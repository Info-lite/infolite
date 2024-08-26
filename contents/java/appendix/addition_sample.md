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

既存のパッケージのクラスを利用するときに書く文です。<br>
Javaでは、既存のクラスを利用することで、様々な機能を使えるようになります。<br>
ここでは、システム入出力等に用いられる `java.io` パッケージを読み込んでいます。

### 4行目

    throws IOException

例外処理についての記述です。<br>
のちに登場する`readLine()`は、基本的にエラー時の処理が必要になるのですが、それを記載せず無視したいとき、この文を書きます。

### 5行目

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

`BufferedReader` クラスのインスタンス `br` を作成しています。<br>
クラスとは、ざっくりと例えるとintのようなもので、インスタンスとは変数のようなものです。

### 8行目

    String str1 = br.readLine();

1行のテキストを読み込み、それを `String` 型として返します。
この場合、キーボードから入力されたものを読み込んでいると考えればよいでしょう。

### 9行目

    int a = Integer.parseInt(str1);

`String` 型を `int` 型に変換します。

さらに詳しく知りたい場合は、以下を参照してください。

[Java® Platform, Standard Edition & Java Development Kit
バージョン21 API仕様](https://docs.oracle.com/javase/jp/21/docs/api/index.html)
