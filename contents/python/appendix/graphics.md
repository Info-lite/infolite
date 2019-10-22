---
layout: appendix
title: 主なGraphicsクラスのメソッド
date: 2016-01-22 23:38:07 +0900
---


よく使うであろうメソッドを載せておきます。さらに詳しく知りたい場合は、以下を参照してください。

<span class="label label-info">参考資料</span> [Graphics (Java Platform SE 8)](http://docs.oracle.com/javase/jp/8/docs/api/java/awt/Graphics.html)

### 文字列を描画する

    drawString(String 表示する文字列, int x座標, int y座標);
    
    // 例
    g.drawString("こんにちは",10,10);

### 直線を描画する

    drawLine(int 始点のx座標, int 始点のy座標, int 終点のx座標, int 終点のy座標);
    
    // 例
    g.drawLine(10,10,20,20);

### 長方形を描画する

    drawRect(int 左上のx座標, int 左上のy座標, int 横の長さ, int 縦の長さ);
    
    // 例
    g.drawRect(100,100,200,300);

#### 塗りつぶし

    fillRect(int 左上のx座標, int 左上のy座標, int 横の長さ, int 縦の長さ);
    
    // 例
    g.fillRect(100,100,200,300);

### 楕円を描画する

    // 座標と縦横の長さから描かれる長方形に内接する楕円を描画します。
    drawOval(int 左上のx座標, int 左上のy座標, int 横の長さ, int 縦の長さ);
    
    // 例
    g.drawOval(100,100,200,300);

#### 塗りつぶし

    // 座標と縦横の長さから描かれる長方形に内接する楕円を描画します。
    fillOval(int 左上のx座標, int 左上のy座標, int 横の長さ, int 縦の長さ);
    
    // 例
    g.fillOval(100,100,200,300);

### 多角形を描画する

    drawPolygon(int[] x座標のリスト, int[] y座標のリスト,int 点の数);
    
    // 例
    int x[] = {10,30,20};
    int y[] = {50,50,20};
    g.drawPolygon(x,y,3);

#### 塗りつぶし

    fillPolygon(int[] x座標のリスト, int[] y座標のリスト,int 点の数);
    
    // 例
    int x[] = {10,30,20};
    int y[] = {50,50,20};
    g.fillPolygon(x,y,3);

