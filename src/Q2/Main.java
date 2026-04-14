package Q2;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String fName;
        String lName;

        //get the input
        System.out.print("First Name: ");
        fName = myScanner.next();
        System.out.print("Last Name: ");
        lName = myScanner.next();

        String fullName = fName + " " + lName;

        //create window
        JFrame myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setTitle(fullName);
        myWindow.setVisible(true);
    }
}
