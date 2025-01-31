class Solution {
    public static void main(String[] args) {
        int[] n ={1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(n,target));
    }
    static int searchInsert(int[] num, int target) {
        int start = 0;
        int end = num.length;
        while(start<=end){
            int mid = start +(end-start)/2;
            if (num[mid] == target){
                return mid;
            }
            if (num[mid]< target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end+1;
    }
}