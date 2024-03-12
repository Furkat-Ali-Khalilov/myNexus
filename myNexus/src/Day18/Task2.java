package Day18;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Using scanner, ask user to provide two numbers.
        // first number must be smaller than the second number
        // get sum of all numbers, divisible by four, between the numbers user provide

        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scan.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scan.nextInt();

        int total = 0;

        for (int number = firstNumber; number <= secondNumber; number++) {
            if(number%4==0){
                total+=number;
            }
        }

        System.out.println(total);

    }
}
