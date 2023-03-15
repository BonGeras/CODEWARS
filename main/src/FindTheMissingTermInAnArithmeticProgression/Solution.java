package FindTheMissingTermInAnArithmeticProgression;

public class Solution
{
    public static int findMissing(int[] numbers)
    {
        int n = numbers.length;
        int d = (numbers[n-1] - numbers[0]) / n;
        for (int i = 0; i < n-1; i++) {
            if (numbers[i+1] - numbers[i] != d) return numbers[i] + d;
        }
        return numbers[n-1] - d;
    }
}

/*

SMART APPROACH
static int findMissing(int[] numbers) {
    return (numbers[0] + numbers[numbers.length - 1]) * (numbers.length + 1) / 2 - of(numbers).sum();
}
 */
