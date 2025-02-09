package day23;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(isSorted(arr,0));
    }

    static boolean isSorted(int[] arr,int n){
        if(n== arr.length-1){
            return true;
        }

        if(arr[n]<arr[n+1]){
            return isSorted(arr, n+1);
        }
        else return false;

        // return arr[n]<arr[n+1] && isSorted(arr,n+1);
    }
}
