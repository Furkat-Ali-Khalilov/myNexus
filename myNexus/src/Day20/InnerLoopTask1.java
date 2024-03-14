package Day20;

public class InnerLoopTask1 {
    public static void main(String[] args) {

    String str = "232165432165321657749800654040564";
    // print how many times each number repeats.

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            char outerLoopChar = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char innerLoopChar = str.charAt(j);
                if(outerLoopChar == innerLoopChar) {
                    counter++;
                }
            }

            System.out.println(outerLoopChar + " repeats " + counter + " times. ");

        }

    }
}
