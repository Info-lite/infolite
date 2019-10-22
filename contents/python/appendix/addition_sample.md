---
layout: appendix
title: AdditionSample.javaの解説
date: 2015-03-23 16:14:50 +0900
---


プログラムの少し詳しい解説
--------------------------

ここでは、少し詳しく `AdditionSample.java` について解説します。
ここの内容をきちんと理解するには、Java言語のことを深くまで理解している必要があります。

### 1行目

    import java.io.*;

既存のパッケージのクラスを利用するときに書く文です。
ここでは、システム入出力等に用いられる `java.io` パッケージを読み込んでいます。

### 4行目

    throws IOException

例外処理についての記述です。

### 5行目

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

`BufferedReader` クラスのインスタンス `br` を作成しています。

### 8行目

    String str1 = br.readLine();

1行のテキストを読み込み、それを `String` 型として返します。
この場合、キーボードから入力されたものを読み込んでいると考えればよいでしょう。

### 9行目

    int a = Integer.parseInt(str1);

`String` 型を `int` 型に変換します。

さらに詳しく知りたい場合は、以下を参照してください。

<span class="label label-info">参考資料</span> [Overview (Java Platform SE 8)](https://docs.oracle.com/javase/jp/8/docs/api/index.html)
