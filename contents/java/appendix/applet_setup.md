---
layout: appendix
title: Javaアプレット実行環境の整え方
date: 2021-08-30 16:14:50 +0900
---

Eclipseを新しくダウンロードして展開した場合、最初からJavaアプレットの実行環境が整っていない可能性があります。<br>
EclipseでJavaアプレットを実行するためには、バージョン9より前のJavaを用いてコンパイルする必要があります。

Eclipseの導入については、以下を見てください。

- [ソフトウェアのインストール](../basic/01/index.html#chapter4)
  
アプレットを実行できないバージョンの場合、以下のエラーが表示されます。

{% screenshot change_java_ver1.png "Appletが使えないエラー" %}

ここでは、Javaのバージョンを変更する方法を説明します。


### プロジェクトでJavaアプレットを実行可能にする

[パッケージ・エクスプローラー] ビューのJavaプロジェクトをダブルクリックで展開します。<br>
その中の [JRE システム・ライブラリー] 上で右クリックをし、 [プロパティー] を選択します。

{% screenshot change_java_ver2.png "Appletが使えないエラー" %}

[実行環境] で、バージョン9より前のJavaを選択し、 [適用して閉じる] をクリックします。<br> 
※ここではJavaSE-1.8（Java8）を選択しました。

{% screenshot change_java_ver3.png "Javaのバージョン選択" %}

もし、バージョン9以前のJavaがなかった場合は、次の項で説明する方法でJREを追加してください。

### JREにバージョン10以前のJavaの追加をする方法

[ソフトウェアのインストール](../basic/01/index.html#chapter4)
の通りにEclipseのJavaのFull Editionをダウンロードした場合は、最初から過去のバージョンのJavaも同封されています。<br>
展開したフォルダ内のjavaフォルダに10より小さい数字のフォルダがあるか確認してみましょう。

{% screenshot java_ver_add1.png "Javaのバージョン確認" %}

10より小さい数字のフォルダがない場合は、Full Editionではないものをダウンロードしている可能性があります。<br>
その場合は再ダウンロードを行ってください。

Eclipseを起動します。
先ほどと同じように [JRE システム・ライブラリー] の [プロパティー] を選択し、 [インストール済みのJRE] を選択します。

{% screenshot java_ver_add2.png "Javaのバージョン確認" %}

インストール済みのJREが表示されますので、バージョン10以前のJavaが存在するか確認してください。

{% screenshot java_ver_add3.png "Javaのバージョン確認" %}

もし、Javaフォルダにバージョン10以前のJavaがあったにも関わらず、インストール済みのJREに存在しない場合は、[追加]を押すことで追加できます。

{% screenshot java_ver_add4.png "Javaのバージョン確認" %}

**標準VM**を選択し、[次へ]を押します。

{% screenshot java_ver_add5.png "JREの追加" %}

[ディレクトリー]を押し、先ほど確認したバージョン10以前のJavaのフォルダを選択します。<br>
ここでは [8] というフォルダを選択しました。

{% screenshot java_ver_add6.png "フォルダーの選択" %}

正常にJavaのフォルダを選択できると、以下のようにフォルダ内のJREシステム・ライブラリーが読み込まれます。<br>
[JRE 名] の欄には、Java8 などといった分かりやすい名前を入力すると良いでしょう。<br>
入力できたら [完了]を押します。

{% screenshot java_ver_add7.png "フォルダーの選択" %}

無事に設定が完了したら、以下のように追加されますので、チェックを入れて [適用して閉じる] を押します。

{% screenshot java_ver_add8.png "JREの追加" %}

[実行環境] に先ほど追加したバージョンが増えているので、それを選択し、[適用して閉じる] を押します。

{% screenshot java_ver_add9.png "JRE確認画面" %}