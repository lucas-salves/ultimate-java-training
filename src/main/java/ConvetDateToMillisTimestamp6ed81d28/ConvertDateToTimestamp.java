package ConvetDateToMillisTimestamp6ed81d28;

import java.util.Date;

public class ConvertDateToTimestamp {
    
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        
        System.out.println(date.toInstant().toEpochMilli());
    }
}
