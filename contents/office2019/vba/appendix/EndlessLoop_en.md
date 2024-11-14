---
layout: appendix_en
title: Infinite Loop
date: 2024-11-11 00:00:00 +0900
---

This page introduces infinite loops.

Infinite Loop
----------------

**Infinite loops** are the most important flaws to prevent when doing repetition in a code.

A loop repeats the content of a process while a condition is met. In some cases, however, the loop may continue to satisfy the repeat condition, and the loop does not end, causing an <span style="color: red;">**infinite loop**</span>.

In the case of a For–Next statement, for example, a negative value can be specified for the increment, as illustrated below.

*Example of Infinite Loop Source Code *

    For i = 1 To 5 Step -1  
    ' repetitive process code  
    Next i  

In this case, starting from 1, −1 is added each time the repetitive process is executed, and the value of i decreases at every iteration and never exceeds the termination value of 5. Thus, the loop condition is always satisfied, and the loop becomes infinite.

If a negative value is specified for the increment, the end value must also be smaller than the initial value to prevent an infinite loop from occurring. Even if a negative value is specified as the increment value, an infinite loop can be prevented, like in the following case.

*Example of Code That Prevents Infinite Loop with Negative Increment  *

    For i = 1 To -5 Step -1  
    ' repetitive process code  
    Next i  

There are many other types of loops in addition to the ones discussed in this article. Ensuring to prevent that termination conditions cannot be met and designing code to avoid infinite loops are crucial when using these programming structures.

Infinite Loop in Excel Macro
----------------

If you introduce an infinite loop in an Excel macro, try the following keystrokes for termination.

* Press the [Ctrl] and [Break] keys simultaneously.
* Hold the [Alt] and [Esc] keys simultaneously.

Either of these combinations can force the Excel macro to stop.

The applicable keystroke depends on the created program.

If any of the above keystrokes does not work, you may try pressing the [Ctrl], [Alt], and [Del] keys simultaneously to launch the Task Manager and force Excel to close.

If you are working in the information processing classroom, you may ask for help from your instructor or tutor. 


