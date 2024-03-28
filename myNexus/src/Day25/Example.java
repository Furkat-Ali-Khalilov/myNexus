package Day25;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String str = "555 444 33 22";
        // ["555", "444", "33", "22"]

        String[] result = splitTheString(str);

        System.out.println(result[0]);
        System.out.println(result[3]);

    }

    public static String[] splitTheString(String s){
        String[] output = s.split(" ");
        return output;
    }
}
