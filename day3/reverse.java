package day3;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 11, 12, 14, 20, 36, 48};
//        Scanner sc= new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        swap(arr,a,b);
//        System.out.println(Arrays.toString(arr));
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
//        reverseRange(arr,2,7);
//        System.out.println(Arrays.toString(arr));
    }
    static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void Reverse(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void reverseRange(int[] arr, int index1, int index2){
//        int start = index1;
//        int end = index2;
        while(index1<=index2){
            int temp= arr[index1];
            arr[index1] = arr[index2];
            arr[index2]=temp;
            index1++;
            index2--;
        }
    }
}
