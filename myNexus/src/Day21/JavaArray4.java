package Day21;

import java.util.Arrays;

public class JavaArray4 {
    public static void main(String[] args) {

        String str = "123454678932196321";

        int[] arr = new int[str.length()];

        for (int i = 0; i < arr.length; i++) {
            String character = String.valueOf(str.charAt(i));
            arr[i] = Integer.parseInt(character);
        }


        System.out.println(Arrays.toString(arr));

        // print only numbers, which are greater or equal 5;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 5){
                System.out.println(arr[i]);
            }
        }

        // get total of all numbers

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("================");
        System.out.println(total);


    }
}
