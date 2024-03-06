package Day12;

public class Example3 {
    public static void main(String[] args) {

        /** Task1
         * Given an int ,
         *             if the age is less than or equal 10
         *                 print "too young to create a Facebook account"
         *              if the age is less than or equal 16
         *                 print "too young to get a driver's license"
         *              if the age is less than or equal 18
         *                 print "too young to get a tattoo"
         *             if the age is less than or equal 21
         *                 print "too young to drink alcohol"
         *             if the age bigger than 21
         *                 print "do whatever you want to do"
         */

        int age = 25;

        String toPrint;

        toPrint = age<=10 ? "too young to create a Facebook account" :
                age<=16 ? "too young to get a driver's license" :
                age<= 18 ? "too young to get a tattoo" :
                age<=21? "too young to drink alcohol":
                        "do whatever you want to do";

        System.out.println(toPrint);

    }
}
