package com.syscho.dsa.binarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//https://leetcode.com/discuss/interview-question/313216/Binary-search-Interview-Questions
public class CountOccurence {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 8, 8, 8, 10, 10};
        int target = 8;

        countOccurenceBrute(nums, target);

        countOccurence(nums, target);

    }

    private static void countOccurenceBrute(int[] nums, int target) {

        int occurrences = 0;
        for (int n : nums) {
            if (n == target) {
                occurrences += 1;
            }
        }

        System.out.println("Number of occurrences of " + target + ": " + occurrences);
    }

    private static void countOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;


        while (low <= high) {

            //5, 7, 7, 8, 8, 8, 10,16}; //

            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                arr[1] = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }


        }

        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            //5, 7, 7, 8, 8, 8, 10,16}; //

            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                arr[0] = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }


        }
        int occurrences = arr[1] - arr[0] + 1;
        System.out.println("Number of occurrences of " + target + ": " + occurrences);
    }
}
