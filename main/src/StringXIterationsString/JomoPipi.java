package StringXIterationsString;

public class JomoPipi{
    public static String stringFunc(String s, long x) {
        char[] sArr = s.toCharArray();
        int cycleLength = 0;

        for (int i = 0; i < x; i++) {
            sArr = scrambleCharacters(sArr);
            cycleLength++;
            if (new String(sArr).equals(s)) {
                return stringFunc(s, x % cycleLength);
            }
        }
        return new String(sArr);
    }

    private static char[] scrambleCharacters(char[] s) {
        char[] newS = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            newS[i] = i % 2 == 0 ? s[s.length - 1 - i / 2] : s[i / 2];
        }
        return newS;
    }
}
//THIS IS ALREADY THE SMARTEST SOLUTION ON DA BLOCK. HARD AS FUCK CREATED BY SOME ZADROT
