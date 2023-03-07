package TwoToOne;

import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String result = s1 + s2;
        return result.chars().distinct().sorted().mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());
    }
}
