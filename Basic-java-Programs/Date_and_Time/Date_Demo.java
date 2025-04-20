package Date_and_Time;

import java.util.Date;

public class Date_Demo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // give time passed (in milliseconds) from 1 Jan 1970
//        System.out.println("Seconds since 1 Jan 1970 : "+(System.currentTimeMillis())/(1000));
//        System.out.println("Minutes since 1 Jan 1970 : "+(System.currentTimeMillis())/(1000*60));
//        System.out.println("Hours since 1 Jan 1970 : "+(System.currentTimeMillis())/(1000*60*60));
//        System.out.println("Days since 1 Jan 1970: "+(System.currentTimeMillis())/(1000*60*60*24));
//        System.out.println("Years since 1 Jan 1970: "+(System.currentTimeMillis())/(1000L *60*60*24*365));

//        System.out.println(Long.MAX_VALUE); // return the possible value can long variable hold
//        System.out.println(Integer.MAX_VALUE);

        // Java have a Date Class

        Date d = new Date();
        System.out.println(d); // print date in a better format
        System.out.println(d.getTime()); // return time in milliseconds

        // Below methods are deprecated
        System.out.println(d.getDate()); // date from the todays date
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());

    }
}
