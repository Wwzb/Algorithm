package com.zbin.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Zbin
 * @date 2021/11/16
 */
public class SortTest2 extends AbstractSortTest {

    //====================BubbleSort======================

    /**
     * 两两交换，直到有序
     * 平均复杂度：O(n2)
     * 最好情况：O(n)
     * 最坏情况：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     */
    @Test
    public void testBubbleSort() {
        int[] array = generateArray(20);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] arr) {
    }

    //====================SelectionSort======================

    /**
     * 把最小的放到最前面
     * 平均复杂度：O(n2)
     * 最好情况：O(n2)
     * 最坏情况：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     */
    @Test
    public void testSelectionSort() {
        int[] array = generateArray(20);
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] arr) {
    }

    //====================InsertionSort======================

    /**
     * 从前往后把小的往前插
     * 平均复杂度：O(n2)
     * 最好情况：O(n2)
     * 最坏情况：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     */
    @Test
    public void testInsertionSort() {
        int[] array = generateArray(20);
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] arr) {
    }

    //====================MergeSort======================

    @Test
    public void testMergeSort() {
        int[] array = generateArray(20);
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] arr) {
    }

    private static void doMergeSort(int[] arr, int left, int right) {
    }

    private static void merge(int[] arr, int left, int mid, int right) {
    }

    //====================ShellSort======================

    /**
     * 平均复杂度：O(nlogn)~O(n2)
     * 最好情况：O(n1.3)
     * 最坏情况：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     */
    @Test
    public void testShellSort() {
        int[] array = generateArray(20);
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void shellSort(int[] arr) {
    }

    //====================QuickSort======================

    /**
     * 平均复杂度：O(nlogn)
     * 最好情况：O(nlogn)
     * 最坏情况：O(n2)
     * 空间复杂度：O(nlogn)
     * 稳定性：不稳定
     */
    @Test
    public void testQuickSort() {
        int[] array = generateArray(20);
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] arr) {

    }

    private static void doQuickSort(int[] arr, int left, int right) {

    }

    private static int partition(int[] arr, int left, int right) {
        return 0;
    }
}
