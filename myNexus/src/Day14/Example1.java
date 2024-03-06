package Day14;

public class Example1 {
    public static void main(String[] args) {


        System.out.println(Math.pow(2, 5));

        int pow = 5;
        int number = 2;
        int result = 1;

        while(pow > 0){
            result *= number;
            pow --;
        }

        System.out.println(result);

    }
}
