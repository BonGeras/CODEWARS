package DigitDigit;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class SquareDigit {

    public int squareDigits(int n) {
        String numberString = Integer.toString(n);
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numberString.length() - 1; i++) {
            int val = Integer.parseInt(String.valueOf(numberString.charAt(i))) * Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }
        StringBuilder result = new StringBuilder();
        for (int a : nums) {
            String val = Integer.toString(a);
            result.append(val);
        }
        return Integer.parseInt(String.valueOf(result));
    }

}
