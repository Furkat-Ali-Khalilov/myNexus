package Day20;

public class Task2 {
    public static void main(String[] args) {

        // create multiplication table
        // example
        // 1 * 1 = 1;
        // 1 * 2 = 2;
        // 1 * 3 = 3;

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }



    }
}
