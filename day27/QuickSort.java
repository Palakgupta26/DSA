package day27;

import java.util.Arrays;

//worst case when pivot is smallest or largest
//best case when pivot is largest
//O(N^2)
//not stable, in space
// merge sort is better for link-list
public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={3,4,5,1,2,6,0};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low, int high){
        int start =low;
        int end = high;
        if(start>=end){
            return;
        }
        int mid = start+(end-start)/2;
        int pivot=arr[mid];
        while(start<end){
            while(arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        sort(arr,low,end);
        sort(arr,start,high);
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
