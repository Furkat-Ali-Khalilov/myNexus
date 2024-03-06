package Day9;

import java.util.Scanner;

public class innerIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter students name : ");
        String name = scan.nextLine();

        System.out.println("Enter students Grade");
        int grade = scan.nextInt();

        if(grade >= 90){
            if(grade >= 98){
                System.out.println(name + " got A++ for his exam");
            }else if(grade >= 95){
                System.out.println(name + " got A+ for his exam");
            }
            else{
                System.out.println(name + " got A- for his exam");
            }
        }else if (grade >= 80) {
            if(grade >= 85){
                System.out.println(name + " got B+ for his exam");
            }else{
                System.out.println(name + " got B- for his exam");
            }
        }else if (grade >= 70) {
            if(grade >= 75){
                System.out.println(name + " got C+ for his exam");
            }else{
                System.out.println(name + " got C- for his exam");
            }
        }else if (grade >= 60) {
            if(grade >= 65){
                System.out.println(name + " got D+ for his exam");
            }else{
                System.out.println(name + " got D- for his exam");
            }
        }else {
            System.out.println(name + " FAILED THE EXAM");
        }
    }
}
