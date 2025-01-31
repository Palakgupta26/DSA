package day6;

import java.util.Scanner;

public class floor {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,10};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(FloorNum(arr, num));
    }
    static int FloorNum(int[] arr, int num){
        if (num< arr[0]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]<num){
                start = mid+1;
            } else if (arr[mid]>num) {
                end =mid-1;
            } else if (arr[mid]==num) {
                return arr[mid];
            }
        }
        return arr[end];
    }

}
