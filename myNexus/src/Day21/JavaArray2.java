package Day21;

public class JavaArray2 {
    public static void main(String[] args) {

        String[] arr = {"str1","str2","str3","str4","str5","str6","str7","str8", "55member", "autoMem5" };

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // find any string that includes number 5
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("5")){
                System.out.println(arr[i]);
            }else{
                continue;
            }
        }

    }
}
