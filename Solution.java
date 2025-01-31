class Solution {
    public static void main(String[] args) {
        int[] n ={1,3,5,6};
        System.out.println(searchInsert(n,7));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while(start<=end){
            int mid = start +(end-start)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid]< target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end+1;
    }
}