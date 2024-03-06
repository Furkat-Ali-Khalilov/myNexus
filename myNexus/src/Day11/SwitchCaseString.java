package Day11;

import java.util.Scanner;

public class SwitchCaseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Month ot the year");
        String str = scan.nextLine();

        switch(str){
            case "December":
            case "January":
            case "February":
                System.out.println("It is winter time");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("It is Spring time");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("It is Summer time");
                break;
            case "September":
            case "October":
           case "November":
                System.out.println("It is Fall time");
                break;
            default:
                System.out.println("You didnt enter a month.");
        }
    }
}
