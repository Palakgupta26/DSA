package day11;
//stable sorting algo
//order is maintained for two or more values that are same

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 6, 9};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                return arr;
            }
        }
        return arr;
    }
}