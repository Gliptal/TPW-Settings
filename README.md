TPW Settings
======

This small program provides an easy-to-use and efficient graphical interface to configure the TPW MODS package. This collection was proven to be essential for a thorough enjoyement of [ArmA III](http://www.arma3.com/), thanks to the life it brings in what are otherwise barren and uninhabited islands.

What the program does is to simply act as a graphical version of `TPW_MODS.hpp` that [tpw](http://forums.bistudio.com/member.php?62814-tpw) himself has already set up to configure and fine-tune his mod package. Being coded in Java the Java Virtual Machine (JVM) is required: luckily most PCs and Laptops already have it installed by default.

Changelog
======

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

Install
======

[tpw](http://forums.bistudio.com/member.php?62814-tpw)'s download should already have embedded the latest `TPW SETTINGS.jar`, placed in the correct folder.

If for any reason you don't find the latest version there:
- Download it manually from [git](https://github.com/Gliptal/TPW-Settings) using the 'Download ZIP' button in the right pane
- Extract the `.jar` file from the `/executable` folder
- Place it alongside `TPW_MODS.hpp` in Arma's `userconfig/TPW_MODS/` folder.

The `.jar` works exactly like an `.exe`, hence you can make shortcuts or similar.

Usage
======

- MAIN WINDOW:
  - Shows the collection of all available TPW Mods
  - The colored semaphore to the left of every mod button acts as a quick reference to the state of the mod (green: enabled | red: disabled)
  - Clicking on the semaphore instantly toggles the state of the mod
  - Clicking on a mod button will open the relevant mod window
  - Each mod button has tooltips available on mouse hover, with a quick description of the mod itself

- MOD WINDOW
  - The mod can be activated or deactivated with the checkbox in the window's top left hand corner
  - Changes to every value can be easily made by either editing it directly or by selecting an appropriate one via checkboxes or comboboxes
  - Each parameter has tooltips available on mouse hover, with a description on what it does and/or what values are acceptable

- GENERAL
  - 'APPLY': saves any changes you made by writing them in the config file
  - 'REVERT': cancels any changes you made by reloading the values that were set just before the program was run

- PRESETS
  - 'SAVE': pick a name and save the current parameter values as a new preset
  - 'DELETE': permanently delete the selected preset

- COLOR CHOOSER
  - The sliders can be used to select the wanted color
  - In the top field the relative values are shown
  - Click on one of the buttons to copy the selected value in the relevant parameter

Limitations
======

- JVM is required. Most PCs come with it installed by default, and if you don't have it you should (unless you have valid reason not to).
- `TPW_MODS.hpp` must be in the same folder with `TPW Settings.jar` in order for the program to work.
- If you wish to simply rename a preset you must select it, delete it, and save it again with the new name.
- Presets are not backwards compatible: you can make them so by adding the right lines at the right places manually (just edit the .PRST files with a text editor).
- The only way to copy values from one field to another is using keyboard shortcuts (CTRL-C and CTRL-V), since the right mouse button dropdown menu isn't available in Java.
- Closing the HUD window using the top right hand corner 'X' will not automatically close the color chooser, unlike the 'BACK' button.
- TECHNICAL: If using cmd to run the program, it must be executed from the folder it resides in.

Next Steps
======

1. Icon chooser UI
2. HUD live preview
3. Inserted value check

Screens
======

- Main

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/Main.png)

- Presets

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/Presets.png)

- Civs

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/Civs.png)

- Hud

![](https://raw.githubusercontent.com/Gliptal/TPW-Settings/master/screens/Hud.png)

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

Links
======

- [TPW MODS @ BI Forums](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP)
- [tpw profile @ BI Forums](http://forums.bistudio.com/member.php?62814-tpw)
- [ArmA III official site](http://www.arma3.com/)

Credits
======

All credits for the TPW MODS package go to its author [tpw](http://forums.bistudio.com/member.php?62814-tpw). Special thanks go to Bohemia Interactive, that have proven to be one of, if not the best game studios around.

Thank you also to anyone that helped me in the BI Forums, be it a simple thanks or an helpful suggestion.
