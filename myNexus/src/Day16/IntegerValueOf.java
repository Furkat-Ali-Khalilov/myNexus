package Day16;

public class IntegerValueOf {
    public static void main(String[] args) {

        String str1 = "25";
        String str2 = "45";


//        int n1 = Integer.valueOf(str1);
//        int n2 = Integer.valueOf(str2);

        int n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);

        System.out.println(n1 + n2);


        double d1 = Double.valueOf(str1);
        double d2 = Double.parseDouble(str2);

        System.out.println(d1+d2);


        float f1 = Float.valueOf(str1);
        float f2 = Float.parseFloat(str2);

        System.out.println(f1+f2);

    }
}
