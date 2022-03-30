package com.zbin.sort;

/**
 * @author Zbin
 * @date 2021/11/16
 */
public class SelectionSort {

    /**
     * 把最小的放到最前面
     * <p>
     * 平均复杂度：O(n2)
     * 最好情况：O(n2)
     * 最坏情况：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     */
    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                SortUtil.swap(arr, min, i);
            }
        }
    }
}
