TPW Settings
======

This small program provides an easy-to-use and efficient graphical interface to configure the TPW MODS package, that has proven essential for a thorough enjoyement of [ArmA III](http://www.arma3.com/).

It is coded in Java so the JVM is required (although most PCs and Laptops will already have it installed by default), and simply acts as a graphical version of `TPW_MODS.hpp` that [tpw](http://forums.bistudio.com/member.php?62814-tpw) himself has already set up to configure his mod package.

Changelog
======

[1.5.0]

- added checkboxes to HUD
- reordered GUI parameters for consistency, no changes in .hpp
- reduced HUD sections
- more descriptive parameter names
- added all unit of measurements to parameter names
- ERR value will be shown if `.hpp` or `.PRST` files are outdated
- corrected 'REVERT' buttomn bug

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

Usage
======

The main window shows the collection of all available TPW Mods. The colored column to the left of every button acts as a quick reference to the state of the mod (green: enabled | red: disabled). Clicking on a button will open the relevant mod page, where changes to every value can be easily made by either editing a value directly or by selecting an appropriate one via checkboxes or comboboxes.

- GENERAL
  - 'APPLY': saves any changes you made by writing them in the config file.
  - 'REVERT': cancels any changes you made by reloading the values that were set just before the program was run.

- PRESETS
  - 'SAVE': pick a name and save the current parameter values as a new preset
  - 'DELETE': permanently delete the selected preset

Tooltips are available on mouse hover, describing either an whole mod (in the main window) or a single parameter (in the relevant mod window).

Next Steps
======

1. HUD live preview
2. Inserted value check

Limitations
======

- Presets are not backwards compatible. You can make them so by adding the right lines at the right places manually (just edit the .PRST files with a text editor).
- `TPW_MODS.hpp` must be in the same folder with `TPW Settings.java` in order for the program to work.
- If you wish to rename a preset you must select it, delete it, and save it again with the new name.

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

05/05/14 | [1.4.0](https://github.com/Gliptal/TPW-Settings/tree/1.5.0) | added feautures, parameters reordering

Links
======
- [TPW MODS @ BI Forums](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP)
- [tpw profile @ BI Forums](http://forums.bistudio.com/member.php?62814-tpw)
- [ArmA III official site](http://www.arma3.com/)

Credits
======

All credits for the TPW MODS package go to its author [tpw](http://forums.bistudio.com/member.php?62814-tpw). Special thanks go to Bohemia Interactive, that have proven to be one of, if not the best game studios around.
