package Day9;

import java.util.Scanner;

public class Exmple2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter students name : ");
        String name = scan.nextLine();

        System.out.println("Enter students Grade");
        int grade = scan.nextInt();

        if(grade >= 60){
            System.out.println(name + " passed the exam");
        }

        if (grade < 60) {
            System.out.println(name + " failed the exam");
        }

    }
}
