package CreatePhoneNumber;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int a: numbers) sb.append(Integer.toString(a));
        String unformatted = sb.toString();
        String formatted = String.format("(%s) %s-%s",
                unformatted.substring(0, 3),
                unformatted.substring(3, 6),
                unformatted.substring(6));
        return formatted;
    }
}


/*

SMART APPROACH
public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
  }
}
 */
