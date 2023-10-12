public class Sel {
    public static void main(String[] args) {
        int arr[]={2,4,1,6,5};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if(i!=min){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
