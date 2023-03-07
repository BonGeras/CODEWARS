package SumOfPositive;

public class Positive {
    public static int sum(int[] arr){
        int sum = 0;
        if (arr.length == 0) return 0;
        for (int num : arr) {
            if (num > 0) sum+=num;
        }
        return sum;
    }
}


/*
SMART APPROACH
import java.util.Arrays;
public class Positive{
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}
 */