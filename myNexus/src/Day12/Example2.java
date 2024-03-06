package Day12;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        /**Task2
         * Given an int number. Check if the number is even or not
         *         if the number is even print true
         *         if the number is odd print false
         *         result should be true or false.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide the number");
        int number = scan.nextInt();

//        if(number%2==0){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        System.out.println( number%2 == 0 ? true : false);

        boolean toPrint = number%2 == 0 ? true : false;
        System.out.println(toPrint);
    }
}
