package com.zbin.sort;

/**
 * @author Zbin
 * @date 2022/3/16
 */
public class QuickSort {

    /**
     * 左边比x小，右边比x大
     * <p>
     * 平均复杂度：O(nlogn)
     * 最好情况：O(nlogn)
     * 最坏情况：O(n2)
     * 空间复杂度：O(logn)
     * 稳定性：不稳定
     */
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            sort(arr, left, pivot - 1);
            sort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int l = left + 1;
        int r = right;
        while (l <= r) {
            while (l < right && arr[l] <= pivot) {
                l++;
            }
            while (r > left && arr[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            SortUtil.swap(arr, l, r);
        }
        SortUtil.swap(arr, left, r);
        return r;
    }
}
