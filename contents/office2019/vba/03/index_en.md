---
layout: page_en
title: VBA Programming (3)
date: 2022-04-01 00:00:00 +0900
purposes:
    - Consider algorithms using flowcharts.
    - Discover the basics of conditional statements.
---


Algorithm and Flowchart
--------------

### Algorithm

A program is a description of the order in which a computer performs processes to achieve a certain objective. Programmers create programs by figuring out the order in which the processes of the computer should be arranged to achieve their objectives. The order by which a computer achieves its objective is known as an **algorithm**. In other words, when programmers create a program, they develop an **algorithm** and then code based on it.

A computer can accomplish a certain goal in several ways. Several algorithms may exist, including efficient ways, inefficient ways, and ways that are more in line with the performance of the computer. Programmers select one of those algorithms and program it to create a program.


### Flowchart 

Developing an **algorithm** is difficult. For simple algorithms, one can conceive them. Alternatively, a skilled programmer could construct the algorithm empirically. However, complex algorithms that can achieve critical objectives will often be difficult to conceive using only the brain. This is because conceiving an algorithm is the same as designing a program. Writing on paper is a better way to develop a seamless algorithm than conceptualization, because it also helps to organize ideas.

A **flowchart** is a method of thinking through an algorithm by writing it down on paper or a similar medium.

{% screenshot Flowchart_en.png "Flowchart Schematic from source code" %}

A **flowchart** is a diagram that shows the order of processes by representing each process and data in graphic form and connecting the processes with arrows. Each shape has its own meaning, and one can organize the processes. In a sense, a flowchart is a blueprint for a program. Drawing a well-designed flowchart is not only useful for organizing and conceiving the algorithm but also for sharing it with others. Flowcharts are particularly important when discussing algorithms or when developing a program as a team.

**Flowcharts** can be created using the shape function flowcharts in Word, Excel, and PowerPoint. Whereas writing flowcharts on paper is advisable, using applications to create flowcharts that are easy to read and understand is better.

{% screenshot Office_Flowchart_en.png "Flowchart in the Shape Function of Microsoft Office" %}

**Flowcharts** are also used not only for programming algorithms but also for showing daily tasks and submission procedures. Once one is able to use them, they can be useful in various everyday situations.

Conditional Branching
--------------

### Conditional Branching 

The VBA program normally executes the instruction statement without skipping one line at a time from the top to the bottom. However, one may or may not want to execute a certain process. In such cases, **conditional branching** is used.

**Conditional branching** is a method of changing the processing content when a specified condition is correct (known as True) or incorrect (known as False). The flowchart is shown in the following figure.

{% screenshot ConditionalBranch_en.png "Example of Conditional Branching Flowchart" %}

In this example, conditional branching is performed according to the value of cell "A1,” that is, if the value of cell "A1" is "1," the message "The value of cell A1 is 1” is displayed, whereas if the value of cell "A1" is not "1," nothing is displayed. Thus, one can set a condition and change what is in operation depending on whether the condition is true or false.

### If Statement

The **If statement** is a way to perform conditional branching.

The **If statement** creates a condition for branching and performs the corresponding processing if the condition is true.

**If statements** are used as follows:

*How to use If statements*

    If [conditional expression] Then 
    [processing details]
    End If　   


After the "<span style="color: red;">If</span>" statement, specify a **conditional expression**, followed by a "<span style="color: red;">Then</span>" statement to end the line. From the next line, you write the processing to be taken if the **condition expression** is true. Once you have finished writing all processing details, you end the If statement by writing '<span style="color: red;">End If</span>' on the following line.

In the **conditional expressions**, you specify the conditions under which the processing should be performed. As the word "**conditional expression**" implies, it is an expression that serves as a condition, and the result of comparing the left and right sides with the **comparison operator** is determined to be true or false. The comparison operators used for the determination are listed in the table below.

{% screenshot Table_Comparision_en.png "Comparison Operators" %}

If the algorithm in the flowchart below is programmed as an example, the IfTest source code is as shown.

{% screenshot ConditionalBranch_en.png "Example Flowchart of an If Statement" %}

*IfTest source code*

    Sub IfTest()
        If Range("A1") = 1 Then
            MsgBox ("The value of cell A1 is 1.")
        End If
    End Sub


{% screenshot IfTest_Result_en.png "Execution Result of IfTest" %}

Conditional expressions can use variables and cell values, and formulas can be constructed within conditional expressions. In addition, equal (=) and unequal (<>) can be used to compare not only numbers but also strings. When considering strings, you need to enclose them in double quotation marks ("), just as you would in other parts of the code.

As a test, let us change the conditional expression and observe the branching of the conditions.


### If-Else Statement

In the 2.2. If Statement, processing was performed only when the conditional expression was true; however, cases exist when you intend to perform processing even when the expression is not true. In such cases, the **If-Else statement** is used.

It is used in the following way to branch the processing depending on whether the condition is true or false.

*How to Use If-Else Statements*

    If [conditional expression] Then
    [Processing details when the conditional expression is true]
    Else
    [Processing details when the conditional expression is false]
    End If

As with the If statement, "<span style="color: red;">If</span> conditional expression <span style="color: red;">Then</span>" is followed by a description of the processing if the conditional expression is true. In the case of an If statement, the conditional branching ends with "<span style="color: red;">End If</span>" In the case of an If to Else statement, "<span style="color: red;">Else</span>" is written, followed by the processing details when the conditional expression is false. Finally, "<span style="color: red;">End If</span>" is written to terminate the conditional branching.

If the algorithm in the flowchart below is created as a program using If-Else statements, the IfElseTest source code is as shown below.

{% screenshot IIfElse_en.png "Example Flowchart of If-Else Statement" %}

*IfElseTest source code*

    Sub IfElseTest()
        If Range("A1") = 1 Then
            MsgBox ("The value of cell A1 is 1.")
        Else
            MsgBox ("The value of cell A1 is not 1.")
        End If
    End Sub

Let us set the value of cell A1 to "1" and execute IfElseTest.

{% screenshot IfElseTest_Result1_en.png "Execution Result of IfTest (if cell A1 is "1")" %}

If cell A1 is "1," the message "The value of cell A1 is 1.” is displayed. 

Next, let us execute IfElseTest with the value of cell A1 set to a value other than "1."

{% screenshot IfElseTest_Result2_en.png "Execution Result of IfTest (if cell A1 is not "1")" %}

If cell A1 is not "1," the message "The value of cell A1 is not 1." is displayed.

Thus, the If-Else statement allows you to specify the processing for both when the condition is true and when it is false.


### If-ElseIf-Else Statement

In 2.2. If and 2.3. If-Else statements, you could change the processing contents when one conditional expression is true or false. However, in some cases, you may want to use multiple conditional expressions to perform a conditional branch. In such cases, the **If-ElseIf-Else statement** is used.

If-ElseIf-Else statements are used for the following:

*How to Use If-ElseIf-Else Statements*

    If [conditional expression1] Then
    [Processing details when conditional expression 1 is true]
    ElseIf [conditional expression2] Then
    [Processing details when conditional expression 2 is true]
    Else
    [Processing details when neither conditional expression 1 nor 2 is true]
    End If

You can specify several conditions and processing contents as in "<span style="color: red;">ElseIf</span> conditional expression <span style="color: red;">Then</span>," even two or three. If the conditional expression is true, the processing specified therein is performed, and all processing described afterward until "<span style="color: red;">End If</span>" is ignored. Therefore, the higher the conditional expression is written, the more priority is given to it. Finally, if none of the conditional expressions are true, the processing specified by “<span style="color: red;">Else</span>” will be executed. If no processing is required when none of the conditions are true, the “<span style="color: red;">Else</span>” clause can be omitted.

If the algorithm in the flowchart below is created as a program using If-ElseIf-Else statements, the IfElseIfElseTest source code is as follows:

{% screenshot IfElseIFElse_en.png "Example Flowchart of If-ElseIf-Else Statement" %}

*IfElseIfElseTest source code*

    Sub IfElseIfElseTest()
        If Range("A1") = 1 Then
            MsgBox ("The value of cell A1 is 1.")
        ElseIf Range("A1") = 2 Then
            MsgBox ("The value of cell A1 is 2.")
        Else
            MsgBox ("The value of cell A1 is neither 1 nor 2.")
        End If
    End Sub

Let us set the value of cell A1 to "1" and execute IfElseIfElseTest.

{% screenshot IfElseIfElseTest_Result1_en.png "Execution Result of IfElseIfElseTest (if cell A1 is "1")" %}

If cell A1 is "1," the message "The value of cell A1 is 1.“ is displayed. 

Next, let us set the value of cell A1 to "2" and execute IfElseIfElseTest.

{% screenshot IfElseIfElseTest_Result2_en.png "Execution Result of IfElseIfElseTest (if cell A1 is "2")" %}

If cell A1 is "2," the message "The value of cell A1 is 2.” is displayed. 

Next, let us execute IfElseIfElseTest with the value of cell A1 set to a value other than "1" or "2."

{% screenshot IfElseIfElseTest_Result3_en.png "Execution Result of IfElseIfElseTest (if cell A1 is not "1" or "2")" %}

If cell A1 is not "1" or "2," the message "The value of cell A1 is neither 1 nor 2.” is displayed.

Thus, we can perform a conditional branch in which multiple conditional expressions are checked in turn, and if the true conditional expression is determined, the specified processing is performed. Because numerous "ElseIf" can be added, we can program more complex algorithms that are more suitable for the purpose by fully utilizing conditional branching.


### Practice Problems

Let us enter the following report card and use conditional branching to determine Mr. A's grade in Japanese.

{% screenshot PerformanceTable5_Pre_en.png "Mr. A's Report Card" %}

The grading criteria are summarized in the table below. Please consider carefully the structure of the conditions such that the grades can be assigned accordingly.

{% screenshot Table_GradeCri_en.png "Grading Criteria" %}

The program that incorporates the algorithm to perform conditional branching to determine the grade of the Japanese based on the criteria in the table is the source code for PerformanceTable5.

*PerformanceTable5 source code*

    Sub PerformanceTable5()
        
        'Grading (conditional branching, Mr. A's Japanese)
        If Range("B3") >= 90 Then
            Range("G3") = 5
        ElseIf Range("B3") >= 80 Then
            Range("G3") = 4
        ElseIf Range("B3") >= 70 Then
            Range("G3") = 3
        ElseIf Range("B3") >= 60 Then
            Range("G3") = 2
        Else
            Range("G3") = 1
        End If
    End Sub

When PerformanceTable5 is run, you will observe the following:

{% screenshot PerformanceTable5_Result_en.png "Execution Result of PerformanceTable5" %}

If you are grading multiple people or subjects, grading all of them visually will require a significant amount of time, and careless mistakes will increase. By developing programs that incorporate conditional branching, such as PerformanceTable5, you can achieve your goals more efficiently and accurately. 


Exercises
--------------

### Exercises1

Let us add to the PerformanceTable5 source code and create a macro that will do the same conditional branching for the English and Math grading as it does for the Japanese grading. Therefore, let us do the following. Additionally, the grading criteria will be the same as for Japanese.

* The value in cell H2 is the "English grading." 
* Set the value of cell I2 to "Math grading."
* In cell H3, use conditional branching to input A's English grade from cell C2.
* In cell I3, use conditional branching to input A's math grade from cell D2.

### Exercise2

Let us create a macro that meets the following steps and conditions:

* Enter any number you like in cell A1.
* When the created macro is executed, the absolute value of the number entered in cell A1 is inputted in cell B1.

※Absolute values can be calculated using functions, but for this exercise, please create conditional branching.

### Exercise3

Let us create a macro that meets the following steps and conditions:

* Enter any number you like in cells A1 and A2.
* Enter any integer you like from 1 to 4 in cell B1.
* When the created macro is executed, the result of the following calculation is inputted in cell C1 according to the value of cell B1.
    * If the value of cell B1 is 1, cell A1 plus cell A2.
    * If the value of cell B1 is 2, cell A1 minus cell A2.
    * If the value of cell B1 is 3, cell A1 times cell A2.
    * If the value of cell B1 is 4, cell A1 is divided by A2.

### Exercise4

Let us create a macro that meets the following steps and conditions:

* Enter any number you like in cells A1 and A2.
* When the created macro is executed, a dialog is displayed according to the following conditions:
    * If cell A2 is larger than cell A1, "{cell A2} is larger than {cell A1}."
    * If cell A2 is smaller than cell A1, then "{cell A2} is smaller than {cell A1}."
    * If cell A1 and cell A2 are equal, "{cell A1} and {cell A2} are equal."

※Note that {Cell A1} and {Cell A2} are replaced with the values entered in the respective cells.


