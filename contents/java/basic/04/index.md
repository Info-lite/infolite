---
layout: page
title: 条件分岐
date: 2015-03-23 17:01:14 +0900
purposes:
    - さまざまなif文の使い方の理解
    - switch文の使い方の理解
---

本教材に掲載する製品名は、一般に各開発メーカの商標、または登録商標です。

練習で使ったデータは必ず保存するようにしましょう


条件分岐 - if文（１）
--------------
### 最も基本的な条件分岐

まず、以下のソースコードを入力し、コンパイルして実行してみましょう。その際、入力する値をいろいろ試してみましょう。

Bunki.java
![](./pic/Bunki.png)

実行結果は、以下のどちらかになります。

実行結果（１）

~~~~
数字を入力してください。
1
入力したのは１ですね。
~~~~

実行結果（２）

~~~~
数字を入力してください。
2
~~~~

「1」を入力した場合には実行結果（１）となり、それ以外の値を入力した場合は（２）となります。
ある条件により実行結果を変えたい場合、if文を使います。

if文（１）

~~~~
if(条件) { 
	条件に当てはまった場合に実行する内容;
}
~~~~

例：

~~~~
if(a==1){ 
	System.out.println("入力したのは１ですね。");
} 
~~~~

### 比較演算子
比較演算子には、以下のようなものがあります。

<div id="img">
<table border=2>
<tr>
	<th>演算子</th>
	<th>意味</th>
</tr>
<tr>
	<td align="center"><</td>
	<td>小さい</td>
</tr>
<tr>
	<td align="center">></td>
	<td>大きい</td>
</tr>
<tr>
	<td align="center"><=</td>
	<td>以下</td>
</tr>
<tr>
	<td align="center">>=</td>
	<td>以上</td>
</tr>
<tr>
	<td align="center">==</td>
	<td>等しい</td>
</tr>
<tr>
	<td align="center">!=</td>
	<td>等しくない</td>
</tr>
</table>
</div>

</div>


### 論理演算子
論理演算子には、以下のようなものがあります。

<div id="img">
<table border=2>
<tr>
	<th>演算子</th>
	<th>意味(not)</th>
</tr>
<tr>
	<td align="center">!</td>
	<td>否定</td>
</tr>
<tr>
	<td align="center">&amp;&amp;</td>
	<td>かつ(and)</td>
</tr>
<tr>
	<td align="center">||</td>
	<td>または(or)</td>
</tr>
</table>
</div>

</div>




条件分岐 - if文（２）
--------------
### if-else
では、前のソースコードに少し付け加えてみましょう。

Bunki.java
![](./pic/Bunki-02x.png)

実行結果は、以下のどちらかになります。

実行結果（１）

~~~~
数字を入力してください。
1
入力したのは１ですね。
~~~~

実行結果（２）

~~~~
数字を入力してください。
2
入力したのは１ではありません。
~~~~

「1」を入力した場合には実行結果（１）となり、それ以外の値を入力した場合は（２）となります。
elseを使うと、if文の条件に合わなかった場合に実行する内容を書くことが出来ます。

if文（２）

~~~~
if(条件) { 
	条件に当てはまった場合に実行する内容;
} else { 
	条件に当てはまらなかった場合に実行する内容;
}
~~~~

例：

~~~~
if(a==1){ 
	System.out.println("入力したのは１ですね。");
} else { 
	System.out.println("入力したのは１ではありません。"); 
}
~~~~

### if-else if
さらに複数の分岐をさせてみましょう。

Bunki.java
![](./pic/Bunki-03x.png)

1,2,3を入力した場合はその値が表示され、それ以外の場合は1,2,3ではないと表示されます。
else ifを使うと、さらに分岐を増やすことができます。

if文（３）

~~~~
if(条件１) { 
	条件１に当てはまった場合に実行する内容; 
} else if(条件２) { 
	<strong>条件１に当てはまらずに</strong>条件２に当てはまった場合に実行する内容; 
} else { 
	上のすべての条件に当てはまらなかった場合に実行する内容; 
}
~~~~

例：

~~~~
if(a==1){ 
	System.out.println("入力したのは１ですね。");
} else if(a==2){ 
	System.out.println("入力したのは２ですね。");
} else { 
	System.out.println("入力したのは１、２ではありません。"); 
}
~~~~

else if文は、いくつでも追加することができます。

条件分岐 - switch文
--------------
### switch文
上のソースコードを、以下のように書き直して見ましょう。

Bunkiswitch.java
![](./pic/Bunkiswitch.png)

前のプログラムと同じ動作をしているはずです。

switch文

~~~~
switch(式){
	case 値１:
		式が値１の時に実行したい内容;
		break;
	case 値２:
		式が値２の時に実行したい内容;
		break;
	default:
		上の値すべてと異なる場合に実行する内容;
}
~~~~

注意
case文のラベルに指定できる値は、**整数型の値のみ**です！

上の条件を守れば、switch文とif文は相互に書き換えが可能です。

練習問題
--------------
### 問題１
第３講の練習問題を参考に、以下のような結果を表示するプログラムを書きましょう。クラス名は「Keisan_select」とします。

実行結果（１）

~~~~
１つめの値を入力してください。
5
２つめの値を入力してください。
2
計算方法を指定してください。
１：足し算　２：引き算　３：掛け算　４：割り算
2
5 - 2 = 3
~~~~

ただし、１から４以外の数字が入力された場合は、以下のように表示させるようにしましょう。

実行結果（２）

~~~~
１つめの値を入力してください。
5
２つめの値を入力してください。
2
計算方法を指定してください。
１：足し算　２：引き算　３：掛け算　４：割り算
5
計算方法には1から4までの数字を入力してください。
~~~~

### 問題２
２つの数を入力し、２つの数が等しい場合は「２つの数は等しいです。」と出力し、異なる場合は、「○○のほうが大きいです。」と出力するプログラムを書きましょう。クラス名は「Hikaku」としましょう。

実行結果（１）

~~~~
１つめの値を入力してください。
5
２つめの値を入力してください。
2
5のほうが大きいです。
~~~~

実行結果（２）

~~~~
１つめの値を入力してください。
1
２つめの値を入力してください。
1
２つの数は等しいです。
~~~~