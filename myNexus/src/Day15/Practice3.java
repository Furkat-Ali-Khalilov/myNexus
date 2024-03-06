package Day15;

public class Practice3 {
    public static void main(String[] args) {

        String alphaNumericValues = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // Task: Create new password.
        // Rule: password must be 15 length
        // Hint: use random class to pick any character from alphaNumericValues;

        // how to get random number between 0 - 10;

        int length = 15; // 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
        String password = "";
        while(length>0){
            int randomIndex = (int)(Math.random()*alphaNumericValues.length());
            char randomCharacter = alphaNumericValues.charAt(randomIndex);
            password += randomCharacter;
            length--;
        }

        System.out.println(password);



    }
}
