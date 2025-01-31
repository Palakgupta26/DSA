package day12;

import java.util.Arrays;

// worst case O(N*2)
// best case O(N*2)
// not stable sort and performs well on small list
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={4,3,1,2,5};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        for (int i=0; i<arr.length; i++){
            int max = 0;
            for (int j= 0; j<arr.length-i; j++){
                if (arr[j]>arr[max]){
                    max= j;
                }
            }
            int temp =arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[max];
            arr[max] =temp;
        }
        return arr;
    }
}
