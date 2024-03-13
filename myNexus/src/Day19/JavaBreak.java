package Day19;

public class JavaBreak {
    public static void main(String[] args) {

    String str = "Java is a strong computer language";
    // print only first word

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(letter == ' '){
                break;
            }

            result += letter;

        }

        System.out.println(result);

    }
}
