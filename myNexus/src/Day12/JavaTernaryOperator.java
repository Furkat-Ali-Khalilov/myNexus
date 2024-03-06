package Day12;

public class JavaTernaryOperator {
    public static void main(String[] args) {

        int n1 = 15;
        int n2 = 10;


        String answer = n1 > n2 ? "n1 is bigger than n2" : "n2 is bigger than n1";
        System.out.println(answer);

        String answer2;

        if(n1>n2){
            answer2 = "n1 is bigger than n2";
        }else{
            answer2 = "n2 is bigger than n1";
        }

        System.out.println(answer2);



    }
}
