---
layout: appendix
title: 演算子の優先順位
date: 2015-03-23 16:14:50 +0900
---


演算子の優先順位
------------------

演算子には優先順位があります。おおまかに言うならば、数学での優先順位とほぼ同じです。

もう少し詳しく言えば、「式 &gt; 単項演算子 &gt; 二項演算子 &gt; 代入演算子」となっていて、さらに二項演算子は、「算術演算子 &gt; 論理演算子 &gt; 比較演算子」となっています。

正確に順序付けたのが次の表です。

<table class="table">
<thead>
<tr>
<th>優先順位</th>
<th>演算子</th>
</tr>
</thead>
<tbody>
<tr>
<td>高い</td>
<td>[ ], ., ()</td>
</tr>
<tr>
<td rowspan="10"></td>
<td>++, --, !, ~</td>
</tr>
<tr>
<td>new, キャスト演算子</td>
</tr>
<tr>
<td>\, *, /, %</td>
</tr>
<tr>
<td>+, -</td>
</tr>
<tr>
<td>&lt;&lt;, &gt;&gt;, &gt;&gt;&gt;</td>
</tr>
<tr>
<td>&lt;, &lt;=, &gt=, &gt;, instanceof</td>
</tr>
<tr>
<td>==, !=</td>
</tr>
<tr>
<td>&amp;, ^, |</td>
</tr>
<tr>
<td>&amp;&amp;, ||</td>
</tr>
<tr>
<td>?:</td>
</tr>
<tr>
<td>低い</td>
<td>=, +=, -=, *=, /=, %=, &amp;=, ^=, !=, &lt;&lt;=, &gt;&gt;=, &gt;&gt;&gt;=</td>
</tr>
</tbody>
</table>
