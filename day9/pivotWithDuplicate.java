package day9;

public class pivotWithDuplicate {
    public static void main(String[] args) {
        int[] arr ={ 2,2,2,9,9,0,0};
        System.out.println(PivotWithDuplicate(arr));
    }
    static int PivotWithDuplicate(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid =start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // conditions to ignore duplicate elements
            if(arr[start]==arr[mid] && arr[mid]== arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                else {
                    start++;
                }
                if(arr[end-1]>arr[end]){
                    return end-1;
                }
                else{
                    end--;
                }
            }
            else if ((arr[start]==arr[mid] && arr[end]<arr[mid]) || arr[start]<arr[mid]){
                start=mid+1;

            }
            // answer lies on the left side of pivot
            else{ // end is less and start is greater
                end=mid-1;
            }
        }
        return -1;
    }
}
