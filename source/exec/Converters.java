package exec;


public class Converters
  {
  public static boolean stringToBoolean(String string)
    {
    return string.equals("1") ? true : false;
    }

  public static String booleanToString(boolean bool)
    {
    return bool ? "1" : "0";
    }
  }