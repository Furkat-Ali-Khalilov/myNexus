package Day25;

public class MethodParameters {
    public static void main(String[] args) {

//        printSum(15, 25);
//        Math.max(1, 2);

        printMaxNumber(15,8);
    }

    public static void printSum(int number1, int number2){
        int total = number1 + number2;
        System.out.println(total);
    }

    public static void printMaxNumber(int number1, int number2){
        if(number1 > number2){
            System.out.println(number1);
        }else if(number2>number1){
            System.out.println(number2);
        }else{
            System.out.println("numbers are equal");
        }
    }
}
