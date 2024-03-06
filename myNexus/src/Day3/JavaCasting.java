package Day3;

public class JavaCasting {
    public static void main(String[] args) {

        // byte < short < int < long < float < double

        byte byteNumber = 10;
        short shortNumber = byteNumber;
        int intNumber = shortNumber;
        long longNumber = intNumber;
        float floatNumber = longNumber;
        double doubleNumber = floatNumber;
        /// UP CASTING


        double doubleNumber2 = 10;
        float floatNumber2 = (float) doubleNumber2;
        long longNumber2 = (long)floatNumber2;
        int intNumber2 = (int)longNumber2;
        short shortNumber2= (short)intNumber2;
        byte byteNumber2= (byte)shortNumber2;
        /// DOWN CASTING


        int num = 100;
        System.out.println("num = " + num);

        double dbNum = num;
        System.out.println("dbNum = " + dbNum);

        double dbNum2 = 15.287;
        System.out.println("dbNum2 = " + dbNum2);

        int num2 = (int)dbNum2;
        System.out.println("num2 = " + num2);


    }
}
