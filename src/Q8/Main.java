package Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your Text: ");
        String text = myScanner.nextLine();

        String text_1 ;
        String text_2 ;

        int text_length = text.length();
        int text_1_Length=-1;

        for (int i = 0; i < text.length(); i++) {
            char nowChar = text.charAt(i);
            if(nowChar == '!'){
                text_1_Length = i;
                break;
            }
        }
        if(text_1_Length==-1){
            System.out.println("Your text haven't a '!'.");
        }else {
            text_1 = text.substring(0,text_1_Length);
            text_2 = text.substring(text_1_Length+1, text_length);


            System.out.println(text_1 + "\n" + text_2);
        }



    }
}
