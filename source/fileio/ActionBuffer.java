package fileio;

import java.io.*;
import mods.parameters.*;


public class ActionBuffer
  {
  private static final String FILE_NAME = "TPW_MODS.hpp";
  private static final String SEPARATOR = "//><";

  private static PrintWriter writer;
  private static BufferedReader reader;

  public static void writeWholeFile()
    {
    createWriter();

    writeNonParameters(FileTemplate.HEADER);
    separateSections();
    writeSection(FileTemplate.AIR, AirParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.ANIMALS, AnimalsParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.BLEEDOUT, BleedoutParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.BOATS, BoatsParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.CARS, CarsParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.CIVS, CivsParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.EBS, EbsParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.FALL, FallParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.FOG, FogParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.HOUSELIGHTS, HouselightsParameters.PARAMETERS);
    separateSections();
    writeNonParameters(FileTemplate.HUD);
    separateSections();
    writeSection(FileTemplate.LOS, LosParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.PARK, ParkParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.RADIO, RadioParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.RAIN_FX, RainFxParameters.PARAMETERS);
    separateSections();
    writeSection(FileTemplate.STREETLIGHTS, StreetlightsParameters.PARAMETERS);
    separateSections();

    closeWriter();
    }

  public static void readWholeFile()
    {
    createReader();

    readNonParameters();
    readSection(AirParameters.PARAMETERS);
    readSection(AnimalsParameters.PARAMETERS);
    readSection(BleedoutParameters.PARAMETERS);
    readSection(BoatsParameters.PARAMETERS);
    readSection(CarsParameters.PARAMETERS);
    readSection(CivsParameters.PARAMETERS);
    readSection(EbsParameters.PARAMETERS);
    readSection(FallParameters.PARAMETERS);
    readSection(FogParameters.PARAMETERS);
    readSection(HouselightsParameters.PARAMETERS);
    readNonParameters();
    readSection(LosParameters.PARAMETERS);
    readSection(ParkParameters.PARAMETERS);
    readSection(RadioParameters.PARAMETERS);
    readSection(RainFxParameters.PARAMETERS);
    readSection(StreetlightsParameters.PARAMETERS);

    closeReader();
    }

  protected static void writeNonParameters(String[] lines)
    {
    for (int i = 1; i < lines.length; i += 1)
      writeLine(lines[i]);
    }

  protected static void writeSection(String[] lines, String[] parameters)
    {
    for (int i = 0; i < lines.length; i += 1)
      writeLine(lines[i]+parameters[i]+";");
    }

  protected static void readNonParameters()
    {
    String line;

    do
      {
      line = readLine();
      }
    while (!line.equals(SEPARATOR));
    }

  protected static void readSection(String[] parameters)
    {
    String line;
    int parameterCounter = 0;

    do
      {
      line = readLine();

      int firstChar = line.indexOf("=")+2;
      int lastChar = line.indexOf(";");

      if (line.indexOf("=") != -1 && line.indexOf(";") != -1)
        {
        parameters[parameterCounter] = line.substring(firstChar, lastChar);
        parameterCounter += 1;
        }
      }
    while (!line.equals(SEPARATOR));
    }

  private static void createWriter()
    {
    try
      {
      writer = new PrintWriter(FILE_NAME, "UTF-8");
      }
    catch (FileNotFoundException | UnsupportedEncodingException except) {}
    }

  private static void closeWriter()
    {
    writer.close();
    }

  private static void createReader()
    {
    try
      {
      reader = new BufferedReader(new FileReader(FILE_NAME));
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
      return "0";
      }
    }

  private static void separateSections()
    {
    writer.println(SEPARATOR);
    }
  }