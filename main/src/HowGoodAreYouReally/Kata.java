package HowGoodAreYouReally;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i : classPoints) sum+=i;
        return (yourPoints > (sum / classPoints.length)) ? true : false;
    }
}

/*

SMART APPROACH
class Kata {
    static boolean betterThanAverage(final int[] classPoints, final int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }
}
 */
