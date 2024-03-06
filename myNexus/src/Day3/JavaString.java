package Day3;

public class JavaString {
    public static void main(String[] args) {

        String str = "Hello World";

//        System.out.println("str = " + str);

        System.out.println(str.charAt(1));

        /*
        The charAt() method returns the character at the specified index in a string.
        The index of the first character is 0, the second character is 1, and so on.

        RULE: index must be within 0 and the length-1 of the string.
         */


        int length = str.length();
        System.out.println("length = " + length);

        /*
        The length() method returns the length of a specified string.
        Note: The length of an empty string is 0.
         */

        System.out.println(str.codePointAt(1));

        /*
        Returns the decimal code for each character
         */

        String str1 = "HELLO";
        String str2 = "hello";

        System.out.println(str1.compareTo(str2));

        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));




    }
}
