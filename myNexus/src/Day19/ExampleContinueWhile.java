package Day19;

public class ExampleContinueWhile {
    public static void main(String[] args) {

        String str = "Java is a strong computer language";

        int index = 0;

        String result = "";
        String vowels = "";

        while(index < str.length()){
            char letter = str.charAt(index);
            index++;


            if(letter == 'a' || letter == 'o' || letter == 'e' || letter == 'i' || letter == 'u'){
                vowels += String.valueOf(letter);
                continue;
            }

            result += String.valueOf(letter);
        }

        System.out.println("vowels = " + vowels);
        System.out.println("result = " + result);



    }
}
