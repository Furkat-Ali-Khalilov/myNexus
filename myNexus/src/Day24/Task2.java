package Day24;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[4][5];
        int[] resultArray = new int[array.length];
        Random random = new Random();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col <array[row].length; col++) {
                array[row][col] = random.nextInt(100);
                resultArray[row] += array[row][col];
            }
        }
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
    }
        System.out.println(Arrays.toString(resultArray));
    }
}
