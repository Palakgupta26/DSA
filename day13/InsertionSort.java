package day13;
//stable, good for small N and when arr is partially sorted
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={4,3,1,2,5,-9};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] arr) {
        for(int i=0; i<arr.length-1;i++){
            for (int j=i+1; j>0; j--){
                if (arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else break;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
