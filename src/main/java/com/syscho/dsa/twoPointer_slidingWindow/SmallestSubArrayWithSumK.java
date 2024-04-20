package com.syscho.dsa.twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.List;

//Smallest Subarray with Sum Greater Than or Equal to Target
public class SmallestSubArrayWithSumK {
    public static void main(String[] args) {

        int nums[] = {2, 3, 2, 2, 4, 3};
        //8 -> 6
        //6+4 -> 10 ->8-> 6
        //6+3 ->9 ->7

        int target = 7;
        int result = minSubarrayLengthWithSumK(nums, target);
        System.out.println(result);
        result = maxSubarrayLengthWithSumK(nums, target);
        System.out.println(result);


    }

    private static int maxSubarrayLengthWithSumK(int[] nums, int target) {
        int currentSum = 0;
        int n = nums.length;

        int left = 0, right = 0;
        int minLength = Integer.MIN_VALUE;
        while (right < n) {

            currentSum += nums[right];

            while (currentSum >= target) {
                minLength = Math.max(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
            right++;
        }

        return minLength == Integer.MIN_VALUE ? 0 : minLength;
    }

    private static int minSubarrayLengthWithSumK(int[] nums, int target) {

        List<Integer> smallestSubarray = new ArrayList<>();

        int currentSum = 0;
        int n = nums.length;

        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        while (right < n) {

            currentSum += nums[right];

            while (currentSum >= target) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    smallestSubarray.clear(); //clear the existing once
                    for (int i = left; i <= right; i++) { // add from left to right
                        smallestSubarray.add(nums[i]);
                    }
                }
                currentSum -= nums[left];
                left++;
            }
            right++;
        }

        System.out.println(smallestSubarray);
        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }


}
