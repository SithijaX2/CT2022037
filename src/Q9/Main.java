package Q9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);


        System.out.print("Enter your text: ");
        String text = newScanner.nextLine();

        int length = text.length();
        char f_Letter = text.charAt(0);
        char l_letter = text.charAt((length-1));

        System.out.println(length + "\n" + f_Letter + "\n" + l_letter);
    }
}
