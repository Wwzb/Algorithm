package com.zbin.sort;

/**
 * @author Zbin
 * @date 2021/11/16
 */
public class SortUtil {

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
