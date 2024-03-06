package Day10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // create an email address.
        /*
        1. email address must have only 1 @ character.
        2. must have only lower case letters.
        3. must have at least 1 "." character
        4. the length of the email before @ sign must be at least 5 characters.
         */
        // afdada@adfadf@gmail.com

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email address");
        String email = scan.nextLine();

        boolean checkAtChar = email.contains("@");
        boolean onlyOneAtChar = email.replaceAll("[^@]","").length() == 1;
        boolean hasCapitalLetters = email.replaceAll("[^A-Z]","").length()>0;
        boolean hasDotChar = email.replaceAll("[^.]", "").length() >= 1;

        boolean lengthBeforeAtChar = false;

        if(checkAtChar) {
            lengthBeforeAtChar = email.substring(0, email.indexOf('@')).length() >= 5;
        }

        if(checkAtChar && onlyOneAtChar && !hasCapitalLetters && hasDotChar && lengthBeforeAtChar){
            System.out.println("You entered valid email address");
        }else {
            System.out.println("Email is not valid");
        }

    }
}
