package com.zbin.cache;

import java.util.HashMap;

/**
 * @author Zbin
 * @date 2021/12/2
 */
public class LRUCache {

    private final LinkedList cache;
    private final HashMap<Integer, Node> map;
    private final int capcity;

    public LRUCache(int capcity) {
        this.capcity = capcity;
        this.cache = new LinkedList();
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        makeRecently(key);
        return map.get(key).val;
    }

    public void set(int key, int val) {
        if (map.containsKey(key)) {
            deleteKey(key);
            addRecently(key, val);
            return;
        }
        if (map.size() == capcity) {
            removeRecently();
        }
        addRecently(key, val);
    }

    private void makeRecently(int key) {
        Node node = map.get(key);
        cache.remove(node);
        cache.addLast(node);
    }

    private void addRecently(int key, int val) {
        Node node = new Node(key, val);
        cache.addLast(node);
        map.put(key, node);
    }

    private void deleteKey(int key) {
        Node node = map.get(key);
        cache.remove(node);
        map.remove(key);
    }

    private void removeRecently() {
        Node node = cache.removeFromHead();
        if (node != null) {
            map.remove(node.key);
        }
    }

    private static class LinkedList {
        Node head;

        Node tail;

        int size;

        public LinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        public void addLast(Node node) {
            node.prev = tail.prev;
            node.next = tail;
            tail.prev.next = node;
            tail.prev = node;
            size++;
        }

        public void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        public Node removeFromHead() {
            if (head.next == tail) {
                return null;
            }
            Node next = head.next;
            remove(next);
            return next;
        }

        public int size() {
            return size;
        }
    }

    private static class Node {
        int key;

        int val;

        Node prev;

        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
