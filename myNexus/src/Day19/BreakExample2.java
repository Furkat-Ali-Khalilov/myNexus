package Day19;

public class BreakExample2 {
    public static void main(String[] args) {
        String str = "Java is a strong computer language";
        // print first 4 words from the sentence

        String result = "";
        int emptySpaceCount = 0; // we have to use a counter

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(letter == ' '){
                emptySpaceCount += 1;
            }

            if(emptySpaceCount == 4){
                break;
            }

            result += letter;

        }

        System.out.println(result);
    }
}
