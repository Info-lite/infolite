---
layout: appendix
title: Java言語における予約語
date: 2015-03-23 16:14:50 +0900
---


予約語
------

**予約語（キーワード）** はプログラム中で命令・処理のために使われる言葉です。
予約語はプログラム中で変数名やクラス名などに利用することができません。

### Java SE 21 の予約語

Java SE 21 では 51 の単語が予約語（キーワード）として確保されています。

    abstract   continue   for          new         switch
    assert     default    if           package     synchronized
    boolean    do         goto         private     this
    break      double     implements   protected   throw
    byte       else       import       public      throws
    case       enum       instanceof   return      transient
    catch      extends    int          short       try
    char       final      interface    static      void
    class      finally    long         strictfp    volatile
    const      float      native       super       while
    _（アンダースコア）

また、17の単語が文脈キーワードとなっています。
<br>文脈キーワードは変数名などとして利用が可能ですが、コードの文脈によってはキーワードとして解釈されるため、<strong>使用は非推奨です。</strong>

    exports      opens      requires     uses   yield
    module       permits    sealed       var
    non-sealed   provides   to           when
    open         record     transitive   with

<span class="label label-info">参考資料</span> [Lexical Structure](https://docs.oracle.com/javase/specs/jls/se21/html/jls-3.html#jls-3.9)
