package Day21;

import java.util.Arrays;

public class ForEachLoopInt {
    public static void main(String[] args) {

        double[] prices = {1.99, 2.99, 3.45, 2.48, 2.05, 0.99, 0.87, 0.65};

        for(double price : prices){
            System.out.println(price);
        }

        // because of inflation, increase each price by 18%

        System.out.println("========================");
        for(double price : prices){
            System.out.println(price * 1.18);
        }
    }
}
