package Q5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        String result = today.format(format);
        System.out.println(result);
    }
}
