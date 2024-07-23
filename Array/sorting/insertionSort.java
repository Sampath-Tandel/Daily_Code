package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={94,0,59,7,2,34,15,56,8,5,};
        int key;
        int j;

        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for (int i : arr) {
            System.out.println(i);
            
        }



    }
    
}
