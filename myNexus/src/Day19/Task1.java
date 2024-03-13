package Day19;

public class Task1 {
    public static void main(String[] args) {


        // print all numbers from 0 to 100.

        // skip all the number which are divisible by 3 and 5

        // stop code iteration when number is divisible by 19;

        for (int i = 0; i < 100; i++) {

            if(i%3==0 || i%5==0){
                continue;
            }

            if(i%19 == 0){
                break;
            }

            System.out.print(i + " ");
        }

    }
}
