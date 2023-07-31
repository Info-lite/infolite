---
layout: page
title: 相関分析
date: 2020-09-24 10:00:00 +0900
purposes:
    - 相関分析について学ぶ
    - Rを用いて、相関関係を実際に調べてみる
---

<div class="panel panel-info">
<div class="panel-body">
今回使うファイルです。必要に応じてご利用ください。文字コードはUTF-8です。 
<ul>
<li><a href="06.csv" download>ある小学校の児童30人の身長、体重(06.csv)</a></li>
</ul>
</div>
</div>

相関分析
--------

### 相関関係

2つの変数$ x$と$ y$があるときに、$ x$の変化に伴って$ y$も変化するような関係を「<span id="correlation">相関関係</span>（correlation）」といいます。相関関係を調べるには<a href="#chapter3">散布図</a>や<a href="#chapter7">相関係数</a>を用います。相関関係は正の相関関係と負の相関関係、無相関に分けられます。この正負は後で述べる相関係数によって決まります。
<dl>
 	<dt id="positive_correlation">正の相関関係（positive correlation）</dt>
 	<dd>$ x$が増加していったとき、$ y$も増加している。$ x$と$ y$が比例している関係。</dd>
 	<dt id="negative_correlation">負の相関関係（negative correlation）</dt>
 	<dd>$ x$が増加していったとき、$ y$は減少している。$ x$と$ y$が比例（傾きが負）している関係。</dd>
 	<dt id="uncorrelated">無相関（uncorrelated）</dt>
 	<dd>$ x$と$ y$に（比例）関係が見出せない。</dd>
</dl>


散布図
------

散布図（scatter plot）は<a href="#correlation">相関関係</a>の有無を視覚的に表す図です。2つの変数の内、一方を横軸にとり他方を縦軸にとって、対応するデータを1点ずつプロットしていきます。

{% screenshot 06_01dust.png "身長と体重の散布図例" %}

### 散布図の分析

散布図の分析では以下のような点に着目します。

* はずれ点がないか
* 2つの変数$ x$と$ y$との間にはどのような関係があるか
    * 直線
    * 曲線
    * 無関係
* グループが形成されているか

<a href="#scatter_plot_example">上図</a>を見てみると、ある程度の点が身長145～170、体重40～70の範囲でグループを形成しているように見えます。そのグループは左下から右上がりになっていて、身長と体重とには比例の関係があるように思われます。体重80以上に幾つかはずれ点が見らますが、大幅に外れているとはいえなさそうです。

このようにデータの分布を視覚的に見ることによって、$ x$と$ y$の2変数の関係に方向性が見えてきます。その方向性がデータをよく表しているかどうか、計算によって判定します。

相関係数
--------

相関係数（correlation coefficient）は、<a href="#correlation">相関関係</a>の有無を数量的に調べるために用います。

<a href="../02/#sample">標本</a>に基づく相関係数（<span id="sample_correlation_coefficient">標本相関係数</span>、sample correlation coefficient）$ r$の範囲は-1 ≤ $ r$ ≤ 1です。

* $ r$が正数（0より大きい数）のとき、<a href="#positive_correlation">正の相関関係</a>があるといいます
* $ r$が負数（0より小さい数）のとき、<a href="#negative_correlation">負の相関関係</a>があるといいます
* $ r$が0に近い場合は、<a href="#uncorrelated">無相関</a>であるといいます

標本相関係数$ r$は以下の数式で求めることができます。

$ \displaystyle r = \frac{V_{xy}}{s_x s_y}$

* *$ \displaystyle V_{xy} = \frac{1}{N - 1} \sum_{i = 1}^N \left( x_i - \overline{x} \right) \left( y_i - \overline{y} \right)$：$ x$と$ y$の<span id="covariance">不偏共分散</span>
* $ \displaystyle s_x = \sqrt{ \frac{1}{N - 1} \sum_{i = 1}^N {\left( x_i - \overline{x} \right)}^2 }$：$ x$の<a href="../01/#standard_deviation">標準偏差</a>（<a href="../01/#variance">不偏分散</a>の平方根）
* $ \displaystyle s_y = \sqrt{ \frac{1}{N - 1} \sum_{i = 1}^N {\left( y_i - \overline{y} \right)}^2 }$：$ y$の標準偏差（不偏分散の平方根）
* $ \displaystyle \overline{x} = \frac{1}{N} \sum_{i = 1}^N x_i$：$ x$の<a href="../class01/#mean">平均</a>
* $ \displaystyle \overline{y} = \frac{1}{N} \sum_{i = 1}^N y_i$：$ y$の平均

また、標本相関係数の絶対値によって、その相関の強さがわかります。


* 0.7 ≤ $ \left| r \right|$：強い相関あり

{% screenshot 06_09dust.png "強い正の相関の例" %}

{% screenshot 06_10dust.png "強い負の相関の例" %}


* 0.4 ≤ $ \left| r \right|$ &lt; 0.7：中程度の相関あり

{% screenshot 06_11dust.png "中程度の相関の例" %}


* 0.2 ≤ $ \left| r \right|$ &lt; 0.4：弱い相関あり

{% screenshot 06_13dust.png "弱い相関の例" %}


* $ \left| r \right|$ &lt; 0.2：ほとんど相関なし

{% screenshot 06_14dust.png "無相関の例" %}



### 練習問題1

次のデータは、ある小学校の児童30人の身長（$ x$）と体重（$ y$）とを測定したものです。このデータをグラフで表現し、身長$ x$と体重$ y$の関係を把握してください。
<br />

データ  
<a href="06.csv" download>ある小学校の児童30人の身長、体重(06.csv)</a>

<a href="http://www.mext.go.jp">文部科学省</a><cite>平成20年度学校保健統計調査</cite>の結果を基に作成した仮想データ


### Rの操作

Rを用いて<a href="#chapter5">練習問題1</a>に取り掛かりましょう。


&#9312; データをRに入力します。

##### コード

<pre class="Rcode">
# データの読み込み
data06<- read.csv("06.csv")
</pre>
<br />

&#9312; 散布図を作成します。

##### コード

<pre class="Rcode">
#散布図の作成
plot(data06$身長, data06$体重, xlab="身長" , ylab="体重")
</pre>

実行すると、以下のようなグラフが出力されます。

{% screenshot 06_practice1_result.png " " %}

出力された散布図を見ると、左下から右上がりに点が分布しているように見えます。身長（$ x$）と体重（$ y$）には<a href="#positive_correlation">正の相関関係</a>があるのかもしれません。それを確かめるために、次に<a href="#chapter7">相関係数</a>を求めます。


相関係数の検定
--------------

### 練習問題2

<a href="#chapter5">練習問題1</a>のデータを利用して、身長と体重の<a href="#chapter7">相関係数</a>を求め、<a href="#chapter13">無相関の検定</a>をしてください。


### 無相関の検定

相関係数には、<a href="../02/#sample">標本</a>に基づいた<a href="#sample_correlation_coefficient">標本相関係数</a>$ r$と、<a href="../02/#population">母集団</a>の相関係数（母相関係数）ρ（ロー）が存在します。

<dl>
 	<dt>母集団の相関係数</dt>
 	<dd>母相関係数ρ</dd>
 	<dt>標本の相関係数</dt>
 	<dd>標本相関係数$ r$</dd>
</dl>

標本は母集団全体を表しているわけではないので、母相関係数ρ = 相関係数$ r$とは言えません。母相関係数ρ = 0であっても、抽出された標本によっては相関がある場合もあります。

そこで、母相関係数ρが0かを検定します。これを無相関の検定と言います。


#### 仮説の設定

* <a href="../02/#null_hypothesis">帰無仮説</a>H<sub>0</sub>：母<a href="#chapter7">相関係数</a>は0である（ρ = 0）
* <a href="../02/#alternative_hypothesis">対立仮説</a>H<sub>1</sub>：母相関係数は0ではない（ρ ≠ 0）


#### 有意水準$\alpha$の設定

<a href="../04/#chapter1">有意水準</a>$\alpha$ = 0.05とします。


#### 検定統計量$ t$値の算出

今回は以下の数式で<a href="../02/#test_statistic">検定統計量</a>$ t$値を求められます。

<span id="t_equation">$ \displaystyle t = \frac{r}{\sqrt{\frac{1 - r^2}{N - 2}}}$</span>

この$ t$値は自由度がφ = $ N - 2$の<a href="../02/#student_s_t-distribution">$t$分布</a>に従うことがわかっています。これは、<a href="#sample_correlation_coefficient">標本相関係数</a>$ r$が平均ρ、標準偏差
$ \displaystyle \sqrt{\frac{1 - r^2}{N - 2}}$
の分布に従うと解釈すれば、他の検定同様<a href="../02/#standardization">標準化</a>でき、さらに、<a href="../02/#null_hypothesis">帰無仮説</a>の条件下ではρ = 0なので、<a href="#t_equation">上式</a>のようになると考えることもできます。

#### $p$値の算出

<a href="../04/#chapter1">有意水準</a>と比較する確率<span id="p_of_t">$p$値</span>を計算します。$p$値は、自由度φの<a href="../02/#student_s_t-distribution">$t$分布</a>において、$ -t$未満の値が発生する確率と$ t$より大きい値が発生する確率との和です。


#### 判定

<dl>
 	<dt><a href="#p_of_t">$p$値</a> ≦ <a href="../04/#chapter1">有意水準</a>α</dt>
 	<dd><a href="../02/#null_hypothesis">帰無仮説</a>H<sub>0</sub>を棄却する</dd>
 	<dt>$p$値 &gt; 有意水準α</dt>
 	<dd>帰無仮説H<sub>0</sub>を受容する</dd>
</dl>

### Rの操作

Rを使って、<a href="#chapter12">練習問題2</a>に取り掛かりましょう。

&#9312; データをRに入力します。<a href="#chapter5">練習問題1</a>から続けて行う場合は不要です。

##### コード

<pre class="Rcode">
# データの読み込み
data06<- read.csv("06.csv")
</pre>
<br />

&#9313; 相関係数を求めます。

##### コード

<pre class="Rcode">
#相関係数を求める
cor(data06$身長, data06$体重)
</pre>

##### 結果

<pre class="Rres">
[1] 0.9375383
</pre>

相関係数 $r$ = 0.9375383が求まりました。ここから、児童30人の身長と体重には強い正の相関関係が成り立つということが分かります。 すなわち、身長が高くなるにつれて、体重は重くなっていくようだということが分かりました。

<br />

&#9314; 無相関検定を行います。

##### コード

<pre class="Rcode">
#無相関検定
cor.test(data06$身長, data06$体重)
</pre>

##### 結果

<pre class="Rres">
	Pearson's product-moment correlation

data:  data06$身長 and data06$体重
t = 14.261, df = 28, p-value = 2.294e-14
alternative hypothesis: true correlation is not equal to 0
95 percent confidence interval:
 0.8716998 0.9701303
sample estimates:
      cor 
0.9375383 
</pre>
<br />

### 結果

<a href="#p_of_t">$p$値</a> = 2.294 × 10<sup>-14</sup>が求まりました。下図の塗りつぶされた領域が全体に対してpの割合になっています。

![$t$値による$p$値の図示](./pic/06_practice3_t.png)

![rによる$p$値の図示](./pic/06_practice3_r.png)

$p$値 = 2.294 × 10<sup>-14</sup> &lt; <a href="../04/#chapter1">有意水準</a>α = 0.05 なので<a href="../02/#null_hypothesis">帰無仮説</a>H<sub>0</sub>は棄却されます。

すなわち、身長と体重の間には、<a href="#chapter2">相関関係</a>が存在するということがわかりました。また、<a href="#chapter7">相関係数</a>は 0.9375383と強い<a href="#positive_correlation">正の相関</a>が認められたので、身長が高ければ体重は重いと判断されました。


課題
----

次の表は、あるクラスの生徒10名を対象に行った家庭での書籍数と国語の試験結果（得点）の調査をまとめた表です。書籍数と国語の得点には<a href="#chapter1">相関関係</a>が見られるでしょうか。<a href="#chapter7">相関係数</a>を求め、<a href="#chapter13">無相関検定</a>をし、相関関係を考察してください。

表4：書籍数（冊）と得点（点）

![表4：書籍数（冊）と得点（点）](./pic/06_38Q.png)
