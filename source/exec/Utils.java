package exec;


public class Utils
  {
  public static boolean stringToBoolean(String intAsString)
    {
    return intAsString.equals("1") ? true : false;
    }

  public static String booleanToString(boolean bool)
    {
    return bool ? "1" : "0";
    }
  }