package CountOfPositivesSumOfNegatives;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) throws NullPointerException {
        if (input == null || input.length == 0) return new int[]{};
        int pos = 0, neg = 0;
        for (Integer num: input) {
            if (num == null) continue;
            if (num > 0) pos++;
            else neg+=num;
        }
        return new int[]{pos, neg};
    }
}
