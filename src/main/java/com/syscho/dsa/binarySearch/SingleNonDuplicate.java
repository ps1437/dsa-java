package com.syscho.dsa.binarySearch;

// Find the single element in a sorted array where every other element appears exactly twice.
// Solution must run in O(log n) time and O(1) space.

public class SingleNonDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(findSingleNonDuplicate(arr));
    }

    private static int findSingleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        // Perform binary search
        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if mid is even
            boolean isEven = (high - mid) % 2 == 0;

            // If mid is even, compare mid with next element
            if (nums[mid] == nums[mid + 1]) {
                // If mid and next element are same,
                // the single element must be to the right of mid
                if (isEven) {
                    low = mid + 2;
                } else { // If mid is odd, the single element is to the left of mid
                    high = mid - 1;
                }
            }
            // If mid is odd, compare mid with previous element
            else if (nums[mid] == nums[mid - 1]) {
                // If mid and previous element are same,
                // the single element must be to the right of mid
                if (isEven) {
                    high = mid - 2;
                } else { // If mid is odd, the single element is to the left of mid
                    low = mid + 1;
                }
            }
            // If mid is not equal to either adjacent elements,
            // mid is the single element
            else {
                return nums[mid];
            }
        }
        // Return the single element
        return nums[low];
    }
}
