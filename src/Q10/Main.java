package Q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //get input from user
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your text: ");
        String text = myScanner.nextLine();

        //check is odd and operate
        int text_length = text.length();
        int middle = (text_length%2) + 1;

        if((text_length%2)==1){
            System.out.println(text.charAt(middle));
        }else {
            System.out.println("Your text is not a odd length text!");
        }
    }
}
