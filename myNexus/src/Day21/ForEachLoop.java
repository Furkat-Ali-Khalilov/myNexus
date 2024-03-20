package Day21;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] names = {"John", "Michael", "Jordan", "Michele", "Stephany", "Tom", "Smith"};

        int ind = 0;
        while(ind < names.length){
            System.out.print(names[ind] + " ");
            ind++;
        }

        System.out.println();

        int index = 0;
        do{
            System.out.print (names[index] + " ");
            index++;
        }while(index < names.length);

        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();

        for(String name: names){
            System.out.print(name + " ");
        }
    }
}
