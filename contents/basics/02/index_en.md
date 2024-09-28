---
layout: page_en
title: Computer systems and basic operation 
date: 2016-09-12 16:09:21 +0900
purposes:
    - To understand how computers work and the role of the operating system 
    - To engage in working with files and folders 
    - To understand how to use electronic mail 
---


If you missed the last class 
------------------------

<div class="alert alert-danger" role="alert">
<p><strong>Students must take the Information Ethics Course before using the university’s computer network system (Information Systems for Education and Research). </strong></p>
<p>Students who have not taken the Information Ethics Course or have missed a previous class are not permitted to use the University’s Information Systems for Education and Research. Please notify your teacher or tutor that you plan to attend the course. </p>
</div>


How computers work
--------------------

Basic computer knowledge can help you deal with a variety of problems more effectively. Here, you will learn how computers work. 

### Basic structure of a computer 

Computers perform various tasks based on commands. The procedure of a computer performing a specific task is called “processing.” 

For a computer to process a certain task, three functions are required: an “input device” to receive the task from a person, a “processor” to actually process the task, and an “output device” to present the results of the task that has been processed. 

<dl>
<dt>Input device</dt>
<dd>The keyboard, mouse, camera, and microphone act as a computer’s “eyes” and “ears.” They are used to input programs and data from outside to the processing unit. </dd>
<dt>Processor </dt>
<dd>The arithmetic, main memory, and control units are collectively referred to as processing units. Classroom computers are integrated into the computer itself, which is mounted on the back of the display. </dd>
<ul>
<li>Arithmetic unit : The brain of a computer, generally the better the performance, the faster the processing. Examples include CPUs and GPUs. </li>
<li>Main memory :  functions similarly to a computer workstation. Insufficient capacity slows down simultaneous or complex processing or causes applications to crash while processing (e.g., RAM).</li>
<li>Control unit : A device that controls the operation of input, processing, and output devices based on the commands of a programs (e.g., CPU)</li>
</ul>
<dt>Output device</dt>
<dd>Devices such as displays, printers, and speakers can be considered a computer’s “mouth” and “hands.” They output the results produced by the processing unit to communicate with humans.</dd>
<dt>Auxiliary storage </dt>
<dd>These devices include hard disks, CDs, DVDs, Blu-ray discs, and USB memory sticks, which can store information even when the computer is turned off.</dd>
</dl>

{% screenshot en/neumann_en.jpg "Basic structure of a computer " %}

A computer with this architecture is called a stored program (von Neumann-type) computer. 
<br />
John Eckert, John Mauchly, and John von Neumann invented the von Neumann-type computer in the 1940s.　Most modern computers are based on this architecture, known as the Neumann-type. 
<br />
A distinguishing feature of von Neumann-type computers is that the “instructions” and “data” for the computer to process various tasks are stored in the main memory. 
<br />
Before the von Neumann-type computers emerged, the “instructions” were already embedded in the computer’s arithmetic and control units, allowing them to be processed quickly for some purposes while being of little use for others. 
<br />
However, the von Neumann-type computer can be used for a variety of purposes by storing the “instructions” and “data” in main memory and constantly changing the “instructions.” 
<br />

### Hardware and software 

In addition to functional classifications such as the von Neumann-type, computers can be divided into two categories: “hardware” and “software.”　The term “hardware” refers to the physical machines that comprise the computer, such as the processing unit and input devices in the von Neumann-type. 
<br />
In contrast, the term “software,” refers to the intangible functions that run on a computer. For example, while the arithmetic unit is hardware, the computing actions and methods are classified as software. 

### 32-bit and 64-bit operating systems

Recently, we have seen operating systems (OSs) such as Windows 32-bit and Windows 64-bit versions in stores. These are called the 32-bit and 64-bit OS, respectively, meaning that the OS has been optimized for the CPU with the corresponding numerical value. A 32-bit CPU implies that it can process up to 32 bits of data at once, whereas a 64-bit CPU can process 64 bits of data at once. 
<br />
Of course, a 64-bit CPU has a faster processing speed; however, without an OS that processes at that speed, performance cannot be achieved. For example, if a 64-bit CPU is used with a 32-bit OS, the computer will function properly. However, the full performance of the 64-bit CPU cannot be demonstrated. However, if a 32-bit CPU and 64-bit OS are used in combination, the computer will not operate in the first place. 

{%screenshot os_cpu.jpg "Combination between OS and CPU for their performance "%}

The processing speed (bit number) of the OS must be less than the processing speed (bit number) of the CPU; however, to get the most efficient performance out of the CPU, an OS optimized for that CPU’s processing speed (bit number) must be used. A 32-bit OS must be used on a 32-bit CPU, while 64-bit CPUs must be used with a 64-bit OS. 
<br />
These are sometimes referred to as 32-bit and 64-bit machines, respectively; however, in practice, a computer running a 32-bit OS is called a 32-bit machine, and a computer running a 64-bit OS is called a 64-bit machine with a 64-bit CPU. 


 Role of the operating system
------------------------------

A computer is composed of several pieces of hardware (devices), and the software that combines these hardware functions together is called an “**operating system.**” 
<br />
The following links will explain how to use the OS, using “Windows” as an example. For Macs, the screen structure and names are different; thus, operating instructions can be found at the following links. 

-   [Mac user's guide](https://tmuner.cpark.tmu.ac.jp/tmuner/ja/study/pc/mac.html) (in TMUNER)

Proceed with the instructions in a Windows environment. First, ensure that you are signed in and ready to use your computer. (We explained how to sign in in the previous lecture; if you have forgotten how to sign in, please refer to the previous document.) 


Mouse and keyboard operation
------------------------

Input devices, such as a mouse or keyboard, are used to communicate instructions to computers. 

### Mouse operation 

The OS allows the mouse to operate and move the cursor freely on the screen, allowing users to perform operations visually. For more information on how to operate the mouse, refer to the pages from the link below. 

{% appendix_en ../appendix/mouse.html " How to operate the computer mouse" %}

### Keyboard operation

Text input, for example, is performed using the keyboard rather than the mouse. Currently, the keyboard used in the Japanese Windows environment is known as the “109 keyboard.” Different keyboards may have different key positions, and some may have fewer keys; however, the basic operations remains the same. 
<br />
For detailed information on key operations and input methods, see the reference material. 

{% appendix_en ../appendix/keyboard.html "How to operate the keyboard " %}


Names and operations of each component on a screen 
--------------------

The following pages provide an overview of the names of the desktops, windows, etc. Have a look at them. 

{% appendix_en ../appendix/desktop_window.html "画面各部の名称と操作" %}


Files and folders 
------------------

Subsequently, the functionality of files and folders is briefly described. 
<br />
This section explains files and folders in the Windows 11 environment. 

### Files 

On a computer, data items such as documents, images, and music are referred to as “files.” 
<br />
In the real world, documents and images have a medium (paper), and music has a CD on which they are stored, but computer files have no physical form. 
<br />
Instead, all files always have names. 

### File types 

Open Notepad, type some text, give the document a name, and then save it. 
<br />
The file will be saved as “(name you gave it) +.txt.” This .txt part is called an extension. The extension indicates the application with which the file was created and generally consists of “.” + 3–5 letters of the alphabet. The OS automatically determines the type of file using this extension and displays it as an “icon.” 
<br />
The typical file extensions and corresponding applications are listed below. 

<table>
<thead>
<tr>
<th>Types </th>
<th>Icon </th>
<th>Extension </th>
<th>Uses </th>
<th>Typical applications</th>
</tr>
</thead>
<tbody>
<tr>
<td rowspan="4">Text file, rich text file, etc.</td>
<td><img src="../pic/icon_txt.png" /></td>
<td>.txt</td>
<td>Document creation. </td>
<td>Notepad<br />Hidemaru</td>
</tr><tr>
<td><img src="../pic/icon_docx.png" /></td>
<td>.docx</td>
<td>Higher-order document writing, e.g. reports. </td>
<td>Microsoft Word</td>
</tr><tr>
<td><img src="../pic/icon_pdf.png" /></td>
<td>.pdf</td>
<td>Distribution of electronic versions of manuals, catalogues, and other printed material. </td>
<td>Adobe Acrobat<br />Adobe Acrobat Reader</td>
</tr><tr>
<td><img src="../pic/icon_html.png" /></td>
<td>.htm<br />.html</td>
<td>Publication of web pages using the Internet. </td>
<td>Microsoft InternetExplorer<br />Mozilla Firefox、Google Chrome</td>
</tr><tr>
<td>Spreadsheet file </td>
<td><img src="../pic/icon_xlsx.png" /></td>
<td>.xlsx</td>
<td>Tables, such as rosters, and calculation sheets. </td>
<td>Microsoft Excel</td>
</tr><tr>
<td>Presentation file </td>
<td><img src="../pic/icon_pptx.png" /></td>
<td>.pptx</td>
<td>Creating presentation slides. </td>
<td>Microsoft PowerPoint</td>
</tr><tr>
<td rowspan="2">Image file </td>
<td><img src="../pic/icon_bmp.png" /></td>
<td>.bmp</td>
<td>Save images created in Paint as they are. </td>
<td>Paint</td>
</tr><tr>
<td><img src="../pic/icon_jpg.png" /></td>
<td>.jpg</td>
<td>Compress and save image files. </td>
<td>Paint</td>
</tr><tr>
<td rowspan="2">Video file </td>
<td><img src="../pic/icon_wmv.png" /></td>
<td>.wmv</td>
<td>Video playable on Windows only. </td>
<td>Windows Media Player</td>
</tr><tr>
<td><img src="../pic/icon_mp4.png" /></td>
<td>.mp4</td>
<td>Widely playable video. </td>
<td>Windows Media Player</td>
</tr>
</tbody>
</table>

### Folders

The files you created have been saved in “My Documents.” However, if you simply save files, you may not be able to locate the file you are looking for. Therefore, it is critical to organize saved files in a user-friendly manner. 
<br />
Files are organized in folders, which are icons shaped like file case. A folder, also known as a directory, is a box that holds all the files together. 

### Organizing files using folders 

The golden rule for file organization is to arrange files and folders hierarchically, as shown in the diagram below. This hierarchical structure is known as a tree structure. 

{% screenshot treestructure.png "Schematic of a tree structure" %}

Specifically, here is how it is structured. 

The following example shows the folder “example” in “Downloads” is sorted into “Word,” “English,” and “Excel.’” 

<!-- {%screenshot folder_example1.webp "フォルダ階層の例"%} -->

For personal use, untidy files are fine as long as you remember where they are located; however, this becomes more difficult as the number of files increases. It is best to keep things tidy. 
<br />
In addition, the tree structure can be expressed using character strings. For example, the location of a folder “word” in the example above can be expressed as 
<br />

>    Downloads¥example¥word 

<br />
This representation is called a pathname and can be accessed by clicking on the address bar at the top. 


Managing and handling files and folders using Explorer
-----------------------------------------------------

We now use Explorer (File Explorer) to manipulate files and folders. 

### Creating and saving files 

Files store the results of work done in an application or other application. Therefore, in many cases, a file is created only by saving. 
<br />
Most applications allow you to save in the following ways. 

{% screenshot en/filesave.png "Example of a file menu " %}

If you are saving for the first time or pressing “Save as,” enter a name of your choice in the “File name” field at the bottom, navigate to the location where you want to save the file (e.g., My Documents), and click “Save.” 

{% screenshot en/filesave_naming.png "In case of saving with naming " %}

Note that `¥` `/` `?` `:` `\*` `"` `\>` `\<` `|` are important symbols used by computers and are therefore prohibited characters and cannot be used in file names. 

{% screenshot en/filesave_error.png "Invalid character error " %}

In addition to this, it is also forbidden to use “.” or (single space) at the beginning of the file name. It is possible to change a file name that already starts with “.” to a name without “.” at the beginning. 
<br />
In addition,, if you change the file name, including the extension part after “.,” to something other than the specified file, the file may fail to open. 
<br />
Notepad can be used to create a text file and save it in My Documents under the appropriate name. Notepad can be started by typing “notepad” or “note” into the search bar at the bottom of the screen. 

### Viewing and updating existing files 

When you double-click file icon, the application that corresponds to the filename extension is opened. 
<br />
This section describes how to open the text file that you have just created. 
<br />
The text file mentioned above has a “.txt” extension, which launches Notepad in Windows. If you want to open it in another application, follow the steps below:. 

1.  Launch the application that you want to use. 
1.  Drag and drop the file icon you want to open onto the opened application window. (Move the mouse while holding down the left button and release it at the destination). 

<!-- {% screenshot en/fileopen.webp "ドラッグ＆ドロップでファイルを開く" %} -->

This method lets you to open text files with the “.txt” extension in applications other than Notepad. Applications other than Notepad that can open text files include Hidemaru. 

### Creating new folders

Let us create a folder called “infolit” in My Documents. 

1.  Right-click on a blank area in the window to display the menu. 
1.  Click [New] - [Folder]. 
1.  Enter “infolit” as the folder name. 

{% screenshot en/make_folder.png "Creating a new folder" %}

### Moving and copying files and folders

This section describes how to move or copy files to another folder. In this example, “practice.txt” from “infolit” is moved to the subfolder “reports.” 

1.  Select the file practice.txt you want to move/copy and right-click on the file to display a menu. 
1.  Click [Cut] or [Copy]. 
    -   Cut: To move completely 
    -   Copy: If you want to duplicate a file without leaving it where it is. 
1.  Double-click on the destination folder “reports.” 
1. Open the right-click menu in a blank area of the window and select [Paste]. 

{% screenshot en/copy_file.png "Select a file and copy " %}

{% screenshot en/paste_file.png "Paste a file in the destination folder " %}

Another method to move a file is by dragging with the mouse. 

1.  Have two Explorer windows open. 
1.  Display “infolit” folder in one window and “reports” folder in the other. 
1.  Select the file “practice.txt” that you want to move/copy and drag it to the other window while holding down the left button. 

In this case, the situation is identical to when moving using the [Cut] operation. 
<br />
The same operation can be performed by dragging and dropping into the ‘reports’ folder without opening the folder. 

###  Deleting files 

File deletion is essentially the same as moving or copying files. The deleted files were temporarily stored in the “Recycle Bin.” There are several methods of deleting files. 

- Move the file you want to delete to “Recycle Bin” by dragging and dropping. 
- Open the right-click menu of the file you want to delete and select [Delete]. 

{% screenshot en/delete_file.png "Deleting a file " %}

The files in the Recycle Bin have not yet been completely deleted at this stage. If you want to delete them completely, point the mouse to the Recycle Bin and select the Empty Recycle Bin from the right-click menu. Note that files in the Recycle Bin can be restored, but those that have been completely deleted cannot be restored. 
<br />
Note that, according to Windows specifications, files deleted from locations other than the hard disk (e.g., deleted from a USB memory stick) are not placed in the Recycle Bin but are completely deleted. 


How My Documents works 
------------------------

### Overview of My Documents 

On the desktop, there is a shortcut to My Documents (the H drive). This is where you store your own data. 

{% screenshot en/desktop-mydocuments.png "A shortcut to My Document " %}

Double-click on this to open My Documents. 
<br />
In the Computer Room, My Documents can also be viewed from a PC using Explorer. The contents of [PC]-[H:¥] should be the same as those in My Documents. 

<div class="alert alert-warning" role="alert">
<strong>Constraints in the Computer Room</strong>
Avoid using Japanese names for files and folders whenever possible. The university uses a variety of OS, including Mac, UNIX, and Windows. Each OS may have a different character encoding, which can cause garbled characters in some cases. 
<br />
According to Windows specifications, files erased from locations other than the hard disk (e.g., a USB memory stick) are not placed in the Recycle Bin and are permanently deleted. If files are dragged from these locations to the Recycle Bin for erasure, a confirmation dialogue for deletion is displayed. If you select [OK] here, the file will be permanently deleted rather than being placed in the Recycle Bin. Take care not to accidentally delete important files. 
<br />
In Information Processing Classroom devices, data saved on the desktop are deleted when the user logs off. Make sure you save your data in My Documents. </div>

### Using My Documents and carrying data around 

Files stored on the H drive (My Documents) can be viewed from any computer in the TMU Information systems. 

- Files on the H drive are only visible to yourself. 
- The storage capacity for the H drive is 5 GB. 

The H drive is not available on home computers, personal laptops, etc. 
<br />
There are three ways to transport files between the university and home. 

#### &#9312; Use the USB memory stick: Copy and move files to a USB memory stick and carry them with you. 

##### Connecting a USB memory stick 

1. Plug in the USB memory stick. 
    - The main body of the computer is located behind the monitor. 
    - Plug the USB memory stick into the USB port. 
        {% screenshot en/usb_back.png "USB port behind the monitor in classroom 350. " %}
        {% screenshot en/usb_back_330340.png "USB port behind monitors in classrooms 330 and 340. " %}

1. Check the contents of the USB memory stick. 
   -   Double-click the desktop PC to launch Explorer. 
   -   Double-click on the connected USB memory stick displayed. 
{% screenshot en/usb_explorer.png "Display of connected USB memory stick. " %}

##### Removing the USB memory stick 
1. Remove the USB memory stick after use. 
- Before unplugging the USB memory stick from the port, a removal process must be performed. 

- Look for an icon in the shape of a USB memory stick in the task tray at the bottom right of the screen. 

- If it is hidden, click on the [symbol](pic/usb_click.webp) to display more icons. 

- Click on the icon in the shape of a USB memory stick and select ‘Eject’ from the menu that appears. 

- A message will appear, and you can remove it.

{% screenshot en/usb_desktop.png "Removing the USB memory stick " %}
 
#### &#9313; Using kibaco: Use the “Documents” section on kibaco's My Page. 

- Upload documents to kibaco from a university PC. 
- Download materials from kibaco on your home PC. 

##### Uploading files to kibaco 
1. Click [Resources] on Home. 
1. Click [Actions] in the destination folder to which files will be uploaded. 
{% screenshot en/kibaco1.png "Click [Resources]-[Actions] " %}

1. Click [Upload Files]. 
{% screenshot en/kibaco2.png "Click [Upload Files] " %}
1.Click [Drop files to upload, or click here to browse.]. 
{% screenshot en/kibaco3.png "Click [Drop files to upload, or click here to browse.] " %}
1. アSelect the file to upload. *The maximum upload size is 150 MB at a time. 
1. Click [Open]. 
{% screenshot en/kibaco4.png "Select the file and click [Open] " %}
1. When the file to upload is displayed, click [Continue]. 
{% screenshot en/kibaco5.png "Click [Continue] " %}
1. The file is uploaded. 
{% screenshot en/kibaco6.png "Upload " %}

##### Storage capacity of Home [Resources] 

The capacity of the Home [Resources] is 1 GB. You can check your capacity using the following steps: 

1. Click [Check Quota].
{% screenshot en/kibaco_myDocument_1.png "Check [Check Quota] in Home [Resources]  %}
In this way, the capacity in use is shown.
{% screenshot en/kibaco_myDocument_2.png "Checking quota " %}

##### Replacing and deleting files 
<div class="alert alert-warning" role="alert">
<p>When replacing a file, the uploaded file is deleted and the file is re-uploaded. </p>
</div>

1. Click [Resources]. 
1. Select [Actions] for the file you want to delete. 
1. Click [Move to Trash]. 
{% screenshot en/kibaco7.png "Click [Resources] – [Actions] – [Move to Trash] " %}
1. [Remove] 
{% screenshot en/kibaco8.png "Click [Remove] " %}

##### Download from kibaco 
1. Click [Home] 
1. Click [Resources] 
1. Download a file 
{% screenshot en/kibaco9.png "Click [Home] – [Resources] to download a file " %}

#### &#9314; Using box: Use Box contracted by the Tokyo Metropolitan Public University Corporation

##### Upload a file to Box 
1. Log in to the “Box” for TMU Public University Corporation with your TMU ID. 
1. Click a folder in [All files] 
{% screenshot box.webp "[All files] -  " %}
1. Upload a file

##### Download from Box 
1. For PCs, access Box in the same manner as when uploading and download a file. 
1. For smartphones, a dedicated application is available. 

GUI and CUI 
------------------

Files can also be manipulated using the command prompt, a character user interface (CUI), instead of Windows Explorer, a graphical user interface (GUI). 
<br />
A CUI is a computer screen that is represented by text only. 
<br />
When OS such as UNIX and MS-DOS were first integrated into computers, they were not expected to be as versatile as they are today. Computers, also known as calculators or computers, existed solely as calculation tools, and they lacked the ability to display graphical screens for as long as they do today. 
<br />
The GUI was first introduced in 1984 with MacOS and 1986 with Windows. 
<br />
The GUI is a graphical computer screen that you use today. Since then, computers have been used for various purposes, such as advanced image editing and video, as their capabilities have improved, and their prices have decreased. 

{%screenshot cui_gui.webp "Command Prompt 			Explorer  "%}

However, the CUI has not disappeared; its most important feature is that it does not overload computers. 
<br />
Therefore, when a computer boots up, the CUI begins first, followed by the GUI. Sometimes, computer operations are performed from the CUI, such as when the computer malfunctions or assembles itself. 
<br />
Because programs are essentially command lines, there are many cases where they are run using a CUI, such as UNIX or its developmental system Linux, Terminal, or Command Prompt. Therefore, it can be concluded that learning CUI as basic computer knowledge is still important today. 
<br />
The following reference material describes how to use the Command Prompt and Terminal, so you may want to learn them. 

{% appendix_en ../../common/appendix/win_cmd_prompt.html "How to use the Command Prompt" %}

{% appendix_en ../../common/appendix/mac_terminal.html "How to use the Terminal" %}



How to use e-mail 
------------------

The university has a webmail system that allows university e-mails to be viewed from any location using a browser. 
<br />
For instructions on how to use the system, check the PDF file below. 

-    [How to use e-mail](./o365.pdf)


Notes on using e-mail 
--------------------------

### E-mail addresses 

At the Tokyo Metropolitan University, student e-mail addresses are set up as “[last name]-[first name]@ed.tmu.ac.jp” (e.g., toritsu-masaru@ed.tmu.ac.jp). 

The e-mail address includes the string “@ed.tmu.ac.jp,” indicating that you are a Tokyo Metropolitan University member. 

Only persons affiliated with the Tokyo Metropolitan University can send and receive e-mails using this address containing “@ed. tmu.ac.jp.” Therefore, when you send an e-mail from this address, the recipient is aware that you are a member of the Tokyo Metropolitan University. In other words, the identity of the university’s e-mail addresses is guaranteed. 

This type of public guarantee cannot be obtained using personal computers, smartphones, or mobile phone e-mail addresses. Please use your university e-mail address appropriately, understanding that your identity is secure while also being identifiable. 

You should also check your inbox for your university e-mail address frequently, as you may receive important communication from teachers and administrators via e-mail. Please note that if you do not check your email, you will not only miss out on communication, but you will also cause a large volume of e-mails to accumulate on the servers, which can have a negative impact on the university's system. 

You can use the university’s webmail from anywhere (e.g., home or mobile phone) as long as they are connected to the Internet. You can also forward e-mails to your primary e-mail address. Make the most of your university e-mail addresses by checking them in a convenient manner. 

### E-mail etiquette 

E-mail has become a vital mode of communication. E-mails are used for research and extracurricular activities at universities as well as for job searches. 

Therefore, it is critical to not only understand how to use e-mails but also to use them correctly. There are no set rules for sending e-mails, but there are some important etiquette considerations. 

#### Always mention an addressee and sign the letter 

An addressee and signature are necessary when sending an e-mail, just as they are when sending a letter. The recipient may not always know sender’s e-mail address. Receiving an e-mail from an unfamiliar e-mail address can be confusing; however, an addressee and signature can prevent this confusion. 

An addressee and signature will also help the recipient realize that the e-mail was not addressed to them, such as if it was sent by mistake. 

As you can see, there are numerous advantages to having an addressee and signature, so make it a habit to write in the body of all e-mails sent from (sender’s signature) to (addressee). 

{% appendix_en ../appendix/office365.html#chapter1 "Add one's signature" %}

#### Be mindful of using a subject line that clearly indicates the content 

Although e-mail is becoming increasingly popular, unsolicited e-mail (spam) is a growing problem. Spammers, as you may have noticed on your mobile phone, will sometimes use subject lines such as “Nice to meet you” or “Hello” to catch people’s attention, which can come from anyone. 

This means that if you receive an e-mail with such a subject line from an unknown e-mail address, it is likely to be suspected of being spam and deleted. To avoid using such subject lines, especially if you are sending an e-mail to someone for the first time, include your name or a subject line that explains what the body of the e-mail is about. 

#### Do not abuse attachments and HTML e-mails 

Files can be attached to an e-mail and sent along with the text. However, large file attachments can strain the recipient’s mailbox. When the mailbox is full, the recipient unable to receive new messages, which can be inconvenient for them. In addition, there are many cases in which recipients are infected with computer viruses via e-mail attachments. 

For these reasons, avoid attaching more attachments than necessary. Before attaching or sending large files (data in megabytes), ask the other party if it is acceptable to send them as an attachment to an e-mail. 

{% appendix_en ../appendix/office365.html#chapter2 "How to attach files" %}

There is also a type of e-mail known as “HTML e-mail,” which is frequently found in e-newsletters and direct mail and includes backgrounds and images. HTML e-mails may appear glamorous, but they can vex the recipient because of the additional data they contain. Additionally, in the case of HTML e-mails, the recipient may be infected with an attached computer virus as soon as they open the email. Therefore, it is necessary to avoid sending more HTML e-mails than required. 

In Office365, the default setting is that new e-mails are created in HTML. To change this setting and the standard to text format, please refer to the MicrosoftOffice365 Information Literacy Practice Manual. 


Information ethics training and information security training
--------------------------

The university allows students to use the TMU information systems provided by attending an Information Ethics Course. 

This ensures that students learn the information required to use the TMU information systems correctly. 

The Information Ethics Course’s content is critical not only for TMU Information Systems　 for Education and Research but also for life in modern society, and it should be fully understood. 

However, in today’s highly information-oriented society, information technology (IT) is rapidly developing. Therefore, it is critical to obtain and learn only the minimum amount of information required for safe handling. 

As part of the content of the Information Literacy I course, an Information Ethics Test is provided in kibaco, so take and pass it. 

The timing of the information literacy and information ethics tests differs depending on the teacher in charge of the class; therefore, please follow the teacher’s instructions. 

Furthermore, apart from the Information Literacy I course, TMU requires students attend an information security training at least once a year and pass a test to be able to handle information safely. 

The table below summarizes the tests related to information ethics and security. Check that you have completed them thoroughly. 

You will then be able to handle information safely and improve your skills to make the most of the information in the modern world.
<br>

| Test  | When to take | Where to take | Explanation  | Passing score  |
| --- | --- | --- | --- | --- |
| Information literacy and information ethics test. | Within the second class or within a week after the class.  | kibaco-within the Information Literacy I course | Test to check the understanding of information ethics in Information Literacy I.  | Take as many attempts as possible until a score of 80 or more is obtained.  |
| Information security training.  | not yet determined.  |Conducted in Microsoft Forms. For more information, see below. | Training and testing to check information security throughout the university.  | Take the test as many times as possible until you get 100 points. |

### Information security training

TMU provides information security training using the following materials and mini-test. 
<br />
Please review the information security training materials and complete the mini-test. The deadline is not yet determined. 

*Authentication with a TMU ID is required to access the materials and mini-test. 

*The mini-test must be taken as many times as possible until a score of 100 is achieved. 

*The materials and mini-test are available in English.  

- [AY2024 TMU Information Security Training for 1st Grade.pdf ](https://jmjtmu.sharepoint.com/:f:/s/for_tmuner/Etofrrgg1J5IkX9XBqcQaucBys2b5Wz8tdg1MNkqKRO6MQ?e=BHV2wF)


Assignments 
--------

1. Create a new folder “English” in the “infolit” folder. 
1. Move all the files in the folder “infolit” into the new folder. 
1. Think about how you can move all the files in one operation. 
1. Take some of the currently popular auxiliary storage devices and summarize their characteristics (maximum storage capacity, where they can be used, advantages, disadvantages, etc.). 


 References 
----------

### TMU-hosting website 

-   [TMUNER](https://tmuner.cpark.tmu.ac.jp/tmuner/ja/)
    -   [Windows利用ガイド](https://tmuner.cpark.tmu.ac.jp/tmuner/ja/study/pc/windows.html)
    -   [Mac利用ガイド](https://tmuner.cpark.tmu.ac.jp/tmuner/ja/study/pc/mac.html)
