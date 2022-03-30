package com.zbin.sort;

/**
 * @author Zbin
 * @date 2021/11/16
 */
public class MergeSort {

    /**
     * 拆分成小部分分别排序再合并
     * <p>
     * 平均复杂度：O(nlogn)
     * 最好情况：O(nlogn)
     * 最坏情况：O(nlogn)
     * 空间复杂度：O(n)
     * 稳定性：稳定
     */
    public static void sort(int[] arr) {
        doSort(arr, 0, arr.length - 1);
    }

    private static void doSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            doSort(arr, left, mid);
            doSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int i = left; // 左边数组开始
        int j = mid + 1; // 右边数组开始
        int k = 0; // 临时数组下标
        int length = right - left + 1; // 数组长度
        int[] tmp = new int[length]; // 新建临时数组
        while (i <= mid && j <= right) {// 循环比较两段数组,把小的拷贝到临时数组
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }
        while (i <= mid) {// 剩余的直接拷贝
            tmp[k++] = arr[i++];
        }
        while (j <= right) {// 剩余的直接拷贝
            tmp[k++] = arr[j++];
        }
        // 覆盖填充原数组
        System.arraycopy(tmp, 0, arr, left, length);
    }

}
