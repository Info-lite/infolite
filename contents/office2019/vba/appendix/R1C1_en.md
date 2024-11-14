---
layout: appendix_en
title: R1C1 Reference Style in  Worksheets
date: 2024-11-11 00:00:00 +0900
---

This page introduces the R1C1 reference style for worksheets.

R1C1 Reference Style in Worksheets
----------------

Usually, as shown in the image below, worksheet rows are numbered 1, 2, 3..., and columns are labeled with letters A, B, C, .... This is called the **A1 reference style** and is the most common for worksheets.

{% screenshot R1C1_A1_en.png "Worksheets in A1 Reference Style" %}

Alternatively, worksheet columns can be labeled with numbers instead of letters. This style is called the **R1C1 reference style**. This style is used in some cases, such as for macro development.

{% screenshot R1C1_R1C1_en.png "Worksheets in R1C1 Reference Style" %}

When cells are referenced, the R1C1 style facilitates handling because not only the rows but also the columns are displayed using numbers. It is recommended to switch the reference style as needed.

Nevertheless, as the A1 reference style is more common than the R1C1 reference style for displaying data, the former should be adopted in general when using Excel, except for tasks such as macro development.

How to Set R1C1 Reference Style
----------------

&#9312; From the File tab, click on [Options].

{% screenshot R1C1_FileTab_en.png "File Tab" %}

&#9313; Click on [Formulas].

{% screenshot R1C1_Option_en.png "Excel Options" %}

&#9314; Check "R1C1 reference style" and click [OK].

{% screenshot R1C1_FormulaOption_en.png "Formulas Options" %}

Then, the worksheet is displayed in the R1C1 reference style.

{% screenshot R1C1_R1C1_en.png "Worksheet in R1C1 Reference Style" %}

To restore the A1 reference style, uncheck the "R1C1 reference style" checkbox. 

