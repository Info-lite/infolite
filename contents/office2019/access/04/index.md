---
layout: page
title: クエリ
date: 2016-03-10 13:49:00 +0900
purposes:
    - クエリの使い方を学ぶ
    - クエリを新規作成し、必要な形式で保存する
---


クエリ
------

前回から引き続いて、"Clist.accdb"を使用します。開いてください。


### デザインビューでクエリを作成する

&#9312; [作成]タブ - [クエリ] - [クエリデザイン]をクリックします。

{% screenshot newquery1.png "クエリデザイン アイコンの場所" %}

&#9313; テーブルから"サークル名簿"を選択 - [追加]をクリックします。

{% screenshot newquery2.png "[サークル名簿]テーブルの追加" %}

&#9314; クエリ デザイン ウィンドウにテーブルが追加されました。[閉じる]をクリックします。

{% screenshot newquery3.png "テーブル追加後" %}

&#9315; "サークル名簿"の"会員ＩＤ"をダブルクリックします。すると、フィールドに会員ＩＤが追加されます。

{% screenshot newquery4.png "フィールドに会員ＩＤを追加" %}

&#9316; 同様に以下を追加します。

-   氏名
-   フリガナ
-   入会年月日
-   学部学科コース
-   退会

{% screenshot newquery5.png "フィールド追加後" %}

&#9317; ![](../pic/databaseview.png) （[表示]）もしくは ![](../pic/action.png) （[実行]）をクリックします。

{% screenshot newquery6.png "実行アイコンの場所" %}

{% screenshot newquery7.png "クエリ実行後" %}

&#9318; ![](../pic/quicksave.png) をクリックして、"入会日と所属"という名前でクエリを保存します。

{% screenshot newquery8.png "保存アイコンの場所" %}

{% screenshot newquery9.png "クエリ保存後" %}

このようにして、"入会年月日"と"学部学科コース"、"退会"情報に特化したクエリを作ることができました。


### 並べ替えを設定する

&#9312; "デザインビュー"に切り替えます。

&#9313; "フリガナ"フィールドの並べ替えをクリック - "昇順"を選択します。

{% screenshot sortname1.png "[フリガナ]フィールドの並べ替えを[昇順]に設定" %}

&#9314; ![](../pic/databaseview.png) もしくは ![](../pic/action.png) をクリックし表示を切り替え、上書き保存します。

{% screenshot sortname2.png "クエリ実行後" %}

"フリガナ"の昇順、すなわちアイウエオ順に並べ替えられました。


### 単一条件で抽出する

&#9312; [作成]タブ - [クエリ] - [クエリデザイン]をクリックします。

&#9313; テーブルから"サークル名簿"を選択 - [追加]をクリックします。

{% screenshot abstract1.png "[サークル名簿]テーブルの追加" %}

&#9314; フィールドリストのタイトルバーである"サークル名簿"をダブルクリックします。すると、サークル名簿内の全てのフィールドが選択状態になります。

&#9315; 選択したもの全てをデザイングリッドにドラッグアンドドロップします。

{% screenshot abstract2.png "項目の追加" %}

{% screenshot abstract3.png "追加後" %}

&#9316; "フリガナ"フィールドを選択 - キーボードの[Delete]キーをクリックして削除します。

{% screenshot abstract4.png "[フリガナ]フィールドの削除" %}

&#9317; 同様に"携帯TEL"フィールドも削除します。

&#9318; "都道府県"フィールドの抽出条件に `東京都` と入力 - [Enter]キーをクリックします。

{% screenshot abstract5.png "[都道府県]フィールドの抽出条件に <font color="red">東京都</font> を入力" %}

&#9319; ![](../pic/databaseview.png) もしくは ![](../pic/action.png) をクリックします。

{% screenshot abstract6.png "クエリ実行後" %}

これで、東京都の会員だけが抽出されました。`東京都会員` と入力して、保存します。


### OR条件で抽出する

&#9312; "デザインビュー"に切り替えます。

&#9313; "都道府県"フィールドの「または」に `神奈川県` と入力 - [Enter]キーをクリックします。

{% screenshot or1.png "[都道府県]フィールドの「または」に <font color="red">神奈川県</font> を入力" %}

&#9314; ![](../pic/databaseview.png) もしくは ![](../pic/action.png) をクリックします。

{% screenshot or2.png "クエリ実行後" %}

これで、東京都と神奈川県の会員だけが抽出されました。


### AND条件で抽出する

&#9312; "デザインビュー"に切り替えます。

&#9313; "都道府県"フィールドの「または」に入力されている"神奈川県"を選択 - [Delete]キーをクリックして、削除します。

&#9314; "退会"フィールドの抽出条件に半角で `yes` と入力 - [Enter]キーをクリックします。

{% screenshot and1.png "[退会]フィールドの抽出条件に`yes`を入力" %}

&#9315; ![](../pic/databaseview.png) もしくは ![](../pic/action.png) をクリックします。

{% screenshot and2.png "クエリ実行後" %}

これで、東京都でかつ退会した会員だけが抽出されました。


### ワイルドカードを利用して抽出する

「＊（ワイルドカード)」は、任意の文字列を表しています。つまり、"学部学科コース"フィールドに `理学部*` と入力すると、先頭に"理学部"がついていればその後ろの文字列に関係なく抽出します。

&#9312; "デザインビュー"に切り替えます。

&#9313; "都道府県"フィールドの抽出条件に入力されている `東京都` を削除 - "退会"フィールドの抽出条件に入力されている `Yes` を削除します。

&#9314; "学部学科コース"フィールドの抽出条件に `理学部*` と入力 - [Enter]キーをクリックします。

{% screenshot wildcard1.png "[学部学科コース]フィールドの抽出条件に <font color="red">理学部*</font> を入力" %}

{% screenshot wildcard2.png "入力後" %}

&#9315; ![](../pic/databaseview.png) もしくは ![](../pic/action.png) をクリックします。

{% screenshot wildcard3.png "クエリ実行後" %}

これで、理学部の会員だけが抽出されました。


### 一定範囲を指定してデータを抽出する

&#9312; "デザインビュー"に切り替えます。

&#9313; "学部学科コース"フィールドの抽出条件に入力してある `Like "理学部*"` を削除します。

&#9314; "入会年月日"フィールドの抽出条件に半角で `Between #2015/1/1# And #2015/12/31#` と入力 - [Enter]キーをクリックします。

{% screenshot between1.png "[入会年月日]フィールドの抽出条件に <font color="red">Between #2015/1/1# And #2015/12/31#</font> を入力" %}

{% screenshot between2.png "入力後" %}

&#9315; ![](../pic/databaseview.png) もしくは ![](../pic/action.png) をクリックします。

{% screenshot between3.png "クエリ実行後" %}

これで、2015 年 1 月 1 日から 2015 年 12 月 31 日までに入会した会員だけが抽出されました。[ファイル]タブ - [名前を付けて保存] - [オブジェクトに名前を付けて保存]をクリックし、"2015年入会会員"という名前で保存します。

{% screenshot between4.png "保存アイコンの場所" %}

{% screenshot between5.png "名前を付けて保存" %}


課題
----

"congress"の"会員名簿"テーブルを基にクエリを作成し、指示に従って新しいクエリ（並べ替えや条件の設定）を作成してください。

1. "会員名簿"テーブルを基に、デザインビューでクエリを作成して実行し、名前を付けて保存してください。
    -   表示するフィールド：会員ＩＤ、氏名、シメイ、入会年月日、職種、退会
    -   クエリ名：入会日と職種
2. "入会日と職種"クエリに抽出条件と並べ替えを設定して実行し、新しく名前を付けて保存してください。
    -   抽出条件："職種"が `大学` から始まる語で、"退会"が `No` の会員
	-   ヒント：ワイルドカードを使いましょう。
    -   並べ替え："シメイ"の昇順
    -   クエリ名：大学関係者
3. さらに"大学関係者"クエリの抽出条件を削除した後に、以下のように変更して実行し、新しく名前を付けて保存してください。
    -   抽出条件："入会年月日"が `2017/1/1` から `2017/12/31` までの会員（元々の抽出条件は削除）
    -   クエリ名：2017年入会会員
4. "2017年入会会員"クエリを閉じます。