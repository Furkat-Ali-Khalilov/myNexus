package Day25;

public class MethodReturnTypes {
    public static void main(String[] args) {
        MethodReturnTypes md = new MethodReturnTypes();
        int number = md.getNumber();
        System.out.println(number);

        int total = md.getTotal(100,360);
        System.out.println(total);

        String result = removeAllNumbers("32adadfa156523424321321123!@#!@#!@#!1SDqeqr r a fa fdfadsfa");
        System.out.println(result);
    }

    int getNumber(){
        return 65;
    }

    int getTotal(int n1, int n2){
        return n1+n2;
    }

    static String removeAllNumbers(String str){
        String result = str.replaceAll("[0-9]","");
        return result;
    }
}
