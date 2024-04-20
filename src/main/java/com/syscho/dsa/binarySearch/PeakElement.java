package com.syscho.dsa.binarySearch;

//Peak Element in rotated array
//Max Element in a rotated array
//bitonic array maximum
//Mountain array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakElement {

    public static int peakElement(int[] arr, int size) {
        int low = 0; // Initialize the low pointer
        int high = size - 1; // Initialize the high pointer

        // Perform binary search
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate the middle index

            // Check if mid is not at the ends of the array
            if (mid > 0 && mid < size - 1) {
                // Check if the current element is greater than its neighbors
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid]; // Return the peak element
                } else if (arr[mid - 1] > arr[mid]) {
                    high = mid - 1; // Update the high pointer
                } else {
                    low = mid + 1; // Update the low pointer
                }
            }
            // When mid is at the start, no need to compare the left side (-1)
            else if (mid == 0) {
                if (arr[0] > arr[1]) {
                    return arr[0]; // Return the peak element
                }
                return arr[1];
            }
            // When mid is at the end, no need to compare the right side (-1)
            else if (mid == size - 1) {
                if (arr[size - 1] > arr[size - 2]) {
                    return arr[size - 1]; // Return the peak element
                }
                return arr[size - 2];
            }

        }

        return -1; // Peak element not found
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 8, 10, 1, 2, 3}; // OP = 10
        System.out.println(peakElement(arr, arr.length));
    }
}
