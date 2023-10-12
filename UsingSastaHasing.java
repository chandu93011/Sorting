import java.util.Arrays;

public class UsingSastaHasing {
    public static void main(String[] args) {
        //it works only for the numbers
        int arr[] = {2, 1, 23, 45, 67, 23, 45, 12, 9, 8, 7, 6,};

        int n = arr.length;
        Arrays.sort(arr);
        int ct[] = new int[150];
        for (int i = 0; i < n; i++) {
            int age=ct[i];
            ct[age]++;
        }
        for(int i=0;i<150;i++){
            if(ct[i]>0){
                for(int j=1;j<=ct[i];j++){
                    System.out.println(i);
                }
            }
        }

    }

}
