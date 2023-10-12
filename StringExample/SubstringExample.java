package StringExample;

public class SubstringExample {
    public static void main(String[] args) {
        String s="hello";
        String finalResult="";

        for(int i=0;i<3;i++){
            finalResult=finalResult+s.charAt(i);
        }
        finalResult=finalResult+"r";
        for (int i = 3; i < 5; i++) {
            finalResult=finalResult+s.charAt(i);
        }
        System.out.println(finalResult);

    }
}
