---
layout: appendix
title: 分析ツール
date: 2017-04-07 19:30:54 +0900
---


分析ツールを追加する
--------------------------------

[ファイル] - [オプション] - [アドイン]をクリックします。

{% screenshot 01_addin00.png "ファイルを開く" %}

{% screenshot 01_addin01.png "オプションを開く「" %}

{% screenshot 01_addin02.png "アドインを選択" %}

[Excelアドイン]を選択し、[設定]をクリックします。

{% screenshot 01_addin03.png "Excelアドインの設定" %}

[分析ツール]を選択し、[OK]をクリックします。

{% screenshot 01_addin04.png "分析ツールにチェックを入れる" %}

[データ分析]が追加できました。


分析ツール有効時の注意事項
--------------------------

Office2013 では、分析ツールを有効にしているときに Excel のマクロを実行すると強制終了する未修正の不具合があります。
分析ツールを有効にしている状態でマクロを実行するときは、下記のいずれかの手順で実行してください。

1. Visual Basicエディターから実行

1. xlsm ファイルを開き、[Ctrl] + [S] キーで上書き保存してから、マクロより実行
    * [ファイル]メニュー - [上書き保存] は利用しないでください

1. 上述の手順と同様にアドインの設定で分析ツールを無効にしてから、VBAを実行する
    * [ファイル]リボン - [オプション] - [アドイン] をクリックする
    * [Excelアドイン] を選択し、[設定] をクリック
    * [分析ツール] の選択を解除し、[OK] をクリック
