# Python

## インストール手順
1. 公式サイトからminicondaのインストーラーをダウンロード

    miniconda
    https://docs.conda.io/en/latest/miniconda.html  
    上記サイトから
    - Windows、MacOSX、Linux
    - 64-bit、32-bit　オペレーティングシステム　

    のうち使用するPCに対応するものを選び、ダウンロードします。

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

## 仮想環境を作る

仮想環境については
- [Pythonの仮想環境まとめ](https://blog.codecamp.jp/programming-python-virtual-environment)
- [仮想環境](https://www.python.jp/install/windows/venv.html)

などを参考にしてください。

1.　condaのアップデート

   「Anaconda prompt」上で
   
           conda info -e

   と入力すると、現在の環境を確認することができます。

   - [【初心者向け】Windows環境でPythonをダウンロード・インストールする簡単手順解説](https://kredo.jp/media/howto-download-python-windows/)
   - [Setup Miniconda on Windows 10](https://estuarine.jp/2017/12/setup-miniconda-windows10/)

   上記サイトを参考に、condaやパッケージのアップデートを行い、仮想環境を作成します。

2. 仮想環境の作成

      conda create -n 仮想環境名 python=バージョン 
      
     と入力して仮想環境を作成し、
      
      activate 仮想環境名
      
     と入力して仮想環境を起動します。環境を元に戻す場合は「deactivate」と入力します。

##　PATHを通す

PATHについては
- [「PATH を通す」の意味をできるだけわかりやすく説明する試み](https://qiita.com/sta/items/63e1048025d1830d12fd) 

などを参考にしてください。
ここではWindows10の方法を紹介します。
1. [スタートメニュー]-[Windows システム ツール]-[コントロール パネル]-[システムとセキュリティ]-[システム]-[システムの詳細設定]-[環境変数]を開く

    [スタートメニュー]の検索欄へ「環境変数の編集」と入力しても開くことができます。

2. 変数欄の「Path」を選択し「編集」ボタンをクリック

3. Minicondaをインストールしたフォルダにpathを通す

##　コマンドプロンプトで開く

コマンドプロンプト上で

    activate.bat
    
と入力すると（base）の環境でminicondaが開きます。
ここから先程作成した環境へ移動してください。

##　参考にしたサイト
- [WindowsにMinicondaインストール(2018年)](https://qiita.com/FukuharaYohei/items/cf72049b2a97687037bb)
- [anaconda使いがminiconda使いになるまで【jupyterも】](https://qiita.com/Ringa_hyj/items/0d8193925fbf4e53a113)
- [【初心者向け】Windows環境でPythonをダウンロード・インストールする簡単手順解説](https://kredo.jp/media/howto-download-python-windows/)
- [Setup Miniconda (Python 3.7) on Windows 10](https://estuarine.jp/2018/12/setup-miniconda-windows10-2/)
- [久々にMinicondaを操作するときの道案内
   Python
   Miniconda](https://qiita.com/hatorijobs/items/d0aef1a2824faabc5ee5)

