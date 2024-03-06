package Day2;

public class JavaByte {
    public static void main(String[] args) {
/*
byte	1 byte	Stores whole numbers from -128 to 127

1. byte can store ONLY numbers.


 */

        byte a = -128;
        byte b = -126;
        byte c = (byte)(a+b);
        System.out.println("c = " + c);

        byte maximumValue = Byte.MAX_VALUE;
        System.out.println("maximumValue = " + maximumValue);

        byte minimumValue = Byte.MIN_VALUE;
        System.out.println("minimumValue = " + minimumValue);


    }
}
