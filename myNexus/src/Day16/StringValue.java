package Day16;

import java.util.Scanner;

public class StringValue {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Provide any number");

        int num = scan.nextInt();

        String str = String.valueOf(num);

        int index = 0;

        while(index < str.length()){
            System.out.println(str.charAt(index));
            index++;
        }





    }
}
