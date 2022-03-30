package com.zbin.sort;

/**
 * @author Zbin
 * @date 2021/11/16
 */
public class InsertionSort {

    /**
     * 从前往后把小的往前插
     * <p>
     * 平均复杂度：O(n2)
     * 最好情况：O(n2)
     * 最坏情况：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     */
    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    SortUtil.swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

}
