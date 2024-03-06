package Day13;

public class MathRandom {
    public static void main(String[] args) {
       // Math.random() important topic. returns random number between 0 and 1

        double random = Math.random();

        System.out.println(random);

        int randomNum = (int) (Math.random() * 10);
        System.out.println(randomNum);

        // random number between two specific numbers

        int randomNum2 = (int) (Math.random() * 9) + 1;
        System.out.println(randomNum2);

       // int formula = (int) (Math.random() * (maxNumber - MinNumber) ) + MinNumber;

        // 25 - 51

        int num3 = (int) (Math.random()*26)+25;
        System.out.println(num3);
    }
}
