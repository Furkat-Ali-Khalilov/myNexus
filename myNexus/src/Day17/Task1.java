package Day17;

public class Task1 {
    public static void main(String[] args) {
        String str = "65321983232198433216";

        // How many times number 3 repeated?
        int index = 0;
        int result = 0;
        do{
            char ch = str.charAt(index);
            if(ch == '6'){
                result += 1;
            }

            index++;
        }while(index < str.length());

        System.out.println(result);

    }

}
