---
layout: appendix
title: Visual Studio Communityのインストール
date: 2015-03-23 16:14:50 +0900
---

  　Microsoft社が開発した**統合開発環境**として、Visual Studioがあります。<ins>統合開発環境とは、システム開発をする際に、コーディング(プログラムを書くこと)、コンパイル、デバッグ(バグなどのミスを探すこと)などを行える環境</ins>のことです。情報処理教室では、C言語の開発環境として、Visual Studioがインストールされています。どの教室にインストールされているかは、TMUNERを参照してください。また、<ins>情報リテラシー実践IIBの授業にて、学習するためのプログラミング環境として、Visual Studioを利用するかは、担当教員の指示に従ってください</ins>。
   
 　 Visual Studioは通常有償ですが、Microsoft社では、**無償版のVisual Studio Community**を配布しています。有償版と比べていくつかの制約がありますが、情報リテラシー実践IIBの授業内容を学習する程度であれば、無償版のVisual Studio Communityで十分対応ができます。自習などのためにWindows PCにVisual Studio Communityをインストールする方法を以下では説明します。

Visual Studio Communityのインストールファイルのダウンロードとインストール
----------------

1. [Visual Studio CommunityのWebページ](https://visualstudio.microsoft.com/ja/vs/community/)へアクセスします。
1. [Visual Studioのダウンロード]をクリックし、任意のフォルダへインストールファイルをダウンロードします。<br />
{% screenshot VSC01.png %}<br />
1. ダウンロードしたインストールファイルをダブルクリックします。<br />
通常、特に変更や指定をしていなければ、”ダウンロード”フォルダにインストールファイルはダウンロードされています。
1. インストーラが起動したら、[続行]をクリックします。<br />
{% screenshot VSC02.png %}<br />
{% screenshot VSC03.png %}<br />
1. インストーラの準備が整ったら、どの機能をインストールするか選択する画面が開きます。<br />
※Visual StudioはC言語のみならず、様々なプログラミング言語を用いてシステムを開発することができます。<br />
“ワークロード”タブの“C++によるデスクトップ環境”にチェックを入れます。<br />
{% screenshot VSC04.png %}<br />
1. [インストール]をクリックします。<br />
{% screenshot VSC05.png %}<br />
{% screenshot VSC06.png %}<br />
1.	インストールが完了したら、再起動を要求されるので、[再開]をクリックし、再起動してください。<br />
{% screenshot VSC07.png %}

Visual Studio Communityの動作確認
----------------
   インストールし、再起動が完了したら、正常にインストールが終わったか、動作を確認しましょう。
1. [スタート]から”すべてのアプリ” – “Visual Studio 20**“ – “Developer Command Prompt for VS 20**”をクリックします。<br />
※20**には、Visual Studio Communityのバーションの年が入ります。<br />
{% screenshot VSC08.png %}<br />
1. Developer Command Prompt for VS 20**が起動したら、”cl”と入力し、[Enter]キーを押してください。<br />
{% screenshot VSC09.png %}<br />
1. インストールが成功していたら、以下のように表示されます。<br />
エラーになるようであれば、インストールは失敗していますので、Visual Studio Communityをアンインストールして、インストールをし直しましょう。<br />
{% screenshot VSC10.png %}

  　<ins>**Developer Command Prompt for VS 20\**はVisual Studion Community用のコマンドプロンプト**になります</ins>。基本的な操作は、通常のコマンドプロンプトと同じように使うことができます。Visual Studioでは、統合開発環境として、エディタや実行環境などが統合した画面も持っていますが、初心者がいきなり利用するには、機能や設定項目等が多く、使い方にも簡単ではありません。初心者は、メモ帳などのエディタとDeveloper Command Prompt for VS 20\**を併用して学習するのが良いでしょう。プログラミングに慣れて、システム開発などの高度なプログラミングに興味がわいてきたら、Visual Studioの使い方も学んでみると良いでしょう。
