package com.zbin.list;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/11/9
 */
public class LinkedListTest {

    @Test
    public void test1(){
        LinkedList<Integer> list = new LinkedList<>();
        list.print();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }

    @Test
    public void test2(){
        LinkedList<Integer> list = new LinkedList<>();
        list.print();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
        list.add(9,4);
        list.print();
    }

    @Test
    public void test3(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
        list.print();
    }

    @Test
    public void test4(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
        list.remove(0);
        list.remove(0);
        list.print();
    }

    @Test
    public void test5(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
        list.clear();
        list.print();
    }
}
