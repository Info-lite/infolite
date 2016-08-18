---
layout: page
title: アプレット（３）
date: 2016-01-22 23:36:30 +0900
purposes:
    - 様々な部品やリスナーの使い方の理解
    - スレッドを用いたアニメーションの理解
---


さまざまな部品とリスナー
------------------------

### テキストボックスとラベル

前回と同様に、ソースコードを打ち込み、実行してみましょう。
htmlファイルは自分で作成してください。

*CalcApplet.java*<br>
![](./pic/CalcApplet.java.png)

左の2つのテキストボックスに数字を入力しボタンをクリックすると、その和が表示されます。

この他にもawtでは様々な部品を用いることができます。

### マウスリスナー

以下のソースコードを入力・実行し、マウスをいろいろと操作してみましょう。

*MouseApplet.java*<br>
![](./pic/MouseApplet.java.png)

このように、マウスの動きを捉えるリスナーもあります。

awtには他にもいろいろなものが用意されています。


アニメーション
--------------

### スレッドを用いたアニメーション

ソースコードを打ち込み、実行してみましょう。

*CountUpApplet.java*<br>
![](./pic/CountUpApplet.java.png)


練習問題
--------

### 問題１

半径を入力すると、その大きさの円を書くプログラムを書きましょう。
クラス名は、`DrawCircleApplet` とします。

### 問題２

上の問題１のプログラムを、クリックした場所を中心とする円を描くプログラムになるように改良しましょう。
クラス名は、`DrawCircleWithClickApplet`とします。

#### ヒント

座標は、`MouseEvent` のインスタンス・メソッド `getX()`, `getY()` で得ることができます。

<span class="label label-info">参考資料</span> [MouseEvent (Java Platform SE 8)](https://docs.oracle.com/javase/jp/8/docs/api/java/awt/event/MouseEvent.html)
