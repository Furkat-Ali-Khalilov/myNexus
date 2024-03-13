package Day19;

public class ExampleContinue {
    public static void main(String[] args) {

        String str = "Java is a strong computer language";

        // print only consonant letters
        String result = "";
        String vowels = "";

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);

            if(letter == 'a' || letter == 'o' || letter == 'e' || letter == 'i' || letter == 'u'){
                vowels += String.valueOf(letter);
                continue;
            }

            result += String.valueOf(letter);

        }

        System.out.println(vowels);
        System.out.println(result);


    }
}
