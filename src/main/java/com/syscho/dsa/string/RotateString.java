package com.syscho.dsa.string;

//https://leetcode.com/problems/rotate-string/
public class RotateString {
    static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String circularS = s + s;

        return circularS.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }

}
