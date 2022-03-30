package com.zbin.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Zbin
 * @date 2021/11/16
 */
public abstract class AbstractSortTest {

    protected static int[] generateArray(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    protected static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
