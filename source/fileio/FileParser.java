package fileio;

import java.io.*;

import exec.*;
import mods.*;
import mods.factories.*;
import static exec.Files.*;


public abstract class FileParser
  {
  private static class PresetFilter implements FilenameFilter
    {
    private String extension;

    private PresetFilter(String extension)
      {
      this.extension = extension;
      }

    public boolean accept(File directory, String name)
      {
      return name.endsWith(extension);
      }
    }

  private static PrintWriter    writer;
  private static BufferedReader reader;

  public static String[] getFilteredFiles(String extension)
    {
    File directory = new File(WORKING_DIRECTORY);
    String[] filteredFiles = directory.list(new PresetFilter(extension));

    return filteredFiles;
    }

  public static void writeFile(String fileName)
    {
    openWriter(fileName);

    plainWrite(FileTemplate.HEADER);
    separateSection();
    for (int i = 0; i < Mods.NUMBER_OF_MODS; i += 1)
      {
      writeSection(FileTemplate.FILE_SECTIONS[i], Main.modFactories[i]);
      separateSection();
      }

    closeWriter();
    }

  public static boolean readFile(String fileName)
    {
    boolean isReadable = (new File(WORKING_DIRECTORY+"/"+fileName)).canRead();

    if (isReadable)
      {
      openReader(fileName);

      plainRead();
      plainRead();
      for (int i = 0; i < Mods.NUMBER_OF_MODS; i += 1)
        readSection(Main.modFactories[i]);

      closeReader();
      }

    return isReadable;
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
    for (String line:lines)
      writeLine(line);
    }

  private static void writeSection(String[] lines, ModFactory modFactory)
    {
    for (int i = 0; i < lines.length; i += 1)
      {
      if (lineIsDefine(lines[i]))
        writeLine(lines[i]+modFactory.getValueFromParameter(i));
      else
        writeLine(lines[i]+modFactory.getValueFromParameter(i)+SEMICOLON);
      }
    }

  private static void plainRead()
    {
    String line;

    do
      line = readLine();
    while (!line.equals(SECTION_SEPARATOR));
    }

  private static void readSection(ModFactory modFactory)
    {
    String line;
    int parameter = 0;

    do
      {
      line = readLine();

      if (lineIsParameter(line))
        {
        int equalsIndex    = line.indexOf(EQUALS);
        int semicolonIndex = line.indexOf(SEMICOLON);
        String value = line.substring(equalsIndex+2, semicolonIndex);

        modFactory.setValueToParameter(value, parameter);
        parameter += 1;
        }
      else if (lineIsDefine(line))
        {
        int dotIndex  = line.indexOf('.');
        int lastDigit = line.indexOf(' ', dotIndex)  != -1 ? line.indexOf(' ', dotIndex)  :
                        line.indexOf('\t', dotIndex) != -1 ? line.indexOf('\t', dotIndex) :
                                                             line.length();
        String value = line.substring(dotIndex-1, lastDigit);

        modFactory.setValueToParameter(value, parameter);
        parameter += 1;
        }
      }
    while (!line.equals(SECTION_SEPARATOR));
    }

  private static void separateSection()
    {
    writeLine(SECTION_SEPARATOR);
    }

  private static void writeLine(String line)
    {
    writer.println(line);
    }

  private static String readLine()
    {
    String line = "";

    try
      {
      line = reader.readLine();
      }
    catch (IOException except) {}

    return line;
    }

  private static boolean lineIsParameter(String line)
    {
    boolean equalsExists    = (line.indexOf(EQUALS)    != -1);
    boolean semicolonExists = (line.indexOf(SEMICOLON) != -1);

    return equalsExists && semicolonExists;
    }

  private static boolean lineIsDefine(String line)
    {
    return line.startsWith("#define");
    }
  }