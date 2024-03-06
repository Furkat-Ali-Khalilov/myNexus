package Day10;

public class exampleException {

    public static void main(String[] args) {


        String str = "anyeadfaWEfaGFAARaedsfadfmail@gmail.com";
        str = str.substring(0, str.indexOf('@'));
        System.out.println("str = " + str);

    }
}
