package Day14;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter first string");
        String first = scan.nextLine();
        System.out.println("Enter second string");
        String second = scan.nextLine();

        if(first.contains(second)){
            System.out.println("First String includes second string");
        }else{
            System.out.println("First string doesnt include second string");
        }


    }
}
