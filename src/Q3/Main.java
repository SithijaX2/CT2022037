package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String fName, mName, lName;

        //get inputs
        System.out.print("Enter First Name: ");
        fName = myScanner.next();

        System.out.print("Enter Middle Name: ");
        mName = myScanner.next();

        System.out.print("Enter Last Name: ");
        lName = myScanner.next();

        System.out.println(fName + " " + mName.charAt(0)+ "." + lName);
    }
}
