---
layout: appendix_en
title:  How to Write Easy-to-Read Source Code 
date: 2022-04-01 00:00:00 +0900
---

This page introduces various points to consider when writing source code. 

The suggestions presented here are not only applicable to VBA but to programming in general. These guidelines can be used as a general reference. 

Indents and Line Breaks 
----------------

In programming, source code becomes more difficult to read as the number of code lines increases. Source code that is difficult to read hinders understanding and increases the likelihood of mistakes. Thus, written source code should facilitate reading. 

To create easy-to-read source code, it is needed to use **indents (spaces from the left edge of a line)** and **line breaks**. 

One statement should be written per line of source code, and single spaces and line breaks are ignored during program compilation or execution. Therefore, source code is easier to understand if the lines are properly aligned through indentation and line breaks for spacing. 

For example, if neither indent nor line breaks are used, as shown below, the source code looks crowded and difficult to read. 

*Example of Difficult-to-Read PerformanceTable Code *

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

 
On the other hand, source code can be easier to read by aligning indentation using spaces and inserting line breaks where needed, as shown below. 

*Example of Indentation and Line Breaks in PerformanceTable Code*

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


Comments 
----------------


Comments also help understanding the content of source code. 

As the contents of source code are basically subject to computer processing, including any unnecessary characters will result in errors. However, comments are excluded from processing. Any text included after a single quote ' is excluded from processing and considered as commented out. Therefore, explanatory text can be included in source code using comments, as illustrated in the source code below. 

*Example of PerformanceTable Code with Indents, Line Breaks, and Comments *

    Sub PerformanceTable()
        
        'Title
        Range("A1") = "Report Card"
        
        'Grade Label
        Range("A2") = "Name"
        Range("B2") = "Japanese Score"
        Range("C2") = "English Score"
        Range("D2") = "Math Score"
        
        ' Mr. A's Score
        Range("A3") = "A"
        Range("B3") = 90
        Range("C3") = 85
        Range("D3") = 70
    End Sub
    
Overall, writing source code that is easy to read and understand can help you understand and improve your programming. Thus, be creative and start writing source code that is easy to read. 

