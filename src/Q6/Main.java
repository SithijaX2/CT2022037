package Q6;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //get inputs
        System.out.print("Window Height: ");
        int H = myScanner.nextInt();
        System.out.print("Window Width: ");
        int W = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Window Title: ");
        String title = myScanner.nextLine();

        //create window
        JFrame myWindow = new JFrame();
        myWindow.setSize(W,H);
        myWindow.setTitle(title);

        myWindow.setVisible(true);
    }
}
