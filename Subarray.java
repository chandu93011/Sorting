import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

        }
        int mid=arr.length/2;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+ " ");
                }System.out.println();
            }
        }
    }
}
