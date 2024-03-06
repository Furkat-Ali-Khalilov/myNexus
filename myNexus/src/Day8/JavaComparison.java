package Day8;

public class JavaComparison {
    public static void main(String[] args) {


        // ALWAYS RETURN BOOLEAN

        int num1 = 10;
        int num2 = 11;

        // Equals
        boolean comparison = num1 == num2;
        System.out.println("comparison = " + comparison);

        // DOES NOT EQUAL
        comparison = num1 != num2;
        System.out.println("comparison = " + comparison);

        // BIGGER THAN
        comparison = num1 > num2;
        System.out.println("comparison = " + comparison);

        // BIGGER THAN OR EQUALS
        comparison = num1 >= num2;
        System.out.println("comparison = " + comparison);


        // SMALLER THAN
        comparison = num1 < num2;
        System.out.println("comparison = " + comparison);

        // SMALLER THAN OR EQUALS
        comparison = num1 <= num2;
        System.out.println("comparison = " + comparison);

    }
}
