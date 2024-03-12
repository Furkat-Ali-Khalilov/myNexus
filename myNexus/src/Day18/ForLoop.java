package Day18;

public class ForLoop {
    public static void main(String[] args) {

        System.out.println("==============WHILE LOOP=================");
        int index = 0;
        while(index < 10){
            System.out.println(index);
            index++;
        }

        System.out.println("=============DO WHILE LOOP ====================");
        int ind = 0;
        do{
            System.out.println(ind);
            ind++;
        }while(ind<10);

        System.out.println("================FOR LOOP=================");
        for(int a =0; a < 10; a++){
            System.out.println(a);
        }


    }
}
