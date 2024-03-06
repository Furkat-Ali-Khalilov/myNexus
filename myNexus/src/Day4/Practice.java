package Day4;

public class Practice {
    public static void main(String[] args) {

       String str =  "United States of America"; //S->$, s->$, a->@
       System.out.println(str);

        System.out.println("\""+str.substring(7)+"\"");
        String xxx = str.replace("S", "$").replace("s", "$").replace("a", "@");

        System.out.println("replaced = " + xxx);

        System.out.println(str.replace(" ", "+"));

        System.out.println(str.replaceFirst(" ", "+"));

        System.out.println(str.indexOf(" bROOKLyn "));


        String str2 = "     trim trim trim trim   ";

        str2 = str2.trim();
        System.out.println("***"+str2+"***");

    }
}
