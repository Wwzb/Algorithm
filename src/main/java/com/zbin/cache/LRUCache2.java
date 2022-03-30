package com.zbin.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Zbin
 * @date 2021/12/2
 */
public class LRUCache2 extends LinkedHashMap<Integer, Integer> {

    private final int capcity;

    public LRUCache2(int capcity) {
        super();
        this.capcity = capcity;
    }

    public int get(int key) {
        return getOrDefault(key, -1);
    }

    public void set(int key, int val) {
        put(key, val);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capcity;
    }
}

