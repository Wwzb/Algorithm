package com.zbin.list;

/**
 * @author Zbin
 * @date 2021/11/9
 */
public class LinkedList<T> {

    private Node<T> head;

    private Node<T> tail;

    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<T> cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.data;
    }

    public void add(T data) {
        Node<T> tmp = tail;
        Node<T> newNode = new Node<>(tmp, data, null);
        tail = newNode;
        if (tmp == null) {
            head = newNode;
        } else {
            tmp.next = newNode;
        }
        size++;
    }

    public void add(T data, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == size) {
            add(data);
            return;
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        Node<T> prev = node.prev;
        Node<T> newNode = new Node<>(prev, data, node);
        node.prev = newNode;
        if (prev == null) {
            head = newNode;
        } else {
            prev.next = newNode;
        }
        size++;
    }

    public T remove() {
        T data = head.data;
        Node<T> r = head;
        head = head.next;
        r.data = null;
        r.next = null;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return data;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        T data = node.data;
        Node<T> next = node.next;
        Node<T> prev = node.prev;
        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            node.prev = null;
        }
        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }
        node.data = null;
        size--;
        return data;
    }

    public void clear() {
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            Node<T> tmp = node.next;
            node.next = null;
            node.data = null;
            node.prev = null;
            node = tmp;
        }
        head = tail = null;
        size = 0;
    }

    public void print() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> tmp = head;
        if (size > 0) {
            while (tmp != null) {
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(tmp.data);
                tmp = tmp.next;
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

    private static class Node<T> {

        T data;

        Node<T> next;

        Node<T> prev;

        public Node(Node<T> prev, T data, Node<T> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
