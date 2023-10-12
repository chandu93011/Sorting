package StringExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="Hey Hello";
        String s=str;
        String str1="Hey Hello";
        String str2=new String("Hey Hello");
        if(str==s){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
        if(str==str1){
            System.out.println("True");
        }else{
            System.out.println("false");
        }if(str1==str2){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    if(s.equals(str2)){
        System.out.println("equal");
    }else{
        System.out.println("not equal");
    }

    }
}
