package Day24;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int [] arr = {5,3,1,6,-5,25,4,-1,7,0};

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
