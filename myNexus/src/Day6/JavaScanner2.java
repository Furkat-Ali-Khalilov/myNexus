package Day6;

import java.util.Scanner;

public class JavaScanner2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        Double first =  scan.nextDouble();

        System.out.println("Please enter second number: ");
        Double second =  scan.nextDouble();

        System.out.println(first + " * " + second + " = " + (first*second));


    }
}
