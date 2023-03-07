package PersistentBugger;

class Persist {
    public static int persistence(long n) {
        if (n < 10) return 0;
        int counter = 0;
        while (n >= 10) {
            int product = 1;
            for (char num : Long.toString(n).toCharArray()) {
                product *= Character.getNumericValue(num);
            }
            counter++;
            n = product;
        }
        return counter;
    }
}


/*
SMART APPROACH

class Persist {

public static int persistence(long n) {
    if (n < 10) {
        return 0;
    }
    return 1 + persistence(multiplyDigits(n));
}
    private static long multiplyDigits(long n) {
        if (n < 10) {
            return n;
        }
        return n % 10 * multiplyDigits(n / 10);
    }
}
 */