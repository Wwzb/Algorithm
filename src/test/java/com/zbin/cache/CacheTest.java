package com.zbin.cache;

import org.junit.Test;

/**
 * @author Zbin
 * @date 2021/12/2
 */
public class CacheTest {

    @Test
    public void testLRUCache1() {
        LRUCache cache = new LRUCache(2);
        cache.set(1, 1);
        cache.set(2, 2);
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        cache.set(3, 3);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
    }

    @Test
    public void testLRUCache2() {
        LRUCache2 cache = new LRUCache2(2);
        cache.set(1, 1);
        cache.set(2, 2);
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        cache.set(3, 3);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
    }

    @Test
    public void testLFUCache() {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
