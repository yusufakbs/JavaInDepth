package timeOperations;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeTest {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        //epoch time
        System.out.println("Time: " + time);

        Date date = new Date();
        System.out.println("Date : " + date);

        Locale locale = new Locale("tr","TR");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMMM/yy",locale);
        String dateString = formatter.format(date);
        System.out.println("Biçimli : " + dateString);


        Calendar calendar =  Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTime().getTime());
        String text = formatter.format(calendar.getTime());
        System.out.println(text);

    }
}
