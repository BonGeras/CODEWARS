package NumberOfTrailingZerosOfN;

public class NumberOfTrailingZerosOfN {
    public static int zeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }
        return res;
    }
}
