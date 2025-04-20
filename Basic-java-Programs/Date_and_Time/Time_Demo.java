package Date_and_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Demo {
    public static void main(String[] args) {
        // other date is mutable nut this is immutable
        LocalDate d = LocalDate.now(); // date of now
        System.out.println(d);

        LocalTime t = LocalTime.now(); // time of now
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now(); // Date with Time
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy -- E a"); // it will format date in Month -- Day -- Year pattern
        String myDate = dt.format(dtf); // in this format
        System.out.println(myDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2 = dt.format(dtf2);
        System.out.println(myDate2);
    }
}
