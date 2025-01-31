package day8;
// not for duplicates
public class RotationCount {
    public static void main(String[] args) {
        int[] arr={6,7,8,0,1,2,3,4,5};
        int ans = rotations(arr)+1;
        if (ans==0){
            System.out.println("No rotations");
        }
        System.out.println(ans);
    }
    static int rotations(int[] arr){
        int start =0;
        int end=arr.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]>arr[start]){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

}
