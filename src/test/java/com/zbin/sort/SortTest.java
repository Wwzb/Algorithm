package com.zbin.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Zbin
 * @date 2021/11/16
 */
public class SortTest extends AbstractSortTest {

    @Test
    public void testBubbleSort() {
        int[] array = generateArray(20);
        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testSelectionSort() {
        int[] array = generateArray(20);
        SelectionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testInsertionSort() {
        int[] array = generateArray(20);
        InsertionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testMergeSort() {
        int[] array = generateArray(20);
        MergeSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testShellSort() {
        int[] array = generateArray(20);
        ShellSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testQuickSort(){
        int[] array = generateArray(20);
        QuickSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
