package Day10;

import java.util.Scanner;

public class Practice {

    /** Task1
     * Given an int ,
     *             if the age is less than or equal 10
     *                 print "too young to create a Facebook account"
     *              if the age is less than or equal 16
     *                 print "too young to get a driver's license"
     *              if the age is less than or equal 18
     *                 print "too young to get a tattoo"
     *             if the age is less than or equal 21
     *                 print "too young to drink alcohol"
     *             if the age bigger than 21
     *                 print "do whatever you want to do"
     */

    /**Task2
     * Given an int number. Check if the number is even or not
     *         if the number is even print true
     *         if the number is odd print false
     *         result should be true or false.
     */

    /**
     * Given an int  ,
     *             if the int is 1 print Monday
     *             if the int is 2 print Tuesday
     *             if the int is 3 print Wednesday
     *             if the int is 4 print Thursday
     *             if the int is 5 print Friday
     *             if the int is 6 print Saturday
     *             if the int is 7 print Sunday
     *             if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."
     */

    /**
       Given a string.
     if string is empty, print "String is empty"
     if String starts with A (lower or upper case), print "First character is A"
     if String ends with A (lower or upper case), print "Last character is A"
     if String contains any A (lower or upper case), print "String has A"
     all other condition, print "Invalid String."
     */

    public static void main(String[] args) {
        // AND OR

       // 1. condition
       // 2. condition

        // we USE AND when we want both conditions to be true. We use && to specify AND
        // we use OR when we want at least one condition to be true. We use || to specify OR

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");

        int number = scan.nextInt();

        if(number%2==0){
            System.out.println("number is Even");
        }

        if(number > 10){
            System.out.println("number is Greater than 10");
        }

        if(number%2==0 && number>10){
            System.out.println("number is even and greater than 10");
        }

        if(number%2==0 || number>10){
            System.out.println("number is either even or greater than 10");
        }


    }

}
