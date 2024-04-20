package com.syscho.dsa.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Binarysearch {

    int binarySearchFindTarget(int arr[], int n, int k) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == k) return mid;
            else if (arr[mid] < k) {
                low = mid + 1;

            } else {
                high = mid - 1;

            }
        }
        return -1;

    }


    int binarySearchFindTargetDescArray(int arr[], int n, int k) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == k) return mid;
            else if (arr[mid] > k) {
                low = mid + 1;

            } else {
                high = mid - 1;

            }
        }
        return -1;

    }

    @Test
    void testBinarysearch() {
        int arr[] = {11, 22, 33, 44, 55};
        Assertions.assertEquals(1, binarySearchFindTarget(arr, arr.length, 22));
        Assertions.assertEquals(-1, binarySearchFindTarget(arr, arr.length, 2));
    }

    @Test
    void testBinarysearchDesc() {
        int arr[] = {55, 44, 33, 22, 11, 10};
        Assertions.assertEquals(3, binarySearchFindTargetDescArray(arr, arr.length, 22));
        Assertions.assertEquals(-1, binarySearchFindTargetDescArray(arr, arr.length, 2));
    }
}