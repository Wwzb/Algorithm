package com.zbin.sort;

/**
 * @author Zbin
 * @date 2021/11/16
 */
public class BubbleSort{

    /**
     * 两两交换，直到有序
     * <p>
     * 平均复杂度：O(n2)
     * 最好情况：O(n)
     * 最坏情况：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     */
    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            boolean swaped = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    SortUtil.swap(arr, j, j + 1);
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
    }
}
