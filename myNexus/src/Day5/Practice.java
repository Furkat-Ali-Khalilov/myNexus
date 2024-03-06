package Day5;

import java.util.Locale;

public class Practice {
    public static void main(String[] args) {

        // Given a string, which has at least 4 letter characters. Convert it to Camel Case.
        // gulnaz => Gulnaz.... GULNAZ => Gulnaz.... GUlnAZ => Gulnaz

        // Using ASCII table, write your name.

        // Task
        // Given a String. Tuesday, February 13, 2024;
        // Print only "February 13"

        // Tasks
        // 1. Create string "Java is FUN".
        // 2. Substring only FUN.
        // 3. Convert to lowercase.
        // 4. replace all 'u' chars to 'a' chars.


        // Task
        // Create a string which is "hello world"
        // 1. validate if string startsWith "Hello"
        // 2. validate if string ends with "ld";

        // Task
        // Create a string with your home address.
        // replace all non-numeric characters to *
        // 825 valley road wayne nj 07470
        // 825 ****** **** ***** ** 07470


        // Task
        // 1. Create a string which is "Hello, my name is <<put your name>>"
        // convert all characters in the string to lower case.
        // 2. convert all characters in the string to upper case
        // convert all characters to lowercase, but "Hello" and your name must be camel cased.
        // example output: Hello, my name is Ali

        String str = "HeLLo, my namE is alI";
        str = str.toLowerCase();
        str = str.toUpperCase();
        System.out.println("str = " + str);

        str = str.substring(0,1) + str.substring(1).toLowerCase();
        System.out.println("str = " + str);

        int index = str.lastIndexOf(" ");
        String beginning = str.substring(0,index);
        System.out.println("beginning = " + beginning);
        String ending = str.substring(index).trim();
        System.out.println("ending = " + ending);

        ending = ending.substring(0,1).toUpperCase()+ending.substring(1);

        System.out.println("beginning = " + beginning);
        System.out.println("ending = " + ending);


        System.out.println(beginning + " "+ ending);







    }
}
