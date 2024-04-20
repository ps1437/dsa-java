package com.syscho.dsa.maths;

public class PrintAllDivisors {


    public static void main(String[] args) {
        printAllDivisorsBrute(125); //O(N)
        printAllDivisorsOptimized(125);
    }

    private static void printAllDivisorsOptimized(int n) {


        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
        System.out.println();
    }

    private static void printAllDivisorsBrute(int n) {
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.print(i + " ");
        System.out.println();
    }


}
