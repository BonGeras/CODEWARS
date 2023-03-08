package DigitDigit;

import java.util.ArrayList;
import java.util.List;

public class SquareDigit {

    public int squareDigits(int n) {
        char[] chars = ("" + n).toCharArray();
        List<Integer> nums = new ArrayList<>();
        for (char a: chars) {
            int b = Integer.parseInt(String.valueOf(a));
            nums.add(b*b);
        }
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }
}

/*

SMART APPROACH
import java.util.stream.Collectors;

public class SquareDigit {

    public int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                                      .chars()
                                      .map(i -> Integer.parseInt(String.valueOf((char) i)))
                                      .map(i -> i * i)
                                      .mapToObj(String::valueOf)
                                      .collect(Collectors.joining("")));
    }

}
 */
