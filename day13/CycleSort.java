package day13;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr ={4,3,1,2,5};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }

    static int[] cycleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            while (arr[i] != i+1){
                swap (arr, i, arr[i]-1);
            }
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b]=temp;
    }
}
