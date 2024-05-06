# Why I study android
the following excerpt from book <<Beginning Android Games>>
Android was first publicly noticed in 2005 when Google acquired a small startup called 
Android, Inc. This 2008, the release on version 1.0 of Andoird . 
1.0 put an end to all speculation, and Android became the new challenger on the mobile market. 
iOS and BlackBerry and its chances of winning look rather good.
Because Android is open source, handset manufactures have a low barrier . 
Open Handset Allicance  HTC Qualcomm, Motorola and NVIDIA, Althogh Android's core 
is developed mainly by Google, all the OHA members contribute to its source in one form or another.

Linux kernel2.6 . OHA build custom versions of Android . enable hobbyists , a
fellow known as Cyanogen and . Each version. 
1.5 Cupcake native libaried , which were previously restricted to being written in pure Java. 
Native code can be very benefical in situations where performance is of upmost concern. 
Do not introduced support for different screen resolutions. We will revisit this fact . 
it has some impact on how approach writing games for Andorid With verison2.0 came support 
for multi-touch screens, and version 2.2 Froyo added just-in-time cmpilation to the Dalvik 
virtual machine,the JIT speed up the exectution of Android app considerably. 
latest version is 2.3, called GingerBread. It adds a new concurrent garbage collector to 
the Dalvik VM. A special version of Andoir , targeted at tablets, is also being released in 2011. 
The only handset using GingerBread is the Nexus S, a developer phone sold be Google directly.
minimal , Most often , you can even completely forget . As game developers, we're less concerned 
with hardware capabilities. This a form , iOS, albeit nor as pronounces.
Google is the clear leader . Everyone is free to use this source code to build .
Developers need to register an Android Developer a one-time fee . A user is worked so far.

At the end of 2010, the latest ADP was released ; this Samsung device running Android 2.3 . 
ADPs can be bought via the Android market, which requires you to have a developer account.

# View bindings
View binding is a feature that makes it easier to write code that interacts with views .
Once view binding is enables in a module, it generates a binding class for each
XML layout file present in that module.
An instance of a binding class constians direct references to all views that have an ID in the 
corresponding layout.

If you want a layout file to be ignored while generating binding classes, 
add the tools:viewBindingIgnore="true" attribute to the root view
of that layout file.

# What is Jet Compose
The role of the UI is to display the application data on the screen and also to serve as the primary
point of user interaction. Whenever the data changes, either due to user interaction or
external input, the UI should update to reflect those changes. Effectively, the UI is a visual reprensentation state
as retrieved from the data layer.

might mneed to merge two different data sources to present information that is relevant to the use. 
The UI layer is the pipeline that converts application data changes to a from that UI can present 
and then displays it.

UI Layer
UI elements
State holders
Data layer

Note: The recommendations and best practicce present in this page can be scale qualit robustness and 
make them easier to test. However, you should 

read, has an articles screen that read really,at any momment , the reader should be able to browse 
articles . In summary, the app lets users do the following.

The section use as a case study to introduce the principles of app for UI.

UI layer must perform th efollowing steps:

The rest of this guide demostrates how to implement a UI layer tht performs steps. I nparticular, 
this guide covers the following tasks and concepts:

definition of UI state

a list of articles along with , this information that presents is UI state

if the UI is what the user sees, th UI state is what the app says they should see. two sides:
UI is the visual representaion of the UI state.

UI is a result of binding UI elements on the screen with the UI state.

case study;  fully render the UI can be encapsulated in a NewUiState data class defined as follows:

data class NewUiState(
    val isSignedIn: Boolean = false,
    val isPremium: Boolean = false,
    val newsItems: List<NewsItemUiState> = listOf(),
    val userMessages: List<Message> = listOf()
)

Immutablity
free up the UI to focus on a single role: 
to read the state and update its UI elements accordingly

As a result, modify UI state in the UI diretly unless the UI itself id the sole source of its data. 
Violating this principle results in mu. leading to data inconsistencies and subtle bugs.

that flag would be competing with the data layer as the sosurce of the bookmarked status of an article.
Immutable data classes are very useful for preventing this kind of antipattern
Immutable data classes are very useful for preventing this kind of antipattern.

In this guide, UI states classes are named based on teh 
For example, the state of a screen displaying news might be called NewsUiState, and the stat of 
a news item in a list of new items might be a NewsItemUiState

data class NewsItemUiState(
    val title: String,
    val body: String,
    
)

an immutable snapshot of the details 
These interactions may benefit from a mediator to process them,
may be housed in the UI itself, but this cam quickly ge unwield as th UI .
because the resulting code is a tightly coupled amalgam with
no discernable boundaried.
Unidirecctional DataFlow, an architecture 
pattern that helps enforce this healthy separation of responsibility.

State holders come in a variety of sizes depending on the scope of the corresponding UI elements.

The technique works by conceptually regenerating the entire screen from scratch.
framework
cost intelligently choose which parts of the UI need to redrawn.
some implications for how you design your UI .

instantiating a tree of widgets. Youoften do this by inflating an ZML layout file. 
Each w. widgets are not exposed as objects. your composbale are 
responsible for transfroming the current application state.

Guide to app architecture.

@Composable
fun Greeting(names: List<String>) {
    for (name in names) {
        Text("Hello $name")
    }
}

The compose framework can intelligently recompose only the components that changed.

@Composable
fun clickcounter(clicks: Int, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("I've been clicked $clicks times")
    }
|
# What is flutter
Flutter widgets are built using modern framework that takes inspiration from React. 
UI out of widgets. Widgets describe what their view should look like given current configuration 
and state.When a widget's state changes, the widget rebuild its description, 
which the framework diffs against the previous description in order to determine the minimal 
changes needed in the underlying render tree to transition from one state to the next.

```
import 'package: flutter/material.dart';

void mian() {
    runapp(
        const Center(
            child: Text(
                'Hello, world!',textDirection: TextDirection.ltr,
            ),
        ),
    ),
);
```
# What is React
You will learn
. How to create and nest components
. How to add markup and styles
. How to display data
. How to render condition and lists
. How to respond to events and updat the screen
. How to share data between components

Creating and nesting components
React apps are made out of components. A component is a piece of the UI(user interface) that has its own logic and apperance. A component can be as a button, or as large as an entire page.

React components are JavaScript functions that return markup:
```
function MyButton() {
    return (
        <button>I'm a button</button>
        );
}
```

# How to use Git
At the heart of Github is an open-source version control system(VCS) called Git. Git is responsible
for everything Github-related
that happens locally on your computer

## Using Git
To use Git on the command line. 

Authenticating with Github from Git
$ echo "# Java" >> README.md
$ git init
Initialized empty Git repository in D:/ideaworkspace/untitled/src/.git/

$ git add README.md
$  git config --global user.email ""
$  git commit -m "first commit"
[master (root-commit) c5cb7f7] first commit
1 file changed, 1 insertion(+)
create mode 100644 README.md
$ git branch -M main
$ git remote add origin https://github.com/chenxuguo/Java.git
$ git push -u origin main
$ git status
$ git pull
$ git add
$ git rm
$ git restore <file>

after window732bit update win10 64bit .what I should do:
cd $HOME/src
git config --global --add safe.directory $HOME/src
git branch -M main
