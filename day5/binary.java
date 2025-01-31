package day5;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        //int[] arr = {2, 4, 6, 8, 11, 12, 14, 20, 36, 48};
        int[] arr2 = {48, 48, 20, 14, 12, 12, 8, 6, 6, 2};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int order = Order(arr2);
        if (order ==1){
            System.out.println(AscBinarySearch(arr2,target));
        } else if (order ==2) {
            System.out.println(DesBinarySearch(arr2, target));
        } else if (order==0) {
            System.out.println(AscBinarySearch(arr2,target));
        }
        //System.out.println(BinarySearch(arr, target));
//        System.out.println(AscBinarySearch(arr,target));
//        System.out.println(DesBinarySearch(arr2,target));
    }

    static int Order(int[] arr){
        if (arr[0]<arr[arr.length-1]){
            return 1;
        } else if (arr[0]>arr[arr.length-1]) {
            return 2;
        }
        return 0;
    }

    static int AscBinarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start) /2;
            if (target< arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int DesBinarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if (target>arr[mid]){
                end=mid-1;
            } else if (target<arr[mid]) {
                start=mid+1;
            } else if (target==arr[mid]) {
                return mid;
            }
        }
        return -1;
    }

    static boolean BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target){
                end = mid - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
