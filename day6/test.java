package day6;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target );
        ans[1] = search(nums, target);

        return ans;
    }

    static int search(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                return ans;
//                if (first) {
//                    end = mid - 1;
//                } else start = mid + 1;
            }
        }
        return ans;
    }
}
