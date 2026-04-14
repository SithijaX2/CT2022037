package Q4;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        String[] months ={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(day + " " + months[month] + " " + year);
    }
}
