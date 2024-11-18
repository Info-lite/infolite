---
layout: page_en
title: VBA Programming (1)
date: 2022-04-01 00:00:00 +0900
purposes:
    - Learn how to set up a program execution environment using Excel 
    - Learn about the basics of VBA
---


Programming and Programming
--------------

We use computers for various purposes.

By doing so, the computer performs various processes to help us achieve our goals and displays the results of these processes. A description of the sequence in which a computer performs processes to achieve a certain goal is known as a program. The computer performs processing based on the **program** and does not perform actions that are not indicated in the program. Therefore, a program is necessary to enable computers to operate as intended. In addition, we need **programming skills** to create a program as intended.

The information environment has changed significantly in recent years. The amount of information to be processed, such as big data, is rapidly expanding, and new methods for processing information using AI and machine learning are being developed one after another.

As we live in the modern age, we need to be able to make better use of information that is being produced continuously. To make better use of information, we need a processing method that is optimal for the information and purpose for which we intend to use it for. Existing programs, including applications, have already been created by programmers for some purpose; however, this is not necessarily the optimal processing method in all cases. To enable computers to perform tasks that are more in line with our intentions, we need to create our own programs.

To create a program, learning **programming languages** is necessary.

**Programming languages** are a systematization of rules that humans can understand and use to create programs. In addition to **visual basic for applications (VBA)**, which will be covered in this lecture, several other programming languages such as C, Fortran, and Java exist. Each programming language has its own strengths; therefore, they are used differently depending on the processing the computer needs to perform. In this study, we created a simple data processing program using Excel through VBA, which specializes in processing Excel data.


Prepare an Environment to Run VBA in Excel
--------------

### Macro and VBA

In Excel, a program created by programming with VBA is known as a **macro**.

A **macro** is used not only in Excel but also to automate tasks in other Microsoft Office products. In Excel, we usually perform operations such as clicking and typing by hand. However, by programming these operations as macros, we can perform programmed processes without moving our hands by simply executing the macros.

**Macros** are often used to perform complex processing that is prone to human error or when the same process must be performed several times. This is because macros follow a program and perform the process automatically without making mistakes.

**VBA** was used as the programming language to create these **macros**. Therefore, the terms **“VBA” as well as** “macro” are used to refer to programming dose on Excel.


### How to Show the [Developer] Tab in Excel

In Excel, the [Develop] Tab must be displayed to  develop macros using VBA. If the [Develop] Tab is not displayed, please follow the instructions on the Supplementary Materials page below.

{% appendix_en ../appendix/vba_devtab_en.html "Showing [Developer] Tab in Excel" %}

### How to Set Up Macro Security in Excel

Macros can also be used as harmful programs. Macro security is preconfigured in Excel on the PCs in the information processing classrooms at TMU, but may not be set on other PCs. If you wish to run macros on those PCs, check the macro security settings by following the instructions on the Supplementary Materials page below and change the settings if necessary.

{% appendix_en ../appendix/vba_security_en.html "Check and Set Macro Security" %}

### Creating and Saving Excel Macro-Enabled Book Files

In Excel, the file in which a macro is saved has a different file format than an Excel book file (. xlsx). To save and run a macro, it must be saved in an **Excel macro-enabled book file (.xlsm)**.

&#9312; Create a new blank book.

{% screenshot en/NewBook.png "Create New" %}

&#9313; Click on the "File" tab.

{% screenshot en/FileButton.png "File Button" %}

&#9314; Click [Save As].

{% screenshot en/FileTab_NewNameSave.png "File Tab" %}

&#9315; Click [Browse]

{% screenshot en/NewNameSave.png "Save As" %}

&#9316; Navigate to the folder where you saved the file and enter the file name.

&#9317; Change the “Save as type” to "Excel Macro-Enabled Workbook" and click [Save].

{% screenshot en/xlsm.png "Save As Dialog" %}

Now you have saved the file with the macro available.

### Visual Basic Editor (VBE)

To program using the VBA, you start **Visual Basic Editor (VBE)** and write your program.

Open VBE.

&#9312; Click on the [Developer] Tab – [Visual Basic].

{% screenshot en/DevTab_VBE.png "Visual Basic on the Developer Tab" %}

&#9313; Double-click [Sheet1] in the "VBAProject(File name)" of the project on the left.

※If you want to use a sheet other than ‘Sheet1’ select the name of the sheet that you want to use.

{% screenshot en/VBE.png "VBE" %}

You will write a VBA-based program in the window that appears.

{% screenshot en/VBE_Sheet1.png "Sheet1 of VBE" %}


### Record Macro

Macros can be created in two ways: programming using VBA and "Record Macro.” In "Record Macro,” all operations are recorded when recording, and a program is automatically generated based on the record. Therefore, depending on the nature of the operation, the program may be complex or inefficient, and care must be taken. It is best used as a confirmation when one knows how to perform a manual operation but cannot program that process.

&#9312; Click on the [Developer] Tab – [Record Macro].

{% screenshot en/DevTab_MacroStart.png "Record Macros on the Develop Tab" %}

&#9313; Give it a "Macro name" and click [OK]. 

{% screenshot en/Macro_Record.png "Macro Records" %}

&#9314; Perform the operation you want to save and click on the [Developer] Tab – [Stop Recording]. 

Here, we have entered a number in each cell of column A as a test.

{% screenshot en/DevTab_MacroEnd.png "End of Developer tab recording" %}

&#9315; In the VBE, a standard module – Module1 has been generated within "VBAProject (file name).” Double-click [Module1]. In the VBE, Module1 has been generated within "VBAProject (file name).”

{% screenshot en/VBE_Module1_1.png "VBE" %}

The automatically generated program will be displayed as shown below. 

{% screenshot en/VBE_Module1_2.png "VBE Recorded Macros" %}


The Most Basic Program
--------------

### HelloVBA

&#9312; Open the VBE "Sheet1" window.

&#9313; Write the following in the “Sheet1” window. Please ensure that all the characters are entered correctly using single-byte alphanumeric characters. Errors may occur if mistakes are made.

*HelloVBA* source code

```
Sub HelloVBA()
    MsgBox ("Hello VBA!")
End Sub
```

&#9314; Click![Save as](pic/Save.png)

&#9315; Click![Run](pic/Start.png)

{% screenshot en/VBE_Start.png "How to Execute Macros" %}

If successful, a dialog box will appear as shown below.

{% screenshot en/HalloVBA_Result.png "Result of HelloVBA Execution" %}


VBA Basics
--------------

### How to Write Programs Using VBA

Using VBA, macros can be created in the following form.

*How to create VBA macros*

    Sub MacroName()
        Macro processing
    End Sub



<span style="color: red;">Sub</span> MacroName<span style="color: red;">()</span>～<span style="color: red;">End Sub</span> is one macro. Always write ‘<span style="color: red;">Sub</span> MacroName<span style="color: red;">()</span>’ first, which indicates the beginning of the macro, and ‘<span style="color: red;">End Sub</span>’ last, which indicates the end of the macro.

Macro names can be freely named according to the following rules:

* Alphabetic can be used. 
* Numbers are allowed but not at the beginning of macro names. 
* Underbars are allowed but not at the beginning of macro names. 
* Symbols other than underbars are not allowed. 
* Spaces are not allowed. 
* Terms that are already used in the system are known as reserved words, and cannot be used. 
* Macro names that are already used in the same file cannot be used.

A character limit on macro names also exists; therefore, creating macros with excessively long macro names is not possible.

In programming, each sentence that makes a computer perform an action is known as a **statement**, and the program text is described by a statement known as the **source code**.

In VBA, between ‘Sub MacroName()’ and ‘End Sub,’ one needs to arrange the necessary statement according to their purpose. These statements are executed in order from top to bottom. If no statement to skip a line is present, no line is skipped; if no statement to go back up is present, there is no going back up. In programming with a VBA, we consider the order in which each statement should be written to achieve the objective, write it as source code, and complete the program.

3.The most basic program, the macro "HelloVBA" that you ran, can be explained as follows:

*HelloVBA* source code

    Sub HelloVBA()
        MsgBox ("Hello VBA!")
    End Sub


The macro name is ‘HelloVBA.’

Only ‘MsgBox ("Hello VBA!")’ in HelloVBA macro.

MsgBox() is a statement displaying the content within () as a dialog box.

Therefore, when the HelloVBA macro is executed, a dialog box with the words "Hello VBA!” appears.

{% screenshot en/HalloVBA_Result.png "Result of HelloVBA Execution" %}

Macro programs can be created by writing statements based on the VBA in this manner. Several elements make up a program, such as statements; therefore, we can learn these elements and become capable of creating a wide range of programs.


### Excel Book Structure

The VBA running on Excel can perform data processing using Excel tables. As Excel often processes data entered into  tables, understanding the structure of Excel tables is essential. The structure of Excel tables is covered in the following lecture:

* [Table creation Basics](../../excel/01/index_en.html#chapter11)

The Excel file body is known as a **book**. Within it are **sheets**, and each sheet contains one table. A book can contain more than one sheet; therefore, it can contain more than one table. The part of each table on a sheet that allows data entry is known as a **cell**

{% screenshot en/Excel_Const.png "Excel Table Structure" %}

In VBA, tables can be handled by specifying books and sheets as objects. As illustrated in the diagram below, you can specify the book you intend to use by Workbooks("Book Name"), sheet by Worksheets("Sheet Name"), and cell by Range("cell name") or Cells(row number, column number). 

{% screenshot en/VBA_Const.png "VBA Diagram of the Structure of an Excel Table" %}

These are connected by "." (dot) to represent a cell as follows:

    Workbooks(“u1234567Name.xlsm”).Worksheets(“Sheet1”).Range(“A1”)
    Workbooks(“u1234567Name.xlsm”).Worksheets(“Sheet1”).Cells(1, 1)


The above both show the cell name "A1" in the sheet "Sheet1" in the book file "u1234567name.xlsm."

When using Cells, it is important to note that the column is specified by a number instead of an alphabet. 

**<u>In addition, when processing within the same workbook, you can omit Workbooks. Worksheets can also be omitted if used on the same sheet. In this case, note that the macro must be written in the VBE to the sheet to be used. </u>**

We created a report card using a macro as a test. Please write and execute the following Performance Table in VBE. If we use numbers or formulas, we can use them as they are; however, if we use characters, we enclose the value in double quotes (")

*PerformanceTable* source code

    Sub PerformanceTable()
        Range("A1") = "Report Card"
        Range("A2") = "Name"
        Range("B2") = "Japanese Score"
        Range("C2") = "English Score"
        Range("D2") = "Math Score"
        Range("A3") = "A"
        Range("B3") = 90
        Range("C3") = 85
        Range("D3") = 70
    End Sub



A report card was created as follows. Check the cell names and values entered in the Range() of the Performance Table, and carefully check how the cells are handled using Range().

{% screenshot en/PerformanceTable_Result.png "Result of PerformanceTable Execution" %}


Exercises
--------------

### Exercises1

Let us create a macro that displays a dialog as follows:

{% screenshot en/Test01_1_Result.png "Results of Exercises1 Execution" %}

### Exercises2

Using Range, let us create a macro that would be similar to the following:

{% screenshot en/Test01_2_Result.png "Results of Exercises2 Execution" %}

### Exercises3

Using Cells, let us create a macro that would be similar to the following:

{% screenshot en/Test01_2_Result.png "Results of Exercises3 Execution" %}

### Exercises4

Multiple methods to obtain the same results in programming exist. Let u s rewrite the Range in the program Performance Table mentioned above using Cells to obtain the same content. In this case, it is easier to understand if we clear the values of each cell first before proceeding.

### Exercises5

Let us create a macro that will enter a name into a table and display that name in a dialog using Range, as shown below.

{% screenshot en/Test01_5_Pre.png "Preparation for Exercises5" %}

{% screenshot en/Test01_5_Result.png "Results of Exercises5 Execution" %}

### Exercises6

Let us create a macro that enters a name into a table and displays that name in a dialog using Cells, as shown below.

{% screenshot en/Test01_5_Pre.png "Preparation for Exercises6" %}

{% screenshot en/Test01_5_Result.png "Results of Exercises6 Execution" %}


