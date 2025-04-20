package Date_and_Time;

import java.util.GregorianCalendar; // concrete sub class of the Calender abstract class
import java.util.TimeZone;

public class Gregory_Calender {
    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();

        System.out.println(gcal.isLeapYear(2020));

        // available ids
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
