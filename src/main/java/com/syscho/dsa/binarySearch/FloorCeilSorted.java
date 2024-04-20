package com.syscho.dsa.binarySearch;

public class FloorCeilSorted {
    public static void main(String[] args) {

        int arr[] = {3, 4, 4, 7, 8, 10};
        int key = 8;

        findFloorAndCeilBrute(arr, key);
        findFloorAndCeil(arr, key);

    }

    private static void findFloorAndCeil(int[] arr, int key) {
        int floor = findFloor(arr, key);
        int ceil = findFCeil(arr, key);

        System.out.println("floor :" + floor + " Ceil:" + ceil);
    }

    private static int findFloor(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] <= key) {
                ans = arr[mid];
                //look for smaller index on the left
                low = mid + 1;
            } else {
                high = mid - 1; // look on the right
            }
        }

        return ans;

    }

    private static int findFCeil(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= key) {
                ans = arr[mid];
                //look for smaller index on the left

                high = mid - 1; // look on the right
            } else {
                low = mid + 1;
            }
        }

        return ans;

    }

    private static void findFloorAndCeilBrute(int[] arr, int key) {
        int floor = 0;
        int ceil = -1;

        for (int j : arr) {

            if (j == key || j < key) {
                floor = j;
            }

            if (j == key || j > key && ceil == -1) {
                ceil = j;
            }
        }

        System.out.println("floor :" + floor + " Ceil:" + ceil);
    }
}
