package exec;


public class Utils
  {
  public static boolean stringToBoolean(String stringInt)
    {
    return stringInt.equals("1") ? true : false;
    }

  public static String booleanToString(boolean bool)
    {
    return bool ? "1" : "0";
    }
  }