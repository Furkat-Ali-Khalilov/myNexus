package Day24;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[][] dbArr=new int[4][5];
        int total=0;
        Random ran=new Random();
        for (int i = 0; i < dbArr.length ; i++) {
            for (int j = 0; j < dbArr[i].length; j++) {
                dbArr[i][j]=ran.nextInt(100);
                total+=dbArr[i][j];
            }

        }
        System.out.println(Arrays.deepToString(dbArr));
        System.out.println(total);


    }
}
