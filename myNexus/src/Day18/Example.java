package Day18;

public class Example {
    public static void main(String[] args) {

    // print all even numbers between 10 and 50

        for (int i = 10; i <= 50; i += 2) {
            System.out.println(i);
        }

    // print all odd numbers between 20 and 80

        for (int j = 21; j <= 80; j += 2) {
            System.out.println(j);
        }

    // print all even numbers from 0 to 50, print two numbers.
        // first is total of all odd numbers, second is total of all even numbers

        int totalOddNumbers = 0;
        int totalEvenNumbers = 0;

        for (int i = 0, j = 1 ; j <= 100 || i <= 100 ; i+=2, j+=2) {
            totalOddNumbers += j;
            totalEvenNumbers += i;

        }

        System.out.println(totalOddNumbers);
        System.out.println(totalEvenNumbers);

        //5050 / 2 = 2525

    }
}
