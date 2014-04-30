package fileio;

import exec.*;
import java.io.*;
import mods.*;
import mods.factories.*;

import static exec.userinterface.Files.*;


public class FileBuffer
  {
  private static PrintWriter writer;
  private static BufferedReader reader;

  public static String[] parseDirectoryFor(final String extension)
    {
    File directory = new File(".");

    return directory.list(new FilenameFilter()
                           {
                           public boolean accept(File directory, String name)
                             {
                             return name.endsWith(extension);
                             }
                           }
                         );
    }

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

  public static boolean readWholeFile(String fileName)
    {
    boolean readable = (new File(DIRECTORY+fileName)).canRead();

    if (readable)
      {
      openReader(fileName);

      plainRead();
      plainRead();
      for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
        readSection(Main.modFactories[i]);

      closeReader();
      }

    return readable;
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
      writeLine(lines[i]+modFactory.getValueFromParameter(i)+SEMICOLON);
    }

  private static void plainRead()
    {
    String line;

    do
      {
      line = readLine();
      }
    while (!line.equals(SEPARATOR));
    }

  private static void readSection(ModFactory modFactory)
    {
    String line;
    int parameter = 0;

    do
      {
      line = readLine();

      int equalsIndex = line.indexOf(EQUALS);
      int semicolonIndex = line.lastIndexOf(SEMICOLON);

      if (equalsIndex != -1 && semicolonIndex != -1)
        {
        modFactory.setValueToParameter(line.substring(equalsIndex+2, semicolonIndex), parameter);
        parameter += 1;
        }
      }
    while (!line.equals(SEPARATOR));
    }

  private static void separateSection()
    {
    writeLine(SEPARATOR);
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
      return ERROR;
      }
    }
  }