package com.zbin;

/**
 * @author Zbin
 * @date 2021/11/10
 */
public class Fibonacci {

    public static void solveByArray(int length) {
        if (length < 0 || length > 1000) {
            return;
        }
        if (length == 0) {
            System.out.println(0);
            return;
        }
        if (length == 1) {
            System.out.println(1);
            return;
        }
        int[] arr = new int[length];
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(0);
        System.out.println(1);
        for (int i = 2; i < length; i++) {
            int sum = arr[i - 1] + arr[i - 2];
            arr[i] = sum;
            System.out.println(sum);
        }
    }

    public static void solveByRecursive(int length) {
        if (length < 0 || length > 1000) {
            return;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(fib(i));
        }
    }

    private static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        solveByArray(15);
        solveByRecursive(15);
    }
}
