<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=shift_jis">
        <meta http-equiv="Content-Script-Type" content="text/javascript">
        <meta http-equiv="Content-Style-Type" content="text/css">
        <meta http-equiv="imagetoolbar" content="no">
        <meta name="Author" content="FoundationEducationCenter">
        <title>第８講　Accessの概要とテーブル</title>
        <link href="../../style/common.css" rel="stylesheet" type="text/css"></head>
    <body>
        <div class="header">情報リテラシー実践ⅡＡ</div>
        <h1>第８講　Accessの概要とテーブル</h1>
        <div class="boxtitle">本講の目的</div>
        <div class="box">
            <ul class="1st">
                <li>データベースソフトについて学ぶ</li>
                <li>Microsoft Accessの基本操作を学ぶ</li>
                <li>新しいテーブルを作成する</li>
            </ul>
        </div>
        <div class="boxtitle">本講の内容</div>
        <div class="box">
            <ul>
                <li><a href="#1-1">Microsoft Accessについて</a></li>
                <li><a href="#1-2">Microsoft Accessの基本操作</a></li>
                <li><a href="#1-3">データベースの作成</a></li>
                <li><a href="#1-4">課題 1</a></li>
            </ul>
        </div>
        <div class="notice">
            <p><strong>本教材に掲載する製品名は、一般に各開発メーカの商標、または登録商標です。</strong></p>
        </div>
        <div class="text">
            <p><strong>練習で使ったデータは必ず保存するようにしましょう！</strong></p>
        </div>
        <div class="box">
            <p>今回使うファイルです。ダウンロードしてください。</p>
            <ul>
                <li><a href="./Clist(fin).accdb">Clist(fin).accdb</a></li>
                <li><a href="./Clist.xls">Clist.xls</a></li>
                <li><a href="./gradetype.accdb">gradetype.accdb</a></li>
                <li><a href="./congress.xls">congresslist.xls</a></li>
                <li><a href="./membertype.accdb">membertype.accdb</a></li>
            </ul>
        </div>
        <h2><a name="1-1"></a>Microsoft Accessについて</h2>
        <div class="text">
            <div class="img"><img src="pic/accesslogo.png"></div>
            <p>Microsoft Accessは、Microsoft社が開発したリレーション（関係）型データベースソフトウェアです。</p>
            <p>大量のデータを入力、保存することができ、そのデータを必要に応じた形で表示したり、印刷したりすることができます。</p>
            <p>大きな特徴は、データ間のリレーションシップ（関係）に基づいて、データを処理することができるということです。</p>
        </div>
        <h3>Microsoft Excelとの違い</h3>
        <div class="text">
            <p>Microsoft Officeには、Accessの他にデータを操作するソフトウェアとしてExcelがあります。しかし、Accessはデータベースソフトウェアと呼ばれる一方で、Excelは表計算ソフトと呼ばれ、それぞれ特長を持っています。</p>
            <ul>
                <li>Excelの特長</li>
                <ol>
                    <li>データはセルに直接入力する</li>
                    <li>自由に入力することができる</li>
                    <li>計算はセルに直接計算式を入力する</li>
                    <li>シートに表された形で印刷する</li>
                </ol>
                <li>Accessの特長</li>
                <ol>
                    <li>データはテーブルに入力する</li>
                    <li>同じ列には同じ型のデータしか入力することはできない</li>
                    <li>クエリを使うことによって、複数のデータテーブルを組み合わせ、様々な形で設定できる</li>
                    <li>計算にはクエリを使用する</li>
                    <li>レポートで任意の形で印刷することができる</li>
                </ol>
            </ul>
        </div>
        <h2><a name="1-2"></a>Microsoft Accessの基本操作</h2>
        <h3><a name="3-2"></a>ウィンドウ構成</h3>
        <div class="text">
            <ul>
                <li>各部の名称</li>
            </ul>
            <div class="img"><img src="pic/window.png"></div>
        </div>
        <h3><a name="3-3"></a>クイックアクセスツールバー</h3>
        <div class="text">
            <div class="img"><img src="pic/quick.png" alt="クイックアクセスツールバー"></div>
            <p>よく使うコマンドを表示しておくことができます。</p>
            <p>初期設定では、<img src="../buttonpic/quicksave.png" alt="上書き保存" align="absmiddle">（[上書き保存]）、<img src="../buttonpic/quickreturn.png" alt="元に戻す" align="absmiddle">（[元に戻す]）、<img src="../buttonpic/quickrepeat.png" alt="繰り返す" align="absmiddle">（[繰り返す]）が表示されています。</p>
            <p><img src="../buttonpic/quick_more.png" alt="more" align="absmiddle">を押すと、表示するコマンドのカスタマイズができます。</p>
        </div>
        <h3><a name="3-4"></a>リボン</h3>
        <div class="text">
            <p>データベースを作成していく際によく利用するコマンドを割り当てたボタンが機能ごとにパネルに分類され、配置されています。</p>
            <p>リボン上部のタブ状になった[ホーム]、[作成]、[外部データ]、[データベース ツール]をクリックすることによって、
            各機能のパネルに切り替えることができます。もしくは、カーソルがリボン上にあるときにホイールを回すと、切り替えることができます。</p>
            <ul>
                <li>ホーム：フォントの設定や並び替え、検索などを行う事が出来ます。</li>
            </ul>
            <div class="img"><img src="pic/ribbon1.png" alt="リボン ホーム"></div>
            <ul>
                <li>作成：テーブル、フォーム、レポートおよびクエリやマクロはここで作成する事が出来ます。</li>
            </ul>
            <div class="img"><img src="pic/ribbon2.png" alt="リボン 作成"></div>
            <ul>
                <li>外部データ：他のAccessやExcelなどのデータをインポートしたり、ExcelやPDF形式のファイルにエクスポートしたりできます。</li>
            </ul>
            <div class="img"><img src="pic/ribbon3.png" alt="リボン 外部データ"></div>
            <ul>
                <li>データベース ツール：マクロの設定や、リレーションシップの設定などを行う事が出来ます。</li>
            </ul>
            <div class="img"><img src="pic/ribbon4.png" alt="リボン データベース ツール"></div>
        </ul>
        <p>パネルの右下にある<img src="../buttonpic/details.png" alt="詳しい設定" align="absmiddle">を押すと、より詳しく各項目を設定することができます。</p>
        <div class="img"><img src="pic/ribbon_details.png" alt="フォント"></div>
        <div class="img"><img src="pic/fontwindow.png" alt="フォント"></div>
        <p>また、カーソルを使用したいコマンドの上で静止させると、そのコマンドの説明を見ることができます。</p>
        <p></p>
    </div>
    <h3>Microsoft Accessの起動</h3>
    <div class="text">
        <ol>
            <li>[スタート] - [すべてのプログラム] - [Microsoft Office] - [Microsoft Office Access]をクリックします。</li>
        </ol>
        <p>起動画面</p>
        <div class="img"><img src="pic/home.png"></div>
    </div>
    <h3>データベースを開く</h3>
    <div class="text">
        <ol>
            <li>（[ファイルメニュー]） - [開く]をクリック - 先ほど保存した"Clist(fin)"を選択 - [開く]をクリックします。</li>
            <div class="img"><img src="pic/open1.png"></div>
            <div class="img"><img src="pic/open2.png"></div>
            <li>セキュリティの警告が出ているので解除します。[コンテンツの有効化]をクリックします。</li>
            <div class="img"><img src="pic/security1.png"></div>
            <!-- 		<p>セキュリティの設定によっては、警告が出る場合がありますが、[開く]を押せば、開きます。</p>
            <div class="img"><img src="8-04access.png" alt="セキュリティ"></div>
            <div class="img"><img src="8-05access.png" alt="メニュー" width="480" height="345"></div>
            -->	
        </ol>
    </div>
    <h3>ナビゲーションウィンドウの操作</h3>
    <div class="text">
        <p>Access2010では、ウィンドウ左に表示される"ナビゲーション ウィンドウ"を使って
        テーブルやフォームなどの一覧を表示させることができます。</p>
        <ol>カテゴライズの方法とフィルタの設定がここで行えます。
            <div class="img"><img src="pic/navi1.png"></div>
        </ol>
    </div>
    <h3>テーブルを開く</h3>
    <div class="text">
        <p>ここからは、Accessの基本である「テーブル」「フォーム」「クエリ」「レポート」の開き方を見ていきます。</p>
        <p>テーブルは、データを蓄積し、表として保存しておくものです。同じ行のデータはそれぞれ対応関係にあります。列（フィールド）はデータの各項目を表しており、特定の型が設定されます。その型以外のデータは保存することはできません。</p>
        <ol>
            <li>すべてのAccessオブジェクトから[サークル名簿]を開きます。</li>
            <div class="img"><img src="pic/readlist1.png"></div>
            <div class="img"><img src="pic/readlist2.png"></div>
            <li>[ホーム]タブ（もしくは[データシート]タブ） - [表示] - <img src="../buttonpic/designview.png" alt="デザインビュー" align="absmiddle">（[デザイン ビュー]）をクリックしてデザインビューに切り替えます。</li>
            <div class="img"><img src="pic/readlist3.png"></div>
            <div class="img"><img src="pic/readlist4.png"></div>
            <li>デザインビューに切り替わりました。デザインビューは、テーブル以外にもあり、レイアウトの変更やフィールドの設定変更などを行うことができます。</li>
            <li>[ホーム]タブ（もしくは[デザイン]タブ） - [表示] - <img src="../buttonpic/databaseview.png" alt="データベースビュー" align="absmiddle">（[データベース ビュー]）をクリックすると、元に戻ります。</li>
            <div class="img"><img src="pic/readlist5.png"></div>
        </ol>
    </div>
    <h3>フォーム</h3>
    <div class="text">
        <p>フォームは、テーブルに保存されているデータを、また入力用のウィンドウをどのように表示するか設定するものです。フォームを作成すると1つのレコードを1つのウィンドウに表示することができるので、入力作業を効率的に行うことができます。</p>
        <ol>
            <li>すべてのAccessオブジェクトから[会員情報]を開きます。</li>
            <div class="img"><img src="pic/readinfo1.png"></div>
            <div class="img"><img src="pic/readinfo2.png"></div>
            <li>[ホーム]タブ - [表示] - <img src="../buttonpic/layoutview.png" alt="レイアウトビュー" align="absmiddle">の<img src="../buttonpic/underview.png"align="absmiddle">（[表示]）の部分をクリックして、[デザインビュー]をクリックします。</li>
            <div class="img"><img src="pic/readinfo3.png"></div>
            <div class="img"><img src="pic/readinfo4.png"></div>
            <li>デザインビューに切り替わりました。[ホーム]タブ（もしくは[デザイン]タブ） - [表示] - <img src="../buttonpic/formview.png" alt="データベースビュー" align="absmiddle">（[データベースビュー]）をクリックすると、元に戻ります。</li>
            <div class="img"><img src="pic/readinfo5.png"></div>
        </ol>
    </div>
    <h3>クエリ</h3>
    <div class="text">
        <p>クエリは、テーブルに蓄積されたデータをどのような形に加工するか設定するものです。複数のテーブルの必要な部分だけを引き出したり、関連性のあるデータ同士をリレーションシップによって接続することなどができます。</p>
        <ol>
            <li>すべてのAccessオブジェクトから[入会日と所属]を開きます。</li>
            <div class="img"><img src="pic/readcourse1.png"></div>
            <div class="img"><img src="pic/readcourse2.png"></div>
            <li>[ホーム]タブ - [表示] - <img src="../buttonpic/designview.png" alt="デザインビュー" align="absmiddle">（[デザイン ビュー]）をクリックしてデザインビューに切り替えます。</li>
            <div class="img"><img src="pic/readcourse3.png"></div>
            <div class="img"><img src="pic/readcourse4.png"></div>
            <li>デザインビューに切り替わりました。[ホーム]タブ（もしくは[デザイン]タブ） - [表示] - <img src="../buttonpic/databaseview.png" alt="データベースビュー" align="absmiddle">（[データベース ビュー]もしくは[実行]）をクリックすると、元に戻ります。</li>
            <div class="img"><img src="pic/readcourse5.png"></div>
        </ol>
    </div>
    <h3>レポート</h3>
    <div class="text">
        <p>レポートは、クエリなどでデータの集合をどのようなデザインで表示するかを設定するものです。フォームとの違いは、フォームは 1つのレコードについて各項目を表示するのに対し、レポートはデータの抽出や集計を実行した結果の報告書を作成したりできます。</p>
        <ol>
            <li>すべてのAccessオブジェクトのフォームにある[入会日リスト]を開きます。</li>
            <div class="img"><img src="pic/readjoin1.png"></div>
            <div class="img"><img src="pic/readjoin2.png"></div>
            <li>[ホーム]タブ - [表示] - <img src="../buttonpic/layoutview.png" alt="データベースビュー" align="absmiddle">の<img src="../buttonpic/underview.png"align="absmiddle">（[表示]）の部分をクリックして、[デザイン ビュー]に切り替えます。</li>
            <div class="img"><img src="pic/readjoin3.png"></div>
            <div class="img"><img src="pic/readjoin4.png"></div>
            <li>デザインビューに切り替わりました。[ホーム]タブ（もしくは[デザイン]タブ） - [表示] - <img src="../buttonpic/reportview.png" alt="データベースビュー" align="absmiddle">（[データベース ビュー]）をクリックすると、元に戻ります。</li>
            <div class="img"><img src="pic/readjoin5.png"></div>
        </ol>
    </div>
    <h2><a name="1-3"></a>データベースの作成</h2>
    <h3>新しいデータベースの作成</h3>
    <div class="text">
        <ol>
            <li>（[ファイルメニュー]） - [新規作成]をクリックします。</li>
            <div class="img"><img src="pic/new1.png"></div>
            <li>[空のデータベース]の下のファイル名入力欄に"Clist"と打ち込み、[作成]をクリックします。</li>
            <div class="img"><img src="pic/new2.png"></div>
            <div class="img"><img src="pic/new3.png"></div>
            <li>新しいデータベースが作成されました。</li>
        </ol>
    </div>
    <h3>テーブルの作成</h3>
    <div class="text">
        <p>既にテーブルが開かれているのでこれを編集していきます。</p>
        <ol>
            <li>まず、デザインビューに切り替えます。[ホーム]タブ - [表示] - [データベース ビュー]をクリックしてデザインビューに切り替えます。</li>
            <li>名前を付けて保存ウィンドウが表示されるので"サークル名簿"と入力し、[OK]をクリックします。</li>
            <div class="img"><img src="pic/field1.png"></div>
            <div class="img"><img src="pic/field2.png"></div>
            <li>フィールド名の項目に以下の１１個の要素を入力していきます。</li>
            <ul>
                <li>会員ID（すでに「ID」と入力されている部分を「会員ID」に変更する。）</li>
                <li>氏名</li>
                <li>シメイ</li>
                <li>郵便番号</li>
                <li>都道府県</li>
                <li>市区町村</li>
                <li>自宅TEL</li>
                <li>入会年月日</li>
                <li>学年ID</li>
                <li>学部コース</li>
                <li>退会</li>
            </ul>
            <div class="img"><img src="pic/field3.png"></div>
            <p>これでフィールド名の入力が終わりました。次に、データを入力する際に便利な機能を各フィールドに付与していきます。</p>
        </ol>
        <h3>ふりがなウィザードでプロパティを設定</h3>
        <div class="text">
            <ol>
                <li>"氏名"をクリック - フィールドプロパティのふりがなの項目をクリックします。横に表示された[…]というボタンを押します。</li>
                <div class="img"><img src="pic/furigana1.png"></div>
                <li>警告が出るのでテーブルを保存します。</li>
                <div class="img"><img src="pic/furigana2.png"></div>
                <li>ふりがなウィザードの"既存のフィールドを使用する"にチェックを入れ、[シメイ]を選択します。</li>
                <li>さらにふりがなの文字種に[全角カタカナ]を選択し、[完了]を押します。</li>
                <div class="img"><img src="pic/furigana3.png"></div>
                <li>フィールドのプロパティを変更します。[OK]をクリックします。</li>
                <div class="img"><img src="pic/furigana4.png"></div>
                <p>これで、"氏名"のフィールドに入力すると、"シメイ"のフィールドに全角カタカナでふりがなが入力されるようになりました。</p>
            </ol>
        </div>
        <h3>住所入力支援ウィザードでプロパティを設定</h3>
        <div class="text">
            <ol>
                <li>"郵便番号"をクリック - フィールドプロパティの住所入力支援の項目をクリックします。横に表示された[…]を押します。</li>
                <div class="img"><img src="pic/zipcode1.png"></div>
                <li>住所入力支援ウィザードの郵便番号に[郵便番号]を選択 - [次へ]を押します。</li>
                <div class="img"><img src="pic/zipcode2.png"></div>
                <li>住所の構成の中から"都道府県と住所の 2 分割"にチェック - 都道府県に[都道府県]を選択 - 住所に[市区町村]を選択 - [次へ]を押します。</li>
                <div class="img"><img src="pic/zipcode3.png"></div>
                <p>"郵便番号"に自分の家の郵便番号を入力してみましょう。"都道府県"と"市区町村"に住所が表示されます。</p>
                <li>[完了]を押します。</li>
                <div class="img"><img src="pic/zipcode4.png"></div>
                <li>フィールドのプロパティを変更します。[OK]をクリックします。</li>
                <div class="img"><img src="pic/zipcode5.png"></div>
                <p>上で試したように、これで"郵便番号"を入力すると、"都道府県"と"市区町村"に住所が入力されるようになりました。</p>
            </ol>
        </div>
        <h3>フィールドサイズの変更</h3>
        <div class="text">
            <ol>
                <li>"学年ID"をクリック - フィールドサイズを"255"から"5"と入力し直します。</li>
                <div class="img"><img src="pic/fieldsize.png"></div>
            </ol>
        </div>
        <h3>IMEモードの変更</h3>
        <div class="text">
            <ol>
                <li>"自宅TEL"をクリック - IME 入力モードを[オン]から[オフ]に変更します。</li>
                <div class="img"><img src="pic/tel1.png"></div>
                <p>これで"自宅TEL"に入力しようとしたとき、日本語入力がオフになります。</p>
            </ol>
        </div>
        <h3>定型入力プロパティの設定</h3>
        <div class="text">
            <ol>
                <li>"入会年月日"の右横にある"テキスト型"を"日付/時刻型"に変更します。</li>
                <div class="img"><img src="pic/join1.png"></div>
                <li>"入会年月日"をクリック - 定型入力の項目をクリック - 横に表示された[…]を押します。</li>
                <div class="img"><img src="pic/join2.png"></div>
                <li>警告が出るのでテーブルを保存します。</li>
                <div class="img"><img src="pic/join3.png"></div>
                <li>定型入力名の中の[日付（S）]を選択 - [次へ]を押します。</li>
                <div class="img"><img src="pic/join4.png"></div>
                <li>さらに、[次へ] - [完了]を押します。</li>
                <div class="img"><img src="pic/join5.png"></div>
                <div class="img"><img src="pic/join6.png"></div>
                <p>これで、"入会年月日"に入力したとき、年/月/日の形で入力されるようになりました。</p>
            </ol>
        </div>
        <h3>データ型の変更</h3>
        <div class="text">
            <li>"学年ID"の右横にある"テキスト型"を"数値型"に変更します。</li>
            <div class="img"><img src="pic/grade1.png"></div>
            <li>次に、"退会"の右横にある"テキスト型"を"Yes/No型"に変更します。</li>
            <div class="img"><img src="pic/quit1.png"></div>
            <li>"退会"をクリック - [ルックアップ]タブの"表示コントロール"を"チェックボックス"に変更します。</li>
            <div class="img"><img src="pic/quit2.png"></div>
        </div>
        <h3>データの入力</h3>
        <div class="text">
            <ol>
                <li>[ホーム]タブ - [表示] - <img src="../buttonpic/databaseview.png" alt="データベースビュー" align="absmiddle">（[データベース ビュー]）をクリックして、データシートビューに戻ります。以下のデータを入力してみてください。
                <ul>
                    <li>氏名：山本伊平（ヤマモト イヘイ）</li>
                    <li>郵便番号：221-0023</li>
                    <li>市区町村：横浜市神奈川区宝町5-5-0</li>
                    <li>自宅TEL：045-231-0000</li>
                    <li>入会年月日：2009/10/01</li>
                    <li>学年ＩＤ：1</li>
                    <li>学部コース：都市教養学部都市教養学科生命科学コース</li>
                </ul>
                </li>
                <div class="img"><img src="pic/yamamoto1.png"></div>	
            </ol>
        </div>
        <h3>Excelデータのインポート</h3>
        <div class="text">
            <ol>
                <li>まず、サークル名簿を開いていたら、閉じます。</li>
                <li>[外部データ]タブ - [インポート] - <img src="../buttonpic/excelimport.png" align="absmiddle">をクリックします。</li>
                <div class="img"><img src="pic/excelimport1.png"></div>
                <li>[参照]ボタンを押し、先ほどダウンロードした"Clist.xls"を選択します。</li>
                <li>"レコードのコピーを次のテーブルに追加する"にチェックを入れ、"サークル名簿"を選択し、[OK]を押します。</li>
                <div class="img"><img src="pic/excelimport2.png"></div>
                <li>[次へ]をクリックします。</li>
                <div class="img"><img src="pic/excelimport3.png"></div>
                <li>[完了]を押します。</li>
                <div class="img"><img src="pic/excelimport4.png"></div>
                <li>[閉じる]を押してインポートを完了します。</li>
                <div class="img"><img src="pic/excelimport5.png"></div>
                <p>このようにExcelのファイル内に保存されているデータをAccessにインポートすることができます。</p>
                <div class="img"><img src="pic/excelimport6.png"></div>
            </ol>
        </div>
        <h3>Accessテーブルのインポート</h3>
        <div class="text">
            <ol>
                <li>[外部データ]タブ - [インポート] - <img src="../buttonpic/accessimport.png" align="absmiddle">をクリックします。</li>
                <div class="img"><img src="pic/accessimport1.png"></div>
                <li>[参照]ボタンを押し、先ほどダウンロードした"gradetype.accdb"を選択し、[OK]を押します。</li>
                <div class="img"><img src="pic/accessimport2.png"></div>
                <li>"月会費"を選択 - [OK]を押します。</li>
                <div class="img"><img src="pic/accessimport3.png"></div>
                <li>[閉じる]を押してインポートを完了します。</li>
                <div class="img"><img src="pic/accessimport4.png"></div>
                <p>月会費</p>
                <div class="img"><img src="pic/accessimport5.png"></div>
                <p>このように元々作られていたAccessのテーブルをインポートし、クエリを用いて関連づけをすることができます。</p>
            </ol>
        </div>
        <h2><a name="1-4"></a>課題 1</h2>
        <div class="text">
            <p>学会の入会日リストを管理するデータベースを作成し、"会員名簿"テーブルを作成します。テーブルのデータはExcelファイルからインポートします。以下の指示に従って、作成してください。</p>
            <ol>
                <li>空の"会員管理"データベースを作成してください。名称は"congress"にしてください。</li>
                <li>次のフィールドを含む"会員名簿"テーブルを作成してください。
                <ul>
                    <li>テーブル名：会員名簿</li>
                    <li>フィールド名：氏名、シメイ、郵便番号、都道府県、市区町村、自宅TEL、入会年月日、会員タイプ、職種、退会</li>
                    <li>フィールド名の変更：ＩＤ　→　会員ＩＤ</li>
                    <li>主キー：自動的に設定される</li>
                </ul>
                </li>
                <li>"氏名"フィールドに氏名を入力すると、"シメイ"フィールドに全角カタカナのフリガナが自動的に表示されるようにしてください。</li>
                <li>"郵便番号"フィールドに郵便番号を入力すると、住所が"都道府県"フィールドと"市区町村"フィールドに自動的に表示されるように設定してください。</li>
                <li>"自宅TEL"フィールドのIME入力モードプロパティをオフに設定してください。</li>
                <li>"入会年月日"フィールドの定型入力プロパティにデータ入力時の書式として日付（Ｓ）（年／月／日）を設定してください。</li>
                <li>デザインビューで以下のフィールドを設定してください。
                <ul>
                    <li>"入会年月日"フィールドのデータ型は[日付／時刻型]</li>
                    <li>"会員タイプ"フィールドのデータ型は[数値型]</li>
                    <li>"退会"フィールドのデータ型は[Yes／No型]</li>
                </ul>
                </li>
                <li>"会員名簿"テーブルに、Excelファイルの"congress.xls"からデータをインポートしてください。</li>
                <li>新規レコードに次のデータを入力してください。
                <ul>
                    <li>会員ＩＤ：21（自動入力）</li>
                    <li>氏名：佐川亮子</li>
                    <li>シメイ：サガワリョウコ（自動入力）</li>
                    <li>郵便番号：160-0022</li>
                    <li>都道府県：東京都（自動入力）</li>
                    <li>市区町村：新宿区新宿6-6-0（自動入力だが、番地は手入力する）</li>
                    <li>自宅TEL：03-3330-0000</li>
                    <li>入会年月日：2009/09/26</li>
                    <li>会員タイプ：2</li>
                    <li>職種：大学生</li>
                    <li>退会：オフ</li>
                </ul>
                </li>
                <li>"会員管理"データベースにaccessファイル"membertype.accdb"データベースの"会員タイプ"テーブルをインポートしてください。</li>
            </ol>
        </div>
        <div class="footer">作成者：首都大学東京 大学教育センター 情報教育担当</div>
    </body>
</html>
