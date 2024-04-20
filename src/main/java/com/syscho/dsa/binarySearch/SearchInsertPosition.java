package com.syscho.dsa.binarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {

        int nums[] = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) {

        int n = nums.length; // size of the array
        int low = 0, high = n - 1;
        int ans = n; // if ans greater then nums[high] =>  n


        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (nums[mid] >= target) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
}
