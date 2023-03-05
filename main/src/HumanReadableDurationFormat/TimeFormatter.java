package HumanReadableDurationFormat;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        int year = seconds / (365 * 24 * 60 * 60);
        int day = seconds / (24 * 60 * 60) % 365;
        int hour = seconds / (60 * 60) % 24;
        int minute = seconds / 60 % 60;
        int second = seconds % 60;

        List<String> timeList = new ArrayList<>();
        if (year > 0) timeList.add(year + (year == 1 ? " year" : " years"));
        if (day > 0) timeList.add(day + (day == 1 ? " day" : " days"));
        if (hour > 0) timeList.add(hour + (hour == 1 ? " hour" : " hours"));
        if (minute > 0) timeList.add(minute + (minute == 1 ? " minute" : " minutes"));
        if (second > 0) timeList.add(second + (second == 1 ? " second" : " seconds"));
        String result = timeList.get(0);
        for (int i = 1; i < timeList.size(); i++) {
            if (i == timeList.size() - 1) result += " and ";
            else result += ", ";
            result += timeList.get(i);
        }
        return result;
    }
}

//assertEquals("1 second", TimeFormatter.formatDuration(1));
//        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
//        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
//        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
//        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));