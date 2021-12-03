package DateToMilliTimestamp6ed81d28;

import java.util.Date;

public class DateToMilliTimestamp {

    public static void main(String[] args) {
        //timestamp to date
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        //Date to timestamp
        System.out.println( date.toInstant().toEpochMilli() );
    }
    
}
