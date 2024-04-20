
package com.syscho.dsa.twoPointer_slidingWindow;

import java.awt.image.WritableRaster;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

///https://leetcode.com/problems/substring-with-concatenation-of-all-words/
class Solution {

    //  Input: s = "barfoothefoobarman", words = ["foo","bar"]

    // Output: [0,9]


    public static void main(String[] args) {

        String s = "barfoofoobarthefoobarman", words[] = {"bar", "foo", "the"};

        // List<Integer> result = findSubstring(s, words);
        //System.out.println(result);
        System.out.println(maxOperations());
    }

    //https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75
    static public int maxOperations() {
        int[] nums = {3, 5, 1, 5};
        int k = 2;
        int count = 0;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            int c = k - num;
            if (freq.containsKey(c) && freq.get(c) > 0) {
                count++;
                freq.put(c, freq.get(c) - 1);
            } else {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

        }
        return count;
    }

    public boolean closeStrings3(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char c : word1.toCharArray()) {
            arr1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            arr2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((arr1[i] == 0 && arr2[i] != 0) || (arr1[i] != 0 && arr2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (!Arrays.equals(arr1, arr2)) {
            return false;
        }

        return true;
    }

    public boolean closeStrings2(String word1, String word2) {
        // Arrays to track character frequencies and presence
        int[] word1_freq = new int[26];
        int[] word2_freq = new int[26];
        boolean[] word1_isPresent = new boolean[26];
        boolean[] word2_isPresent = new boolean[26];

        // Populate frequency and presence arrays for word1
        char[] charArray = word2.toCharArray();
        int i =0;
        for (char c : word1.toCharArray()) {
            word1_freq[c - 'a']++;
            word1_isPresent[c - 'a'] = true;
            word2_freq[charArray[i] - 'a']++;
            word2_isPresent[charArray[i] - 'a'] = true;
            i++;
        }


        // Check if sorted frequency arrays are equal (ignoring frequencies themselves)
        Arrays.sort(word1_freq);
        Arrays.sort(word2_freq);
        if (!Arrays.equals(word1_freq, word2_freq)) {
            return false; // Different character sets
        }

        // Check if presence arrays are equal (ignoring frequencies)
        return Arrays.equals(word1_isPresent, word2_isPresent); // Same cha
    }

    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) return false;

        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();

        // Count frequencies in word1
        for (char ch : word1.toCharArray()) {
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }

        // Count frequencies in word2
        for (char ch : word2.toCharArray()) {
            freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
        }

        // Compare character frequencies
        if (!freq1.keySet().equals(freq2.keySet())) {
            return false; // Character sets are different
        }

        // Compare frequencies
        HashMap<Integer, Integer> freqCount1 = new HashMap<>();
        HashMap<Integer, Integer> freqCount2 = new HashMap<>();

        for (int count : freq1.values()) {
            freqCount1.put(count, freqCount1.getOrDefault(count, 0) + 1);
        }

        for (int count : freq2.values()) {
            freqCount2.put(count, freqCount2.getOrDefault(count, 0) + 1);
        }

        return freqCount1.equals(freqCount2);

    }

    public static int maxOperationsSort(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    static public int maxOperations2() {
        int[] nums = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
        int k = 2;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k) {
                    nums[i] = Integer.MAX_VALUE;
                    nums[j] = Integer.MAX_VALUE;
                    count++;
                    break;
                }
            }

        }
        return count;

    }


    static List<Integer> findSubstring(String s, String[] words) {

        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return Collections.emptyList();
        }


        List<Integer> result = new ArrayList<>();

        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;

        if (s.length() < totalLength) return Collections.emptyList();


        int wordCount = words.length;

        Map<String, Integer> frequency = new HashMap<>();
        for (String str : words) {
            frequency.put(str, 0);
        }

        Set<String> wordFrequency = new HashSet<>();

        String newString = s;


        while (newString.length() >= totalLength) {
            String subString = newString.substring(0, wordLength);
            boolean contains = frequency.containsKey(subString);
            if (contains && !wordFrequency.contains(subString)) {
                wordFrequency.add(subString);
                newString = newString.substring(wordLength);
            } else {
                wordFrequency.clear();
                newString = newString.substring(wordLength);
            }
            if (wordFrequency.size() == wordCount) {
                int startingIndex = s.length() - newString.length() - totalLength;
                result.add(startingIndex);
                wordFrequency.clear();
            }

        }
        return result;
    }


}