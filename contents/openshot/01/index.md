---
layout: page
title: 映像編集（１）
date: 2018-03-20 15:55:40 +0900
purposes:
    - OpenShot Video Editor を使った映像編集方法の理解
---


映像の特徴
------------

電子機器ならではの情報表現として、映像（映像）があります。
映像は、時間軸に沿って視覚情報（画像）や聴覚情報（音声・音楽）を同期させた情報表現です。つまり、映像は情報量の多い表現と言えます。


コンピュータにおける映像の扱い
------------------------------

### 映像の形式

コンピュータで映像を扱うためには、データとして情報を処理する必要があります。
データの変換のことをエンコードと呼び、エンコードするためのプログラムをコーデックと呼びます。
そして、利用したコーデックに対応するように映像の形式（ファイルフォーマット）が用意されています。
それぞれに特徴があるため、用途に応じた種類を選ぶ必要があります。

<table>
<thead>
<tr>
<th>ファイル形式</th>
<th>拡張子</th>
<th>特徴</th>
</tr>
</thead>
<tbody>
<tr>
<td>MPEG-4 file format version 2 (MPEG-4)</td>
<td>.mp4</td>
<td>優れた圧縮率のためファイルサイズを小さく抑えることができる。現在広く利用されている。</td>
</tr>
<tr>
<td>Windows Media Video</td>
<td>.wmv</td>
<td>Windows で標準対応しているビデオ形式。</td>
</tr>
<tr>
<td>QuickTime Video</td>
<td>.mov</td>
<td>macOS で標準対応しているビデオ形式。</td>
</tr>
<tr>
<td>Audio Video Interleave (AVI)</td>
<td>.avi</td>
<td>非圧縮のビデオ形式。圧縮していないため画質が良いが、ファイルサイズが大きくなる。</td>
</tr>
</tbody>
</table>


### 映像の再生

コンピュータにおいて映像を再生するためには、プレイヤーと呼ばれるソフトウェアが必要です。
OS には標準でプレイヤーが同梱されているため、一般的なファイル形式であれば特別な準備をせずとも再生できます。

* Windows Media Player (Windows)
* QuickTime Player (macOS)

### 映像の編集

映像を編集するためには、映像編集ソフトウェアが必要となります.
映像編集ソフトウェアとは、映像ファイルを加工・編集し、出力できるソフトウェアの総称です。

* [OpenShot Video Editor](https://www.openshot.org/) (Windows/macOS/Linux)
* [Shotcut](https://shotcut.org/) (Windows/macOS/Linux)
* [Adobe Premiere](https://www.adobe.com/jp/products/premiere.html) (Windows/macOS)
* [iMovie](https://www.apple.com/jp/imovie/) (macOS)

ここでは、 [OpenShot Video Editor](https://www.openshot.org/) を利用します。OpenShot Video Editor はシンプルな操作に特化したオープンソースソフトウェアで、誰でも自由に利用できます。
読み込んだ映像ファイルの長さを調整したり、複数の映像ファイルを組み合わせたりすることができます。
操作は Windows 環境を例に説明しますが、macOS や Linux でも同様に操作できます。

映像編集ソフトウェアは、市販されているパッケージソフトウェアなども含め他にも様々な製品があります。
この講で映像編集の基本的な概念を学んだ後、自分たちの目的に合った映像を作れるソフトウェアを探してみましょう。


OpenShot Video Editor を使った映像の編集
------------------------------------------

実際に複数の映像ファイルを組み合わせて、BGMを付けた映像を作成してみます。
事前に下記のファイルを素材としてダウンロードします。リンクを右クリックし、名前を付けて作業フォルダ（マイドキュメント等）に保存してください。

* [River (映像)](river.mp4)
* [Waterfall (映像)](waterfall.mp4)
* [RiverMeditation (BGM)](river_meditation.mp3)

### 起動と画面の構成

OpenShot Video Editor を起動します。

スタートボタンをクリックし、[OpenShot Video Editor] を選択します。

画面構成は下記の通りです。

{% screenshot names_of_parts.png "画面各部の名称" %}

### ビデオ形式の選択

編集を始める前に，作成するビデオの形式を設定しておきます。
画面上部のツールバーからフィルムアイコンをクリックし，"ビデオ形式の選択" ダイアログを表示します。

{% screenshot settings_of_video_format.png "ビデオ形式の設定" %}

様々なプロファイル（設定）がありますが，ここでは "HD 720p 25fps (1280x720)" を選択します。
画面の大きさが 1280x720 (720p)，フレームレート（秒間のフレーム数）が 25 の高精細度映像という設定です。

### 保存

作業中の状態を保存しておきます。
映像編集ソフトウェアでは、2通りの保存が存在します。

* 作業状態の保存
    * 作業中の状態を保存し、再開できるようにする
    * 保存したファイルは、作業に用いた映像編集ソフトウェアでなければ開くことができない
* できあがった映像ファイルの保存（エクスポート）
    * 完成した映像を映像形式で出力し、プレイヤーで再生できるようにする

編集作業については，常に作業状態の保存をするようにしてください。
そして、完成した作品はできあがった映像ファイルとして書き出す（エクスポートする）ようにしてください。

OpenShot Video Editor では、作業状態の保存は [ファイル] - [プロジェクトを保存] または [プロジェクトを別名で保存] 、できあがった映像ファイルの保存は [ファイル] - [映像を書き出し] から行います。

### ファイルのインポートとタイムラインの操作

編集するために，映像や音声といった素材ファイルを読み込み（インポートし）ます。
画面上部のツールバーから + のアイコンをクリックし，読み込むファイルを選択します。
インポートされたファイルは，画面左の "プロジェクトファイル" ビューに表示されます。

{% screenshot import_files.png "ファイルをインポートした状態" %}

プロジェクトファイルに読み込まれた素材は，画面下部のタイムラインに追加できます。
プロジェクトファイルの `river.mp4` をドラッグし，"タイムライン" ビューの トラック0 にドロップします。

{% screenshot drop_river.png "映像ファイルを トラック0 に追加" %}

タイムラインに映像を追加できました。プレビューにはタイムラインの様子が表示されています。
同様に `waterfall.mp4` を トラック1 に追加します。

{% screenshot drop_river.png "映像ファイルを トラック1 にもに追加" %}

タイムラインに追加した素材は，ドラッグすることでタイミングを変更できます。また，長さを調整したり，トラック間を移動させることもできます。

タイムラインでは，数字が大きいトラックほど優先的に表示されます。数字が小さい順にフィルムを重ねたものをイメージすると良いかも知れません。
ここの例では，`waterfall.mp4` の映像と `river.mp4` の映像が一部重なっています。
この場合，トラック1 にある `waterfall.mp4` の映像が優先されて表示されます。実際に再生しながら，動きを確認してください。

### トランジションの追加

トランジションとは，映像の切り替わる際に付加する映像効果のことです。
トランジションをうまく使うことによって、映像の質をより高めることができます。

画面左の "プロジェクトファイル" ビューの下部にある "トランジション" タブをクリックし，トランジションの一覧を表示します。
ここでは，トラック1 の `waterfall.mp4` の開始端に "ワイプ 右から左" を設定します。
"ワイプ 右から左" を選び，タイムラインの `waterfall.mp4` の開始端にドラッグ&amp;ドロップします。

{% screenshot add_transition.png "トランジションをトラックに追加" %}

水色で表示されている部分がトランジションの対象範囲です。実際にプレビューで再生してみると，ワイプ効果が確認できます。
トランジションのサムネイルにあるように実際に黒や白の色が表示されるわけではなく，黒いところが透明・白いところが不透明となり合成される点に注意してください。

画面左下の "プロパティ" ビューの "終了" の値を変更することで，トランジションの時間を調整することができます。
標準では10秒ですが，ここでは素早く切り替えるため3秒（`3.00`）に変更します。

{% screenshot change_transition_setting.png "トランジションの設定を修正" %}

水色の範囲が狭くなったことがわかります。
このように，映像にトランジションを追加することで，映像間の切り替えに効果をつけることができます。

同じように，`waterfall.mp4` の終端にフェード効果を追加し，終了を `5.00` に変更します。

### タイトルの挿入

"タイトル" は，映像中に文字を表示する機能です。
OpenShot Video Editor ではいくつかのデザインがあらかじめテンプレートとして用意されていますので，これを用いて映像のタイトルやテロップを追加できます。
ここでは，映像の最初に映像タイトルを挿入してみましょう。

画面上部のメニューより [タイトル] - [タイトル] を選択します。

{% screenshot titles.png "タイトルテンプレートの選択" %}

利用したいテンプレートを選択し，右で設定します。
ここでは "Camera border" を選択し，下記のように設定します。

* ファイル名: title
* 行 1: 川の流れ
* フォント: メイリオ

文字・背景で色を変更することもできます。

[Save] をクリックすると，"プロジェクトファイル" ビューに `title.svg` というファイルが追加されます。
今作成したタイトルが画像としてインポートされた形となっています。

{% screenshot import_title.png "タイトルが追加された状態" %}

`title.svg` を選択し，"タイムライン" ビューのトラック2の開始端にドラッグ&amp;ドロップします。

{% screenshot add_title.png "タイトルをトラックに追加" %}

プレビューで再生すると， `river.mp4` の映像に重なるようにタイトルが表示されていることが確認できます。
トランジションと同じように，黒い背景はそのまま表示されるのではなく透過しています。

### 音声の追加

楽曲や録音した音声などの音声ファイルをタイムラインに追加することで，映像に音をつけることができます。

先ほど保存した `river_meditation.mp3` を映像ファイルと同じようにプロジェクトにインポートし，"タイムライン" ビューのトラック2 に追加します。
再生時間が長いため，終端をドラッグしてトラック1の終端と合うように調整します。

{% screenshot add_music.png "音楽ファイルをトラックに追加" %}

映像と音声の細かいタイミングを合わせたいときは、それぞれの長さやタイミングをタイムラインで確認して微調整しましょう。

### 音声の調整

映像に音声を重ねたとき，もともと映像にも音声が含まれている場合は混ざって聞こえます。
音声はそれぞれで調整することができます。また、フェードイン・フェードアウトしながら合成することもできます。

ここでは，`river_meditation.mp3` の終端にフェードアウトを追加します。
トラック2 の `river_meditation.mp3` を右クリックし，[ボリューム] - [クリップ終端] - [フェードアウト (遅い)] をクリックします。

{% screenshot add_fadeout.png "フェードアウトを追加" %}

### 書き出し

編集後の状態を映像ファイルとして書き出します。
画面上部のツールバーより，赤い丸アイコンをクリックすると "動画を書き出し" ダイアログが表示されます。

{% screenshot export.png "動画を書き出し" %}

ここでは，作成時と同じ "HD 720p 25fps (1280x720)" を選択し，MP4 形式で書き出します。また，書き出したファイルは "Folder Path" 以下に保存されますので，Hドライブを選択するようにしてください。
用途が決まっている場合は，"プロファイル" で形式を絞ると，目的に応じたプロファイルが候補として表示されますので参考にしてください。

参考リンク
----------

### 学外サイト

-   [OpenShot Video Editor](https://www.openshot.org/)
-   [Pixabay](https://pixabay.com/ja/videos/)
-   [Free Music Archive](https://freemusicarchive.org/)

