package Day17;

public class Task2 {
    public static void main(String[] args) {
        String str = "Today is a wonderful day";

        // how many 'a' or 'd'

        int index = 0;
        int result = 0;
        do{
            if(str.charAt(index) == 'a' || str.charAt(index) == 'd') {
                result += 1;
            }
            index++;
        }while(index < str.length());

        System.out.println(result);

    }
}
