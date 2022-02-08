package JavaTimerSchedule93ee735b;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class JavaTimerSchedule {
    
    public static void main(String[] args) {
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task is on");
            }
        
        };
    
    t.schedule(tt, new Date());
        
    }
}
