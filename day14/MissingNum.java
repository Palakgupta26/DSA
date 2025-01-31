package day14;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr ={1,4,2,3,7,6,0};
        System.out.println(missingNum(arr));
    }

    static int missingNum(int[] arr){
        int num = arr.length;
        sort(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i] != i){
                return i;
            }
        }
        return num;
    }
    static void sort(int[] arr){
        int i = 0;
        while (i<arr.length){
            if ( arr[i]< arr.length && arr[i] != i){
                swap(arr, i, arr[i]);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
