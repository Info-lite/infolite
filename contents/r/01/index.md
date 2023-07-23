---
layout: page
title: コンピュータを用いた統計学の基礎知識
date: 2020-09-12 10:24:00 +0900
purposes:
    - 統計の基本について知る
    - Rを用いて基本的な統計量を求める
---


情報倫理講習会
--------------

担当教員の指示に従って受講し、終了後は「テスト/アンケート」より、情リテ情報倫理テストを受験してください。

*   [情報倫理講習会資料](/lit/infoethics/information_ethics_ja.pdf)
*   [情報倫理講習会資料(英語版)](/lit/infoethics/information_ethics_en.pdf)

Rついて
-----------

本授業ではフリーの統計解析用プログラミング言語であるRを使って基本的な統計解析を扱います。データの可視化や統計解析を短いプログラムで記述することができます。  

Rは無料で利用できますので、授業時間外に課題等を行う場合には以下のページの手順を参考にしてください。  

{% appendix ../appendix/Renv.html "Rの環境構築" %}


Rの基本操作
-------------

Rコンソールを起動して簡単なプログラムを実行してみましょう。

#### コード

<pre class="Rcode">
cat("Hello World!")
</pre>

##### 結果

<pre class="Rres">
Hello World!
</pre>

Hello World!と表示されれば成功です。

Rコンソールでプログラムを書くこともできますが、本授業ではR言語の統合開発環境（IDE）であるR Studioを利用します。R Studioでは”プロジェクト”として関数、変数、作成したグラフのデータなどを一括で管理することができます。

R Studioを起動して、本授業用の新規プロジェクトファイルを作成しましましょう。

【注意】プロジェクトは必ずHドライブに保存してください。詳細は<a href="">こちら</a>

{% screenshot 02_01data.png "R Studioの画面構成" %}


以下のプログラムを実行してみましょう。

プログラムを実行するには、スクリプトエディタにコードを記述して、CtrlキーとEnterキーを同時に押します。すると、コンソールに結果が表示されます。

##### コード

<pre class="Rcode">
cat(1+1)
</pre>

##### 結果

<pre class="Rres">
2
</pre>

<br />

##### コード

<pre class="Rcode">
cat("1+1")
</pre>

##### 結果

<pre class="Rres">
1+1
</pre>

<br />

##### コード

<pre class="Rcode">
num = 1+1  
cat(num)
</pre>

##### 結果

<pre class="Rres">
2
</pre>

<br />

##### コード

<pre class="Rcode">
vec<-c(1,6,9,4,3)  
cat(vec)
</pre>

##### 結果

<pre class="Rres">
1 6 9 4 3
</pre>

<br />
    
データを数値で表現する方法
--------------------------

データにはカテゴリーを表す質的データと連続的な数値データを表す量的データがあります。それぞれのデータには尺度が存在し、統計的にデータを分析する際には尺度によって検定を使い分ける必要があります。


### 尺度の種類

#### 質的データ（qualitative data、特定の属性を表すデータ）

<dl>
  <dt id="nominal_scale">名義尺度（nominal scale）</dt>
  <dd><span id="category">カテゴリー</span>（category、水準）に分類され、データの区分にのみ意味があるものです。大小関係や順序関係は存在しません。データのタイプは数字か文字です。例として、性別や血液型などがあげられます。</dd>
  <dt id="ordinal_scale">順序尺度（ordinal scale）</dt>
  <dd>データの大小または、順位のみが意味を持つ尺度です。基本的には<a href="#mean">平均</a>や<a href="#standard_deviation">標準偏差</a>は使用せず、<a href="#median">中央値</a>を主に使用します。データタイプは数値か文字のどちらかで、数値であれば大きさで順序が決まり、文字であれば50音順やアルファベット順などで順序が決まります。例として、年代や検定試験の級などがあげられます。</dd>
</dl>

#### 量的データ（quantitative data、数量として得られるデータ）

量的データの尺度を基本的に<span id="continuous_scale">連続尺度</span>（continuous scale）といいます。連続尺度には以下の二種類があります。

<dl>
  <dt id="interval_scale">間隔尺度（interval scale）</dt>
  <dd>順序情報と等間隔性を有する尺度です。加減に意味はありますが、乗除は意味がありません。例として、摂氏の温度（℃）や時刻などがあげられます。</dd>
  <dt id="ratio_scale">比例尺度（ratio scale）</dt>
  <dd>間隔尺度の性質に加えて、0を基点とすることができる尺度です。テストの点数や身長・体重など多くの事象にこの尺度を用います。数値はそのまま計算に用いることができ、乗除にも意味があります。</dd>
</dl>

なお、絶対温度（K）は原子の動いていない状態を0（基点）としているため比例尺度ですが、摂氏の温度（℃）は水の凝固点に便宜上0を割り当てたものであり、その0は"温度がない=無の値"を表している基点**ではない**ため、間隔尺度となります。

また、統計を使って分析されることの多いデータのひとつにアンケートの回答があります。分析の際に回答へ「1：悪い」「2：普通」「3：良い」といった数値を割り当てることがありますが、人によって「普通」という評価が「悪い」に近い場合と「良い」に近い場合とがありえます。このことから、等間隔とはいえませんが、順序だけは明確であるため、順序尺度であるといえます。しかし、実際に分析を行う際には、割り当てた数値を基に<a href="#mean">平均</a>や<a href="#variance">分散</a>、<a href="#deviation">偏差</a>などを求めることがあります。このときは、間隔尺度として扱っているといえます。


基本統計量
----------------

<a href="#nominal_scale">名義尺度</a>・<a href="#ordinal_scale">順序尺度</a>の場合に求められる統計量には、各<a href="#category">カテゴリー</a>あるいは階級（class）のデータ数（<span id="frequency">度数</span>、frequency）とその度数が全体のデータ数（総度数）に占める割合（<span id="relative_frequency">相対度数</span>、relative frequency）とがあります。<a href="#continuous_scale">連続尺度</a>の場合に求められる主要な基本統計量には、<a href="#quantile">分位数</a>、<a href="#mean">平均値</a>、<a href="#median">中央値</a>、<a href="#mode">最頻値</a>、<a href="#range">範囲</a>、<a href="#variance">分散</a>、<a href="#standard_deviation">標準偏差</a>、<a href="#skewness">歪度</a>、<a href="#kurtosis">尖度</a>などがあります。

それぞれの統計量の意味は以下のとおりです。


#### <span id="missing_value">欠損値（missing value）</span>

測定値が得られていない項目がある場合、有効でないことが明らかな値を入力します。Excelでは空白のままにしたり、ハイフン（-）を入力したりすることが多いようです。


#### <span id="sample_size">標本の大きさ（sample size）$N$</span>

欠損値以外の測定値の数です。

#### <span id="summation">合計（summation）</span>

欠損値以外の測定値の合計値です。

$\displaystyle \left( x_1 + x_2 + \dots + x_N \right) = \sum_{i = 1}^N x_i$

$x_i$は標本の$i$番目の測定値、$N$は<a href="#sample_size">標本の大きさ</a>です。例えば標本に1，3，4，6，7の5個の測定値があったとき、合計は1 + 3 + 4 + 6 + 7 = 21です。

#### <span id="mean">平均（mean）</span>

測定値の算術平均を表します。<a href="#summation">合計</a>を<a href="#sample_size">標本の大きさ</a>$N$で割った値です。

$\displaystyle \bar{x}=\frac{1}{N}\left ( x_1+x_2+_\cdots+x_N \right )$

$N$は<a href="#sample_size">標本の大きさ</a>、$x_i$は標本の$i$番目の測定値です。例えば1，3，4，6，7であれば、平均は21 ÷ 5 = 4.2です。

#### <span id="maximum">最大値（maximum）</span>

欠損値を除く測定値の最大値です。例えば1，3，4，6，7であれば7が最大値です。

#### <span id="minimum">最小値（minimum）</span>

欠損値を除く測定値の最小値です。例えば1，3，4，6，7であれば1が最小値です。

#### <span id="range">範囲（レンジ、range）</span>

測定値が分布する範囲を示します。範囲R = <a href="#maximum">最大値</a> - <a href="#minimum">最小値</a>で求めることができます。例えば1，3，4，6，7であれば範囲R = 7 - 1 = 6です。

#### <span id="quantile">分位数（quantile）</spam>

分位点とも呼びます。測定値を大きさの順に並べ、測定値の個数が等しくなるように複数のグループに分割した時のグループ間の境界値のことを言います。どの値までが全体のどれくらいの割合を占めるかの見当をつけるのに用います。特に、100グループに分割する場合は百分位数（パーセンタイル、percentile）、4グループに分割する場合は四分位数（quartile）と呼びます。<span id="1st_quartile">第1四分位数</span>（first quartile）は小さいほうから25%に当たる値、<span id="3rd_quartile">第3四分位数</span>（third quartile）は大きいほうから25%に当たる値になります。

#### <span id="median">中央値（メディアン、median）</span>

50パーセンタイル、第2四分位数とも言い、測定値を大きさの順に並べたときに全体の中央に位置する値です。例えば1，3，4，6，7であれば4が中央値です。

#### <span id="mode">最頻値（モード、mode）</span>

測定値の中で最大の<a href="#frequency">度数</a>を持つ値です。例えば1，3，4，4，6，7であれば4の数が最も多いので、4が最頻値になります。

#### <span id="variance">分散（variance）</span>

各測定値と<a href="#mean">平均</a>との差である<span id="deviation">偏差</span>（deviation）を2乗することで符号を消し、その合計（<span id="sum_of_squared_deviations">偏差平方和</span>（sum of squared deviations）$S$）を$N$で割ったものです。平均値からのデータの散らばり具合を把握するのに用います。不偏分散を求める際には$N$ではなく$N - 1$で割ります。

$\displaystyle V = \frac{S}{N - 1}$

$\displaystyle S = {\left( x_1 - \bar{x} \right)}^2 + {\left( x_2 - \bar{x} \right)}^2 + \dots + {\left( x_N - \bar{x} \right)}^2 = \sum_{i = 1}^N {\left( x_i - \bar{x} \right)}^2$

$V$は分散、$N$は<a href="#sample_size">標本の大きさ</a>、$x_i$は標本の$i$番目の測定値、$\bar{x}$は<a href="#mean">平均</a>です。例えば1，3，4，6，7であれば分散は{(1 - 4.2)<sup>2</sup> + (3 - 4.2)<sup>2</sup> + (4 - 4.2)<sup>2</sup> + (6 - 4.2)<sup>2</sup> + (7 - 4.2)<sup>2</sup>} ÷ (5 - 1) = 5.7となります。<a href="../02/#population">母集団</a>（対象全体に対して測定したデータ、例えば日本人全員の身長など）の平均（母平均）が未知であることを前提としていて、（<a href="../02/#sample">標本</a>）平均$\bar{x}$を用いて母分散を求めるため、自由度$N - 1$で割ります。

#### <span id="standard_deviation">標準偏差（standard deviation）</span>

分散$V$の平方根をとった値で、分散同様散らばり具合の尺度になります。単位と次数が標本データと同じです。

$s = \sqrt{V} = \sqrt{\frac{1}{n-1}\sum ^{N}_{i=1}{(x_i-\bar{x})^2}}$

$s$は標準偏差です。例えば1，3，4，6，7であれば標準偏差は分散の平方根をとって、2.387467...になります。

#### <span id="standard_error">標準誤差（standard error）</span>

<a href="#standard_deviation">標準偏差</a>を<a href="#sample_size">標本の大きさ</a>$N$の平方根で割った値で、平均に関する検定や推定で用いられます。<a href="#mean">平均</a>の標準誤差とも呼ばれます。

$s / \sqrt{N}$

$s$は標準偏差、$N$は標本の大きさです。

#### <span id="skewness">歪度（skewness）</span>

測定値の分布の非対称性を測る尺度です。

* 歪度 = 0 : 左右対称
* 歪度 &gt; 0 : 右に裾がのびる
* 歪度 &lt; 0 : 左に裾がのびる

{% screenshot 01_04warp.png "歪度" %}

#### <span id="kurtosis">尖度（kurtosis）</span>

測定値の分布の裾の長さを測る尺度です。

* 尖度 = 0 : 正規分布
* 尖度 &gt; 0 : 正規分布よりも尖っている
* 尖度 &lt; 0 : 正規分布よりも平坦である

{% screenshot 01_05sharp.png "尖度" %}



基本統計量の算出
----------------

Rでは、事前に用意された関数を用いることで、基本統計量を算出することができます。

&#9312;データの準備

##### コード

<pre class="Rcode">
prac<- c(1, 3, 5, 7, 9) # 練習用データを変数に格納
</pre>

<br />

&#9313;以下の関数を利用して基本統計量を算出してみましょう。

##### コード

<pre class="Rcode">
sum(prac) # 合計値

mean(prac) # 平均値

max(prac) # 最大値

min(prac) # 最小値

var(prac) # 分散

sd(prac) # 標準偏差

summary(prac) # 最大値、四分位数、最小値を一括で計算
</pre>

<br />

課題
----

Rで次の計算をしてみましょう。

* 100-1
* 3 + 2 × 5<sup>2</sup>
* 71.3 ÷  1.8<sup>2</sup>

次のデータの標準偏差をsd,varコマンドを使わずに求めてみましょう。

45, 50, 74, 85, 69


