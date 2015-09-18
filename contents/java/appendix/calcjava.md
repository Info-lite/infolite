---
layout: appendix
title: Calc.javaの解説
date: 2015-03-23 16:14:50 +0900
---


Calc.javaの解説
------------------
ここでは、少し詳しくCalc.javaについて解説します。ここの内容をきちんと理解するには、Java言語のことを深くまで理解している必要があります。

### プログラム少し詳しい解説

import java.io.*;

既存のパッケージのクラスを利用するときに書く文です。ここでは、システム入出力等に用いられるjava.ioパッケージを読み込んでいます。

throws IOException

例外処理についての記述です。

BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

BufferedReaderクラスのオブジェクトbrを作成しています。

String str1 = br.readLine();

1行のテキストを読み込み、それをString型（文字列型）として返します。この場合、キーボードから入力されたものを読み込んでいると考えればよいでしょう。

int a = Integer.parseInt(str1);

String型をint型に変換します。

さらに詳しく知りたい場合は、以下を参照してください。
Oracle Technology Network for Java Developers（英語）
