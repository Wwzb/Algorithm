package com.zbin.stack;

import java.util.EmptyStackException;

/**
 * @author Zbin
 * @date 2021/11/10
 */
public class Stack<T> {

    private Node<T> top;

    public boolean empty() {
        return top == null;
    }

    public void push(T data) {
        top = new Node<>(data, top);
    }

    public T pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        Node<T> pop = top;
        top = top.next;
        pop.next = null;
        return pop.data;
    }

    public T peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void print() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> tmp = top;
        while (tmp != null) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append(tmp.data);
            tmp = tmp.next;
        }
        sb.append("]");
        System.out.println(sb);
    }

    private static class Node<T> {

        T data;

        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
