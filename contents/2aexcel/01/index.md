---
layout: page
title: コンピュータを用いた統計学の基礎知識
date: 2020-09-12 10:24:00 +0900
purposes:
    - 統計の基本について知る
    - Excelを用いて簡単な統計量を求める
---

<div class="panel panel-info">
<div class="panel-body">
今回使うファイルです。ダウンロードしてください。必要に応じてご利用ください。（ダウンロード後、ファイルが保護ビューで開かれた場合は、[編集を有効にする]をクリックしてください。）
<ul>
<li><a href="01_1.xlsx">ある20人の身長、体重、血液型(01_1.xlsx)</a></li>
</ul>
</div>
</div>

情報倫理講習会
--------------

担当教員の指示に従って受講し、終了後は「テスト/アンケート」より、情リテ情報倫理テストを受験してください。

*   [情報倫理講習会資料](/lit/infoethics/information_ethics_ja.pdf)
*   [情報倫理講習会資料(英語版)](/lit/infoethics/information_ethics_en.pdf)

Excelを用いた統計分析について
-----------

統計分析を行うためには、JMP（ジャンプ）やR、SPSSなどの専門的な統計ソフトウェアを使うこともありますが、Excelで統計分析を行うこともできます。

専門的な統計ソフトウェアを用いるためには、そのソフト独自の使い方やルールを1から学ぶ必要があり、慣れるまで使いにくさを感じることもあります。しかし、Excelの場合は、情報リテラシー実践Iで扱ってきた使い方の延長線上で利用できるため、より気軽に使うことができます。

本授業では、Excelの様々な操作を行います。もしExcelの基礎操作に不安がある方は、以下の情報リテラシー実践Iの内容を復習してから授業に臨みましょう。

* [表計算ソフトによるデータ処理（１）](../../office2019/excel/01/index.html)
* [表計算ソフトによるデータ処理（２）](../../office2019/excel/02/index.html)
* [表計算ソフトによるデータ処理（３）](../../office2019/excel/03/index.html)


データを数値で表現する方法
--------------------------

数値化されたデータを得るためには、<span id="universe">対象</span>（universe）がもつ特性である事象に数値（数字や記号）を割り当てる処理、すなわち、<span id="measurement">測定</span>（measurement）が必要になります。例えば、全世界の人間（対象）の性別（特性）を数値で表す場合、性別を測定していることになります。測定は<span id="scale">尺度</span>（scale of measurement）と呼ばれる規則に基づいて実施しますが、測定したい事象に応じて4つの尺度を適切に使う必要があります。

### 尺度の種類

#### 質的データ（qualitative data、特定の属性を表すデータ）

<dl>
  <dt id="nominal_scale">名義尺度（nominal scale）</dt>
  <dd>特性は<span id="category">カテゴリー</span>（category、水準）に分類され、データの区分にのみ意味があるものです。大小関係や順序関係は存在しません。データのタイプは数字か文字です。例として、性別や血液型などがあげられます。</dd>
  <dt id="ordinal_scale">順序尺度（ordinal scale）</dt>
  <dd>データの大小または、順位のみが意味を持つ尺度です。基本的には<a href="#mean">平均</a>や<a href="#standard_deviation">標準偏差</a>は使用せず、<a href="#median">中央値</a>を主に使用します。データタイプは数値か文字のどちらかで、数値であれば大きさで順序が決まり、文字であれば50音順やアルファベット順などで順序が決まります。例として、年代や各種のスケールなどがあげられます。</dd>
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

また、統計を使って分析されることの多いデータにアンケートの回答があります。分析の際に回答へ「1：悪い」「2：普通」「3：良い」といった数値を割り当てることがありますが、人によって「普通」という評価が「悪い」に近い場合と「良い」に近い場合とがありえます。このことから、等間隔とはいえませんが、順序だけは明確であるため、順序尺度であるといえます。しかし、実際に分析を行う際には、割り当てた数値を基に<a href="#mean">平均</a>や<a href="#variance">分散</a>、<a href="#deviation">偏差</a>などを求めることがあります。このときは、間隔尺度として扱っているといえます。



要約統計量の算出
----------------

Excelでは、関数などを利用して、入力したデータの<span id="summary_statistics">要約統計量</span>（summary statistics）を求めることができます。しかしながら、得られた統計量にどのような意味があるのかを理解しないことには、統計解析の結果を考察することはできません。

実際に例題を通して、それぞれの要約統計量について学んでいきましょう。


### 練習問題

Excelを用いて次のデータを入力し、要約統計量を求めてみましょう。

![表1](./pic/01_02exQ.png)



### データの入力

&#9312; Excelを開き、以下のようにデータを入力してください。すでにデータを入力してある　<a href="01_1.xlsx">ある20人の身長、体重、血液型(01_1.xlsx)</a>　を利用しても構いません。

{% screenshot 01_03table012.png "データの入力" %}

&#9313; 身長の単位をcmからmへ変換します。"C2"セルに<code>=A2/100</code>と半角で入力します。

{% screenshot 01_04table022.png "cmからmへの変換1" %}

{% screenshot 01_05table031.png "cmからmへの変換2" %}

&#9314; <span id="autofill"><a href="https://support.office.com/ja-jp/article/ビデオ-オートフィル-9BAD52FB-410D-470E-B17F-618C605E165B">オートフィル</a></span>を使って、全員の身長を変換します。"C2"セルの右下にある[■]の上にカーソルを持って行き、一気に"C21"セルまで引き延ばします。

{% screenshot 01_06table042.png "cmからmへの変換のオートフィル" %}

&#9315; 全員の身長がcmからmへ変換できました。

{% screenshot 01_07table052.png "変換のオートフィル後" %}


### 要約統計量の求め方

Excelの関数を利用して<a href="#summary_statistics">要約統計量</a>を求めてみましょう。

&#9312; 以下のように項目を入力してください。

{% screenshot 01_08table063.png "要約統計量の項目" %}

&#9313; "H2"セルに<code>=COUNTA(A2:A21)</code>と入力し、身長(cm)の<a href="#sample_size">標本の大きさ</a>$N$を求めます。

{% screenshot 01_09table073.png "標本の大きさ" %}

&#9314; 同様に以下のように入力します。

* "H3"：<code>=COUNTBLANK(A2:A21)</code>（<a href="#missing_value">欠損値</a>の個数）
* "H4"：<code>=SUM(A2:A21)</code>（<a href="#summation">合計</a>）
* "H5"：<code>=AVERAGE(A2:A21)</code>（<a href="#mean">平均</a>)
* "H6"：<code>=MAX(A2:A21)</code>（<a href="#maximum">最大値</a>）
* "H7"：<code>=MIN(A2:A21)</code>（<a href="#minimum">最小値</a>）
* "H8"：<code>=H6-H7</code>（<a href="#range">範囲</a>）
* "H9"：<code>=QUARTILE.EXC(A2:A21,3)</code>（<a href="#3rd_quartile">第3四分位数</a>）
* "H10"：<code>=MEDIAN(A2:A21）</code>（<a href="#median">中央値</a>）
* "H11"：<code>=QUARTILE.EXC(A2:A21,1)</code>（<a href="#1st_quartile">第1四分位数</a>）
* "H12"：<code>=MODE.SNGL(A2:A21)</code>（<a href="#mode">最頻値</a>）
* "H13"：<code>=VAR.S(A2:A21)</code>（<a href="#variance">分散</a>）
* "H14"：<code>=STDEV.S(A2:A21)</code>（<a href="#standard_deviation">標準偏差</a>）
* "H15"：<code>=SKEW(A2:A21)</code>（<a href="#skewness">歪度</a>）
* "H16"：<code>=KURT(A2:A21)</code>（<a href="#kurtosis">尖度</a>）
* "H17"：<code>=H14/H5*100</code>（<a href="#coefficient_of_variation">変動係数</a>）
* "H18"：<code>=H14/SQRT(H2)</code>（<a href="#standard_error">標準誤差</a>）

{% screenshot 01_10table082.png "要約統計量" %}

&#9315; <a href="#autofill">オートフィル</a>を使って、体重(kg)と身長(m)についても要約統計量を求めます。"H2"セルから"H18"セルまでを選択し、右下にある[■]をドラッグして"J18"セルまで引き延ばします。

{% screenshot 01_11table092.png "要約統計量のオートフィル" %}

&#9316; 体重(kg)と身長(m)の要約統計量が求められました。

{% screenshot 01_12table102.png "要約統計量のオートフィル後" %}

### 度数分布

&#9312; 血液型は<a href="#nominal_scale">名義尺度</a>なので<a href="#summary_statistics">要約統計量</a>はありませんが、<a href="#category">カテゴリー</a>に属するデータの個数である<a href="#frequency">度数</a>を求めます。"L2"セルに<code>=COUNTIF(D$2:D$21,K2)</code>と入力し、A型の度数を求めます。

{% screenshot 01_13table112.png "A型の度数1" %}

{% screenshot 01_14table121.png "A型の度数2" %}

&#9313; <a href="#autofill">オートフィル</a>を使って、他の血液型についても度数を求めます。"L2"セルの右下にある[■]をドラッグして"L5"セルまで引き延ばします。

{% screenshot 01_15table131.png "度数のオートフィル" %}

{% screenshot 01_16table141.png "度数のオートフィル後" %}

&#9314; A型の<a href="#relative_frequency">相対度数</a>も求めます。"M2"セルに<code>=L2/SUM(L$2:L$5)</code>と入力します。


{% screenshot 01_17table151.png "A型の相対度数1" %}

{% screenshot 01_18table161.png "A型の相対度数2" %}

&#9315; <a href="#autofill">オートフィル</a>を使って、他の血液型についても相対度数を求めます。"M2"セルの右下にある[■]をドラッグして"M5"セルまで引き延ばします。


{% screenshot 01_19table171.png "相対度数のオートフィル" %}

{% screenshot 01_20table181.png "相対度数のオートフィル後" %}


要約統計量の意味
----------------

<a href="#nominal_scale">名義尺度</a>・<a href="#ordinal_scale">順序尺度</a>の場合に求められる統計量には、各<a href="#category">カテゴリー</a>あるいは階級（class）のデータ数（<span id="frequency">度数</span>、frequency）とその度数が全体のデータ数（総度数）に占める割合（<span id="relative_frequency">相対度数</span>、relative frequency）とがあります。<a href="#continuous_scale">連続尺度</a>の場合に求められる主要な<a href="#summary_statistics">要約統計量</a>には、<a href="#quantile">分位数</a>、<a href="#mean">平均値</a>、<a href="#median">中央値</a>、<a href="#mode">最頻値</a>、<a href="#range">範囲</a>、<a href="#variance">分散</a>、<a href="#standard_deviation">標準偏差</a>、<a href="#skewness">歪度</a>、<a href="#kurtosis">尖度</a>などがあります。

それぞれの統計量の意味は以下のとおりです。

#### <span id="missing_value">欠損値（missing value）</span>

測定値が得られていない項目がある場合、有効でないことが明らかな値を入力します。Excelでは空白のままにしたり、マイナス記号（-）を入力したりすることが多いようです。


#### <span id="sample_size">標本の大きさ（sample size）$N$</span>

欠損値以外の測定値の数です。<a href="https://support.office.com/ja-jp/article/COUNTA-関数-7dc98875-d5c1-46f1-9a82-53f3219e2509"><code>COUNTA</code>関数</a>を用いることで、求められます。

#### <span id="summation">合計（summation）</span>

欠損値以外の測定値の合計値です。

$\displaystyle \left( x_1 + x_2 + \dots + x_N \right) = \sum_{i = 1}^N x_i$

$x_i$は標本の$i$番目の測定値、$N$は<a href="#sample_size">標本の大きさ</a>です。例えば標本に1，3，4，6，7の5個の測定値があったとき、合計は1 + 3 + 4 + 6 + 7 = 21です。

<a href="https://support.office.com/ja-jp/article/SUM-関数-043e1c7d-7726-4e80-8f32-07b23e057f89"><code>SUM</code>関数</a>を用いることで、求められます。

#### <span id="mean">平均（mean）</span>

測定値の算術平均を表します。<a href="#summation">合計</a>を<a href="#sample_size">標本の大きさ</a>$N$で割った値です。

$\displaystyle \bar{x}=\frac{1}{N}\left ( x_1+x_2+_\cdots+x_N \right )$

$N$は<a href="#sample_size">標本の大きさ</a>、$x_i$は標本の$i$番目の測定値です。例えば1，3，4，6，7であれば、平均は21 ÷ 5 = 4.2です。

<a href="https://support.office.com/ja-jp/article/AVERAGE-関数-047bac88-d466-426c-a32b-8f33eb960cf6"><code>AVERAGE</code>関数</a>を用いることで、求められます。

#### <span id="maximum">最大値（maximum）</span>

欠損値を除く測定値の最大値です。例えば1，3，4，6，7であれば7が最大値です。

<a href="https://support.office.com/ja-jp/article/MAX-関数-e0012414-9ac8-4b34-9a47-73e662c08098"><code>MAX</code>関数</a>を用いることで、求められます。

#### <span id="minimum">最小値（minimum）</span>

欠損値を除く測定値の最小値です。例えば1，3，4，6，7であれば1が最小値です。

<a href="https://support.office.com/ja-jp/article/MIN-関数-61635d12-920f-4ce2-a70f-96f202dcc152"><code>MIN</code>関数</a>を用いることで、求められます。

#### <span id="range">範囲（レンジ、range）</span>

測定値が分布する範囲を示します。範囲R = <a href="#maximum">最大値</a> - <a href="#minimum">最小値</a>で求めることができます。例えば1，3，4，6，7であれば範囲R = 7 - 1 = 6です。

#### <span id="quantile">分位数（quantile）</spam>

分位点とも呼びます。測定値を大きさの順に並べ、測定値の個数が等しくなるように複数のグループに分割した時のグループ間の境界値のことを言います。どの値までが全体のどれくらいの割合を占めるかの見当をつけるのに用います。特に、100グループに分割する場合は百分位数（パーセンタイル、percentile）、4グループに分割する場合は四分位数（quartile）と呼びます。<span id="1st_quartile">第1四分位数</span>（first quartile）は小さいほうから25%に当たる値、<span id="3rd_quartile">第3四分位数</span>（third quartile）は大きいほうから25%に当たる値になります。四分位数は<a href="https://support.office.com/ja-jp/article/QUARTILE-EXC-関数-5a355b7a-840b-4a01-b0f1-f538c2864cad"><code>QUARTILE.EXC</code>関数</a>を用いることで、求められます。

#### <span id="median">中央値（メディアン、median）</span>

50パーセンタイル、第2四分位数とも言い、測定値を大きさの順に並べたときに全体の中央に位置する値です。例えば1，3，4，6，7であれば4が中央値です。

<a href="https://support.office.com/ja-jp/article/MEDIAN-関数-d0916313-4753-414c-8537-ce85bdd967d2"><code>MEDIAN</code>関数</a>を用いることで、求められます。

#### <span id="mode">最頻値（モード、mode）</span>

測定値の中で最大の<a href="#frequency">度数</a>を持つ値です。例えば1，3，4，4，6，7であれば4の数が最も多いので、4が最頻値になります。

<a href="https://support.office.com/ja-jp/article/MODE-SNGL-関数-f1267c16-66c6-4386-959f-8fba5f8bb7f8"><code>MODE.SNGL</code>関数</a>を用いることで、求められます。

#### <span id="variance">分散（variance）</span>

Excelでは不偏分散（unbiaded variance）を指し、各測定値と<a href="#mean">平均</a>との差である<span id="deviation">偏差</span>（deviation）を2乗することで符号を消し、その合計（<span id="sum_of_squared_deviations">偏差平方和</span>（sum of squared deviations）$S$）を$N - 1$で割ったものです。平均値からのデータの散らばり具合を把握するのに用います。

$\displaystyle V = \frac{S}{N - 1}$

$\displaystyle S = {\left( x_1 - \bar{x} \right)}^2 + {\left( x_2 - \bar{x} \right)}^2 + \dots + {\left( x_N - \bar{x} \right)}^2 = \sum_{i = 1}^N {\left( x_i - \bar{x} \right)}^2$

$V$は分散、$N$は<a href="#sample_size">標本の大きさ</a>、$x_i$は標本の$i$番目の測定値、$\bar{x}$は<a href="#mean">平均</a>です。例えば1，3，4，6，7であれば分散は{(1 - 4.2)<sup>2</sup> + (3 - 4.2)<sup>2</sup> + (4 - 4.2)<sup>2</sup> + (6 - 4.2)<sup>2</sup> + (7 - 4.2)<sup>2</sup>} ÷ (5 - 1) = 5.7となります。<a href="../02/#population">母集団</a>（対象全体に対して測定したデータ、例えば日本人全員の身長など）の平均（母平均）が未知であることを前提としていて、（<a href="../02/#sample">標本</a>）平均$\bar{x}$を用いて母分散を求めるため、自由度$N - 1$で割ります。

<a href="https://support.office.com/ja-jp/article/VAR-S-関数-913633de-136b-449d-813e-65a00b2b990b"><code>VAR.S</code>関数</a>を用いることで、求められます。

#### <span id="standard_deviation">標準偏差（standard deviation）</span>

Excelでは<a href="#variance">分散</a>（不偏分散）$V$の平方根をとった値で、分散同様散らばり具合の尺度になります。単位と次数とが<a href="#deviation">偏差</a>と同じです。

$s = \sqrt{V} = \sqrt{\frac{1}{n-1}\sum ^{N}_{i=1}{(x_i-\bar{x})^2}}$

$s$は標準偏差です。例えば1，3，4，6，7であれば標準偏差は分散の平方根をとって、2.387467...になります。

<a href="https://support.office.com/ja-jp/article/STDEV-S-関数-7d69cf97-0c1f-4acf-be27-f3e83904cc23"><code>STDEV.S</code>関数</a>を用いることで、求められます。

#### <span id="skewness">歪度（skewness）</span>

測定値の分布の非対称性を測る尺度です。

* 歪度 = 0 : 左右対称
* 歪度 &gt; 0 : 右に裾がのびる
* 歪度 &lt; 0 : 左に裾がのびる

![歪度](./pic/01_04warp.png)

<a href="https://support.office.com/ja-jp/article/SKEW-関数-bdf49d86-b1ef-4804-a046-28eaea69c9fa"><code>SKEW</code>関数</a>を用いることで、求められます。

#### <span id="kurtosis">尖度（kurtosis）</span>

測定値の分布の裾の長さを測る尺度です。

* 尖度 = 0 : 正規分布
* 尖度 &gt; 0 : 正規分布よりも尖っている
* 尖度 &lt; 0 : 正規分布よりも平坦である

![尖度](./pic/01_05sharp.png)

<a href="https://support.office.com/ja-jp/article/KURT-関数-bc3a265c-5da4-4dcb-b7fd-c237789095ab"><code>KURT</code>関数</a>を用いることで、求められます。

#### <span id="coefficient_of_variation">変動係数（coefficient of variation）</span>

<a href="#standard_deviation">標準偏差</a>を<a href="#mean">平均</a>で割った値で、平均を考慮した上で散らばり具合を相対的に比較するのに便利な指標です。

$s / \bar{x}$

$s$は標準偏差、$\bar{x}$は平均です。

#### <span id="standard_error">標準誤差（standard error）</span>

<a href="#standard_deviation">標準偏差</a>を<a href="#sample_size">標本の大きさ</a>$N$の平方根で割った値で、平均に関する検定や推定で用いられます。<a href="#mean">平均</a>の標準誤差とも呼ばれます。

$s / \sqrt{N}$

$s$は標準偏差、$N$は標本の大きさです。

課題
----

練習問題のE列に<abbr id="bmi" title="body mass index">BMI</abbr>を求めてみましょう。

BMIとは、BMI = 体重(kg) ÷ 身長(m)<sup>2</sup> で求められる肥満の判定指数のことです。