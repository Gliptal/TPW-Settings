TPW Settings
======

This small program should provide an easy and efficient graphical interface to configure the TPW MODS package, that has proven essential for a thorough enjoyement of [ArmA III](http://www.arma3.com/).

Everything is coded in Java, and simply acts as a graphical version of `TPW_MODS.hpp` that tpw himself has already set up to configure his mod package.

Changelog
======

[1.0.0]
First working release

Usage
======

The main window shows the collection of all available TPW Mods. The colored column to the left of every button acts as a quick reference to the state of the mod (green: enabled | red: disabled). Clicking on a button will open the relevant mod page, where changes to every value can be easily made. **ENTER** must be pressed after every change or the value will not register: this rule applies only on text fields, checkboxes and dropdowns do not require an **ENTER** press.

Tooltips are available on mouse hover, describing the whole mod (in the main window) or the single parameter (in the relevant mod window).

Next Steps
======

1. Working 'REVERT' button
2. Working presets
3. HUD section
4. HUD live preview

Limitations
======

- `TPW_MODS.hpp` must be in the same folder with `TPW Settings.java` for the program to work.
- **ENTER** must be pressed every time a change is made in the text fields for it to register in the file. This is due to Java limitations, and will hopefully be addressed in the future.
- HUD is still not implemented: you will have to edit those values manually.

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

Links
======
- [TPW MODS @ BI Forums](http://forums.bistudio.com/showthread.php?164304-TPW-MODS-enhanced-realism-immersion-for-Arma-3-SP)
- [tpw profile @ BI Forums](http://forums.bistudio.com/member.php?62814-tpw)
- [ArmA III official site](http://www.arma3.com/)

Credits
======

All credits for the TPW MODS package go to its author [tpw](http://forums.bistudio.com/member.php?62814-tpw). Special thanks go to Bohemia Interactive, that have proven to be one of, if not the best game studios around.
