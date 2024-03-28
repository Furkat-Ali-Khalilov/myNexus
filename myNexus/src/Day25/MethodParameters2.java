package Day25;

public class MethodParameters2 {
    public static void main(String[] args) {
        printNumbers(4);
    }

    // create a method
    // method will accept 1 int parameter
    // method should type all number from 0 to the parameter

    public static void printNumbers(int n){
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
