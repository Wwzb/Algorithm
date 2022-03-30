package com.zbin.stack;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/11/10
 */
public class StackTest {

    @Test
    public void test1(){
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.empty());
    }

    @Test
    public void test3(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.print();
    }

    @Test
    public void test2(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        stack.print();
    }
}
