package fileio;

import java.io.*;
import mods.parameters.*;


public class ActionBuffer
  {
  public static final String CONFIG_FILE_NAME = "TPW_MODS.hpp";
  private static final String SEPARATOR = "//><";

  private static PrintWriter writer;
  private static BufferedReader reader;

  public static void writeWholeFile(String fileName)
    {
    openWriter(fileName);

    plainWrite(FileTemplate.HEADER);
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
    writeSection(FileTemplate.HUD, HudParameters.PARAMETERS);
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

  public static void readWholeFile(String fileName)
    {
    openReader(fileName);

    plainRead();
    plainRead();
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
    readSection(HudParameters.PARAMETERS);
    readSection(LosParameters.PARAMETERS);
    readSection(ParkParameters.PARAMETERS);
    readSection(RadioParameters.PARAMETERS);
    readSection(RainFxParameters.PARAMETERS);
    readSection(StreetlightsParameters.PARAMETERS);

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

  private static void writeSection(String[] lines, String[] parameters)
    {
    for (int i = 0; i < lines.length; i += 1)
      writeLine(lines[i]+parameters[i]+";");
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

  private static void readSection(String[] parameters)
    {
    String line;
    int parameterCounter = 0;

    do
      {
      line = readLine();

      int equalsChar = line.indexOf("=");
      int semicolonChar = line.lastIndexOf(";");

      if (equalsChar != -1 && semicolonChar != -1)
        {
        parameters[parameterCounter] = line.substring(equalsChar+2, semicolonChar);
        parameterCounter += 1;
        }
      }
    while (!line.equals(SEPARATOR));
    }

  private static void separateSections()
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
      return "ERR";
      }
    }
  }