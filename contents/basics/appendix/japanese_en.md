---
layout: appendix_en
title: About Japanese input 
date: 2016-03-16 14:55:09 +0900
---

This section describes Japanese input in more detail. 

<div id="toc"></div>

Japanese input 
----------

When you use a personal computer, you probably have numerous opportunities to input text, particularly in Japanese. In this section, you will learn how to input text, particularly in Japanese. 

The mouse and keyboard operations previously described are important. If you have forgotten them, please check them. 

{% appendix ../appendix/keyboard.html "(Japanese) キーボードの操作方法" %}
{% appendix ../appendix/mouse_en.html "マウスの操作方法" %}


First, please launch Notepad. If you have forgotten how to start Notepad, please review the first lesson. 

-   [How to use the Computer Room](../01/index_en.html)


### Input mode 

Microsoft IME (Microsoft Input Method Editor, hereafter MS-IME), a Japanese input system manufactured by Microsoft, is used to input Japanese in Windows. 

{% screenshot IMEtoolbar_2.png "The language bar is displayed on the taskbar." %}

Click on the [あ] or [A] in the language bar to change the input mode. Input modes include “Hiragana (あ),” “Full-width Katakana (カ),” “Full-width Alphanumeric (A),” “Half-width Katakana (&nbsp;ｶ),” and “Half-width Alphanumeric(&nbsp;A).” 

In general, you should use the “Hiragana (あ)” input mode for Japanese and “Half-width Alphanumeric (&nbsp;A)” for alphabetic characters.

To switch between these two modes, press the [Alt]+[` ~] key on your keyboard. 

Note that the computer treats half-width and full-width characters as different. 


### Japanese input 

<dl>
<dt>Pointer/Cursor </dt>
<dd>The pointer or cursor indicates the position of the sentence that is the subject of the current operation. It is usually indicated by ■, |, or a blink. </dd>
<dt>Correction</dt>
<dd>Correction using the backspace key: Erase from the left side of the pointer. </dd>
<dd>Correcting a sentence with the delete key: Deletes it from the right side of the pointer. </dd>
<dt>Undoing an operation </dt>
<dd>Edit&rarr;Undo or Ctrl+Z keys </dd>
<dt>Entering text (Roman input)</dt>
<dd>kikounokawarimenihachuuishimashou</dd>
<dd><u>きこうのかわりめにはちゅういしましょう</u></dd>
<dt>Conversion of input characters</dt>
<dd>Before confirming the input conversion of input characters (before hitting the Enter key), you can change the type of the character string that you have entered as the target of the operation. During the conversion, you can return to the intermediate state by pressing Esc or Ctrl+Z.</dd>
</dl>

<table>
<thead>
<tr>
<th>Function key </th><th>Character type </th>
</tr>
</thead>
<tbody>
<tr>
<td>Spacebar </td><td>Kanji </td>
</tr><tr>
<td>F6</td><td>Full-width Hiragana </td>
</tr><tr>
<td>F7</td><td>Full-width Katakana</td>
</tr><tr>
<td>F8</td><td>Half-width Katakana </td>
</tr><tr>
<td>F9</td><td>Full-width alphanumeric </td>
</tr>
</tbody>
</table>

<dl>
<dt>Adjustment of sentence length and sentence breaks and finishing the sentence as you intend </dt>
<dd>
Whether to convert the entire sentence at once, convert by phrase, or convert by individual kanji character, 
<br />
move to the target phrase for conversion correction with the &rarr; or &larr; keys, 
<br />
change the length of the target phrase for conversion correction with Shift+&rarr; or &larr;, 
<br />
press the conversion key (spacebar) 
<br />
confirm (enter) <br />

</dd>
<dt>Redo character conversion </dt>
<dd>きこうのかわりめにはちゅういしましょう。 &rarr; きこうのかわりめにはけんこうにちゅういしましょう。 &rarr; 気候の変わり目には健康に注意しましょう。</dd>
<dd>かれはいしゃかな、またはいしゃかな。&rarr; 彼歯医者かな、または医者かな。</dd>
</dl>


The MS-IME also allows you to configure various functions and settings. Some of them are discussed below. 

* [Japanese input system Microsoft IME](#chapter7)


Half-width and full-width characters 
------------------

Half-width and full-width characters are treated differently in computers. Japanese characters are double-byte characters. In other words, in the standard “alphanumeric input mode,” the input is "half-width characters," which you cannot enter. When you select “Japanese conversion mode” (hiragana), the mode changes to “full-width input mode.” In this mode, you can enter Japanese (in this case, hiragana), but symbols and numbers are also displayed in full-width characters and are twice as wide as half-width characters on the screen. 

 
Full-width characters 

>   ！＠＃＄％＾＆＊（）＿＋＝－０９８７６５４３２１

Half-width 

>   !@\#\$%\^&\*()\_+=-0987654321

English letters also have full-width characters. 

Full-width characters 

>   ＡＳＤＦＧＨＪＫＬ：”～‘’；ｌｋｊｈｇｆｄｓａ

Half-width 

>   ASDFGHJKL:"\~\`';lkjhgfdsa

There are also “full-width spaces” and “half-width spaces.”

### Caution 

There are several ways (character codes) to use full-width characters, and attempting to use text created on one system (text sentences, file names, folder names) on another system, may result in incorrect display. This is referred to as “character corruption.” If such a possibility exists, it is preferable to use alphabetic characters for file and folder names whenever possible. 


Character code 
----------

A character code is a system used for displaying characters on a computer. 

Inside computers, information is exchanged using a binary system that accepts either 0 or 1. 

{% screenshot zu-1.png "Binary system " %}

However, because it is difficult for humans to decipher the information exchanged in this binary system, it is converted into characters using a character code. 

Typical examples of character codes include ASCII code, EBCDIC, JIS code, and Unicode. 

Essentially, ASCII codes and EBCDIC treat a character as a single byte of information. 

In binary notation, one byte can represent 2<sup>8</sup> = 256 types of information, including upper and lower case alphabet characters such as `a` and `A`, and symbol characters such as `!` and `#`, as well as symbol characters such as `NUL` and other restriction codes. Because there are only 256 types of information, only one byte can be used to represent a character. 


{% screenshot zu-3.png "ASCII code table" %}

In Japanese, the addition of hiragana, katakana, and kanji characters such as `あ`, `ア`, and `阿`, in addition to the original alphabet, symbol characters, and restricted codes, resulted in more than 256 types of characters. Therefore, the JIS Kanji code, Unicode, and other codes treat characters as 2-byte information, allowing for the representation of 2<sup>16</sup> = 65,536 types of characters. The Japanese language is represented by viewing characters as 2-byte information. 

However, some characters are not displayed because they cannot be accommodated, such as some old or machine-dependent characters. 

<table>
<thead>
<tr>
<th>Size</th><th>Code name</th><th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td rowspan="5">1 byte</td>
<td>ASCII code</td>
<td>The most basic character encoding, representing alphanumeric characters, symbols, and control codes, is a 7-bit code. (Note: As shown in the diagram, the first bit of the 8-bit code is not used. The first bit is used as a “parity bit” for error detection.) </td>
</tr><tr>
<td>ISO code </td>
<td>This is an international standard 7-bit code based on ASCII code. </td>
</tr><tr>
<td>JIS7 code</td>
<td>This is a half-width character code based on the ISO code, which has almost similar contents as the ISO code. </td>
</tr><tr>
<td>JIS8 code</td>
<td>This is an 8-bit code that adds half-width katakana characters to the JIS7 code.</td>
</tr><tr>
<td>EBCDIC</td>
<td>It is an 8-bit code that represents alphanumeric characters, symbolic characters, and restricted codes. The most basic character code is the ASCII code, which is the most used character code in general-purpose computers. </td>
</tr><tr>
<td rowspan="3">2 byte</td>
<td>JIS Kanji code </td>
<td>This 16-bit code represents alphanumeric characters, symbol characters, hiragana, katakana, and kanji. </td>
</tr><tr>
<td>Shift JIS code</td>
<td>It is a 16-bit code rearranged from JIS Kanji code because JIS Kanji code mixes with other character codes. It is most commonly used in Japan. </td>
</tr><tr>
<td>Unicode</td>
<td>It is an international standard 16-bit code expressed in characters from around the world. </td>
</tr><tr>
<td>1 ～ 3 byte</td>
<td>Japanese EUC </td>
<td>It is a 1- to 3-byte multibyte code used in UNIX.</td>
</tr>
</tbody>
</table>

Garbled characters may appear if the character encoding used in the web page you are viewing differs from the character encoding setting of the browser you are using.


Japanese input system Microsoft IME 
--------------------------------

Windows primarily uses Microsoft’s Japanese input system, Microsoft IME. 

### IME toolbar 

When you enable Japanese input, the IME toolbar appears on the desktop. Right-click on the “`あ`” or “`A`” icon on the IME toolbar to open options. 

{% screenshot IMEtoolbar1_2.png "The option of IME toolbar " %}

<dl>
<dt>Input mode </dt><dd>Change Hiragana, Katakana, and alphanumeric settings </dd>
<dt>Add (register) words </dt><dd>Register frequently used words </dd>
<dt>IME pad </dt><dd>Assist in inputting special characters and difficult-to-read kanji </dd>
<dt>Error conversion report </dt><dd>Report error conversion data to Microsoft </dd>
<dt>Kana input </dt><dd>Change keyboard input mode to Kana input </dd>
<dt>Private mode </dt><dd>Enable and disable input and conversion history. </dd>
<dt>IME toolbar </dt><dd>Displays a toolbar for changing input mode, etc. </dd>
<dt>Settings </dt><dd>Set Japanese input method (see below) </dd>
<dt>Send feedback </dt><dd>Submit usage problems to the community </dd>
</dl>

### Change in Japanese input method 

<div class="alert alert-warning" role="alert">
<strong>Restrictions in the computer room </strong>
<p>In the computer room, it is not possible to change settings related to input. </p>
</div>


Right-click on the IME toolbar → Settings to display the Microsoft IME settings screen and configure settings. 

{% screenshot IMEproperty_2.png "Microsoft IME Settings screen " %}

You can switch between romaji/kana input, the type of punctuation and spaces, etc., to create your preferred environment. Please note that you may need to re-sign in to reflect your settings. 

