package Day6;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {

        // Using scanner class, enter an input of any string.
        // 1. return the length of the string.
        // 2. return first and last character of the string.

        Scanner scan =  new Scanner(System.in);

        System.out.println("Hey Ali! Enter any string:");
        String str = scan.nextLine();

        int strLength = str.length();

        System.out.println("The length of the string is " + strLength );

        System.out.println("The first character is (with charAt) => " + str.charAt(0));
        System.out.println("The first character is (with substring) => " + str.substring(0,1));

        System.out.println("The last character is (with charAt) => " + str.charAt(0)+str.substring(strLength-1));
        System.out.println("The last character is (with charAt) => " + str.charAt(str.length()-1));

        System.out.println("The last character is (with substring) => " + str.substring(strLength-1));
        System.out.println("The last character is (with substring) => " + str.substring(str.length()-1));



    }
}
