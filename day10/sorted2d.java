package day10;

import java.util.Arrays;

public class sorted2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        int target = 9;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        int r_start = 0;
        int r_end = arr.length - 1;
        int c_mid = col / 2;
        while (r_start < (r_end - 1)) {
            int mid = r_start + (r_end - r_start) / 2;
            if (arr[mid][c_mid] > target) {
                r_end = mid;
            } else if (arr[mid][c_mid] < target) {
                r_start = mid;
            } else {
                return new int[]{mid, c_mid};
            }
        }
        if (arr[r_start][c_mid] == target) {
            return new int[]{r_start, c_mid};
        }
        if (arr[r_start + 1][c_mid] == target) {
            return new int[]{r_start + 1, c_mid};
        }


        if (arr[r_start][c_mid] > target) {
            return binarySearch(arr, target, r_start, 0, c_mid);
        }
        if (arr[r_start][c_mid] < target && target <= arr[r_start][col - 1]) {
            return binarySearch(arr, target, r_start, c_mid + 1, col - 1);
        }
        if (arr[r_start + 1][c_mid] > target) {
            return binarySearch(arr, target, r_start + 1, 0, c_mid);
        } else if (arr[r_start + 1][c_mid] < target) {
            return binarySearch(arr, target, r_start + 1, c_mid + 1, col - 1);
        }
        return new int[]{-1, -1};
    }

    static int[] binarySearch(int[][] arr, int target, int row, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            } else if (arr[row][mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
