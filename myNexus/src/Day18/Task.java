package Day18;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        // using scanner class, ask user to provide any string

        // count how many "a" and "o" letters this string has

        // use while loop

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any string");

        String str = scan.nextLine();

        str = str.toLowerCase();

        System.out.println("str = " + str);

        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'o'){
                total += 1;
            }
        }

        System.out.println("total = " + total);
    }
}
