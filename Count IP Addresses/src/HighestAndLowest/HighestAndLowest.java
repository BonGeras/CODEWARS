package HighestAndLowest;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] nums = numbers.split(" ");
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (String s : nums) {
            if ((Integer.parseInt(s)) > highest) highest = Integer.parseInt(s);
            if ((Integer.parseInt(s)) < lowest) lowest = Integer.parseInt(s);
        }
        return highest + " " + lowest;
    }
}
