package day9;

public class splitArray {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int k = 2;
        System.out.println(SplitArray(arr, k));
    }
    static int SplitArray(int[] arr, int k){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start = Math.max(start,arr[i]);
            end = end + arr[i];
        }
        while (start<end){
            int mid = start+(end-start)/2;
            int sum=0;
            int piece=1;
            for(int i=0; i<arr.length; i++){
                if (sum+arr[i] >mid){
                    //create a new sub array
                    sum = arr[i];
                    piece++;
                }
                else{
                    sum= sum+arr[i];
                }
            }
            if (piece<=k){
                end =mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}
