package fileio;

import exec.*;
import java.io.*;
import mods.*;
import mods.factories.*;


public class ActionBuffer
  {
  public static final String CONFIG_FILE_NAME = "TPW_MODS.hpp";
  public static final String REVERT_FILE_NAME = "REVERT";
  public static final String PRESET_EXTENSION = ".PRST";

  private static PrintWriter writer;
  private static BufferedReader reader;

  public static void writeWholeFile(String fileName)
    {
    openWriter(fileName);

    plainWrite(FileTemplate.HEADER);
    separateSection();
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      writeSection(FileTemplate.MOD_SECTIONS[i], Main.modFactories[i]);
      separateSection();
      }

    closeWriter();
    }

  public static void readWholeFile(String fileName)
    {
    openReader(fileName);

    plainRead();
    plainRead();
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      readSection(Main.modFactories[i]);

    closeReader();
    }

  private static void openWriter(String fileName)
    {
    try
      {
      writer = new PrintWriter(fileName, "UTF-8");
      }
    catch (FileNotFoundException | UnsupportedEncodingException except) {}
    }

  private static void closeWriter()
    {
    writer.close();
    }

  private static void openReader(String fileName)
    {
    try
      {
      reader = new BufferedReader(new FileReader(fileName));
      }
    catch (FileNotFoundException except) {}
    }

  private static void closeReader()
    {
    try
      {
      reader.close();
      }
    catch (IOException except) {}
    }

  private static void plainWrite(String[] lines)
    {
    for (int i = 1; i < lines.length; i += 1)
      writeLine(lines[i]);
    }

  private static void writeSection(String[] lines, ModFactory modFactory)
    {
    for (int i = 0; i < lines.length; i += 1)
      writeLine(lines[i]+modFactory.getValueValue(i)+";");
    }

  private static void plainRead()
    {
    String line;

    do
      {
      line = readLine();
      }
    while (!line.equals(FileTemplate.SEPARATOR));
    }

  private static void readSection(ModFactory modFactory)
    {
    String line;
    int parameter = 0;

    do
      {
      line = readLine();

      int equalsChar = line.indexOf("=");
      int semicolonChar = line.lastIndexOf(";");

      if (equalsChar != -1 && semicolonChar != -1)
        {
        modFactory.setValueToParameter(line.substring(equalsChar+2, semicolonChar), parameter);
        parameter += 1;
        }
      }
    while (!line.equals(FileTemplate.SEPARATOR));
    }

  private static void separateSection()
    {
    writeLine(FileTemplate.SEPARATOR);
    }

  private static void writeLine(String line)
    {
    writer.println(line);
    }

  private static String readLine()
    {
    try
      {
      return reader.readLine();
      }
    catch (IOException except)
      {
      return FileTemplate.ERROR;
      }
    }
  }