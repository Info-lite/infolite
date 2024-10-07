---
layout: appendix_en
title: How to use the Terminal 
date: 2016-03-11 09:00:43 +0900
---

This section describes the MacOS terminal; for Windows, refer to [How to use the Command Prompt](./win_cmd_prompt_en.html).

Terminal overview
----------------

### Launching the terminal

Start Finder. Right-click on the folder you want to operate on and select [New Terminal at Folder] (or [New Terminal Tab at Folder]).

{%screenshot terminal_finder.webp "New Terminal at Folder" %}

The following screen then appears.  

{%screenshot terminal_boot.webp "Various commands can be entered here and executed." %}

Various commands can be entered and executed here.


Frequently used commands – Directory-related operations 
-----------------------------------

### Find out where you are

At the terminal, type the following:

    pwd

You will then see, for example, the following:

    /Users/u8888888/

This is the directory that the terminal is now referring to.

### Directory listing

See what files and directories are in the directory you are now referring to.

    ls

You will then see, for example, the following:

    -rw-r--r-- 1 group user date foo.bar
    -rw-r--r-- 1 group user date foo.bar

### Creation and deletion of directories

In addition, a directory can be created.

    mkdir infolit2b

The `mkdir` command is used in the following syntax: `mkdir [Name of the directory to be created] `.

    foo.bar infolit2b

You have created it appropriately.

Subsequently, try deleting the directory. To do this, let's create another directory, `test`, and see if it has been created.

    mkdir test
    ls

Now delete the `test` you have just created.

    rmdir test

Like `mkdir`, this is also used in the syntax of ` [Name of the directory to be deleted]`.


### Moving into directories

Now move into the `infolit2b` that you have just created.

    cd infolit2b

Use `pwd` to check whether you have moved properly.

    pwd
    /Users/u8888888/infolit2b

You can observe a different path from before. This seems to have been moved appropriately.


Frequently used commands - File operations 
-------------------------------

### Showing the contents of a file

Create an empty text file `test.txt` in the `infolit2b` created earlier.

    touch test.txt

Find and open the created test.txt in the Finder, enter something, and save it.

Once done, check if the file has been properly saved using the `ls` command, and type the following command:


    cat test.txt

Hopefully, the file contents should appear in the terminal.

Commands with similar functions include `more` and `less`.


### Copying files

Next, copy the `test.txt` file you have just created.

    cp test.txt aaa.txt

The command is of the form `cp [source filename] [new filename]`. You can also copy to other directories.

Once executed, use the `ls` command to check it.


### Moving and renaming files

Now rename the file `aaa.txt` that you have just copied.

    mv aaa.txt test2.txt

The command is of the syntax of `mv [original filename] [changed filename]`. If the changed filename is the directory name, the file is moved.

### ファイルのDeleting files削除

Delete `test2.txt`, which you have just renamed.

    rm test2.txt

Check that it has been deleted properly using the `ls` command.

