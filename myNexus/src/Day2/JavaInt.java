package Day2;

public class JavaInt {
    public static void main(String[] args) {

/*
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
 */

        int a = 100;
        int b = 50000;
        int c = b-a;

        System.out.println("b - a = " + (b + (-a)));

        System.out.println("b - a = " + c);


        int minimumValue = Integer.MIN_VALUE;
        System.out.println("minimumValue = " + minimumValue);
        int maximumValue = Integer.MAX_VALUE;
        System.out.println("minimumValue = " + minimumValue);



    }
}
