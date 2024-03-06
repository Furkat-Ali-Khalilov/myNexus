package Day14;

public class Example2 {
    public static void main(String[] args) {

        // Hello World!

        // print each letter separately
        // use while loop

//        String str = "Hello World. I am happy man!";
//
//        int index = 0;
//
//        while(index<str.length()){
//            System.out.println(str.charAt(index));
//            index++;
//        }

        // given a string, which is an email address.
        // example : spandana@gmail.com.
        // print all characters before @ sign.

        String email = "furkat.khalilov@gmail.com";
        int ind = 0;
        int indOfAt = email.indexOf('@');

        while(ind < indOfAt){
            System.out.println(email.charAt(ind));
            ind++;
        }

    }
}
