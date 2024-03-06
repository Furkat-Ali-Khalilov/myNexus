package Day6;

import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the expected value:");
        String expected = scan.nextLine();
        System.out.println("Expected value is " + expected);


        System.out.println("please enter the actual value:");
        String actual = scan.nextLine();
        System.out.println("Actual value is " + actual);

        System.out.println("=============================");
        boolean equals = expected.equalsIgnoreCase(actual);
        System.out.println("Actual value matches the expected value => " + equals );





    }
}
