---
layout: appendix_en
title: How to add the analysis tool
date: 2017-04-07 19:30:54 +0900
---


How to add the analysis tool
--------------------------------

Click on [File] - [Options] - [Add-ins].

{% screenshot Slide17.jpg "Open a file" %}

{% screenshot Slide18.jpg "Place a cursor over [More...]" %}

{% screenshot Slide19.jpg "Open [Options]" %}

Select [Add-ins]  

{% screenshot Slide20.jpg "Select [Excel Add-ins] and click [Go...]." %}

Select [Analysis ToolPak] and click [OK].

{% screenshot Slide21.jpg "Check a box next to [Analysis ToolPak] " %}

[Data Analysis] is added. 


Precautions when the analysis tool is enabled 
--------------------------

When executing a macro with the analysis tool enabled, please follow one of the procedures below to prevent a forced termination. 

1. Run the Visual Basic editor 

1. Open the xlsm file and press [Ctrl] + [S] to overwrite the file. Then, execute the macro. 
    * Do not use [Save] to overwrite in [File] menu.  

1. Disable the analysis tool in the Add-in settings and then run VBA. 
    * Click [File] ribbon - [More...] - [Options] - [Add-ins] 
    * Select [Excel Add-ins] and click [Go...] 
    * Deselect [Analysis ToolPak] and click [OK] 

 

