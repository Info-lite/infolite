---
layout: page
title: 相関分析
date: 2016-09-30 10:02:25 +0900
purposes:
    - 相関分析について学ぶ
    - 相関関係を実際に調べてみる
---


相関分析
--------

### 相関関係

2つの変数xとyがあるときに、xの変化に伴って、yも変化するような関係を**相関関係**といいます。
相関関係を調べるには散布図や相関係数を用います。

相関関係には正の相関関係と負の相関関係、無相関に分けられます。
この正負は後で述べる相関係数によって変わります。

-   正の相関関係 : xが増加していったとき、yも増加している。xとyが比例している関係。
-   負の相関関係 : xが増加していったとき、yは減少している。xとyが比例(傾きが負)している関係。
-   無相関 : xとyに関係が見出せない。


散布図
------

相関関係の有無を視覚的に表す図です。
2つの変数の内、一方を横軸にとり、もう一方を縦軸にとって、対応するデータを 1 点ずつプロットしていきます。

{% screenshot 06_01dust.png "散布図" %}

### 散布図の分析

散布図の分析では以下のような点に着目します。

-   はずれ点がないか
-   2つの変数xとyの間にはどのような関係があるか &rarr; 直線／曲線／無関係
-   グループが形成されているか

上図を見てみると、ある程度の点が身長 145〜170、体重 40〜70 の範囲でグループを形成しているように見えます。
そのグループは左下から右上がりになっていて、身長と体重には比例の関係があるように思われます。
体重 80 以上に幾つかはずれ点が見らますが、大幅に外れているとはいえなさそうです。

このように視覚的に分布を見ることによって、xとyの 2 変数の関係に方向性が見えてきます。
その方向性がデータをよく表しているかどうか、計算によって判定します。

### 練習問題 1

次のデータは、あるクラスの生徒20人の身長（x）と足のサイズ（y）を測定したものです。このデータをグラフで表現し、身長xと体重yの関係を把握してください。

表 1  : 20 人の身長と足のサイズ（0:男性 1:女性）

{% screenshot 06_02.png "20人の身長と足のサイズ" %}

### Excelの操作

まず、データをExcelに入力します。

-   A列の1行目に"身長"と入力し、20人分の身長を順に入力。
-   B列の1行目に"足のサイズ"と入力し、20人分の足のサイズを入力。
-   C列の1行目に"性別"と入力し、男性を0、女性を1として20人分の性別を入力。

このように、データを入力してください。

{% screenshot 06_03.png "データ入力" %}

### 並べ替え

&#9312; 次のようにデータを3列分選択して[ホーム]リボン - [並べ替えとフィルター] -
[ユーザー設定の並べ替え]をクリックします。

{% screenshot 06_04rank.png "並べ替え1" %}

&#9313; 最優先されるキーを[性別]と選択し、以下の設定で並べ替えを実行します。

{% screenshot 06_05rank.png "並べ替え2" %}

出力結果

性別を基準に、身長・足のサイズもともに並べ替えられています。

{% screenshot 06_06rank.png "並べ替え後" %}

### 散布図

&#9312; まず、男性(0)のみ9人分の身長と足のサイズを選択して、[挿入]リボンのグラフの中から[散布図]をクリック -
[散布図(マーカーのみ)]をクリックして散布図を挿入します。

{% screenshot 06_07man.png "散布図1" %}

&#9313; このようなグラフが出来上がります。

{% screenshot 06_08man.png "散布図2" %}

&#9314; 女性でも同様に散布図を作成します。

{% screenshot 06_09women.png "散布図3" %}

&#9315; 男性のグラフを選択した状態で、グラフツールの[デザイン]リボンの[データの選択]をクリックします。

{% screenshot 06_10legend.png "凡例の変更1" %}

&#9316; 凡例項目で足のサイズが選択されていることを確認し、[編集(E)]をクリックします。

{% screenshot 06_11legend.png "凡例の変更2" %}

&#9317; 系列名に"男性"と入力し、決定します。

{% screenshot 06_12legend.png "凡例の変更3" %}

&#9318; 男性のグラフをコピーし、女性のグラフ上に貼り付けます。

{% screenshot 06_13scatter.png "散布図4" %}

男女でマーカーの異なる散布図ができました。

マーカーがわかりやすくなるように凡例を出しましょう。
グラフを選択した状態でグラフツール[デザイン]リボンの[グラフのレイアウト]から[グラフ要素の追加]をクリック、[凡例]にカーソルを合わせて表示したい位置を選択します。

{% screenshot 06_14scatter.png "散布図5" %}

&#9319; グラフを整えていきます。
足のサイズは 20〜30 cmまで表示すれば十分なので、縦軸を選択したあと右クリックして、[軸の書式設定]から最小値と最大値を設定します。
最小値を20、最大値を30、[単位]の目盛を2、目盛の種類を内向きにします。

{% screenshot 06_15axis.png "軸の書式設定1" %}

{% screenshot 06_16axis.png "軸の書式設定2" %}

同じように横軸を選択し、[軸の書式設定]からも最小値を150、最大値を190に設定し、目盛りの種類を内向きにします。

{% screenshot 06_17scatter.png "散布図6" %}

&#9320; また、より見やすくするために、次のようにグラフを設定してください。

-   グラフのタイトルを"身長と足のサイズの相関"にする
-   目盛り線は消す
-   横軸ラベルを"身長(cm)"縦軸ラベルを"足のサイズ(cm)"として軸ラベルを作成する

方法がわからない場合は[表計算ソフトによるデータ処理（２）](../../excel/02/index.html)を参照してください。

出力結果

{% screenshot 06_18scatter.png "散布図7" %}

散布図を見ると、左下から右上がりに点が分布しているように見えます。
身長と足のサイズには正の相関関係があるのかもしれません。
それを確かめるために、次の項で相関係数を求めます。

また、グラフ中の字のサイズや枠線の設定などを変更して、より自分の見やすいように工夫することもできます。

{% screenshot 06_19scatter.png "散布図8" %}


相関係数
--------

相関係数は、相関関係の有無を数量的に調べるために用います。

-   相関係数 *r* の範囲 :  -1 &le; *r* &le; 1
    -   値が + のとき、正の相関関係があるといいます
    -   値が - のとき、負の相関関係があるといいます
    -   値が 0 に近い場合は、無相関であるといいます

相関係数 *r* は以下の数式で求めることができます。

{% screenshot 06_r.png "相関係数 *r* " %}

また、相関係数の絶対値によって、その相関の強さがわかります。

-   0.7 &le; | *r* | 強い相関あり

<div class="row">
<div class="col-sm-6 col-xs-12">
<img src="pic/correlation_08.png" alt="強い正の相関を示す散布図 (r = 0.826)" class="img-responsive" />
</div>
<div class="col-sm-6 col-xs-12">
<img src="pic/correlation_-08.png" alt="強い負の相関を示す散布図 (r = -0.79)" class="img-responsive" />
</div>
</div>

-   0.4 &le; | *r* | &lt; 0.7 中程度の相関あり

<div class="row">
<div class="col-sm-6 col-xs-12">
<img src="pic/correlation_05.png" alt="中程度の正の相関を示す散布図 (r = 0.539)" class="img-responsive" />
</div>
<div class="col-sm-6 col-xs-12">
<img src="pic/correlation_-05.png" alt="中程度の負の相関を示す散布図 (r = -0.60)" class="img-responsive" />
</div>

-   0.2 &le; | *r* | &lt; 0.4 弱い相関あり

<div class="row">
<div class="col-sm-6 col-xs-12">
<img src="pic/correlation_03.png" alt="弱い正の相関を示す散布図 (r = 0.306)" class="img-responsive" />
</div>
</div>

-   | *r* | &lt; 0.2 ほとんど相関なし

<div class="row">
<div class="col-sm-6 col-xs-12">
<img src="pic/correlation_0.png" alt="ほとんど相関がない散布図 (r = 0.192)" class="img-responsive" />
</div>
</div>

### 練習問題 2

練習問題  1のデータから、相関係数を求めてみましょう。

### Excelの操作

練習問題 1 を継続して使用します。

男女別に身長と足のサイズの間に相関があるといえるかを求めてみましょう。

まずは、男性(0)から確かめます。

&#9312; 適当なセルを選択し、"男性の身長と足のサイズの相関"と入力しておきます。

&#9313; [データ]リボン - [データ分析]をクリックします。

{% screenshot 06_26r.png "データ分析の説明" %}

&#9314; [相関]を選択し[OK]をクリックします。

{% screenshot 06_27r.png "相関分析（男性）1" %}

&#9315; 次のように入力し、[OK]をクリックして相関分析をします。

-   [入力範囲]に、男性の身長と足のサイズが入力されている範囲を選択する。（先頭の行に文字を含んでいてOK）
-   [先頭行をラベルとして使用]にチェックを入れる。
-   出力先に、適当なセルを選択する。

{% screenshot 06_28r.png "相関分析（男性）2" %}

出力結果

{% screenshot 06_29r.png "相関分析（男性）の出力結果" %}

身長と足のサイズの相関として表示されているF5のセルの値が今回求める相関係数です。

これで相関係数 *r* = 0.840923 と求められました。
ここから、男性について、身長と足のサイズには強い正の相関関係が成り立つことがわかります。

身長が大きくなるにつれて足のサイズも大きくなるといえそうです。

&#9316; 女性についても同様に相関係数を求めましょう。
その際に、ラベルとなる1行目を選択、コピーし、11行目に[コピーしたセルの挿入]をすると男性の場合と同じように求められます。

{% screenshot 06_30r.png "相関分析（女性）1" %}

出力結果

{% screenshot 06_31r.png "相関分析（女性）の出力結果" %}

相関係数 *r* = 0.52698 と求められました。
男性ほど高くはないようですが、中程度の相関があるといえそうです。

### 論文では

論文では下記のようになります。

>   表1に関して、男性について相関係数を求めたところ、強い正の相関関係が認められた (*r* = 0.840923)。
>   よって、男性は身長が高くなるにしたがって、足のサイズは大きくなる傾向があるといえる。
>
>   また、女性についても求めたところ、中程度の正の相関が認められた (*r* = 0.52698)。
>   よって、女性も身長が高くなるにしたがって、足のサイズは大きくなる傾向があるといえる。

**なお、相関関係が見られたからといって、一方がもう片方の原因になっている、という因果関係が示されたわけではありませんので、注意しましょう。**

**また、標本数が少ない場合、求めた相関係数が信頼できる値とはいえない場合もあります。そのため、次項の相関係数の検定が行われます。**


相関係数の検定
--------------

### 練習問題 3

練習問題 1のデータに関して、無相関の検定をしてみましょう。

### 無相関の検定

幾つかの標本が得られたときに、その相関係数を求めます。
その標本から得られた相関係数 *r* とは別に母集団の母相関係数 *&rho;* が存在します。

-   母集団の相関係数 : 母相関係数 *&rho;*
-   標本の相関係数  : （標本）相関係数 *r*

標本は母集団全体を表しているわけではないので、母相関係数 *&rho;* = 相関係数 *r* とは言えません。
母相関係数 *&rho;* = 0 でも相関のある標本が抽出された場合もありえます。

そこでまず、母相関係数 *&rho;* = 0 かどうかを検定します。
これを **無相関の検定** と言います。

### 仮説の設定

-   帰無仮説 H<sub>0</sub> : *&rho;* = 0 母相関係数は 0 である（相関係数が存在しない）
-   対立仮説 H<sub>1</sub> : *&rho;* &ne; 0 母相関係数は 0 ではない（相関係数が存在する）

### 有意水準 *&alpha;* の設定

有意水準 *&alpha;* = 0.05 とします。

### 検定統計量 *t* 値の算出

今回は以下の数式で検定統計量 *t* 値を求められます。

{% screenshot 06_33t.png "検定統計量t値" %}

### *p* 値の算出

有意水準と比較する確率 *p* 値を計算します。*p* 値はt分布において、| *t* |以上の値が発生する確率です。

### 判定

*p* 値 &le; 有意水準 *&alpha;* &rarr; 帰無仮説 H<sub>0</sub>を棄却する

*p* 値&gt;有意水準 *&alpha;* &rarr; 帰無仮説 H<sub>0</sub>を棄却しない

### Excelの操作

引き続き、練習問題 1 を継続して使用します。

身長と足のサイズについて求めた相関係数は有意なものといえるでしょうか？

&#9312; 先ほどの続きに、相関係数や *t* 値などを求めていきます。
次のように準備をしてください。

-   I2のセルに"無相関検定(男性)"と入力する
-   その下のセルから順に、"相関係数"
-   "標本数n"
-   "t値"
-   "自由度"
-   "p値" と入力。

このようになります。

{% screenshot 06_34no.png "無相関検定1" %}

&#9313; "相関係数"と入力したセルの隣 "J3" に、先ほど求めた男性の身長と足のサイズの相関係数を入力します。

{% screenshot 06_35no.png "無相関検定2" %}

&#9314; "標本数n"の隣 "J4" には、標本数 (= ここでは男性の人数) を入力します。
今回は標本数が少ないので自分でも数えられますが、標本数が多い場合のことも考えて、`COUNT` 関数を使います。

[数式]リボン - [関数の挿入] から `COUNT` 関数を選択し、男性の身長の全データを選択範囲として、男性の人数を数えます。

{% screenshot 06_36count.png "count" %}

出力結果

{% screenshot 06_37count.png "countの出力結果" %}

&#9315; 次に、上記 *t* 値を求める式を参考にして数式を入力し、*t* 値を求めます。
"t値"の隣 "J5" に`=ABS(J3*SQRT(J4-2)/SQRT(1-J3^2))` と入力します。

出力結果

{% screenshot 06_38no.png "t 値" %}

&#9316; 自由度を求めます。
ここでは 人数 - 2 となるよう、"J6"に `=J4-2` と入力します。

出力結果

{% screenshot 06_39no.png "自由度" %}

これまで求めた値をもとに、*p* 値を求めます。
[数式]リボン - [関数の挿入] から `TDIST` 関数を選択します。

Xに *t* 値 `J5`、自由度に `J6`、分布は両側検定として `2` と指定し、OKをクリックします。

{% screenshot 06_40no.png "TDIST 関数" %}

出力結果

{% screenshot 06_41no.png "TDIST 関数の算出結果" %}

*p* 値は 0.003786 と求められました。
*p* 値 = 0.003786 &lt; 有意水準 *&alpha;* = 0.05 なので、帰無仮説 H<sub>0</sub> は棄却されます。
すなわち、男性の身長と足のサイズの間には、有意な相関が存在するといえます。
また、相関係数は 0.849023 と強い相関が認められるため、身長が大きくなると足のサイズも大きくなると判断されます。

また、女性についても同様に無相関検定を行います。

出力結果

{% screenshot 06_42no.png "無相関検定" %}

*p* 値は 0.095784 と求められました。
*p* 値 = 0.095784 &gt; 有意水準 *&alpha;* = 0.05 なので、帰無仮説 H<sub>0</sub> は棄却されません。
先ほど求めた女性の身長と足のサイズの相関係数は有意ではないということになりました。

実際はここから、今回のデータでは、身長は高くても足のサイズは大きくない女性もいたり、
データにばらつきがあったために有意ではないという結果になったと考えられる、などと考察を進めていきます。
一般に、標本数が少ないほど、有意な相関は認めにくくなります。

### 論文では

論文では以下のような形になります。

>   男性の身長と足のサイズの相関(n = 9)
>
>   ![論文](pic/06_43male.png)
>
>   女性の身長と足のサイズの相関(n = 11)
>
>   ![論文](pic/06_44female.png)
>
>   上の表は、男性、女性それぞれの身長と足のサイズについての平均および標準偏差を示したものである。
>
>   ![論文](pic/06_19scatter.png)
>
>   また、上図はその散布図である。
>
>   男性については相関係数 *r* = 0.840923 であり、t検定を行ったところ有意であった（*p* &lt; 0.05）。
>   よって、男性では身長が大きくなると足のサイズが大きくなるといえる。
>
>   女性については相関係数 *r* = 0.52698 であり、t検定を行ったところ有意ではなかった（*p* &gt; 0.05）。
>   よって、この女性の集団からは身長が大きくなると足のサイズが大きくなるとはいえない。


課題
------

次の表は、あるクラスの生徒 10 名を対象に行った家庭のCD数と音楽の試験結果（得点）の調査をまとめた表です。
CD数と音楽の得点には相関関係が見られるでしょうか。

相関係数を求め、無相関検定をし、相関関係を考察してください。

表 3  : CD数（枚）と音楽の得点（点）

{% screenshot 06_45.png "CD数（枚）と音楽の得点（点）" %}
