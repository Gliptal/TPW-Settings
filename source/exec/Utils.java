package exec;


public class Utils
  {
  public static boolean stringToBoolean(String string)
    {
    return string.equals("1") ? true : false;
    }

  public static String booleanToString(boolean bool)
    {
    return bool ? "1" : "0";
    }

  public static int ordinalIndexOf(String string, String searched, int ordinal)
    {
    int position = 0;

    for (int i = 0; i < ordinal; i += 1)
      {
      position = string.indexOf(searched, position+1);

      if (position == -1)
        return -1;
      }

    return string.indexOf(searched, position);
    }
  }