package Day24;

import Day23.JavaMethods23;

import java.util.Arrays;
import java.util.Random;

public class JavaMethods {
    public static void main(String[] args) {
//        print2();
//        task1();
//        task2();
//        task3();
//
//        JavaMethods jm = new JavaMethods();
//        jm.print();

        JavaMethods23 jm23 = new JavaMethods23();
        jm23.someMethod();

    }


    public void print(){
        System.out.println("Hello World");
        int number = 15;
        int number2 = 30;
        System.out.println(15*30);
    }

    public static void print2(){
        System.out.println("Static Method");
    }

    public static void task1(){
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

    public static void task2(){
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

    public static void task3(){

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