package Day20;

public class InnerLoops {
    public static void main(String[] args) {

        String str = "Any new string, which has lots of letters. AAA BB CC";

        // print how many times each character repeats.


        for (int chars = 0; chars < str.length() ; chars++) {
            int counter = 0;

            for (int i = 0; i < str.length(); i++) {

                char character = str.charAt(i);
                if(character == str.charAt(chars)){
                    counter ++;
                }
            }
            System.out.println(str.charAt(chars) + " = " + counter + " times.");
        }









    }
}
