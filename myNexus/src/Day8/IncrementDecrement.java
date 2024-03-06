package Day8;

public class IncrementDecrement {
    public static void main(String[] args) {

        // INCREMENT
        int number = 5;
        number ++; // number += 1 OR number = number+1
        System.out.println("number = " + number);

        // DECREMENT
        int number2 = 10;
        number2--; // number -= 1 OR number = number-1
        System.out.println("number2 = " + number2);

        // PRE-INCREMENT
        // number += 1 OR number = number+1
        int number3 = 5;
        System.out.println("number3 = " + ++number3);

        // PRE-DECREMENT
        int number4 = 10;
        // number -= 1 OR number = number-1
        System.out.println("number4 = " + --number4);
    }
}
