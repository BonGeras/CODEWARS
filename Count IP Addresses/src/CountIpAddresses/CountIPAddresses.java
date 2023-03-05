package CountIpAddresses;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        return ConvertToLong(end) - ConvertToLong(start);
    }

    public static long ConvertToLong(String s) {
        long res = 0;
        for (String num : s.split("[.]")) {
            res = res * 256 + Long.parseLong(num);
        }
        return res;
    }
}
