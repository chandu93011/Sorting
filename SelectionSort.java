import java.util.Scanner;

public class SelectionSort {    //first it takes the min index as the min value index and then compare with all the
    //reaming elements in the array if any elements is less than the min element then swap it.

  //  ............... 2 4 6 8 1
    //................1 4 6 8 2
    /// ...............
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int mn=i;
            for(int j=i+1;j<n;j++){
                if(arr[mn]>arr[j]){
                    mn=j;

                }
            }
            if(i !=mn){
                int temp=arr[i];
                arr[i]=arr[mn];
                arr[mn]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
