package Day15;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        // get total count of all even numbers between 0 and 100
        // 0+2+4+6+8+10....+100

        // print all numbers between 0 and 100, which are divisible by 5 or by 3
        // if statement to print (HINT)

        // Use Scanner to get any String.
        // Using while loop:
        // 1. print each character of the string with capital letters:
        // Example: Hello World => H E L L O  W O R L D
        // 2. print each character of the string reversed and with Capital Letters.
        // Example: Hello World => D L R O W   O L L E H

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any string");

        String str = scan.nextLine();

        int index = str.length() - 1;
        while(index >= 0){

            char ch = str.charAt(index);

            String chToString = String.valueOf(ch).toUpperCase();

            System.out.println(chToString);
            index--;
        }


    }
}
