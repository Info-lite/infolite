---
layout: page
title: Java言語の基礎
date: 2015-03-23 17:01:14 +0900
purposes:
    - Java言語の基本的な仕組みの理解
---

本教材に掲載する製品名は、一般に各開発メーカの商標、または登録商標です。

練習で使ったデータは必ず保存するようにしましょう


最も基本的なプログラム
--------------

### Hello.java

以下のソースコードを、適当なエディタを用いて入力してみましょう。すべて**半角英数で入力**してください。

<div id="boxtitle">Hello.java</div>
<div id="box">
<pre id="text">
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
</pre>
</div>

ファイル名は、**Hello.java**とし、**マイドキュメント**に保存してください。
次に、コマンドプロンプト（ターミナル）を起動しましょう。そして、次のように入力します。

~~~~
javac Hello.java
~~~~

![](./pic/hello01.png)

うまくできたら、次は以下のように入力します。

~~~~
java Hello
~~~~

![](./pic/hello02.png)

うまくいくと、以下のように表示されます。

Hello

![](./pic/hello03.png)

コマンドプロンプト・ターミナルの詳しい使い方は以下を参照してください。

<div id="ref"><a href="command.html" target="_blank">コマンドプロンプトの使い方</a></div>
<div id="ref"><a href="terminal.html" target="_blank">ターミナルの使い方</a></div>


Java言語の基本
------------------

### Java言語とは

Javaは、サン・マイクロシステムズによって開発された、プログラミング言語の一つです。
オブジェクト指向プログラミング言語の一種であり、プラットフォームに依存しないという特徴を持っています。
アプリケーションはもちろん、Webサービスや携帯電話等でも使われています。
サン・マイクロシステムズは、2010年1月27日にオラクルジャパンにより買収されました。

<div id="link"><a href="http://www.oracle.com/jp/index.html" target="_blank">オラクル ジャパン</a></div>

### Java言語の簡単な仕組み
Java言語は、作成したソースコードをコンパイルし、中間コード（バイトコード）を作成します。その中間コードをJavaVM (Java Virtual Machine)によってインタプリタ型言語として実行されています。
JavaVMを用いることにより、どの環境でもほぼ同様の実行結果を得ることができます。
C言語などのコンパイル型言語と比較すると、Java言語等のインタプリタ型言語は、逐次機械語に翻訳しながら実行されるので、実行速度は遅くなります。

* コンパイル
ソースコードを、コンピュータが直接実行可能な機械語に翻訳する操作のこと。この操作を行うソフトウェアの事を**コンパイラ**という。
* JavaVM (Java Virtual Machine)
Java言語を実行するための環境のこと。これを各環境に移植することにより、すべての環境で同じ動作をさせることができる。
* インタプリタ
ソースコードを逐次機械語に翻訳しながら実行するソフトウェアのこと。

![](./pic/java.png)


Hello.javaの解説 - コンパイルから実行まで
------------------

### javac
ソースコードを入力・保存したあと、次のようなコマンドを実行しました。

~~~~
javac Hello.java
~~~~

この**javac**が、**コンパイル**するためのコマンドです。
これにより、中間コードの「Hello.class」が作成されます。

### java

コンパイル後、次のコマンドを実行しました。

~~~~
java Hello
~~~~

これは、コンパイルで作成された中間コード「Hello.class」を実行しています。


Hello.javaの解説 - ソースコード
------------------
### class

さて、先ほど作成した「Hello.java」を見てみましょう。１行目に「public class Hello」と書かれています。
これは、**クラス**と呼ばれるものです。詳しくはプログラムに慣れてから説明しますが、ひとまず**プログラムの大きなかたまり**と考えてください。
クラス名は**ファイル名と同じ**ものにしましょう。この理由も後々わかるかと思います。また、習慣として**クラス名の頭文字は大文字**にしています。

### main()
２行目は、「public static void main(String[] args)」となっています。
この**main**と書かれた部分が**メインメソッド**と呼ばれる部分です。プログラムを実行すると、この後の中括弧「 { } 」の中に書かれていることが**必ず実行**されます。
Javaプログラミングでは、このメインメソッドが**必要**です。プログラムの最も大事な部分になります。

### System.out.println()
３行目は、「System.out.println("Hello.");」となっています。
これは、「ターミナルに文字を出力せよ」という命令です。ですから「java」コマンドで実行すると、ターミナルに「Hello.」と表示されます。
よく使うので覚えておきましょう。
lnを除くと（つまり、「System.out.print**In**()」を「System.out.print()」とすると）改行をしません。lnを除いたものも実行してみましょう。


練習問題
--------

「System.out.println("Hello")」を「System.out.print("Hello")」に書き換え、動作の違いを確認してみましょう。
また、「System.out.println("Hello")」を参考に、別の文字列を出力させてみましょう。
