package ISODateFormatef89c5aa;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ISO8601DateFormat {

    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println("Date to ISO8601");
        System.out.println( ISO8601DateFormat.convertDateToIso8601(date) );
        
        System.out.println("Calendar to ISO8601");
        System.out.println( convertCalendarTimeToIso8601() );
        
    }
    
    public static String convertDateToIso8601(Date date){
        var timeZone = TimeZone.getTimeZone("UTC");
        var dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        dateFormat.setTimeZone(timeZone);
        return dateFormat.format(date);
    }
    
    public static String convertCalendarTimeToIso8601(){
        //INPUT
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, Calendar.FEBRUARY, 16, 20, 11, 28);
        calendar.set(Calendar.MILLISECOND, 0);
        Date date = calendar.getTime();
        
        //CONVERSION
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        dateFormat.setTimeZone(TimeZone.getTimeZone("CET"));
        
        return dateFormat.format(date);
    }
    
}
