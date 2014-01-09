freezejellybean
===============

just sample codes, nothing fancy very trivial


this repository is intented to show how i would generally layout the architecture of the app for android, i have included following points of consideration how ever exact scenario would result in some tweaks.
the Repo right now houses projects, lib, open sources, 3rd party libs, most/some project may be empty right now and are only projected to show intented role in project architecture.


following is a explanation of what project is included for what reasons
- actionbarsherlock 
==================== 
- is the open source code included from http://actionbarsherlock.com/ the intended reason is to support the action bar all the way down to 2.1 /2.2 or what ever lowest denominator is for providing the coverage.

- LibraryDump 
==================== 
 it is a stub project to house all the libs (common libs being used by more then one project) reason being that this way you can avoid multiple time adding same jar file to dex which eventually failt to package apk, very common example is compatability library, important thing to note is that inluding this library project in all requred project is not a circular dependency but a multiple one

- TheWorkBasic
==================== 
the intention of this project is to house styles/ color based values which esentialy represents skin of the app, doing so allows to easily replace with the project that can add a different skin / style charecter, for what ever reason, e.g we want a different skin for each vendor/ distribution channel etc.. this way it is much more manageble.

- UIComponents
==================== 
a stub to house all the custom UI controls which will enable to keep business logic seperate from the UI controls and the UI control in seperate projects just keep the code clean and manageable, that is how i would recomend doing it, how ever if the control is complex enough and not a trival single class a seperate project should be introduced, e.g if you are making your own mapview/ date picker/ calandar etc..

- freezejellybean
==================== 
a very trivial project that includes all above mentioned library references and is just a simple apk to parse some random generated json using json generator reffer to assets folder with in for json file.

the apk is in freezejellybean/dist folder
=========================================
