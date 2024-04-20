package com.syscho.dsa.twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.List;

//Problem: Maximum Sum Subarray of Size K
public class MaxSubArrayOfSizeK {
    public static void main(String[] args) {
        int maxSum = maxSumSubArray();
        System.out.println(maxSum);

        int minSum = minSumSubArray();
        System.out.println(minSum);
    }

    private static int minSumSubArray() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int left = 0, right = 0;
        int length = nums.length;
        int minSum = 0;
        int sum = 0;

        List<Integer> maxSumSubarray = new ArrayList<>();


        while (right < length) {
            sum += nums[right];
            if (right - left + 1 == k) {
                if (sum < minSum) {
                    minSum = sum;
                    maxSumSubarray.clear();
                    for (int i = left; i <= right; i++) {
                        maxSumSubarray.add(nums[i]);
                    }
                }
                sum -= nums[left];
                left++;
            }
            right++;
        }
        System.out.println(maxSumSubarray);

        System.out.println("Mininum Sum " + minSum);

        return minSum;

    }

    private static int maxSumSubArray() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int left = 0, right = 0;
        int length = nums.length;
        int maxSum = 0;
        int sum = 0;

        // add SubArryAlo
        while (right < length) {
            sum += nums[right];
            if ((right - left + 1) == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[left];
                left++;
            }
            right++;
        }

/*
        List<Integer> maxSumSubarray = new ArrayList<>();


        while (right < length) {
            sum += nums[right];
            if (right - left + 1 == k) {
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumSubarray.clear();
                    for (int i = left; i <= right; i++) {
                        maxSumSubarray.add(nums[i]);
                    }
                }
                sum -= nums[left];
                left++;
            }
            right++;
        }


 */
        return maxSum;
    }
}
