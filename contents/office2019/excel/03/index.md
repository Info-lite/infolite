---
layout: page
title: 表計算ソフトによるデータ処理（３）
date: 2016-03-15 17:03:47 +0900
purposes:
    - ソートやフィルターの使い方の理解
---


Excelにはデータベースとしての機能もあります。その中の、ソートとフィルターについて説明します。

以下では、[統計表](./population.xlsx) を用いて説明します。元のデータは、平成27年度の国勢調査です。

-   [第1表 人口，人口増減（平成22年〜27年），面積及び人口密度](http://www.e-stat.go.jp/SG1/estat/GL08020103.do?_csvDownload_&fileId=000007591144&releaseCount=2)

<div class="panel panel-default">
<div class="panel-body">
注) 国勢調査令（昭和55年政令第98号）の規定に基づき，調査の対象から除外された次の地域の面積を除いて算出した。
<ul>
<li>歯舞群島(99.94km<sup>2</sup>)</li>
<li>色丹島(253.33km<sup>2</sup>)，国後島(1498.83km<sup>2</sup>)及び択捉島(3184.04km<sup>2</sup>) (属島を含む)</li>
<li>竹島(0.23km<sup>2</sup>)</li>
</ul>
また、一部境界未定のため，総務省統計局において推定した。
</div>
</div>


ソート
------

データの並び替えを行います。

### 簡易並べ替え

並べ替える基準になるセルを選択します。そして[ホーム]リボン - [編集]グループ - [並び替えとフィルター]をクリックします。
その後、[昇順]もしくは[降順]をクリックして、並び替えを行います。

{% screenshot az1.png "並び替えとフィルターを選択" %}

並び替えが行われました。

{% screenshot az3.png "並び替えの結果" %}

文字列以外にも、数値を並び替えることも出来ます。下の例は、"平成22年"を昇順で並び替えたものです。

{% screenshot az4.png "並び替え" %}

### 通常の並び替え

さらに複雑な並び替えをする場合、こちらの方法を用います。

まず、[ホーム]リボン - [編集]グループ - [並び替えとフィルター] - [ユーザー設定の並び替え]をクリックします。

{% screenshot sort1.png "ユーザー設定並び替えを選択" %}

すると、以下のようなウィンドウが開きます。

{% screenshot sort2.png "並び替え設定ウィンドウ" %}

ここでは、複数の条件の並べ替えを行うことが出来ます。[レベルの追加]をクリックして、新たに条件キーを追加してみましょう。

{% screenshot sort3.png "並び替え条件の追加（レベルの追加）" %}

条件キーは上から順番に適用されていきます。
また、[並び替えオプション]をクリックすると、さらにいろいろなオプションを指定することができます。

{% screenshot sort4.png "条件の詳細設定" %}


フィルター
--------

Excelには、フィルターというデータを抽出する機能があります。

### オートフィルター

まず、表内の適当なセルを選択後、[ホーム]リボン - [編集]グループ - [並び替えとフィルター] - [フィルター]をクリックしましょう。

{% screenshot filter1.png "フィルターを選択" %}

{% screenshot filter2.png "フィルター状態" %}

このフィルターは[ホーム]リボン - [編集]グループ - [並び替えとフィルター] - [フィルター]を再度押すことで解除することができます。

**フィールド名の行のセルの一部が結合されていたり、同じ名前のフィールドがあるとうまくいかないことがあります。**

各フィールド名に ![](pic/filter.png) がつきました。クリックしてみましょう。

{% screenshot filter3.png "フィルター設定メニュー" %}

出てきたメニューで要素を抽出したり、並び替えを行うことが出来ます。
ここでは、試しに[数値フィルター] - [トップテン]をクリックしてみましょう。

{% screenshot top1.png "「トップテン」を選択" %}

"トップテン オートフィルター"ダイアログが出てきます。各項目を適切に設定して、[OK]をクリックしましょう。

{% screenshot top2.png "トップテンの設定" %}

すると、条件にあうレコードのみ表示されます。
これだけでは見にくいので、さらに降順に並び替えをするとよいでしょう。
また、元に戻したいときは、"すべて選択”をクリックします。
[ホーム]リボン - [編集]グループ - [並び替えとフィルター] - [クリア]でもできます。

{% screenshot top3.png "フィルターの解除" %}

次に、テキストでの検索を行ってみます。
[テキストフィルター] - [指定の値を含む]をクリックしてみましょう。

{% screenshot textfilter1.png "「指定の値を含む」を選択" %}

{% screenshot textfilter2.png "オートフィルター ― オプションの設定" %}

このように、さらに複雑な条件での抽出ができます。
また、`?` や `*` のワイルドカードも使用できます。

{% screenshot textfilter4.png "ワイルドカードの利用" %}

上の例では、条件を "を含む" から "と等しい" に変えて、`*しま*` と入力しました。
これはさきほどのものと全く同じ意味です。[OK]をクリックします。

{% screenshot textfilter3.png "「しま」が付く都道府県の抽出" %}

すると、県名に "しま" が含まれるもののみ抽出されました。

さらに、条件を表で指定することもできます。
まず、以下の表を適当な場所に作成しましょう。
今回は "K3" と "K4" に入力してみます。

{% screenshot textfilter7.png "条件式" %}

次に、[データ]リボン - [並び替えとフィルター]グループ - [詳細設定]をクリックします。

{% screenshot textfilter5.png "並び替えの詳細設定（ポップヒント：詳細設定による複雑な条件指定）" %}

[リスト範囲]は既に正しく選択されていることを確認してください。
[検索条件範囲]に、先ほど作成した表を指定しましょう。

{% screenshot textfilter6.png "条件式の指定" %}

[抽出先]を[選択範囲内]のままにすると、今まで同様、条件に合わない部分が非表示になった表となります。
[指定した範囲]を選択すると、下の"抽出範囲"がアクティブになります。
これを使うと、条件にあうレコードのみの新しい表が作成されます。
"抽出範囲"には、新たに表を作成したい範囲を指定します。

今回は `A60:I60` に表を作成してみます。

{% screenshot textfilter8.png "条件式によって抽出された表" %}

とても便利な機能です。覚えておきましょう。

この他にも、ピボットテーブルやVBAといったものもあります。興味がある人は調べてみましょう。

