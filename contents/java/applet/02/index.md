---
layout: page
title: アプレット（２）
date: 2015-10-16 10:45:51 +0900
purposes:
    - 基本的な部品やリスナーの使い方の理解
---


リスナーの追加
--------------

### ボタンの作成

次のようなプログラムを実行してみましょう。

*ClickCountApplet.java*<br>
![](./pic/ClickCountApplet.png)

**※Eclipseの場合**、最後まで書ききるまではエラーが表示され続けます。

以下はhtmlファイルの内容です。

*click_count.html*<br>
![](./pic/click_countHtml.png)

ボタンを押した回数を表示するだけのプログラムです。

では、プログラムを少し細かく見ていきましょう。

![](./pic/ClickCountApplet_explain1.png)

これは、インタフェースの実装と呼ばれるものです。<br>
`ActionListener` を実装したら、必ず `actionPerformed()` メソッドを作成します。
これは、イベントが起きた場合に実行されるメソッドです。この場合、ボタンがクリックされた時にあたります。

他のメソッドを見ていきましょう。

メソッド `init()` は、アプレットにおける初期化のためのメソッドです。<br>
今回は、この `init()` においてボタンの作成などを記述しています。

![](./pic/ClickCountApplet_explain2.png)

`repaint()` は、もう一度 `paint()` を呼び出し再描画するコマンドです。
（正確には、`update()` が呼ばれ、その過程で `paint()` が呼ばれます）

アプレット特有のメソッドとしては、今回登場した `init()` や `paint()` の他に、`stop()`, `start()`, `destroy()` 等があります。

### 複数のボタンを使う

それでは、以下のようなプログラムを実行してみましょう。
htmlファイルは上の例を参考に自分で作成してみましょう。

*ChangeColorApplet.java*<br>
![](./pic/ChangeColorApplet.png)

`actionPerformed()` には、引数として `ActionEvent` というクラスのデータが**自動的に**渡されます。<br>
このデータは、何をクリックしたのか、またクリック時のマウスカーソルの座標など、便利な情報をたくさん持っています。

今回は、その `ActionEvent` 型データの変数を `ae` と名付け、`ae.getSource()` というメソッドを用いてどのボタンをクリックしたかの情報を取得しています。


練習問題
--------

### 問題１

上の `ClickCountApplet.java` に、押すと数を減らすボタンを追加しましょう。

### 問題２

３つのボタンを作成し、それぞれのボタンを押すと、三角形・四角形・円が表示されるプログラムを書きましょう。
クラス名は`DrawFigureApplet`とします。
