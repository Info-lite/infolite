---
layout: appendix_en
title: Check and Set Macro Security
date: 2022-04-01 00:00:00 +0900
---

This page introduces macro security.

The settings in the Information Processing Classroom have been preconfigured but may not be set on your computer used for self-study and other activities. Check the settings and change them if needed. 


Macro Security
----------------

Macros may be used as harmful programs because they can allow various processes to be performed automatically. 

Therefore, macros are often disabled by default and may not be available. Check the security settings for macros.

&#9312; Click on the [Developer] tab – [Macro Security].

{% screenshot en/Security_DevTab.png "Macro Security on Developer Tab" %}

&#9313; Check what is selected as "Macro Settings."

* Disable VBA macros without notification: macros are not available.
* Disable VBA macros with notification: When a user tries to open a macro, a warning appears, and the user can press [Enable Content] to use the macro. This setting is chosen in this case because it allows the user to confirm and then use the macro.
* Disable VBA macros except digitally signed macros: Macros that are certified with a digital signature are available, but others are not. 
* Enable VBA macros: All macros are available. However, this setting should be used with caution. Do not set this option because it enables any harmful programs.

&#9314; If "Disable VBA macros with notification" is not checked, check it and press [OK].

{% screenshot en/Security_VBASec.png "Macro Settings" %}

With these security settings in place, macros can be executed.

If you try to open an Excel file that contains macros, as shown below, a security warning will disable the macros, but you can enable the macros only for that file by pressing [Enable Content].

{% screenshot en/Security_Warning.png "Security Warning" %}

