package AgeInDays;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kata {
    public static String ageInDays(int year, int month, int day) {
        LocalDate birthdate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(birthdate, today);
        return "You are " + days + " days old";
    }
}

/*

SMART APPROACH
import java.time.*;

public class Kata {
  public static String ageInDays(final int y, final int m, int d) {
    return String.format("You are %d days old", LocalDate.now().toEpochDay() - LocalDate.of(y, m, d).toEpochDay());
  }
}
 */
