package Date_and_Time;

import java.util.Calendar;
import java.util.TimeZone;

public class Calander_Demo {
    public static void main(String[] args) {
        // Calender is an abstract class
        // we use an static method of that class for making instance
//        Calendar cal = Calendar.getInstance(); // it will create an Calander instance
//        System.out.println(cal.getCalendarType()); // type of the calander
//        System.out.println(cal.getTimeZone());
//
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore")); // can give any time zone
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getTimeZone().getID()); // id of the timezone

        System.out.println(cal.get(Calendar.DATE));// print date
        System.out.println(cal.get(Calendar.HOUR));// print date
        System.out.println(cal.get(Calendar.MINUTE));// print date
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));// print date
    }
}
