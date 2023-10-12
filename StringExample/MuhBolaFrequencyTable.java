package StringExample;

import java.util.Scanner;

public class MuhBolaFrequencyTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int ct[]=new int[256];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ct[c]++;
        }
        for(int i=0;i<256;i++){
            if(ct[i]>0){
                System.out.println((char)i+" "+ct[i]);
            }
        }


    }

}
