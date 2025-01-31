package day18;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr, int t, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == t) {
            return mid;
        } else if (arr[mid] < t) {
            return search(arr, t, mid + 1, e);
        } else {
            return search(arr, t, s, mid - 1);
        }
    }

}
