---
layout: appendix_en
title: Main Data Types
date: 2022-04-01 00:00:00 +0900
---

This page introduces the main data types.

Main Data Types
----------------

The main **basic data types** in VBA include the following:

{% screenshot Table_DataType_en.png "Main Data Types" %}


Integer and Floating-Point Number Types
----------------

When considering data types, it is important to note that the **content** and **range of values** that can be handled differ depending on the data type. The declaration of a variable involves selecting and declaring the most appropriate data type.

First, you need to consider whether the value to be handled as a variable is a number or another instance. Even if a data type can handle the same numerical value, there is a distinction between the integer and floating-point number types, and integers cannot represent values that contain numbers after the decimal point.

For example, you can create and run macros Addition, Division1, and Division2 and then compare their results.


*Addition Source Code*

    Sub Addition ()
        ' Variable Declaration
        Dim x As Integer, y As Integer, z As Integer
        
        ' Assigning values to variables
        x = 30
        y = 20
        z = x + y
        
        ' Message Indication
        MsgBox (x & "plus" & y & "equal" & z)
    End Sub


(If you want to combine a variable and ordinary string in MsgBox(), you can do so by inserting "&" between them.)

{% screenshot addition_execution_result.png "Addition Execution Result" %}


In macro Addition, we combine integer variables, perform calculations, and display the results. The correct results are obtained.

Then, we create and execute macro Division1.


*Division1 Source Code*

    Sub Division1()
        ' Variable Declaration
        Dim x As Integer, y As Integer, z As Integer
        
        ' Assigning values to variables
        x = 30
        y = 20
        z = x / y
        
        ' Message Indication
        MsgBox (x & "divided by" & y & "equal" & z)
    End Sub

{% screenshot division1_execution_result.png "Division1 Execution Result" %}

The above message appears in the result, but the calculation result is incorrect. 30 divided by 20 is 1.5. However, because the variable used is an integer type, the value after the decimal point cannot be represented, and a rounded integer value is returned. In macro Addition, no number appears after the decimal point, displaying the correct result. In contrast, in Division1, a number appears after the decimal point, and the correct result cannot be obtained.
Now, consider macro Division2 for division using the floating-point number type (Single type) that can handle decimal numbers to verify if the correct result can be obtained.


*Division2 Source Code*

    Sub Division2()
        ' Variable Declaration
        Dim x As Single, y As Single, z As Single
        
        ' Assigning values to variables
        x = 30
        y = 20
        z = x / y
        
        ' Message Indication
        MsgBox (x & "divided by " & y & "equal" & z)
    End Sub

{% screenshot division2_execution_result.png "Division2 Execution Result" %}

In macro Division2, the correct result is obtained. As shown above, there are two major types of numeric data types: integer type, which handles integers, and floating-point number type, which can also handle decimal numbers. It is important to select and use the appropriate data type according to the purpose. The results above may suggest that the floating-point number type can be used for every case, but each data type has a defined range that can be handled and size required for storage, as shown in the table of the main data types. When creating a variable, a space in memory is allocated corresponding to its size. As modern computers have large memory capacity, variables are not often used in programs to the extent that memory is depleted. However, more advanced and complex programs require a large number of variables and must be designed not to deplete the memory capacity. The depletion of memory adversely affects the operation of a computer.

Choosing Data Types of the Same Type but with Different Ranges
----------------

The difference between Integer and Long, or Single and Double, depends on the range of values and amount of memory available. If you do not need to handle large values, it is better to choose a data type with a smaller size to save memory. In addition to data types that handle numeric values, various other data types are not mentioned in the table of main data types, such as string and object types. When creating variables, these data types should also be considered.



