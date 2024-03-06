package Day2;

public class JavaShort {
    public static void main(String[] args) {
        /*
        short	2 bytes	Stores whole numbers from -32,768 to 32,767
         */

        short a = 15;
        short b = 100;
        System.out.println("a+b = " + (a + b));

        short maximumValue = Short.MAX_VALUE;
        System.out.println("maximumValue = " + maximumValue);
        short minimumValue = Short.MIN_VALUE;
        System.out.println("minimumValue = " + minimumValue);
    }
}
