package Day14;

public class loopBreaking {
    public static void main(String[] args) {

//        int number = 0;
//        while(number < 100) {
//            System.out.println(number);
//            number++;
//
//            if(number == 50){
//                break;
//            }
//        }


        String email = "furkat.khalilov@gmail.com";
        int ind = 0;

        while(ind < email.length()){
            if(email.charAt(ind) == '@'){
                break;
            }
            System.out.println(email.charAt(ind));
            ind++;
        }


    }
}
