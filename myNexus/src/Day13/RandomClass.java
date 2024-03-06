package Day13;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        Random random = new Random();

        int num = random.nextInt();
        System.out.println(num);

        double db = random.nextDouble();
        System.out.println("db = " + db);

        boolean b = random.nextBoolean();
        System.out.println("b = " + b);


        int num1 = random.nextInt(10);
        System.out.println("num1 = " + num1);

        // to have range between two numbers.
        // random.nextInt(max-min)+min
        // 51 - 25

        int num2 = random.nextInt(26)+25;
        System.out.println("num2 = " + num2);

    }
}
