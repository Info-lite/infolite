---
layout: page
title: 2つのグループの母平均の差に関する検定と推定
date: 2020-09-18 10:00:00 +0900
purposes:
    - 2つのグループの母平均に有意な差があるかどうか検定する
    - 2つのグループの母平均の差を推定する
    - Rを用いて、2つのグループの母平均の差の検定と推定を行う
---

<div class="panel panel-info">
<div class="panel-body">
今回使うファイルです。ダウンロードしてください。必要に応じてご利用ください。文字コードはUTF-8です。
<ul>
<li><a href="04_1.csv" download>[練習問題1]東京と愛媛のみかん5kgあたりの価格（円）(04_1.csv)</a></li>
</ul>
</div>
</div>

母平均の差に関する検定と推定
----------------------------

2つのグループのデータ（2つの標本）は、対応のないデータと対応のあるデータの2つの場合に分けることができます。2グループの母平均の差に関する検定や推定を行う場合、この対応の有無が重要になってきます。どちらなのか注意しましょう。


### 対応のないデータ

一方のグループのデータが他方のグループのデータとは無関係な場合のデータです。グループ内のデータの順番を入れ替えることができます。

例：2つの病棟間の最高血圧、2つのクラスの得点など

この対応のないデータの場合は、まず、2つの母集団の分散（母分散）同士が等しいと仮定できるか確認する、<span id="homogeneity_of_variance_test">等分散性（homogeneity of variance）の検定</span>を行います。その後、母平均に関する検定や推定を行いますが、等分散性を仮定できるか否かで用いる検定・推定法が異なります。

- <span id="student_s_t-test">等分散を仮定する（Studentの$t$検定）</span>
    - 2つの母平均の差に関する検定
    - 2つの母平均の差の推定
-  <span id="welch_s_t-test">等分散を仮定しない（Welchの$t$検定）</span>
    - 2つの母平均の差に関する検定
    - 2つの母平均の差の推定（省略）


### 対応のあるデータ

一方のグループのデータと他方のグループのデータとがペアになっている場合のデータです。グループ内のデータの順番を入れ替えることができません。

例：同一人物の最高血圧と最低血圧、同一人物の前期と後期の得点など

この対応のあるデータの場合は、等分散性の検定を行わず、最初から母平均に関する検定と推定とを行うことができます。

- ２つの母平均の差に関する検定
- ２つの母平均の差の推定


等分散を仮定したときの2つの母平均の差の検定（対応のないデータ）
---------------------------------------------------------------

### 練習問題1

東京と愛媛のみかんの価格について調べたところ、以下のような標本が得られました。東京と愛媛ではみかん5kgあたりの価格の平均に差があるといえるでしょうか。

　<a href="04_1.csv" download>[練習問題1]東京と愛媛のみかん5kgあたりの価格（円）(04_1.csv)</a>　


### 仮説の設定

* 帰無仮説H<sub>0</sub>：東京と愛媛では価格の平均に差がない（$\mu_\text{A} = \mu_\text{B}$）
* 対立仮説H<sub>1</sub>：東京と愛媛では価格の平均に差がないとは言えない（$\mu_\text{A} \ne \mu_\text{B}$）

ここで、$\mu_\text{A}$は東京のみかん5kgあたりの価格を母集団とする母平均、$\mu_\text{B}$は愛媛のみかん5kgあたりの価格を母集団とする母平均です。

なお、後の検定統計量$t$の算出では、東京の標本平均$\overline{x}\_\text{A}$と愛媛の標本平均$\overline{x}\_\text{B}$との差$\overline{x}\_\text{A} - \overline{x}\_\text{B}$を標準化して$t$を求めます。そのため、$\mu_\text{A}$と$\mu_\text{B}$とを2つの値として扱うのではなく、$\mu_\text{A}$と$\mu_\text{B}$との差である$\mu_\text{A} - \mu_\text{B}$を<span id="difference">1つの値</span>として扱います。したがって、仮説を

* 帰無仮説H<sub>0</sub>：$\mu_\text{A} - \mu_\text{B} = 0$
* 対立仮説H<sub>1</sub>：$\mu_\text{A} - \mu_\text{B} \ne 0$

と表すほうが理解しやすいかもしれません。


### 有意水準$\alpha$の設定

有意水準$\alpha$ = 0.05とします。


### 共通分散$V_\text{AB}$の算出

東京の母集団が平均$\mu_\text{A}$、標準偏差$\sigma_\text{A}$の正規分布に従い、愛媛の母集団が平均$\mu_\text{B}$、標準偏差$\sigma_\text{B}$の正規分布に従うとすると、<q cite="#difference">東京の標本平均$\overline{x}\_\text{A}$と愛媛の標本平均$\overline{x}\_\text{B}$との差$\overline{x}\_\text{A} - \overline{x}\_\text{B}$</q>は、平均$\mu_\text{A} - \mu_\text{B}$、標準偏差
$\displaystyle \sqrt{\frac{\sigma_\text{A}^2}{N_\text{A}} + \frac{\sigma_\text{B}^2}{N_\text{B}}}$
の正規分布に従うことがわかっています。
ここで、等分散性が成立し（$\sigma_\text{A}^2 = \sigma_\text{B}^2$）、
かつ、帰無仮説（$\mu_\text{A} - \mu_\text{B} = 0$）の下では、
$\displaystyle \overline{x}\_\text{A} - \overline{x}\_\text{B}$
は平均0、分散
$\displaystyle \sqrt{\sigma^2 \left( \frac{1}{N_\text{A}} + \frac{1}{N_\text{B}} \right)}$
の正規分布に従うことになります。

なお、$\sigma^2$は$\sigma^2 = \sigma_\text{A}^2 = \sigma_\text{B}^2$であるような値です。
したがって、検定にあたっては標準化した
$\displaystyle z = \frac{\overline{x}\_\text{A} - \overline{x}\_\text{B}}{\displaystyle \sqrt{\sigma^2 \left( \frac{1}{N_\text{A}} + \frac{1}{N_\text{B}} \right)}}$
を考えることになります。

しかし、$\sigma^2$も$\sigma_\text{A}^2$も$\sigma_\text{B}^2$も未知なので、標本から求める不偏分散Vで代用することになり、その結果、標準化した値は$t$分布に従うことになります。さらに、算出できる不偏分散は、東京の標本から求めた不偏分散$V_\text{A}$と愛媛の標本から求めた不偏分散$V_\text{B}$の2つで、必ずしも$V_\text{A} = V_\text{B}$が成立するとは限りません。そこで、$V_\text{A}$と$V_\text{B}$との平均とも言うべき共通分散$V_\text{AB}$を算出することになります。

共通分散$V_\text{AB}$は、東京の標本の偏差平方和$S_\text{A}$と愛媛の標本の偏差平方和$S_\text{B}$との和を、不偏分散$V_\text{A}$の自由度$\phi_\text{A}$と不偏分散$V_\text{B}$の自由度$\phi_\text{B}$との和$\phi$で割る、すなわち、以下の数式で求めることができます。
$\displaystyle V_\text{AB} = \frac{S_\text{A} + S_\text{B}}{\phi}$


* $\displaystyle S_\text{A} = \sum_{i=1}^{N_\text{A}} {\left( x_{\text{A}i} - \overline{x}\_\text{A} \right)}^2$
* $\displaystyle S_\text{B} = \sum_{j=1}^{N_\text{B}} {\left( x_{\text{B}j} - \overline{x}\_\text{B} \right)}^2$
* $x_{\text{A}i}$：東京の標本の$i$番目の測定値
* $x_{\text{B}j}$：愛媛の標本の$j$番目の測定値
* $\overline{x}\_\text{A}$：東京の標本平均
* $\overline{x}\_\text{B}$：愛媛の標本平均
* $\phi = \phi_\text{A} + \phi_\text{B}$：共通分散$V$の自由度
* $\phi_\text{A} = N_\text{A} - 1$
* $\phi_\text{B} = N_\text{B} - 1$
* $N_\text{A}$：東京の標本の大きさ
* $N_\text{B}$：愛媛の標本の大きさ


### 検定統計量$t$値の算出

以下の数式で検定統計量$t$値を求めます。
$\displaystyle t = \frac{\overline{x}\_\text{A} - \overline{x}\_\text{B}}{\sqrt{V_\text{AB} \left( \frac{1}{N_\text{A}} + \frac{1}{N_\text{B}} \right)}}$
ここで、$\overline{x}\_\text{A}$は東京の標本平均、$\overline{x}\_\text{B}$は愛媛の標本平均、$V_\text{AB}$は共通分散、$N_\text{A}$は東京の標本の大きさ、$N_\text{B}$は愛媛の標本の大きさです。なお、この検定統計量$t$値は自由度$\phi$の$t$分布に従うことがわかっています。


### $p$値の算出

有意水準と比較する確率$p$値を求めます。<span id="p_of_t">$p$値</span>は、自由度$\phi$の$t$分布において、$-t$未満の値が発生する確率と$t$より大きい値が発生する確率との和です。


### 判定

<dl>
 	<dt>$p$値 ≦ 有意水準$\alpha$</dt>
 	<dd>帰無仮説H<sub>0</sub>を棄却する</dd>
 	<dt>$p$値 &gt; 有意水準$\alpha$</dt>
 	<dd>帰無仮説H<sub>0</sub>を受容する</dd>
</dl>


### Rの操作

Rを使って、練習問題1に取り掛かりましょう。

&#9312; 東京のみかんの価格と愛媛のみかんの価格との間には対応がないので、まず等分散性の検定を行います。

##### コード

<pre class="Rcode">
#データの読み込み  
data04_1<- read.csv("04_1.csv")  
#等分散かどうか  
var.test(data04_1$東京,data04_1$愛媛)  
</pre>

##### 結果

<pre class="Rres">
	F test to compare two variances

data:  data04_1$東京 and data04_1$愛媛
F = 1.0648, num df = 19, denom df = 19, p-value = 0.8926
alternative hypothesis: true ratio of variances is not equal to 1
95 percent confidence interval:
 0.4214555 2.6901313
sample estimates:
ratio of variances 
          1.064787 
</pre>

$p$値 = 0.8926 &lt; 有意水準$\alpha$ = 0.05より、帰無仮説は棄却されません。つまり、東京と愛媛のみかんの価格は、等分散ではないとは言えません。よって、この後は等分散を仮定したt検定を行います。

<br />

&#9313; 等分散性の検定を行った結果、等分散性であることがわかったので、Studentの$t$検定を行います。

##### コード

<pre class="Rcode">
#studentの t 検定  
t.test(data04_1$東京,data04_1$愛媛,var=T)
</pre>

##### 結果

<pre class="Rres">
Two Sample t-test

data:  data04_1$東京 and data04_1$愛媛
t = -2.8796, df = 38, p-value = 0.006507
alternative hypothesis: true difference in means is not equal to 0
95 percent confidence interval:
 -2035.6907  -355.0093
sample estimates:
mean of x mean of y 
  4606.40   5801.75 
</pre>
<br />

#### 結果

$p$値 = 0.006507が求まりました。下図の塗りつぶされた領域が全体に対してpの割合になっています。

{% screenshot 03_practice1_t.png " " %}
{% screenshot 03_practice1_score.png " " %}

設定した有意水準$\alpha$は0.05であるので、$p$値 = 0.006507 &lt; 有意水準$\alpha$ = 0.05となり、帰無仮説H<sub>0</sub>は棄却されます。したがって、東京と愛媛でみかんの価格の母平均には差があると判断します。
<br />

### 等分散を仮定したときの2つの母平均の差の推定（対応のないデータ）

母平均の差$\mu_\text{A} - \mu_\text{B}$について区間推定する場合、母平均の差$\mu_\text{A} - \mu_\text{B}$の(1 - $\alpha$) × 100%信頼区間は以下の式で与えられます。

$\displaystyle (\overline{x}_A-\overline{x}_B)-t(\phi,\alpha)\sqrt{V(\frac{1}{n_A}+\frac{1}{n_B})}<\mu_A-\mu_B<(\overline{x}_A-\overline{x}_B)+t(\phi,\alpha)\sqrt{V(\frac{1}{n_A}+\frac{1}{n_B})}$

練習問題1の東京の母平均と愛媛の母平均との差$\mu_\text{A} - \mu_\text{B}$が取り得る範囲について、95%信頼区間で考えてみましょう。

#### 結果

Studentの$t$検定の実行結果から、東京の母平均と愛媛の母平均との差$\mu_\text{A} - \mu_\text{B}$の95%信頼区間は-2035.6907 &lt; $\mu_\text{A} - \mu_\text{B}$ &lt; -355.0093と求まりました。下側信頼限界は-2035.6907、上側信頼限界は-355.0093で、下図の塗りつぶされた領域が全体の95%になっています。

{% screenshot 03_practice1_t_interval.png " " %}
{% screenshot 03_practice1_score_interval.png " " %}


等分散を仮定しないときの2つの母平均の差の検定・推定（対応のないデータ）
-----------------------------------------------------------------------

等分散を仮定しないときは、検定のみ説明し、推定に関しては省略します。


### 練習問題2

ある学校のA組とB組のテスト結果について調べたところ、以下のような標本が得られました。A組とB組ではクラスの平均点に差があるといえるでしょうか。

<br />

表2：ある学校のテスト結果（点）
<table>
  
  <tr>
    <td>A組</td>
    <td>27</td>
    <td>98</td>
    <td>48</td>
    <td>74</td>
    <td>91</td>
    <td>8</td>
    <td>88</td>
    <td>78</td>
    <td>93</td>
    <td>30</td>
    <td>72</td>
  </tr>
  <tr>
    <td>B組</td>
    <td>32</td>
    <td>62</td>
    <td>29</td>
    <td>45</td>
    <td>42</td>
    <td>56</td>
    <td>21</td>
    <td>24</td>
    <td>32</td>
  </tr>
</table>


### 仮説の設定

* 帰無仮説H<sub>0</sub>：A組とB組では平均点に差がない（$\mu_\text{A} = \mu_\text{B}$）
* 対立仮説H<sub>1</sub>：A組とB組では平均点に差がないとは言えない（$\mu_\text{A} \ne \mu_\text{B}$）

ここで、$\mu_\text{A}$はA組全員のテスト結果を母集団とする母平均、$\mu_\text{B}$はB組全員のテスト結果を母集団とする母平均です。

なお、等分散を仮定したときと同様に、検定統計量$t$値の算出（Welchの$t$検定）では、A組の標本平均$\overline{x}\_\text{A}$とB組の標本平均$\overline{x}\_\text{B}$との差$\overline{x}\_\text{A} - \overline{x}\_\text{B}$を扱います。同様に、2つの母平均を扱うのではなく、差を1つの値として扱うので、ここでも

* 帰無仮説H<sub>0</sub>：$\mu_\text{A} - \mu_\text{B} = 0$
* 対立仮説H<sub>1</sub>：$\mu_\text{A} - \mu_\text{B} \ne 0$

と表すほうが理解しやすいかもしれません。


### 有意水準$\alpha$の設定

有意水準$\alpha$ = 0.05とします。


### 検定統計量$t$値の算出（Welchの$t$検定）

以下の数式で検定統計量$t$値を求めます。

$\displaystyle t_0=\frac{\overline{x}\_A-\overline{x}\_B}{\sqrt{\frac{V_A}{n_A}+\frac{V_B}{n_B}}}$

等分散を仮定したときと同様に、A組の母集団が平均$\mu_\text{A}$、標準偏差$\sigma_\text{A}$の正規分布に従い、B組の母集団が平均$\mu_\text{B}$、標準偏差$\sigma_\text{B}$の正規分布に従うとすると、A組の標本平均$\overline{x}\_\text{A}$とB組の標本平均$\overline{x}\_\text{B}$との差$\overline{x}\_\text{A} - \overline{x}\_\text{B}$は、平均$\mu_\text{A} - \mu_\text{B}$、標準偏差

$\displaystyle \sqrt{\frac{\sigma_\text{A}^2}{N_\text{A}} + \frac{\sigma_\text{B}^2}{N_\text{B}}}$

の正規分布に従うことがわかっています。ここで、帰無仮説の下（$\mu_\text{A} - \mu_\text{B} = 0$）では、$\overline{x}\_\text{A} - \overline{x}\_\text{B}$は平均0、標準偏差

$\displaystyle \sqrt{\frac{\sigma_\text{A}^2}{N_\text{A}} + \frac{\sigma_\text{B}^2}{N_\text{B}}}$

の正規分布に従うことになり、検定にあたっては標準化した

$\displaystyle z=\frac{\overline{x}_A-\overline{x}_B}{\sqrt{\frac{\sigma_A^2}{N_A}+\frac{\sigma_B^2}{N_B}}}$

を考えることになります。しかし、母分散$\sigma_\text{A}^2$、$\sigma_\text{B}^2$は未知なので、上の
$t$
の式ではそれぞれ不偏分散$V_\text{A}$、$V_\text{B}$を用いています。なお、Welchの$t$検定では、この検定統計量$t$が 等価自由度$\phi^*$ の$t$分布に近似的に従うことがわかっています。

### 等価自由度$\phi^*$の算出

以下の数式で、等価自由度$\phi^*$を求めます。

$\displaystyle \phi^* = \frac{\displaystyle {\left( \frac{V_\text{A}}{N_\text{A}} + \frac{V_\text{B}}{N_\text{B}} \right)}^2}{\displaystyle \frac{V_\text{A}}{N_\text{A}^2} \frac{V_\text{A}}{\phi_\text{A}} + \frac{V_\text{B}}{N_\text{B}^2} \frac{V_\text{B}}{\phi_\text{B}}}$


* $V_\text{A}$：A組の不偏分散
* $V_\text{B}$：B組の不偏分散
* $N_\text{A}$：A組の標本の大きさ
* $N_\text{B}$：B組の標本の大きさ
* $\phi_\text{A} = N_\text{A} - 1$：A組の不偏分散の自由度
* $\phi_\text{B} = N_\text{B} - 1$：B組の不偏分散の自由度


### $p$値の算出

有意水準と比較する確率$p$値を求めます。<span id="p_of_t">$p$値</span>は、自由度$\phi^*$の$t$分布において、$-t$未満の値が発生する確率と$t$より大きい値が発生する確率との和です。


### 判定

<dl>
 	<dt>$p$値 ≦ 有意水準$\alpha$</dt>
 	<dd>帰無仮説H<sub>0</sub>を棄却する</dd>
 	<dt>$p$値 &gt; 有意水準$\alpha$</dt>
 	<dd>帰無仮説H<sub>0</sub>を受容する</dd>
</dl>


### Rの操作

Rを使って、練習問題2に取り掛かりましょう。

&#9312; A組のテスト結果とB組のテスト結果との間には対応がないので、まず等分散性の検定を行います。  

##### コード

<pre class="Rcode">
# データの読み込み
A<-c(27,98,48,74,91,8,88,78,93,30,72)
B<-c(32,62,29,45,42,56,21,24,32)
# 等分散かどうか
var.test(A,B)
</pre>

##### 結果

<pre class="Rres">
F test to compare two variances

data:  A and B
F = 4.7805, num df = 10, denom df = 8, p-value = 0.03648
alternative hypothesis: true ratio of variances is not equal to 1
95 percent confidence interval:
  1.112996 18.428150
sample estimates:
ratio of variances 
           4.78046 
</pre>
<br />

&#9313; 等分散性の検定を行った結果、$p$ = 0.03648 ≦ 有意水準$\alpha$ = 0.05となり、等分散性でないことがわかったので、Welchの$t$検定を行います。

##### コード

<pre class="Rcode">
# Welchの t 検定
t.test(A, B,var=F)
</pre>

##### 結果

<pre class="Rres">
Welch Two Sample t-test

data:  A and B
t = 2.502, df = 14.576, p-value = 0.0248
alternative hypothesis: true difference in means is not equal to 0
95 percent confidence interval:
  3.817696 48.505536
sample estimates:
mean of x mean of y 
 64.27273  38.11111 
</pre>
<br />

#### 結果

$p$値 = 0.0248が求まりました。 よって、$p$値 = 0.0248 &lt; 有意水準$\alpha$ = 0.05であるので、A組とB組では点数の母平均に違いがあると判断されたことになります。下図の塗りつぶされた領域が全体に対してpの割合になっています。

{% screenshot 03_practice2_t.png " " %}
{% screenshot 03_practice2_score.png " " %}

2つの母平均の差の検定（対応のあるデータ）
-----------------------------------------

### 練習問題3

次のデータは、あるパーソナルジムにおける、受講生15人の入会前と入会後（入会から１年後）の体重を示したものです。入会後の体重は、入会前の体重よりも減っていると考えられるでしょうか。

<br />
表3：パーソナルジムに通う前後の体重（kg）
<table>
 <tr>
    <th></th>
    <th>1</th>
    <th>2</th>
    <th>3</th>
    <th>4</th>
    <th> 5</th>
    <th>6</th>
    <th>7</th>
    <th>8</th>
    <th>9</th>
    <th>10</th>
    <th>11</th>
    <th>12</th>
    <th>13</th>
    <th>14</th>
    <th>15</th>
  </tr>
  <tr>
    <td>入会前</td>
    <td>68</td>
    <td>77</td>
    <td>54</td>
    <td>80</td>
    <td>118</td>
    <td>84</td>
    <td>82</td>
    <td>69</td>
    <td>97</td>
    <td>76</td>
    <td>94</td>
    <td>50</td>
    <td>81</td>
    <td>98</td>
    <td>66</td>
  </tr>
  <tr>
    <td>入会後</td>
    <td>64</td>
    <td>64</td>
    <td>41</td>
    <td>74</td>
    <td>112</td>
    <td>71</td>
    <td>70</td>
    <td>66</td>
    <td>80</td>
    <td>72</td>
    <td>90</td>
    <td>44</td>
    <td>72</td>
    <td>91</td>
    <td>47</td>
  </tr>
</table>


### 仮説の設定

* 帰無仮説H<sub>0</sub>：入会後と入会前では、体重の平均に差がない（$\mu_\text{A} = \mu_\text{B}$）
* 対立仮説H<sub>1</sub>：入会後と入会前では、体重の平均に差がないとは言えない（$\mu_\text{A} \ne \mu_\text{B}$）

ここで、$\mu_\text{A}$はあるパーソナルジムにおける受講生全員の入会前の体重を母集団とする母平均、$\mu_\text{B}$はあるパーソナルジムにおける受講生全員の入会後の体重を母集団とする母平均です。

なお、後の各ペアの差の算出では、<i>i</i>番目の受講生の入会前の体重<i>x</i><sub>A<i>i</i></sub>と入会後の体重<i>x</i><sub>B<i>i</i></sub>を2つの値として扱うのではなく、両者の差<i>x</i><sub>B<i>i</i></sub> - <i>x</i><sub>A<i>i</i></sub>を1つの値として扱います。すなわち、対応のないデータ（等分散を仮定したとき、等分散を仮定しないとき）のように、2つの母平均を扱うのではなく、差を1つの値として扱うことになるため、仮説を

* 帰無仮説H<sub>0</sub>：$\mu_\text{B} - \mu_\text{A} = 0$
* 対立仮説H<sub>1</sub>：$\mu_\text{B} - \mu_\text{A} \ne 0$

と表すほうが理解しやすいかもしれません。


### 有意水準$\alpha$の設定

有意水準$\alpha$ = 0.05とします。


### 各ペアの差の算出

入会前の体重と入会後の体重を1つのペアとして扱います。

<i>d</i><sub><i>i</i><i></i></sub> = <i>x</i><sub>B<i>i</i></sub> - <i>x</i><sub>A<i>i</i></sub>

この式から、各ペアの差を求めます。ここで、<i>x</i><sub>A<i>i</i></sub>は<i>i</i>番目の受講生の入会前の体重、<i>x</i><sub>B<i>i</i></sub>は同じ受講生の入会後の体重であり、<i>d</i><sub><i>i</i></sub>は同じ受講生の入会前の体重と入会後の体重との差になります。さらに、差<i>d</i><sub><i>i</i></sub>を標本として、その平均$\overline{d}$と不偏分散$V_d$との算出を行います。


### 検定統計量$t$値の算出

今回は、以下の式で検定統計量$t$値が求まります。

$\displaystyle t = \frac{\overline{d}}{\sqrt{\frac{V_d}{N_d}}}$

ここで、$\overline{d}$はペアごとの差<i>d</i><sub><i>i</i></sub>の平均、$V_d$はペアごとの差<i>d</i><sub><i>i</i></sub>の不偏分散、$N_d$はペアの標本の大きさです。

$\overline{d}$は、平均$\mu_\text{B} - \mu_\text{A}$、標準偏差
$\displaystyle \sqrt{\frac{\sigma_d^2}{N_d}}$
の正規分布に従うことがわかっています。ここで$\sigma_d^2$は、あるパーソナルジムにおける受講生の入会前の体重と入会後の体重との差を母集団とする母分散です。帰無仮説（$\mu_\text{B} - \mu_\text{A} = 0$）下では、平均0、標準偏差
$\displaystyle \sqrt{\frac{\sigma_d^2}{N_d}}$
の正規分布に従うことになりますが、$\sigma_d^2$は未知です。そこで、代わりに不偏分散$V_d$を用いて、かつ、標準化した$t$を考えると、自由度$\phi_d = N_d - 1$の$t$分布に従うことがわかっています。

### $p$値の算出

有意水準と比較する確率$p$値を求めます。 <span id="p_of_t_d">$p$値</span>は、自由度$\phi_d$の$t$分布において、$-t$未満の値が発生する確率と$t$より大きい値が発生する確率との和です。

### 判定

<dl>
 	<dt>$p$値 ≦ 有意水準$\alpha$</dt>
 	<dd>帰無仮説H<sub>0</sub>を棄却する</dd>
 	<dt>$p$値 &gt; 有意水準$\alpha$</dt>
 	<dd>帰無仮説H<sub>0</sub>を受容する</dd>
</dl>

### Rの操作

Rを使って、練習問題3に取り掛かりましょう。

&#9312; 表3のデータをRに入力します。

##### コード

<pre class="Rcode">
#データの読み込み  
before<-c(68,77,54,80,118,84,82,69,97,76,94,50,81,98,66)  
after<-c(64,64,41,74,112,71,70,66,80,72,90,44,72,91,47)  
</pre>
<br />

&#9313; 対応のあるT検定を行います。

##### コード

<pre class="Rcode">
#対応のあるT検定  
t.test(before,after,paired=TRUE)  
</pre>

##### 結果

<pre class="Rres">
	Paired t-test

data:  before and after
t = 6.8967, df = 14, p-value = 7.362e-06
alternative hypothesis: true mean difference is not equal to 0
95 percent confidence interval:
  6.247064 11.886269
sample estimates:
mean difference 
       9.066667 
</pre>
<br />


#### 結果

$p$値 = 7.362 x 10<sup>-6</sup>が求まりました。

下図の塗りつぶされた領域が全体に対してpの割合になっています。

{% screenshot 03_practice3_t.png " " %}
{% screenshot 03_practice3_score.png " " %}

よって、$p$値 = 7.362 x 10<sup>-6</sup> &lt; 有意水準$\alpha$ = 0.05であるので、帰無仮説H<sub>0</sub>は棄却されます。入会前の体重と入会後の体重の母平均とには有意差があることが分かりました。


### 2つの母平均の差の推定（対応のあるデータ）

母平均の差$\mu_\text{B} - \mu_\text{A}$について区間推定する場合、母平均の差$\mu_\text{A} - \mu_\text{B}$の(1 - $\alpha$) 100%信頼区間は以下の式で与えられます。

$\displaystyle \overline{d} - t_{\phi_d}(\alpha) \sqrt{ \frac{V_d}{N_d}} &lt; \mu_\text{B} - \mu_\text{A} &lt; \overline{d} + t_{\phi_d}(\alpha) \sqrt{ \frac{V_d}{N_d}}$

練習問題3の入会前の体重の母平均と入会後の体重の母平均との差$\mu_\text{A} - \mu_\text{B}$が取り得る範囲について、95%信頼区間で考えてみましょう。

#### 結果

練習問題3の$t$検定の実行結果から、入会前の母平均と入会後の母平均との差$\mu_\text{B} - \mu_\text{A}$の95%信頼区間は6.247064 &lt; $\mu_\text{B} - \mu_\text{A}$ &lt; 11.886269と求まりました。下側信頼限界は6.247064、上側信頼限界は11.886269で、下図の塗りつぶされた領域が全体の95%になっています。

{% screenshot 03_practice3_t_interval.png " " %}
{% screenshot 03_practice3_score_interval.png " " %}


課題1
-------

Rにデフォルトで入っているモルモットの歯のデータセット（ToothGrowth）を使って、以下の検定をしてみましょう。

ToothGrowthデータセットはモルモットにビタミンCを投与した時の歯の長さのデータです。  
「len：歯牙細胞（歯の成長を担う細胞）の長さ」「supp：ビタミンCの投与方法、OJはオレンジジュース、VCアスコルビン酸（ビタミンC）」「dose：ビタミンCの投与量（単位はmg/day）」

0.5mg/日でビタミンCを投与した場合、ビタミンCの接種方法（VC/OJ）によって歯の成長レベルに差があるといえるでしょうか。有意水準5％で検定してください。  

データセットは「ToothGrowth」で呼び出すことができます。例えば`df <- ToothGrowth`でdfという変数にデータを読み込むことができます。


課題2
-------

次のデータはＡ市内のあるレストランとＢ市内のあるレストランのアルバイトの時給を示しています。2地域のレストランのアルバイトの時給に差はあるでしょうか。有意水準5％で検定してください。

<br />
表5：Ａ市、Ｂ市のあるレストランのアルバイトの時給（円）
<table>
  <tr>
    <td>A市内レストラン（円）</td>
    <td>750</td>
    <td>880</td>
    <td>770</td>
    <td>850</td>
    <td>900</td>
    <td>800</td>
    <td>950</td>
    <td>780</td>
    <td>980</td>
    <td>900</td>
    <td>970</td>
    <td>950</td>
    <td>880</td>
    <td>830</td>
    <td>1000</td>
    <td>790</td>
    <td>920</td>
    <td>900</td>
    <td>870</td>
    <td>790</td>
  </tr>
  <tr>
    <td>B市内レストラン（円）</td>
    <td>990</td>
    <td>1100</td>
    <td>980</td>
    <td>950</td>
    <td>890</td>
    <td>1000</td>
    <td>960</td>
    <td>1050</td>
    <td>960</td>
    <td>850</td>
    <td>1000</td>
    <td>980</td>
    <td>920</td>
    <td>930</td>
    <td>970</td>
    <td>890</td>
    <td>1200</td>
    <td>850</td>
    <td>800</td>
    <td>900</td>
  </tr>
</table>


課題3
-------

次のデータは11人があるダイエット法によりダイエットを行った前後の体重を表しています。このダイエット法で体重の変化は見られたと言って良いでしょうか。有意水準5％で検定してください。また、2つの母平均の差を信頼係数95％で区間推定してください。

<br />
表6：あるダイエット法の前後の体重(kg)
<table>
 <tr>
    <th></th>
    <th>A</th>
    <th>B</th>
    <th>C</th>
    <th>D</th>
    <th>E</th>
    <th>F</th>
    <th>G</th>
    <th>H</th>
    <th>I</th>
    <th>J</th>
    <th>K</th>
  </tr>
  <tr>
    <td>ダイエット前の体重（kg）</td>
    <td>53.1</td>
    <td>50.3</td>
    <td>59.5</td>
    <td>62.0</td>
    <td>58.6</td>
    <td>56.5</td>
    <td>53.5</td>
    <td>74.2</td>
    <td>58.0</td>
    <td>59.2</td>
    <td>53.5</td>
  </tr>
  <tr>
    <td>ダイエット後の体重（kg）</td>
    <td>53.4</td>
    <td>48.8</td>
    <td>53.6</td>
    <td>58.2</td>
    <td>57.8</td>
    <td>53.0</td>
    <td>54.4</td>
    <td>59.3</td>
    <td>57.5</td>
    <td>60.0</td>
    <td>49.8</td>

  </tr>
</table>
