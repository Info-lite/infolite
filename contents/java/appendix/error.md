---
layout: appendix
title: Javaのエラーメッセージ
date: 2016-09-12 16:22:24 +0900
---


ここでは、Javaを扱うときに最初に陥りやすい代表的なミスとそのエラーメッセージと対策をまとめてあります。

１．単純なスペルミスなど
----------------
> ### サンプルコード：Hello.java
> 「Hello World!」と表示されます。
> 
> *正しい構文*
> ~~~
> public class Hello {
>  public static void main( String[] args ) {
>   System.out.println("Hello world!");
>  }
> }
> ~~~

### 例：綴りミスその１
~~~
public class Hallo {
 public static void main( String[] args ) {
  System.out.println("Hello world!");
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Hello.java:1: エラー: クラスHalloはpublicであり、ファイルHallo.javaで宣言する必要があります
public class Hallo {
       ^
エラー1個
~~~
*エラーメッセージの読み方*
* 1行目…【エラーのあるソースファイル名】:【エラーのあった行】:【エラーの内容】
* 2,3行目…コンパイラが解釈できなくなった箇所
* 4行目…エラーの個数

「"Hello.java "というファイルの1行目に問題がありました。classのc付近に間違いがあります。」と解釈できます。ただし、本当の間違いはそれ以前に存在する場合もあります。

#### 解説
ファイル名が"Hello.java"なので、class Hello をclass **Hallo**と間違えたということです。
また、**Hallo**だけでなく、**hello**のような大文字小文字の差でも間違いとなるので、注意しましょう。
ファイル名とクラス名を一致させればよいので、ファイル名を"Hallo.java"としても解決できます。

### 例：綴りミスその２
~~~
pablic class Hello {
 pablic static void main( String[] args ) {
  System.out.println("Hello world!");
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Hello.java:1: エラー: class、interfaceまたはenumがありません
pablic class Hello {
^
Hello.java:2: エラー: <identifier>がありません
 pablic static void main( String[] args ) {
       ^
エラー2個
~~~
#### 解説
2箇所ある**public**を**pablic**と間違えています。最初のミスでは「classの前にpablic(という名前の何か)はつけられません」というエラーが出ています。2つ目のエラーの「identifier」とは識別子という意味で、クラス、変数、メソッドのことです。
綴りを間違えたので、コンパイラが識別子「public」の存在を認識できなかったのです。

### 例：綴りミスその３
~~~
public class Hello {
 public staric void main( String[] args ) {
  System.out.println("Hello world!");
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Hello.java:2: エラー: <identifier>がありません
 public staric void main( String[] args ) {
              ^
Hello.java:2: エラー: 無効なメソッド宣言です。戻り値の型が必要です。
 public staric void main( String[] args ) {
                    ^
エラー2個
~~~
#### 解説
**static**を**staric**と間違えています。
ミスは1箇所ですが、コンパイラが識別子「static」の存在を認識できず、それにともなってメソッド宣言にも失敗しています。
そのためエラーが2種類出てしまっているのです。

### 例：綴りミスその４
~~~
public class Hello {
 public static void main( String[] args ) {
  System.out.printIn("Hello world!");
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Hello.java:3: エラー: シンボルを見つけられません
  System.out.printIn("Hello world!");
            ^
  シンボル:   メソッド printIn(String)
  場所: タイプPrintStreamの変数 out
エラー1個
~~~
*エラーメッセージの読み方*
* 1行目:変数・メソッドの名前が定義されていません。未定義なものか、綴りが間違っているかが原因です。
* 2,3行目:コンパイラとしては、printIn(String)がメソッドだと思って探したものの、ありませんでした。
* 4行目:コンパイラとしては、メソッドはなんらかのクラスに属するはずで、printInの直前のout（System.out）に属しているはずだと思っています。

#### 解説
printlnは元々定義されているメソッド（関数）なのですが、l（エル）とI（アイ）を間違えたことで、未知のメソッドになってしまいました。
綴りミスには他にも、O（オー）と0（ゼロ）など、キーボードの配置も近接しているものがありますので、必ずチェックしておきましょう。

２．記号のミス、欠落
----------------

### 例：全角
~~~
public class Hello {
 public static void main( String[] args ) {
　System.out.println("Hello world!");
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Hello.java:3: エラー: '\u3000'は不正な文字です
　System.out.println("Hello world!");
^
エラー1個
~~~
#### 解説
*\u3000*は、表示される文字に割り当てられた番号です。この場合「Unicodeの16進表記」という決まりに従うと、**全角スペース**を意味します。
とても分かりづらいですが、System.outの前に全角スペースを入れてしまっています。この部分には半角スペースを入れなければなりません。

#### 補足
他にも半角→全角で入力してしまいそうな文字と、その全角文字の文字コードを以下に示します。<br>
"→”…**\u201d**<br>
(→（…**\uff08**<br>
)→）…**\uff09**<br>
;→；…**\uff1b**<br>
{→｛…**\uff5b**<br>
}→｝…**\uff5d**

### 例：「;」（セミコロン）
~~~
public class Hello {
 public static void main( String[] args ) {
  System.out.println("Hello world!")
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Hello.java:3: エラー: ';'がありません
  System.out.println("Hello world!")
                                    ^
エラー1個
~~~
#### 解説
メッセージのとおり、文末の';'を忘れています。
場合によっては次の段の文の先頭を指すこともありますので、注意しましょう。

### 例：「 」（半角スペース）
~~~
public class Hello {
 public static voidmain( String[] args ) {
  System.out.println("Hello world!");
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Hello.java:2: エラー: 無効なメソッド宣言です。戻り値の型が必要です。
 public static voidmain( String[] args ) {
               ^
エラー1個
~~~
#### 解説
メソッドの名前が**main**ではなく**voidmain**と解釈されているため、void等の「型」がないというエラーが出ています。半角スペースは単語を分ける重要な記号なので、入れ忘れないようにしましょう。

３．書き忘れ
----------------

> ### サンプルコード：Sample.java
> 入力された名前を表示します。
> 
> *正しい構文*
> ~~~
> import java.io.*;
> 
> public class Sample {
>  public static void main(String[] args) throws IOException {
>   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
> 
>   System.out.println("あなたの名前は？");
>   String name = br.readLine();
>   System.out.println("こんにちは、" + name + "さん。");
>  }
> }
> ~~~

### 例：import
~~~
public class Sample {
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  System.out.println("あなたの名前は？");
  String name = br.readLine();
  System.out.println("こんにちは、" + name + "さん。");
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Sample.java:2: エラー: シンボルを見つけられません
 public static void main(String[] args) throws IOException {
                                               ^
  シンボル:   クラス IOException
  場所: クラス Sample
Sample.java:3: エラー: シンボルを見つけられません
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  ^
  シンボル:   クラス BufferedReader
  場所: クラス Sample
Sample.java:3: エラー: シンボルを見つけられません
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                          ^
  シンボル:   クラス BufferedReader
  場所: クラス Sample
Sample.java:3: エラー: シンボルを見つけられません
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                             ^
  シンボル:   クラス InputStreamReader
  場所: クラス Sample
エラー4個
~~~
#### 解説
キーボードからの入力には「java.io.*」のインポートが必須です。プログラムコードの初めに記述しましょう。

### 例：IOException
~~~
import java.io.*;

public class Sample {
 public static void main(String[] args) {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  System.out.println("あなたの名前は？");
  String name = br.readLine();
  System.out.println("こんにちは、" + name + "さん。");
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Sample.java:8: エラー: 例外IOExceptionは報告されません。スローするには、捕捉または宣言する必要があります
  String name = br.readLine();
                           ^
エラー1個
~~~
#### 解説
IOExceptionとは、エラーの種類の1つです。予期しない入力などによってプログラムが正しく動作しなくなったとき、IOExceptionというエラーを発生させ**例外処理**を行えるようにするのが、throws IOExceptionの役割です。
通常のキーボード入力でIOExcptionが発生することはありませんが、BufferedReader等は本来キーボードからの入力に限らない処理を行っているため、記述しないとエラーが出ます。

### 例：static
~~~
import java.io.*;

public class Sample {
 public void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  System.out.println("あなたの名前は？");
  String name = br.readLine();
  System.out.println("こんにちは、" + name + "さん。");
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
（コンパイル時のエラーはなし）

\>java Sample
エラー: メイン・メソッドがクラスSampleのstaticではありません。次のようにメイン・メソッドを定義してください。
   public static void main(String[] args)
~~~
#### 解説
コンパイル時にエラーが出ませんが、4行目**public**と**void**の間に**static**がありません。メイン・メソッド＝**main(String[] args)** には**static**が必須です。

４．分岐・繰り返し処理のミス
----------------

> ### サンプルコード：Absolute.java
> 絶対値を計算する関数absを作成しています。
> 
> *正しい構文*
> ~~~
> public class Absolute {
>  public static void main(String[] args) {
>   int a = -3 ;
>   int b = abs(a) ;
>   print(b) ;
>  }
> 
>  public static int abs(int a) {
>   if (a >= 0) {
>    return a;
>   } else {
>    return a * (-1);
>   }
>  }
> 
>  public static void print(int a) {
>   System.out.println("Result : " + a) ;
>  }
> }
> ~~~

### 例：{}（中括弧）
~~~
public class Absolute {
 public static void main(String[] args) {
  int a = -3 ;
  int b = abs(a) ;
  print(b) ;
 }
 
 public static int abs(int a) {
  if (a >= 0) {
   return a;
  } else
   return a * (-1);
  }
 }
 
 public static void print(int a) {
  System.out.println("Result : " + a) ;
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Absolute.java:16: エラー: class、interfaceまたはenumがありません
 public static void print(int a) {
               ^
Absolute.java:18: エラー: class、interfaceまたはenumがありません
 }
 ^
エラー2個
~~~
#### 解説
コンパイラは16,18行目に問題があると言っていますが、実は訂正すべき点はもっと前で、11行目の**elseの後に{（中括弧）を付けなかった**ことが原因です。
なぜコンパイラがそこを問題点としないかというと、11～15行目までは、それで意味が通ってしまうからです。
if文の中では、条件が成立した時の処理が一行で終わる場合、**中括弧をつけなくてもよい**ことになっているため、コンパイラはif文の処理が12行目のみで終わったと思い、13行目以降はif-elseの処理を抜けた後だと考えています。
すると、14行目の段階でAbsoluteクラスの処理全体が終わったことになってしまいます。そのため、16行目以降の文が解釈できなくなり、エラーとなったのです。

### 例：return
~~~
public class Absolute {
 public static void main(String[] args) {
  int a = -3 ;
  int b = abs(a) ;
  print(b) ;
 }
 
 public static int abs(int a) {
  if (a >= 0) {
   return a;
  } else if(a < 0) {
   return a * (-1);
  }
 }
 
 public static void print(int a) {
  System.out.println("Result : " + a) ;
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
Absolute.java:14: エラー: return文が指定されていません
 }
 ^
エラー1個
~~~
#### 解説
このエラーは、returnで値を返さなければならないのに、returnが実行されない可能性がある場合に表示されます。よくあるのは、if文などで処理が分岐したときです。人間が見ると、関数absは9行目「if (a >= 0)」と11行目「else if(a < 0)」のどちらかの条件を満たし、必ずreturnが実行されることが分かります。しかしコンパイラはaの値を考慮できないので、**ifもelse ifも満たされない場合がある**と推測し、「関数absの処理が終わる前にreturnを追加せよ」と指示しているのです。

> ### サンプルコード：Loop.java
> 階乗を順に計算します。
> 
> *正しい構文*
> ~~~
> public class Loop {
>  public static void main(String[] args) {
>   int arr[] = new int[4];
>   int a = 1;
>   for(int i = 0; i < 4; i = i + 1) {
>    a = a * (i + 1);
>    arr[i] = a;
>    System.out.println("arr[" + i + "] = " + arr[i]);
>   }
>  }
> }
> ~~~

### 例：配列の大きさ
~~~
public class Loop {
 public static void main(String[] args) {
  int arr[] = new int[4];
  int a = 1;
  for(int i = 0; i <= 4; i = i + 1) {
   a = a * (i + 1);
   arr[i] = a;
   System.out.println("arr[" + i + "] = " + arr[i]);
  }
 }
}
~~~
*上記に対するエラーメッセージ*
~~~
（コンパイル時のエラーはなし）

\>java Loop
arr[0] = 1
arr[1] = 2
arr[2] = 6
arr[3] = 24
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        at Loop.main(Loop.java:7)
~~~
#### 解説
このエラーは配列の存在しないエリアを参照した際に起こります。
配列を **new int[4]** で定義すると、配列arrは **arr[0]** から **arr[3]** まで作成されます。
しかしこの例では「for(int i = 0; i <= 4; i = i + 1)」により変数iが0から4の値をとるので、6行目のarr[i]が**arr[4]**となる状況が生まれています。
for文で配列を操作するときは、配列のサイズとfor文で変数が変化する範囲をよく見ましょう。
