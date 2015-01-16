TPW Settings
======

This small utility provides a simple and efficient graphical interface to configure [TPW MODS](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP) for [ArmA III](http://www.arma3.com/). This collection has proven to be borderline essential for a thorough enjoyement of the game, owing to the life it brings to otherwise barren and uninhabited islands.

The utility acts as a graphical version of the package's `TPW_MODS.hpp` configuration file. Since it is coded in Java the Java Virtual Machine (JVM) is required: on most PCs and Laptops it should installed by default, in doubt a check for the latest version can be performed [here](https://www.java.com/en/download/installed.jsp).

- [Screens](https://github.com/Gliptal/TPW-Settings#screens)
- [Installation](https://github.com/Gliptal/TPW-Settings#installation)
- [Usage](https://github.com/Gliptal/TPW-Settings#usage)
- [Limitations](https://github.com/Gliptal/TPW-Settings#limitations)
- [Troubleshooting](https://github.com/Gliptal/TPW-Settings#troubleshooting)
- [Changelog](https://github.com/Gliptal/TPW-Settings#changelog)
- [Progress](https://github.com/Gliptal/TPW-Settings#progress)
- [Notes](https://github.com/Gliptal/TPW-Settings#notes)
- [Links](https://github.com/Gliptal/TPW-Settings#notes)
- [Credits](https://github.com/Gliptal/TPW-Settings#credits)

Screens
======

- Main

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/main.png)

- Presets

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/presets.png)

- Civs

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/civs.png)

- Hud

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/hud.png)

- Color Chooser

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/colorchooser.png)

- Icon Chooser

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/iconchooser.png)

Installation
======

This utility is already embedded in the [TPW MODS](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP) package, placed in the correct folder and ready to be used. In case of problems refer to this README's [Troubleshooting](https://github.com/Gliptal/TPW-Settings#troubleshooting) section or post in the [forum's thread](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP).

If you wish or need to separately download this utility:
- Manually download the repository from [git](https://github.com/Gliptal/TPW-Settings) using the 'Download ZIP' button in the right pane
- Extract `TPW SETTINGS.jar` file from the `/executable` folder
- Place it alongside `TPW_MODS.hpp` in Arma's `userconfig/TPW_MODS/` folder.

A `.jar` works exactly like an `.exe`, meaning shortcuts can be placed on the desktop if so desired.

Usage
======

- MAIN WINDOW:
  - The colored button to the left of every module button shows the state of the module (green: enabled | red: disabled)
    - Clicking on this button toggles the module between active and disabled
  - Clicking on a module button opens the relevant module window
    - Each module button shows a tooltip on mouse hover, providing a quick description of the module
  - 'APPLY' saves all changes and applies them to the configuration file
  - 'REVERT' reverts all changes to the moment before the utility was ran


- MODULE WINDOW
  - The module state can toggled using the checkbox in the window's top left hand corner
  - Parameters are modified by directly editing input areas, selecting an existing entry in a dropdown menu, or toggling a radio button
    - Each parameter shows a tooltip on mouse hover, providing a description of its purpose and acceptable values
  - 'APPLY' saves all changes and applies them to the configuration file
  - 'REVERT' reverts all changes to the moment before the utility was ran


- PRESETS
  - 'SAVE' saves the current configuration values for all modules, press ENTER to confirm after a name has been entered
  - 'DELETE' permanently deletes the currently selected preset


- COLOR CHOOSER
  - Opened by clicking on a color parameter's text area
  - The desired color can be selected either by using the sliders or by directly typing the values in the top field
  - 'APPLY': saves the set color


- ICON CHOOSER
  - Opened by clicking on the ICON TYPES parameter's text area
  - The checkboxes on the right select to which elements the icon will be applied to (more elements are selectable at once)
  - Clicking on an image on the left changes the icon for the selected elements
  - 'APPLY': saves the set icons

Limitations
======

- The Java Virtual Machine (JVM) is required.
- `TPW_MODS.hpp` and `TPW SETTINGS.jar` must be in the same folder.
- Presets are backwards compatible only when using the installer to update [TPW MODS](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP).
- The GUI may become unresponsive for a few moments after multiple fast subsequent clicks.
- Due to a bug that Java never fixed since 2001, the light blue border around the dropdowns cannot be removed.

Troubleshooting
======

- The GUI won't start!
  - Check that the Java Virtual Machine (JVM) is installed [here](https://www.java.com/en/download/installed.jsp).
  - Make sure `TPW_MODS.hpp` and `TPW SETTINGS.jar` are in the same folder.
  - Make sure `TPW_MODS.hpp` isn't corrupted.
  - Download [TPW MODS](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP) and manually replace `TPW_MODS.hpp`.


- I still have a problem!
  - Post in the [TPW MODS](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP) thread, send me a [PM](http://forums.bistudio.com/private.php?do=newpm&u=106115) on the BIS forums, or email me at affa[at]outlook[dot]it).

Changelog
======

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

Progress
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

16/01/14 | [2.0.0](https://github.com/Gliptal/TPW-Settings/tree/2.0.0) | complete overhaul

Notes
======

- Edited with [Sublime Text 3](http://www.sublimetext.com/3)
- Compiled with [Netbeans](https://netbeans.org/)
- Versioning follows [Semantic Versioning 2.0.0](http://semver.org/) guidelines
- Look and Feel is entirely custom, if interested contact me

Links
======

- [TPW MODS @ BI Forums](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP)
- [tpw profile @ BI Forums](http://forums.bistudio.com/member.php?62814-tpw)
- [ArmA III official site](http://www.arma3.com/)

Credits
======

Every credit for the TPW MODS package go to its author [tpw](http://forums.bistudio.com/member.php?62814-tpw). Credit for ArmA III go to Bohemia Interactive, one of the best game studios around.

Special thanks to anyone that helped me on the BI Forums, be it a simple thanks or an helpful suggestion.