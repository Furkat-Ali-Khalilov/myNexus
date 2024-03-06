package Day7;

import java.util.Scanner;

public class SpandanaTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("provide any string");

        String str = scan.nextLine();

        int firstIndex = 1;
        int lastIndex = str.length()-1;

        String result = str.toUpperCase().charAt(0) + str.toLowerCase().substring(firstIndex, lastIndex) +
                str.toUpperCase().charAt(lastIndex);

        // 1. hello world => HELLO WORLD => H (tr.toUpperCase().charAt(0))
        // 2. hello world => hello world => ello worl
        // 3. hello world => HELLO WORLD => D

        System.out.println(result);






    }
}
