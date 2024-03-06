package Day9;

public class elseif {
    public static void main(String[] args) {

        String str1 = "MAIN";
        String str2 = "Java is my main programming language";


        if(str2.contains(str1)){
            System.out.println("\""+str2+"\" contains value : \""+str1+"\"" );
        }else if(str2.contains(str1.toLowerCase())){
            System.out.println("\""+str2+"\" does contain value, but issue is with Lower Upper Case issue : \""+str1+"\"");
        }else {
            System.out.println("\""+str2+"\" does NOT contain value : \""+str1+"\"" );
        }




    }
}
