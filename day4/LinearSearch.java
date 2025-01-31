package day4;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12 ,-7, 3, 14, 28};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = search(arr, num);
        System.out.print(index);
    }
    static int search(int[] arr, int num){
        if( arr.length==0){
            return -1;
        }
        for (int i=0; i< arr.length; i++){
            if (num == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
