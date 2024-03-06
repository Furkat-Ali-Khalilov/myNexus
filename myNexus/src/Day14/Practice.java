package Day14;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter any string");
        String s = scan.nextLine();

        System.out.println("Enter any index between 0 and + " + (s.length()-1));
        int index = scan.nextInt();

        if(index < 0 || index > s.length()-1){
            System.out.println("You entered wrong number!!!!");
            System.exit(0);
        }


        System.out.println("character is : " + s.charAt(index));


    }
}
