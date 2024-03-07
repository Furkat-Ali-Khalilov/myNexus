package Day16;

public class StringValueOf {
    public static void main(String[] args) {

        char c = 'c';
        String sc = String.valueOf(c);

        int n = 1;
        String sn = String.valueOf(n);

        double d = 15.5;
        String sd = String.valueOf(d);

        boolean b = false;
        String sb = String.valueOf(b);

        System.out.println("sc = " + sc);
        System.out.println("sn = " + sn);
        System.out.println("sd = " + sd);
        System.out.println("sb = " + sb);
    }
}
