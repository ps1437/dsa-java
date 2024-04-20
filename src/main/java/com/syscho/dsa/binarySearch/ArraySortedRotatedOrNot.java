package com.syscho.dsa.binarySearch;

// A Java program to check if an array is sorted and rotated or not
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class ArraySortedRotatedOrNot {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(check(arr)); // true
    }

    private static boolean check(int[] nums) {
        int count = 0; // Initialize a counter to count the number of inversions

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Compare the current element with the next element in a circular manner
            // For example, when i reaches the last index, compare it with the first index [(i + 1) % nums.length])]
            if (nums[i] > nums[(i + 1) % nums.length]) { // If the current element is greater than the next element
                count++; // Increment the count of inversions
            }
            // If count exceeds 1, it means the array is not sorted and rotated, so we can return false immediately
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
