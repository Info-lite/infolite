---
layout: page
title: Rによるデータの可視化
date: 2020-09-16 16:00:00 +0900
purposes:
    - Rを用いてグラフを作成する
---

Rではコマンドを利用することで、簡単にグラフを作成することができます。

棒グラフ / barplot()
------------------------

東京都公立大学法人の平成28年から令和2年までの5年間の総利益を棒グラフによって可視化してみましょう。  
（データ：[https://www.houjin-tmu.ac.jp/about/finance/](https://www.houjin-tmu.ac.jp/about/finance/)）

<table>
	<tr><td>事業年度</td><td>平成28年</td><td>平成29年</td><td>平成30年</td><td>令和元年</td><td>令和2年</td></tr>
	<tr><td>総利益（百万円）</td><td>1,148</td><td>604</td><td>553</td><td>277</td><td>2,172</td></tr>
</table>

棒グラフは`barplot()`で描画できます。
以下のコードを実行して棒グラフを描画してみましょう。  
＃から始まる行はコメントですので、入力不要です。

<pre class="Rcode">
# データの読み込み
rieki <- c(1148, 604, 553, 277, 2172)

# 棒グラフの作成
barplot(rieki)

# x軸のラベル
label <- c("H28", "H29", "H30", "R1", "R2")
barplot(rieki, name=label)
</pre>

正しく実行できると以下のようなグラフが出力されます。  

{% screenshot 02_barplot01.jpg "総利益の棒グラフ" %}

以下のようなオプションを指定することで、グラフの見た目を変えることができます。

<table>
	<tr><td>軸を原点で交差させる</td><td>par(xaxs="i",yaxs="i", xpd=T)</td></tr>
	<tr><td>グラフの塗りつぶし</td><td>col = "色名"</td></tr>
	<tr><td>x軸の範囲</td><td>xlim = c(最小値, 最大値)</td></tr>
	<tr><td>y軸の範囲</td><td>ylim = c(最小値, 最大値)</td></tr>
	<tr><td>x軸のラベル</td><td>xlab = “x軸の名前”</td></tr>
	<tr><td>y軸のラベル</td><td>ylab = “y軸の名前”</td></tr>
</table>

例えば、以下のようなコードでグラフの見た目を整えることができます。
<pre class="Rcode">
par(xaxs="r",yaxs="i", xpd=T)
barplot(rieki, name=label, col="lightblue" ,ylim=c(0,2500), ylab = "総利益（百万円）" ,xlab = "年度")
</pre>


{% screenshot 02_barplot02.jpg "見た目を変更した棒グラフ" %}


CSVファイルからデータを読み込む
-------------------------------------------------

少ないデータ量であれば1つずつ手で入力することもできますが、データ量が膨大な場合はCSVからデータを読み込むこともできます。  
2020年10月1日〜2022年9月30日までの2年間の「新型コロナウイルス感染症 新規陽性者数」のデータを取得して、Rで読み込んでみましょう。  
<a href="newly_confirmed_cases_daily.csv" download>newly_confirmed_cases_daily.csv</a>　【厚生労働省オープンデータを加工】  
（データ出典：[厚生労働省オープンデータ https://www.mhlw.go.jp/stf/covid-19/open-data.html](https://www.mhlw.go.jp/stf/covid-19/open-data.html)）  

このファイルには日付と都道府県ごとの新規陽性者数が格納されています。

<table>
	<tr style="background-color: #eeeeee;"><td>Date</td><td>ALL</td><td>Hokkaido</td><td>Aomori</td><td>Iwate</td><td>･･･</td></tr>
	<tr><td>2020/10/01</td><td>619</td><td>19</td><td>0</td><td>0</td><td>･･･</td></tr>
	<tr><td>2020/10/02</td><td>537</td><td>15</td><td>1</td><td>0</td><td>･･･</td></tr>
	<tr><td>2020/10/03</td><td>562</td><td>18</td><td>0</td><td>0</td><td>･･･</td></tr>
	<tr><td>2020/10/04</td><td>394</td><td>22</td><td>0</td><td>1</td><td>･･･</td></tr>
</table>

### 作業ディレクトリへCSVファイルを配置して読み込み
CSVファイルをRで読み込むために、ダウンロードしたCSVファイルをRの作業ディレクトリにコピーしましょう。

CSVファイルを読み込む時には以下のコマンドを用います。

##### コード
<pre class="Rcode">
cov <- read.csv("newly_confirmed_cases_daily.csv", header = TRUE, fileEncoding = "utf8")
</pre>

<table>
	<tr><td> <code>header = TRUE</code> </td><td>1行目を見出しにする</td></tr>
	<tr><td> <code>fileEncoding = "utf8"</code> </td><td>文字コードがUTF-8</td></tr>
</table>

`cov` という変数にCSVファイルがデータフレームとして読み込まれました。  
データが正しく読み込まれているか、以下のコードで確認してみましょう。   
##### コード
<pre class="Rcode">
head(cov)
</pre>
##### 結果
<pre class="Rres">
       Date ALL Hokkaido Aomori Iwate Miyagi Akita ...
1 2020/10/1 619       19      0     0      7     0 ...
2 2020/10/2 537       15      1     0      5     0 ...
3 2020/10/3 562       18      0     0      7     0 ...
4 2020/10/4 394       22      0     1      3     5 ...
5 2020/10/5 269       36      0     0      5     0 ...
6 2020/10/6 495       12      0     0      8     0 ...
</pre>

### データフレームの操作
`$` を用いるとデータフレームから列を抽出することができます。  
読み込んだデータフレームから全国の陽性者数（ALL）の列を取り出してみましょう。  

##### コード
<pre class="Rcode">
y_all <- cov$ALL  #covのALL列を変数y_allに格納
print(y_all)
</pre>
##### 結果
<pre class="Rres">
 [1]    619    537    562    394    269    495    502    623    594    666
 [11]    431    272    491    550    703    633    611    422    313    475
 [21]    611    609    742    712    486    401    646    724    803    767
 [31]    866    603    480    860    606   1046   1137   1301    934    770
 [41]   1276   1540   1624   1703   1721   1428    949   1685   2173   2382
</pre>

### 棒グラフでの可視化
全国での新規陽性者数の推移を棒グラフで可視化してみましょう。
##### コード
<pre class="Rcode">
barplot(y_all) #y_allはcov$ALLでも可
</pre>

{% screenshot 02_barplot03.jpg "全国での新規陽性者数の推移" %}



ヒストグラム / hist()
-------------------------------------------------
ヒストグラムの描画には`hist()`を利用します。  
本講では先ほど読み込んだ新型コロナウイルス感染症陽性者数データから、第７波（2022年6月下旬〜9月下旬）のデータを取り出して、ヒストグラムを書いてみましょう。

##### コード
<pre class="Rcode">
y_all_peek7th <- cov$ALL[620:730]  #ALL列の620〜730番目のデータを変数に格納
hist(y_all_peek7th)
</pre>
{% screenshot 02_hist01.jpg "第７波での新規陽性者数（全国）のヒストグラム" %}

以下のようなオプションを指定することで、グラフの見た目を整えることができます。
<table>
	<tr><td>軸を原点で交差させる</td><td>par(xaxs="i",yaxs="i", xpd=T)</td></tr>
	<tr><td>グラフの塗りつぶし</td><td>col = "色名"</td></tr>
	<tr><td>x軸の範囲</td><td>xlim = c(最小値, 最大値)</td></tr>
	<tr><td>y軸の範囲</td><td>ylim = c(最小値, 最大値)</td></tr>
	<tr><td>x軸のラベル</td><td>xlab = “x軸の名前”</td></tr>
	<tr><td>y軸のラベル</td><td>ylab = “y軸の名前”</td></tr>
	<tr><td>y軸階級の数（階級の幅は整数になるため必ずしも指定した数にはならない）</td><td>breaks = 整数</td></tr>
</table>

オプションを指定して、ヒストグラムを描画してみましょう。
##### コード
<pre class="Rcode">
hist(y_all_peek7th, col="white", ylim=c(0,40), main="", xlab="newly confirmed cases (number)")
</pre>

{% screenshot 02_hist02.jpg "第７波での新規陽性者数（全国）のヒストグラム" %}


箱ひげ図 / boxplot()
-------------------------------------------------
箱ひげ図を描画するには`boxplot()`を利用します。
ヒストグラムを描画したデータで箱ひげ図を描画してみましょう。
##### コード
<pre class="Rcode">
＃ オプションを指定して箱ひげ図を描画
boxplot(y_all_peek7th, col="white", ylim=c(0,300000) , xlab="Japan" , ylab="newly confirmed cases (number)")
</pre>
{% screenshot 02_boxplot01.jpg "第７波での新規陽性者数（全国）の箱ひげ図" %}

複数のデータを`list()`にまとめることで、一つのグラフに描画することも可能です。
##### コード
<pre class="Rcode">
y_tk_peek7th <- cov$Tokyo[620:730]  #東京都
y_kanagawa_peek7th <- cov$Kanagawa[620:730]  #神奈川県
y_saitama_peek7th <- cov$Saitama[620:730]  #埼玉県

boxplot(list(y_tk_peek7th, y_kanagawa_peek7th, y_saitama_peek7th), names=c("Tokyo", "Kanagawa", "Saitama") 
, ylab="newly confirmed cases (number)",  col="white")
</pre>
{% screenshot 02_boxplot02.jpg "第７波での新規陽性者数の箱ひげ図" %}


散布図 / plot()
-------------------------------------------------
散布図の描画には`plot()`を利用します。  
これまでのデータを用いて北海道の新規陽性者数数と沖縄県の新規陽性者数の関係を表す散布図を描画してみましょう。  

<pre class="Rcode">
plot(cov$Hokkaido, cov$Okinawa)
</pre>
{% screenshot 02_plot01.jpg "北海道と沖縄県の新規陽性者数の関係" %}


以下のようなオプションを指定することで、グラフの見た目を整えることができます。  
<table>
	<tr><td>軸を原点で交差させる</td><td>par(xaxs="i",yaxs="i", xpd=T)</td></tr>
	<tr><td>プロット（点）の色</td><td>col = "色名"</td></tr>
	<tr><td>プロット（点）の形</td><td>pch = "整数"</td></tr>
	<tr><td>プロット（点）の大きさ</td><td>cex = "整数"</td></tr>
	<tr><td>x軸の範囲</td><td>xlim = c(最小値, 最大値)</td></tr>
	<tr><td>y軸の範囲</td><td>ylim = c(最小値, 最大値)</td></tr>
	<tr><td>x軸のラベル</td><td>xlab = “x軸の名前”</td></tr>
	<tr><td>y軸のラベル</td><td>ylab = “y軸の名前”</td></tr>
</table>
  
プロットの形（pch）は1〜25までの数字で指定できます。  
以下のコードを実行して1～25に対応する形を表示してみましょう。  
<br />
プロットの形を表示するためのコード  
<pre class="Rcode">
plot( 0:12, rep(0.8,13), pch=0:12, cex=1, xaxt="n", yaxt="n", xlim=c(-1,13), ylim=c(0,1), xlab="", ylab="" )
text(0:12, rep(0.9,13), labels=0:12)
par(new=T)
plot( 0:12, rep(0.2,13), pch=13:25, cex=1, xaxt="n", yaxt="n", xlim=c(-1,13), ylim=c(0,1), xlab="", ylab="" )
text(0:12, rep(0.3,13), labels=13:25)
</pre>
結果
{% screenshot 02_pch.jpg "プロットの形の種類" %}

オプションをいくつか指定してグラフを描画してみましょう。
<pre class="Rcode">
plot(cov$Hokkaido, cov$Okinawa, pch=16, col="gray",  xlab="北海道の新規陽性者数（人）", ylab="沖縄県の新規陽性者数（人）")
</pre>
{% screenshot 02_plot02.jpg "北海道と沖縄県の新規陽性者数の関係" %}



折れ線グラフ / plot()
-------------------------------------------------
`plot()`に`type`を指定することで折れ線グラフの描画もできます。  
`type`は`l`で線のみ、`o`でプロットと線、`p`でプロットのみ（デフォルト）で描画できます。
<br />
棒グラフのセクションのデータを折れ線グラフで描画してみましょう。  
横軸は１から`y_all`の要素数（`1:length(y_all)`）を指定しています。  

<pre class="Rcode">
plot(1:length(y_all), y_all, type="l")
</pre>
{% screenshot 02_plot03.jpg "全国での新規陽性者数の推移" %}
  <br />
<pre class="Rcode">
plot(1:length(y_all), y_all, type="o")
</pre>
{% screenshot 02_plot04.jpg "全国での新規陽性者数の推移" %}

オプションを指定して、見た目を整えると以下のようになります。
<pre class="Rcode">
plot(1:length(y_all), y_all, type="o", pch=16, cex=0.5, xlab="日数（日目）", ylab="新規陽性者数（人）")
</pre>
{% screenshot 02_plot05.jpg "全国での新規陽性者数の推移" %}


課題
------

「[男女100名の身長と体重のデータ](kadai02.csv)」をダウンロードして以下の可視化を行ってみましょう。  
データ： <a href="kadai02.csv" download>男女100名の身長と体重のデータ(kadai02.csv)</a>

<br />
１）男女間での身長のばらつきを可視化する。  
２）身長と体重の関係を可視化する。
  
以下は発展問題です。時間に余裕のある人はチャレンジしてみましょう。  
３）（２）で作成したグラフを男女で色分けする。

