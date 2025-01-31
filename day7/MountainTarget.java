package day7;

public class MountainTarget {
    public static void main(String[] args) {

        int[] nums = {5, 1, 3};
        int target = 5;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int peak = peak(target, nums);
        int ans =-1;
        if (peak==-1){
            ans = ascSearch(target, nums, 0, nums.length-1);
        }
        ans = ascSearch(target, nums, 0, peak);
        if (ans == -1) {
            ans = ascSearch(target, nums, peak + 1, nums.length - 1);
        }
        return ans;
    }

    static int peak(int target, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid<end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid>start && nums[mid] < nums[mid - 1]) {
                return mid-1;
            }
            if (nums[mid]<nums[start]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    static int ascSearch(int target, int[] nums, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

