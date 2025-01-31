package day6;

import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,26};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(CeilingNum(arr, num));
    }
    static int CeilingNum(int[] arr, int num){
        if (num > arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        int ans =0;
        while(start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid]<num){
               start = mid+1;
            } else if (arr[mid]>num) {
                end = mid-1;
            } else if (arr[mid]==num) {
                return arr[mid];
            }
        }
        return arr[start];
    }
}