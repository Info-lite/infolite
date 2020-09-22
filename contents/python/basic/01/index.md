---
layout: page
title: Pythonの基礎
date: 2019-10-22 15:56:00 +0900
purposes:
    - Pythonの基本的な仕組みの理解
---


情報倫理講習会
--------------

担当教員の指示に従って受講し、終了後は「テスト/アンケート」より、情リテ情報倫理テストを受験してください。

*   [情報倫理講習会資料](/lit/infoethics/information_ethics_ja.pdf)


Pythonを実行できる環境の準備
--------------

Pythonでプログラミングを行う場合、OSがWindowsのパソコンを利用することを仮定しています。
タブレットやMacOSでもプログラミングを学習することはできますが、機種やOSによって手順・内容が変わる可能性がありますので、もしトラブルが生じたら授業担当者にご相談ください。
なお、スマートフォンでもプログラミングをすることは出来ますが、**推奨しません**。

以下に、みなさんのパソコンでプログラミングをするために必要な準備を記載します。
プログラミングを行う場合はインターネット上で無料で使えるサービス（オンライン実行環境）を利用する、ソフトウェアをパソコンにインストールする、のいずれかを行う必要があります。
もしインターネットを常に利用できるなら、オンライン実行環境を使えばすぐにプログラミングを行えます。
もしインターネットへの接続が無くてもプログラミングをしたい場合にはソフトウェアをインストールしてください。

### オンライン実行環境
[paiza.IO](https://paiza.io/ja)は無料でプログラムをすぐに実行できる環境を提供しているサービスです。

無料でプログラミングをインターネット上でできる同様のサービスとして[ideone](https://ideone.com/)もあります。
サービスごとに実行できるプログラミング言語が異なりますので、学習したいプログラミング言語に併せてサービスを選んでください。

### Windows PCへのソフトウェアのインストール

1. [公式サイト](https://docs.conda.io/en/latest/miniconda.html)からminicondaのインストーラーをダウンロード

    上記サイトから「Windows installers」の下にある表の中から自分のパソコンのOSに応じて「64-bit」、「32-bit」のどちらかを選択する。

    自分のパソコンのビット数を調べる方法は[こちら](https://office-hack.com/windows/windows10-bit-check/) を参考にしてください。

    Pythonのバージョンは最新のもの（Python3.8）を選びます。

2. Minicondaをインストール

    ダウンロードしたインストーラーを開き、セットアップガイドに従いインストールします。
    Install for:  は　Just Me、インストール先のフォルダを指定してインストールを開始します。
    インストール後「Anaconda prompt」を開き、

       python -V 

    とコマンドを入力し、インストールしたバージョンが「Python 3.〇.〇」と表示されればインストール完了の確認ができます。
    また、

       conda list

    とコマンドを入力するとMinicondaでインスト―したパッケージ一覧が確認できます。

3.　condaのアップデート

   「Anaconda prompt」上で
   
    conda info -e

   と入力すると、現在の環境を確認することができます。

   - [【初心者向け】Windows環境でPythonをダウンロード・インストールする簡単手順解説](https://kredo.jp/media/howto-download-python-windows/)
   - [Setup Miniconda on Windows 10](https://estuarine.jp/2017/12/setup-miniconda-windows10/)

   上記サイトを参考に、condaやパッケージのアップデートを行い、仮想環境を作成します。

4. 仮想環境の作成

      conda create -n 仮想環境名 python=バージョン 
      
     と入力して仮想環境を作成し、
      
      activate 仮想環境名
      
     と入力して仮想環境を起動します。環境を元に戻す場合は「deactivate」と入力します。

     情報リテラシー実践IIBでは次のようにしましょう。

      conda create -n py38 python=3.8
 
     と入力して仮想環境を作成し、
      
      activate py38


仮想環境について知りたい人は
- [Pythonの仮想環境まとめ](https://blog.codecamp.jp/programming-python-virtual-environment)
- [仮想環境](https://www.python.jp/install/windows/venv.html)
などを参考にしてください。


5.　PATHを通す

    a. [スタートメニュー]-[Windows システム ツール]-[コントロール パネル]-[システムとセキュリティ]-[システム]-[システムの詳細設定]-[環境変数]を開く

        [スタートメニュー]の検索欄へ「環境変数の編集」と入力しても開くことができます。

    b. 変数欄の「Path」を選択し「編集」ボタンをクリック

    c. Minicondaをインストールしたフォルダにpathを通す

    d.　コマンドプロンプトで開く

コマンドプロンプト上で

    activate.bat
    
と入力すると（base）の環境でminicondaが開きます。
ここから先程作成した環境へ移動してください。

PATHについて知りたい人は
- [「PATH を通す」の意味をできるだけわかりやすく説明する試み](https://qiita.com/sta/items/63e1048025d1830d12fd) 
などを参考にしてください。


### MacOS PCへのソフトウェアのインストール

1. [公式サイト](https://docs.conda.io/en/latest/miniconda.html)からminicondaのインストーラーをダウンロード

    上記サイトから「MacOSX installers」の下にある表の中から「Miniconda3 MacOSX 64-bit bash」をダウンロードします。

    Pythonのバージョンは最新のもの（Python3.8）を選びます。


2. Terminalの起動

    Launchpadの中から「ターミナル」を実行し、次のコマンドを入力しましょう。

       cd Downloads
       bash Miniconda3-latest-MacOSX-x86_64.sh

    途中で何回か「yes|no」のいずれかを入力するように尋ねられるので、全て「yes」を入力します。インストールが完了したらターミナルを再起動しましょう。

3. 仮想環境の作成

      conda create -n 仮想環境名 python=バージョン 
      
     と入力して仮想環境を作成し、
      
      activate 仮想環境名
      
     と入力して仮想環境を起動します。環境を元に戻す場合は「deactivate」と入力します。

     情報リテラシー実践IIBでは次のようにしましょう。

      conda create -n py38 python=3.8
 
     と入力して仮想環境を作成し、

仮想環境について知りたい人は
- [Pythonの仮想環境まとめ](https://blog.codecamp.jp/programming-python-virtual-environment)
- [仮想環境](https://www.python.jp/install/windows/venv.html)
などを参考にしてください。

### 参考サイト
- [WindowsにMinicondaインストール(2018年)](https://qiita.com/FukuharaYohei/items/cf72049b2a97687037bb)
- [anaconda使いがminiconda使いになるまで【jupyterも】](https://qiita.com/Ringa_hyj/items/0d8193925fbf4e53a113)
- [【初心者向け】Windows環境でPythonをダウンロード・インストールする簡単手順解説](https://kredo.jp/media/howto-download-python-windows/)
- [Setup Miniconda (Python 3.7) on Windows 10](https://estuarine.jp/2018/12/setup-miniconda-windows10-2/)
- [久々にMinicondaを操作するときの道案内 Python Miniconda](https://qiita.com/hatorijobs/items/d0aef1a2824faabc5ee5)



Pythonの基本
--------------

### Pythonとは

Python は1990年代後半に Guido van Rossum によって開発されたプログラミング言語です。
現在はコアとなる開発チームを中心としたコミュニティを主体に開発が進められています。
プログラムを読みやすく書けるよう設計されていることが特徴と言われており，コミュニティにおいても読みやすいプログラムを書く文化が根付いています。

- [Python](https://www.python.org/)

Python は主に欧米企業で多く利用されており，Python で構築されたウェブサービスも多く存在します。
また，教育機関や研究機関でも数値計算や言語処理の目的で広く利用されています。 
広く利用されているバージョンは 2.x 系と 3.x 系があり，少し文法が異なります。
今回は 3.x 系 (3.7.0) を基に説明していきます。

### Pythonプログラミングの流れ

Python プログラミングは，次のような流れで行います。

1. ソースコード (source code) を記述する
2. Python インタプリタ (interpreter) で動作させる

他の言語で行われるようなコンパイル (compile) が必要ないため，
"スクリプト言語 (scripting language)"・"軽量プログラミング言語 (lightweight language)"などと呼ばれる事があります。

### プログラミングのルール

プログラミングを行う上で，注意しておくルールがあります。 これは，Python に限らずどの言語を使う時も共通で言えることです。

> **全角文字は使わない**
>
> 慣れないうちは日本語入力システム (IME) を常に OFF にしておきます。特に空白文字（スペース）は全角・半角の区別が付きにくいので注意しましょう。
>
> **大文字・小文字は区別する**
>
> プログラミングにおいては，アルファベットの大文字と小文字（例えば A と a）は区別されます。
>
> **カッコは開いたら閉じる**
>
> カッコは例えば，命令のひとかたまりの範囲（スコープ, scope）などを表します。開いたら閉じることを忘れないようにしましょう。
>
> **見やすくする**
> 
> 何をしているのかを後で読み返せるように説明・注釈（コメント, comment）をつけましょう。
>
>また，スコープをわかりやすくするため，字下げ（インデント, indent）を使いましょう。 なお， Python では，命令のひとかたまりを字下げで表すため，字下げを正しく使わないとプログラムを作れません。
>
> **表示されたエラーメッセージは読む**
>
> エラーメッセージにはエラーなどの原因が書かれていますので，必ず読みましょう。

はじめてのプログラミング
---

### *hello.py*

以下のソースコードを、適当なエディタを用いて入力してみましょう。全て半角英字で入力し，大文字・小文字の区別をします。また，スペースや記号も忘れずに入力してください。

    print("Hello")

ファイル名は、**hello.py**とし、**マイドキュメント**に保存してください。
次に、コマンドプロンプト（ターミナル）を起動してください。　

そして，"python" コマンドでインタプリタを起動しプログラムを実行します。

    H:\>python hello.py

{% screenshot hello02.png "python Hello の入力" %}

うまくいくと、以下のように表示されます。

{% screenshot hello03.png "Hello の出力" %}

コマンドプロンプト・ターミナルの詳しい使い方は以下を参照してください。

<span class="label label-info">参考資料</span> [コマンドプロンプトの使い方](../../../common/appendix/win_cmd_prompt.html)

<span class="label label-info">参考資料</span> [ターミナルの使い方](../../../common/appendix/mac_terminal.html)

### *hello.py*の構造

*.py* 拡張子がつけられたファイルは Python ソースコードと呼びます。
このソースコードを使って，Python プログラムの構造を見ていきます。

    print("Hello")

*print()* 関数は丸括弧の中を表示するための命令です。行として表示され文末は改行されます。
最初のプログラムは関数を 1 つ使うだけのとてもシンプルなものでしたが，
関数や命令文だけを使う Python プログラムは，基本的に関数や命令文が順番に並ぶだけです。


### コメントの利用

ソースコードをあとで見返したときに困らないよう，プログラム内には コメント を入力することができます。 
Python では `#`記号から行末まではコメントとして扱われ，インタプリタから見えない、すなわちプログラムの一部として認識されない部分になります。

    #
    # hello.py
    #
    
    # This program shows　"Hello"
    print("Hello") # -> Hello

全角文字のトラブルを避けるためにもコメントは英語でつけることを勧めますが，
あとで見返して意味がわからないコメントは意味が無いので，自信がない場合は無理せず日本語で入力しましょう。
本テキスト中のサンプルソースコードにコメントがついていることもありますが，
プログラムの動作には関係の無い箇所になりますので不要であれば入力しなくて構いません。


### Pythonのルール

実際のコードを基に，Python のルールをまとめると次のようになります。

* 命令語・単語の区切りは1つ以上の空白文字（スペース）を使う
* 命令文の区切り（行末）は改行する
* `#` 以降は行末までコメントとして扱われる


### インタラクティブシェルの利用

今回のような1行だけのプログラムのために，毎回ファイルを作成するのは少し面倒です。
そこで，Python ならではのインタラクティブシェルを利用してみます。 
コマンドプロンプトで，"C:\Program Files\Python35\python.exe" とだけ入力します。

    H:\>"C:\Program Files\Python35\python.exe"
    Python 3.5.1 (v3.5.1:37a07cee5969, Dec  6 2015, 01:54:25) [MSC v.1900 64 bit (AMD64)] on win32
    Type "help", "copyright", "credits" or "license" for more information.
    >>>

この >>> という記号は，Python の関数や命令文を実行できる状態になると表示されます。
続けて，先ほどと同じ print() 関数を入力してみましょう。

    >>> print("Hello")

入力後に [Enter] キーを押すと，先ほどと同じように文字列が表示されました。
このように，シンプルな命令であればファイルを作らずに実行できるのがインタラクティブシェルの特徴です。 
インタラクティブシェルを終了するには *exit()* と入力します。

    >>> exit()


練習
--------------
1. hello.pyの内容を一部書き換えて、表示される文字列を　Hello Python World! にしてみましょう。