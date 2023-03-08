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
