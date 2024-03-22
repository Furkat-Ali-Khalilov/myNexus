package Day23;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] dbArray = {{1,2,3},{4,5,6},{8,9},{10}};

        System.out.println(Arrays.deepToString(dbArray));

        String[][] dbStringArr = { {"1233 E19 St", "Brooklyn", "NY", "11230"}, {"817 Valley Rd", "Wayne", "NJ", "07470"}};

        String [][] dbArr2 = new String[2][3];

        dbArr2[0][0] = "00";
        dbArr2[0][1] = "01";
        dbArr2[0][2] = "02";
        dbArr2[1][0] = "10";
        dbArr2[1][1] = "11";
        dbArr2[1][2] = "12";


        System.out.println(Arrays.deepToString(dbArr2));

        for (int row = 0; row < dbArr2.length; row++) {
            for (int col = 0; col < dbArr2[row].length; col++) {
                System.out.println(dbArr2[row][col]);
            }
        }


    }
}
