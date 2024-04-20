package com.syscho.dsa.binarySearch;

public class UpperLowerBound {
    public static void main(String[] args) {

        int arr[] = {3, 5, 8, 9, 15, 19};
        int x = 9;

        int index = findLowerBoundIndex(arr, x);
        System.out.println("The lower bound is the index: " + index);
        index = findUpperBoundIndex(arr, x);
        System.out.println("The upper bound is the index: " + index);


    }

    private static int findUpperBoundIndex(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                return i;
            }
        }

        return -1;
    }

    private static int findLowerBoundIndex(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                return i;
            }
        }

        return -1;


    }


}
