package Day17;

public class Practice1 {
    public static void main(String[] args) {

        // to print all even numbers from 0 to 100

        int number = 0;

        do{
            System.out.println(number);
            number+=2;
        }while(number<=100);

        // 1*2*3*4*5*9*...10

        int n = 1;
        int product = 1;

        do{
            product *= n;
            n++;
        }while(n <= 10);

        System.out.println("************ TOTAL RESULT ***********");
        System.out.println(product);

    }
}
