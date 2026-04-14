package Q7;

import javax.swing.*;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar myCalendar = new GregorianCalendar();

        int hour = myCalendar.get(GregorianCalendar.HOUR);
        int minute = myCalendar.get(GregorianCalendar.MINUTE);
        int second = myCalendar.get(GregorianCalendar.SECOND);

        int amPm = myCalendar.get(GregorianCalendar.AM_PM);
        String isAMOrPm = (amPm == GregorianCalendar.AM) ? "AM" : "PM";

        if(hour==0){
            hour = 12;
        }

        String time = hour + ":"+ minute + ":" + second+ " " + isAMOrPm;

        JFrame myWindow = new JFrame();
        myWindow.setSize(400,400);
        myWindow.setTitle(time);
        myWindow.setVisible(true);
    }
}
