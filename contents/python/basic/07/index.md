---
layout: page
title: 課題提出のための実習時間
date: 2015-03-23 17:01:14 +0900
purposes:
    - 課題提出のための実習時間
---


課題を行う前に
--------------

分からなくなったときに参照すべき箇所を挙げておきます。
必要に応じて参照してください。

#### 条件によって動作を変えたい

* [条件分岐](../04/)

#### 同じ動作を繰り返したい

* [繰り返し](../05/)

#### 様々な変数の使い方

* [四則演算と変数](../02/)
* [配列](../06/)

#### 様々な演算子の使い方

* [四則演算と変数](../02/)
* [条件分岐](../04/)

#### キーボードから値を入力したい

* [キーボードからの入力と型変換](../03/)


課題
----

以下の課題は、うまく書けば数行で終わってしまうようなものもあります。
うまく書く必要はありませんが、じっくり考えて、自分の手でプログラムを書いてみましょう。

### 課題１

２次方程式 $ax^2 + bx + c = 0$ の解を求めるプログラムを書きましょう。
クラス名は `Equation` とします。

平方根は `Math.sqrt()` で求めることができます。

*実行結果（１）*

    ２次方程式 ax^2+bx+c=0 を解きます。
    a,b,cの値を入力してください。
    a = 1
    b = 3
    c = -4
    解は、1.0と-4.0です。

*実行結果（２）*

    ２次方程式 ax^2+bx+c=0 を解きます。
    a,b,cの値を入力してください。
    a = 1
    b = 2
    c = 1
    解は、-1.0です。

### 課題２

以下のように出力するプログラムを書きましょう。
クラス名は`Pyramid`とします。

*実行結果*

    値を入力してください。
    5
    
    1
    2 3 4
    5 6 7 8 9
    10 11 12 13 14 15 16
    17 18 19 20 21 22 23 24 25

### 課題３

値を３つ入力すると、大きい順に並び替えて出力するプログラムを書きましょう。
クラス名は`Sort`とします。

*実行結果*

    値を３つ入力してください。
    10
    23
    65
    65,23,10,

余裕がある人は、もっと数が多いときの並び替えを考えてみましょう。