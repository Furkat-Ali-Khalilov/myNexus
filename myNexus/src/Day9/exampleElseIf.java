package Day9;

import java.util.Scanner;

public class exampleElseIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter students name : ");
        String name = scan.nextLine();

        System.out.println("Enter students Grade");
        int grade = scan.nextInt();

        if(grade >= 90){
            System.out.println(name + " got A for his exam");
        }else if (grade >= 80) {
            System.out.println(name + " got B for his exam");
        }else if (grade >= 70) {
            System.out.println(name + " got C for his exam");
        }else if (grade >= 60) {
            System.out.println(name + " got D for his exam");
        }else {
            System.out.println(name + " FAILED THE EXAM");
        }


    }
}
