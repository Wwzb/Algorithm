package com.zbin.list;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/11/8
 */
public class ArrayListTest {

    @Test
    public void testGet() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.length());
        System.out.println(list.get(0));
        System.out.println(list.length());
        System.out.println(list.get(1));
    }

    @Test
    public void testAdd() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.add(9, 4);
        list.print();
    }

    @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        System.out.println(list.remove(3));
        list.print();
    }

    @Test
    public void testClear() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.clear();
        list.print();
    }

    @Test
    public void testSet() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.set(99, 3);
        list.print();
    }
}
