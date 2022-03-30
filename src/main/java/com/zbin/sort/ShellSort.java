package com.zbin.sort;

/**
 * @author Zbin
 * @date 2021/11/16
 */
public class ShellSort {

    /**
     * 平均复杂度：O(nlogn)~O(n2)
     * 最好情况：O(n1.3)
     * 最坏情况：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     */
    public static void sort(int[] arr) {
        int length = arr.length;
        int j;
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i++) {
                int tmp = arr[i];
                for (j = i; j >= gap && tmp < arr[j - gap]; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;
            }
        }
    }

}
