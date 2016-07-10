TPW SETTINGS
======

This small utility provides a simple and efficient graphical interface to configure [TPW MODS](https://forums.bistudio.com/topic/154944-tpw-mods-v20160604-enhanced-realism-and-immersion-for-arma-3-sp/) for [ArmA III](https://arma3.com/). This collection has proven to be borderline essential for a thorough enjoyement of the game, owing to the life it brings to otherwise barren and uninhabited islands.

The utility acts as a graphical version of the package's `TPW_MODS.hpp` configuration file. Since it is coded in Java the Java Virtual Machine (JVM) is required: on most PCs and Laptops it should be installed by default, in doubt a check for the latest version can be performed [here](https://www.java.com/en/download/installed.jsp).

- [Screenshots](https://github.com/Gliptal/TPW-Settings#screenshots)
- [Installation](https://github.com/Gliptal/TPW-Settings#installation)
- [Usage](https://github.com/Gliptal/TPW-Settings#usage)
- [Limitations](https://github.com/Gliptal/TPW-Settings#limitations)
- [Troubleshooting](https://github.com/Gliptal/TPW-Settings#troubleshooting)
- [Changelog](https://github.com/Gliptal/TPW-Settings#changelog)
- [Progress](https://github.com/Gliptal/TPW-Settings#progress)
- [Notes](https://github.com/Gliptal/TPW-Settings#notes)
- [Links](https://github.com/Gliptal/TPW-Settings#notes)
- [Credits](https://github.com/Gliptal/TPW-Settings#credits)
- [License](https://github.com/Gliptal/TPW-Settings#license)

SCREENSHOTS
======

- Main

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/Main.png)

- Presets

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/Presets.png)

- Civs

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/Civs.png)

- Hud

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/Hud.png)

- Color Chooser

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/ColorChooser.png)

- Icon Chooser

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/IconChooser.png)

INSTALLATION
======

- Download the repository from [github](https://github.com/Gliptal/TPW-Settings) by clicking on the green 'Clone or download' button and selecting 'Download ZIP'.
- Extract `TPW SETTINGS.jar` file from the `/executable` folder.
- Place it alongside `TPW_MODS.hpp` in Arma's `userconfig/TPW_MODS/` folder.


As of 24/05/16, this utility is not embedded in the [TPW MODS](https://forums.bistudio.com/topic/154944-tpw-mods-v20160604-enhanced-realism-and-immersion-for-arma-3-sp/) package anymore. In case of problems refer to the [Troubleshooting](https://github.com/Gliptal/TPW-Settings#troubleshooting) section or post in the [GUI forum's thread](https://forums.bistudio.com/topic/191410-tpw-settings-graphical-user-interface-to-edit-tpw-mods-hpp/).

As a `.jar` is the Java version of a Windows `.exe`, shortcuts can be created if so desired.

USAGE
======

- MAIN WINDOW:
  - Clicking on a module button opens the relevant module window
    - Each module button shows a tooltip on mouse hover, providing a quick description of the module
  - The colored button to the left of every module button shows the state of the module (green: enabled | red: disabled)
    - Clicking on this button toggles the module between being active and being disabled
  - 'APPLY' saves all changes and applies them to the configuration file
  - 'REVERT' reverts all changes made since the utility was ran


- MODULE WINDOW
  - The module state is toggled using the checkbox in the window's top left hand corner
  - Parameters are modified by directly editing input areas, selecting an existing entry in a dropdown menu, or toggling a radio button
    - Each parameter shows a tooltip on mouse hover, providing a description of its purpose and acceptable values
  - 'APPLY' saves all changes and applies them to the configuration file
  - 'REVERT' reverts all changes made since the utility was ran


- PRESETS
  - 'SAVE' saves the current configuration values for all modules
    - Press ENTER to confirm a newly entered name
  - 'DELETE' permanently deletes the currently selected preset


- COLOR CHOOSER
  - Opened by clicking on a color parameter's text area
  - The desired color can be selected either by using the sliders or by directly typing the values in the upper field
  - 'APPLY': saves the set color


- ICON CHOOSER
  - Opened by clicking on the ICON TYPES parameter's text area
  - The checkboxes on the right select to which elements the icon will be applied to (more than one element is selectable at once)
  - Clicking on an image on the left changes the icon for the selected elements
  - 'APPLY': saves the set icons

LIMITATIONS
======

- A working copy of the Java Virtual Machine (JVM) is required: on most PCs and Laptops it should be installed by default.
- `TPW_MODS.hpp` and `TPW SETTINGS.jar` must be in the same folder.
- Presets are not backwards compatible. To make older versions work with newer ones one must modify `TPW_MODS.hpp` with a text editor.
- The GUI may become unresponsive for a few moments after multiple quick subsequent clicks.
- Due to a bug that Java never bothered fixing (since 2001), the light blue border around the dropdowns cannot be removed.

TROUBLESHOOTING
======

Q: The GUI won't start!
A: [Check](https://www.java.com/en/download/installed.jsp) that the Java Virtual Machine (JVM) is installed.
A: Make sure `TPW_MODS.hpp` and `TPW SETTINGS.jar` are in the same folder.
A: Make sure `TPW_MODS.hpp` isn't corrupted.

Q: I still have a problem!
A: Post in the [TPW MODS](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP) thread, send me a [PM](http://forums.bistudio.com/private.php?do=newpm&u=106115) on the BIS forums, or email me at affa[at]outlook[dot]it).

CHANGELOG
======

[2.3.2]

- fixed parsing bug

[2.3.1]

- parameters matching CORE [1.25]

[2.3.0]

- added CROWD [1.00]

[2.2.4]

- parameters matching SKIRMISH [1.26]

[2.2.3]

- parameters matching SOAP [1.07]

[2.2.2]

- parameters matching RADIO [1.24]

[2.2.1]

- bug fix

[2.2.0]

- added PUDDLE [1.00]
- pointer cursor on all clickable elements

[2.1.4]

- parameters matching RADIO [1.24] SOAP [1.05]

[2.1.3]

- parameters matching SOAP [1.02]

[2.1.2]

- bug fix

[2.1.1]

- parameters matching SOAP [1.01]

[2.1.0]

- added SOAP [1.00]

[2.0.6]

- parameters matching HUD [1.54]

[2.0.5]

- updated executable

[2.0.4]

- bug fix

[2.0.3]

- parameters matching BLEEDOUT [1.16]

[2.0.2]

- git mess fix

[2.0.1]

- parameters matching RADIO [1.19]

[2.0.0]

- code refactoring
- added log file (`error.log`)
- complete GUI overhaul
- rewritten tooltips
- rewritten README
- added hints window
- changed taskbar icon

[1.11.10]

- parameters matching BLEEDOUT [1.15]

[1.11.9]

- fixed excessive digits rounding

[1.11.8]

- parameters matching ANIMATIONS [1.01]

[1.11.7] | UPDATE YOUR PRESETS

- added ANIMATIONS

[1.11.6] | UPDATE YOUR PRESETS

- parameters matching EBS [1.23]

[1.11.5]

- parameters matching SKIRMISH [1.11]
- tweaked SKIRMISH parameters positioning

[1.11.4] | UPDATE YOUR PRESETS

- parameters matching FALL [1.30]
- parameters matching SKIRMISH [1.08]

[1.11.3]

- parameters matching SKIRMISH [1.06]

[1.11.2] | UPDATE YOUR PRESETS

- parameters matching SKIRMISH [1.01]

[1.11.1] | UPDATE YOUR PRESETS

- parameters matching AIR [1.27]
- parameters matching HUD [1.30]

[1.11.0]

- added icon chooser for HUD

[1.10.0] | UPDATE YOUR PRESETS

- parameters matching AIR [1.26]
- parameters matching FALL [1.29]
- added unit of measurements to SKIRMISH
- tweaked sliders background color
- added ticks to color chooser sliders

[1.9.0] | UPDATE YOUR PRESETS

- added SKIRMISH [1.00]
- slightly tweaked the UI

[1.8.1]

- color chooser parsing bug fixed

[1.8.0] | UPDATE YOUR PRESETS

- parameters matching HUD [1.28]
- color chooser now opens when click-selecting a color parameter
- enlarged color chooser slider handles
- shortened tooltip pop up delay to 1 second
- lengthned tooltip duration to 20 seconds

[1.7.0] | UPDATE YOUR PRESETS

- parameters matching HUD [1.27]
- enabling and disabling mods through semaphores
- moved color chooser below HUD window
- added copy buttons to color chooser
- fixed HUD Colors section bug

[1.6.1] | UPDATE YOUR PRESETS

- parameters matching HUD [1.24]

[1.6.0]

- more descriptive HUD names
- added color chooser for HUD

[1.5.0]

- added checkboxes to HUD
- reordered GUI parameters for consistency, no changes in .hpp
- reduced HUD sections
- more descriptive parameter names
- added all unit of measurements to parameter names
- ERR value will be shown if `.hpp` or `.PRST` files are outdated
- corrected 'REVERT' button bug

[1.4.0]

- corrected CIVS display bug
- implemented HUD sections

[1.3.0] | UPDATE YOUR PRESETS

- parameters matching HUD [1.21]
- added version number
- added online README link
- tweaked presets section appearence
- corrected a rare saving bug

[1.2.1] | UPDATE YOUR PRESETS

- parameters matching HUD [1.19]

[1.2.0]

- working presets
- removed 'RENAME' button
- nicer grids in mod windows
- added HUD tooltips

[1.1.0]

- program now opens in the center of the screen
- **ENTER** key press is no longer required
- added HUD section
- working 'REVERT' button

[1.0.0]

- first working release

PROGRESS
======

07/04/14 | [0.1.0](https://github.com/Gliptal/TPW-Settings/tree/0.1.0) | first skeleton

08/04/14 | [0.2.0](https://github.com/Gliptal/TPW-Settings/tree/0.2.0) | expanded skeleton

12/04/14 | [0.3.0](https://github.com/Gliptal/TPW-Settings/tree/0.3.0) | 2/16 skeleton done

13/04/14 | [0.4.0](https://github.com/Gliptal/TPW-Settings/tree/0.4.0) | 4/16 skeleton done, expanded functionalities

14/04/14 | [0.5.0](https://github.com/Gliptal/TPW-Settings/tree/0.5.0) | 11/16 skeleton done, refactoring

16/04/14 | [0.6.0](https://github.com/Gliptal/TPW-Settings/tree/0.6.0) | 15/16 skeleton done, tooltips added

17/04/14 | [0.7.0](https://github.com/Gliptal/TPW-Settings/tree/0.7.0) | basic file I/O set up

17/04/14 | [0.7.1](https://github.com/Gliptal/TPW-Settings/tree/0.7.1) | fixed .gitignore

17/04/14 | [0.7.2](https://github.com/Gliptal/TPW-Settings/tree/0.7.2) | fixed README.md

20/04/14 | [1.0.0](https://github.com/Gliptal/TPW-Settings/tree/1.0.0) | first working release, refactoring

25/04/14 | [1.1.0](https://github.com/Gliptal/TPW-Settings/tree/1.1.0) | total reimplementation, added feautures

27/04/14 | [1.2.0](https://github.com/Gliptal/TPW-Settings/tree/1.2.0) | working presets

27/04/14 | [1.2.1](https://github.com/Gliptal/TPW-Settings/tree/1.2.1) | parameters matching HUD [1.19]

27/04/14 | [1.3.0](https://github.com/Gliptal/TPW-Settings/tree/1.3.0) | added feautures, parameters matching HUD [1.21]

05/05/14 | [1.4.0](https://github.com/Gliptal/TPW-Settings/tree/1.4.0) | added feautures, refactoring

05/05/14 | [1.5.0](https://github.com/Gliptal/TPW-Settings/tree/1.5.0) | added feautures, parameters reordering

08/05/14 | [1.6.0](https://github.com/Gliptal/TPW-Settings/tree/1.6.0) | added color chooser, README.md refactoring

17/05/14 | [1.6.1](https://github.com/Gliptal/TPW-Settings/tree/1.6.1) | parameters matching HUD [1.24]

20/05/14 | [1.7.0](https://github.com/Gliptal/TPW-Settings/tree/1.7.0) | added feautures, parameters matching HUD [1.27]

22/05/14 | [1.8.0](https://github.com/Gliptal/TPW-Settings/tree/1.8.0) | fixed color chooser, parameters matching HUD [1.28]

22/05/14 | [1.8.1](https://github.com/Gliptal/TPW-Settings/tree/1.8.1) | fixed color chooser bug

25/05/14 | [1.9.0](https://github.com/Gliptal/TPW-Settings/tree/1.9.0) | slight tweaks, added SKIRMISH [1.00]

27/05/14 | [1.10.0](https://github.com/Gliptal/TPW-Settings/tree/1.10.0) | complete refactoring, parameters matching AIR [1.26] FALL [1.29]

28/05/14 | [1.11.0](https://github.com/Gliptal/TPW-Settings/tree/1.11.0) | added icon chooser

29/05/14 | [1.11.1](https://github.com/Gliptal/TPW-Settings/tree/1.11.1) | parameters matching AIR [1.27] HUD [1.30]

01/06/14 | [1.11.2](https://github.com/Gliptal/TPW-Settings/tree/1.11.2) | parameters matching SKIRMISH [1.01]

15/06/14 | [1.11.3](https://github.com/Gliptal/TPW-Settings/tree/1.11.3) | parameters matching SKIRMISH [1.06]

23/06/14 | [1.11.4](https://github.com/Gliptal/TPW-Settings/tree/1.11.4) | parameters matching FALL [1.30] SKIRMISH [1.08]

30/06/14 | [1.11.5](https://github.com/Gliptal/TPW-Settings/tree/1.11.5) | parameters matching SKIRMISH [1.11]

13/08/14 | [1.11.6](https://github.com/Gliptal/TPW-Settings/tree/1.11.6) | parameters matching EBS [1.23]

23/08/14 | [1.11.7](https://github.com/Gliptal/TPW-Settings/tree/1.11.7) | added ANIMATIONS

30/08/14 | [1.11.8](https://github.com/Gliptal/TPW-Settings/tree/1.11.8) | parameters matching ANIMATIONS [1.01]

18/09/14 | [1.11.9](https://github.com/Gliptal/TPW-Settings/tree/1.11.9) | fixed excessive digits rounding

06/11/14 | [1.11.10](https://github.com/Gliptal/TPW-Settings/tree/1.11.10) | parameters matching BLEEDOUT [1.15]

16/01/15 | [2.0.0](https://github.com/Gliptal/TPW-Settings/tree/2.0.0) | complete overhaul

20/03/15 | [2.0.1](https://github.com/Gliptal/TPW-Settings/tree/2.0.1) | parameters matching RADIO [1.19]

20/03/15 | [2.0.2](https://github.com/Gliptal/TPW-Settings/tree/2.0.2) | git mess fix

07/04/15 | [2.0.3](https://github.com/Gliptal/TPW-Settings/tree/2.0.3) | parameters matching BLEEDOUT [1.16]

07/04/15 | [2.0.4](https://github.com/Gliptal/TPW-Settings/tree/2.0.4) | bug fix

07/04/15 | [2.0.5](https://github.com/Gliptal/TPW-Settings/tree/2.0.5) | updated executable

03/03/16 | [2.0.6](https://github.com/Gliptal/TPW-Settings/tree/2.0.6) | parameters matching BLEEDOUT [1.54]

15/05/16 | [2.1.0](https://github.com/Gliptal/TPW-Settings/tree/2.1.0) | added SOAP [1.00]

15/05/16 | [2.1.1](https://github.com/Gliptal/TPW-Settings/tree/2.1.1) | parameters matching SOAP [1.01]

16/05/16 | [2.1.2](https://github.com/Gliptal/TPW-Settings/tree/2.1.2) | bug fix

17/05/16 | [2.1.3](https://github.com/Gliptal/TPW-Settings/tree/2.1.3) | parameters matching SOAP [1.02]

07/06/16 | [2.1.4](https://github.com/Gliptal/TPW-Settings/tree/2.1.4) | parameters matching RADIO [1.24] SOAP [1.05]

09/06/16 | [2.2.0](https://github.com/Gliptal/TPW-Settings/tree/2.2.0) | added PUDDLE [1.00], added pointer cursor

13/06/16 | [2.2.1](https://github.com/Gliptal/TPW-Settings/tree/2.2.1) | bug fix

13/06/16 | [2.2.2](https://github.com/Gliptal/TPW-Settings/tree/2.2.2) | parameters matching RADIO [1.24]

14/06/16 | [2.2.3](https://github.com/Gliptal/TPW-Settings/tree/2.2.3) | parameters matching SOAP [1.07]

25/06/16 | [2.2.4](https://github.com/Gliptal/TPW-Settings/tree/2.2.4) | parameters matching SKIRMISH [1.26]

04/07/16 | [2.3.0](https://github.com/Gliptal/TPW-Settings/tree/2.3.0) | added CROWD [1.00]

08/07/16 | [2.3.1](https://github.com/Gliptal/TPW-Settings/tree/2.3.1) | parameters matching CORE [1.25]

10/07/16 | [2.3.2](https://github.com/Gliptal/TPW-Settings/tree/2.3.2) | fixed parsing bug

NOTES
======

- Coded with [Sublime Text 3](http://www.sublimetext.com/3)
- Compiled with [Netbeans](https://netbeans.org/)
- Versioning follows [Semantic Versioning 2.0.0](http://semver.org/) guidelines
- Look and Feel is entirely custom, if interested contact me

LINKS
======

- [TPW MODS @ BI Forums](https://forums.bistudio.com/topic/154944-tpw-mods-v20160604-enhanced-realism-and-immersion-for-arma-3-sp/)
- [TPW SETTINGS @ BI Forums](https://forums.bistudio.com/topic/191410-tpw-settings-graphical-user-interface-to-edit-tpw-mods-hpp/)
- [tpw's profile @ BI Forums](https://forums.bistudio.com/user/762937-tpw/)
- [gliptal's profile @ BI Forums](https://forums.bistudio.com/user/795587-gliptal/)
- [ArmA III official website](https://arma3.com/)

CREDITS
======

All credit for the TPW MODS package go to its author [tpw](https://forums.bistudio.com/user/762937-tpw/). All credit for ArmA III go to Bohemia Interactive.

Special thanks to all those who have given feedback.

LICENSE
======

[![license](https://i.creativecommons.org/l/by-sa/4.0/80x15.png)](http://creativecommons.org/licenses/by-sa/4.0/)

TPW SETTINGS by [Mattia Affabris](mailto:affa@outlook.it) is licensed under a [Creative Commons Attribution-ShareAlike 4.0 International License](http://creativecommons.org/licenses/by-sa/4.0/).


