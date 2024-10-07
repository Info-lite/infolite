---
layout: appendix_en
title: How to use the Command Prompt
date: 2015-03-23 16:14:50 +0900
---

This section describes the Windows command prompt. For MacOS, please refer to the [How to use the Terminal](./mac_terminal_en.html).

Command Prompt overview
------------------------

### Launching the Command Prompt

Type ‘cmd’ in the search bar at the bottom of the screen and press Enter to launch the Command Prompt program.

{% screenshot command_search.webp "Enter ‘cmd’ in the search bar" %}

The following screen will appear.

{% screenshot command_boot.webp "Screen immediately after launching the Command Prompt" %}

Various commands can be entered and executed here.
The Terminal (Windows PowerShell) <img src="pic/command_powershell.webp" /> is a similar functionality.

This is more advanced than Command Prompt and facilitates a greater number of operations, albeit being slightly heavier.



Frequently used commands – Directory-related operations
-----------------------------------

### Find out where you are

At the Command Prompt, type the following and press Enter.

    cd

You will then observe, for example, the following:

    H:\

In certain cases, the ‘\’ may appear as ‘¥.’

This is the directory that Command Prompt is now referring to.


### Directory listing

Observe the files and directories that are in the directory you are now referring to using

    dir

You will then observe, for example, the following:

    2015/10/01  13:34   <DIR>   java
    2015/10/01  13:40           memo.txt

### Creation and deletion of directories

A directory can also be created.

    md infolit2b

The ‘md’ command is used as per the following syntax: 
‘md [Name of the directory to be created].’

Use the ‘dir’ command to check whether it has been created properly.


    2015/10/02  10:32   <DIR>   infolit2b
    2015/10/01  13:34   <DIR>   java
    2015/10/01  13:40           memo.txt

The directory infolit2b has been added to the top line, which indicates its proper creation.

Next, attempt to delete the directory. To do this, let us create another directory, ‘test,’ and check if it has been created.

    md test

    dir

Now delete the ‘test’ directory you have just created as follows:

    rd test

Similar to ‘md,’ this is also used in the syntax of ‘rd [Name of the directory to be deleted].’


### Moving into directories

Now we attempt to move to the ‘infolit2b’ directly that you have just created.

    cd infolit2b

Use ‘cd’ to check whether you have moved it properly.

    cd
    H:\infolit2b

You will observe a different path from before. This indicates that you have been moved properly.


Frequently used commands - File operations
-------------------------------

### Showing the contents of a file

Start a text editor such as Notepad. Type certain data and save the file as ‘test.txt’ in the ‘infolit2b’ you have just created.

Thereafter, check if the file has been saved properly by using the ‘dir’ command. Consequently, type the following command:

    type test.txt

Hopefully, the contents of the file will be displayed on the Command Prompt.
There is a similar command referred to as ‘more.’
At this point, if the text file contains Japanese characters, they may be garbled in nature.

{% screenshot command_garbling.webp "Garbled characters" %}

This situation occurs when the character encoding does not match between the Command Prompt (Shift JIS) and the text file (UTF-8).

Thus, enter the following command to set the character encoding of the Command Prompt to UTF-8:

    chcp 65001

This will fix several garbled characters; however, the text in the Command Prompt will be in English.

To change the character encoding back to Shift JIS, enter the following command:

    chcp 932

### Copying files

Next, attempt to copy the ‘test.txt’ file you have just created using

    copy test.txt aaa.txt

The command is of the form ‘copy [source filename] [new filename].’ You can also copy to other directories.

Once executed, use the ‘dir’ command to check the status of the copied file.

### Moving and renaming files

Now attempt to rename the file ‘aaa.txt’ that you have copied using

    move aaa.txt test2.txt

The command follows the syntax of ‘move [original filename] [changed filename].’ If the changed filename is the directory name, the file is moved.

### Deleting files

Next, attempt to delete ‘test2.txt,’ which you have renamed using

    del test2.txt

Consequently, check if it has been deleted properly using the ‘dir’ command.
