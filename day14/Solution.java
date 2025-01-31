package day14;

    public class Solution {
        public static void main(String[] args) {
            int days = 5;
            int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(shipWithinDays(weights, days));
        }

        static int shipWithinDays(int[] weights, int days) {
            int maxSum = max(weights);
            int minSum = min(weights);
            int weight = search(weights, days, maxSum, minSum);
            return weight;
        }

        static int search(int[] arr, int target, int max, int min) {
            while(min<max) {
                int sum = 0;
                int mid = min + (max - min) / 2;
                int count = 1;
                for (int i = 0; i < arr.length; i++) {
                    if (sum+arr[i]> mid){
                        count++;
                        sum = arr[i];
                    }
                    else{
                        sum = sum + arr[i];
                    }
                }
                if (count <= target) {
                    max = mid;
                } else {
                    min = mid + 1;
                }
            }
            return max;
        }

        static int max(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            return sum;
        }

        static int min(int[] arr) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

