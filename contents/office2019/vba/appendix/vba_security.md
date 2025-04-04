---
layout: appendix
title: マクロのセキュリティの確認と設定
date: 2022-04-01 00:00:00 +0900
---

ここでは、マクロのセキュリティについて確認します。

情報処理教室では、あらかじめ設定されていますが、自習などで用いるご自分のPCでは設定されていない可能性がありますので、確認を行い、必要に応じて設定の変更を行いましょう。


マクロのセキュリティ
----------------

マクロのセキュリティ設定を行います。

マクロは、様々な処理を自動で行えるようにできるため、有害なプログラムとしても利用されることがあります。よって、初期設定では、マクロは無効になっていることが多く、マクロを利用できない場合があります。マクロのセキュリティ設定を確認してみましょう。

&#9312; [開発]タブ – [マクロのセキュリティ]をクリックします。

{% screenshot Security_DevTab.png "開発タブのマクロのセキュリティ" %}

&#9313; “マクロの設定”として何が選択されているかを確認しましょう。

* 警告せずにVBAマクロを無効にする：マクロは利用できません。
* 警告して、VBAマクロを無効にする：マクロを開こうとした際に、警告が表示され、[コンテンツの有効化]を押すと、マクロを利用できます。ユーザーが確認してマクロを利用できるようになるため、今回は、この設定を選びます。
* 電子署名されたマクロを除き、VBAマクロを無効にする：電子署名で証明されているマクロは利用できますが、それ以外のマクロは利用できません。
* VBAマクロを有効にする：全てのマクロが利用できますが、注意として書いてあるとおり、有害なプログラムも利用できる状態になってしまうため、この設定にはしないようにしましょう。

&#9314; “警告して、VBAマクロを無効にする”にチェックが入っていない場合は、チェックを入れて、[OK]を押しましょう。

{% screenshot Security_VBASec.png "マクロの設定" %}

これで、セキュリティ上マクロをExcelで実行できるようになりました。

下記のようにマクロが含まれたExcelファイルを開こうとすると、セキュリティの警告によって、マクロが無効化されますが、[コンテンツの有効化]を押すことによって、そのファイルに限ってマクロを有効にすることができます。

{% screenshot Security_Warning.png "セキュリティの警告" %}

