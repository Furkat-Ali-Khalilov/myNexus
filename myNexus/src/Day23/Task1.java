package Day23;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        // create an int double array.
        // it must have 4 rows and 5 columns
        // using for loop, assign random number between 0 and 100 to each index

        int[][] dbArr = new int[4][5];

        System.out.println(Arrays.deepToString(dbArr));
        Random random = new Random();
        for (int row = 0; row < dbArr.length; row++) {
            for (int col = 0; col < dbArr[row].length; col++) {
                dbArr[row][col] = random.nextInt(100);
            }
        }

        System.out.println(Arrays.deepToString(dbArr));


        // 2. Get Grand Total of all numbers
        // 3. Create a new one dimensional array. and add total of each inner array as a value to one dimensional array.
        // Example: [[39, 95, 27, 67, 27], [74, 89, 93, 55, 97], [61, 62, 29, 5, 39], [95, 75, 30, 93, 81]]
        // New Array: [255, 408, 196, 374]
    }
}
