package day10;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4},
                {5,6}
        };
        int target = 5;
        System.out.println(Arrays.toString(searchIn2dArr(arr,target)));
    }

    static int[] searchIn2dArr(int[][] arr, int target){
        int row = 0;
        int column = arr[0].length-1;
        while(row<arr.length && column>=0){
            if (target<arr[row][column]){
                column--;
            } else if (target>arr[row][column]) {
                row++;
            }
            else {
                return new int[]{row,column};
            }
        }
        return new int[]{-1,-1};
    }
}
