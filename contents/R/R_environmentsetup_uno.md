# R 環境構築

## 何をインストールすれば良いのか

- R
- R Commander
- RStudio

## どのWebページを見れば良いのか

1. R

以下のサイトにアクセスする

https://cran.r-project.org/

サイト内にある

- [Download R for Linux](https://cran.r-project.org/bin/linux/)
- [Download R for (Mac) OS X](https://cran.r-project.org/bin/macosx/)
- [Download R for Windows](https://cran.r-project.org/bin/windows/)

のいずれかをダウンロードする

2. R Commander

①Rを起動する．
②開かれたRの上にあるメニューから[パッケージ]－[パッケージのインストール]と選ぶ．
③[JapanTokyo]⇒[OK]をクリック．
④[Rcmdr]⇒[OK]をクリック．
⑤[質問]のようなダイアログボックスが出るので，全て[はい]をクリック．
⑥インストールが終了したら，コマンドプロンプト（赤字の[＞｜]）をクリックしてから，半角で

　　　　　　library(Rcmdr)

と入力．入力後，Enterキーを押す．
⑦[Rcmdrが利用する次のパッケージがありません]のような警告のダイアログボックスが出ます．これに対しては[はい]をクリック．
⑧[無いパッケージをインストールする]というダイアログボックスで，[OK]をクリック．
⑨またインストールが始まりますので，少し待ちます．Rコマンダーのインストールが完了すると，新たにRコマンダーの画面が現れる．

*以下のサイトを参照しました*

https://personal.hs.hirosaki-u.ac.jp/pteiki/research/yodosha/second.html

3. RStadio

以下のサイトにアクセス

https://rstudio.com/products/rstudio/download/

ページ下部にある

**RStudio Desktop FOR 【使用しているOS】** をクリックしダウンロードする．

インストールしてアプリケーションフォルダに「R Stadio」があることを確認する．



*以下のサイトを参照しました*

https://qiita.com/daifuku_mochi2/items/ad0b398e6affd0688c97

## 参考にしたサイト

https://personal.hs.hirosaki-u.ac.jp/pteiki/research/yodosha/second.html

http://sgn.sakura.ne.jp/R/Rinstall.html

https://qiita.com/daifuku_mochi2/items/ad0b398e6affd0688c97
