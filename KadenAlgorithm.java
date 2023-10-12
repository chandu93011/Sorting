import java.util.Scanner;

public class KadenAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int sum=0;

        int st=0, ed=-1, fst=-1;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

            if(sum>max) {
                max = sum;
                fst = st;
                ed = i;
            }
            if(sum<0){
                sum=0;
                st=i+1;
            }
        }
        System.out.println(max);
    }
}
