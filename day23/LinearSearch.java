package day23;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={2,5,1,3,8,4};
        System.out.println(search(arr,0,4));
    }
    static int search(int[] arr, int i, int target){
        if(arr[i]==arr.length){
            return -1;
        }
        if (arr[i]==target){
            return i;
        }
        return search(arr,i+1,target);
        //return arr[i]==target || search(arr,i+1,target);         for boolean ans
    }
}
