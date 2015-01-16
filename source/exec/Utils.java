package exec;


public abstract class Utils
  {
  public static boolean stringToBoolean(String string)
    {
    return string.equals("1");
    }

  public static String booleanToString(boolean bool)
    {
    return bool ? "1" : "0";
    }

  public static int indexOfNth(String string, String searched, int occurence)
    {
    if (occurence <= 0)
      throw new IndexOutOfBoundsException();

    int position = -1;

    for (int i = 0; i < occurence; i += 1)
      {
      position = string.indexOf(searched, position+1);

      if (position == -1)
        return -1;
      }

    return position;
    }
  }