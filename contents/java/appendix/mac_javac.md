---
layout: appendix
title: コンパイルと実行(Mac)
date: 2015-03-23 16:14:50 +0900
---


コンパイル
----------

### ターミナルを起動する

Dockから、*ターミナル* を起動します。Dockから見つけられない場合は、Finderの [アプリケーション] - [ユーティリティ] - [ターミナル.app] からも起動できます。

ターミナルの詳しい使い方については、以下を参照してください。

<span class="label label-info">参考資料</span> [ターミナルの使い方](../../common/appendix/mac_terminal.html)

### コンパイル

まず、ソースコードを保存しているディレクトリに移動します。

    cd ディレクトリ名

`ls` コマンドなどでファイルがあることを確認したら、コンパイルします。

    javac ファイル名

これでエラーが表示されずにclassファイルが作成されたら、コンパイルは完了です。


実行
----

### 中間コードの実行

コンパイルができたら、実行しましょう。

    java クラス名
