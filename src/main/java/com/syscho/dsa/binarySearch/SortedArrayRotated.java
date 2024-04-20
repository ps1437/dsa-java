package com.syscho.dsa.binarySearch;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class SortedArrayRotated {
    public static void main(String[] args) {

        int nums[] = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(findMinRotation(nums));
    }

    private static int findMinRotation(int[] nums) {
        int N = nums.length;
        int low = 0, high = N - 1;

        while (low <= high) {
            // If the array is not rotated, return the first element
            if (nums[low] <= nums[high]) {
                return nums[low];
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % N;
            int prev = (mid + N - 1) % N;

            // Check if mid is the minimum element
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                //How many time array rorated instaed of sending value we can send index
                return nums[mid];
            } else if (nums[mid] >= nums[low]) {
                // If the left half is sorted, search in the right half
                low = mid + 1;
            } else if (nums[mid] <= nums[high]) {
                // If the right half is sorted, search in the left half
                high = mid - 1;
            }
        }
        return -1; // This line should not be reached in a valid rotated sorted array
    }
}
