package day25;

import java.util.Arrays;

public class BubbleUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (arr[c] > arr[c + 1]) {
                swap(arr, c, c + 1);
                sort(arr, r, c + 1);
            }
        } else {
            sort(arr, r - 1, 0);
        }
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
