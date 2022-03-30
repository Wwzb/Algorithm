package com.zbin.cache;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * @author Zbin
 * @date 2021/12/2
 */
public class LFUCache {

    private final Map<Integer, Integer> keyValueMap;

    private final Map<Integer, Integer> keyFreqMap;

    private final Map<Integer, LinkedHashSet<Integer>> freqKeysMap;

    int minFreq;

    int cap;

    public LFUCache(int capacity) {
        this.keyValueMap = new HashMap<>();
        this.keyFreqMap = new HashMap<>();
        this.freqKeysMap = new HashMap<>();
        this.cap = capacity;
    }

    public int get(int key) {
        if (!keyValueMap.containsKey(key)) {
            return -1;
        }
        increaseFreq(key);
        return keyValueMap.get(key);
    }

    public void put(int key, int val) {
        if (keyValueMap.containsKey(key)) {
            increaseFreq(key);
            return;
        }
        if (cap <= keyValueMap.size()) {
            removeMinFreqKey();
        }
        keyValueMap.put(key, val);
        keyFreqMap.put(key, 1);
        freqKeysMap.putIfAbsent(1, new LinkedHashSet<>());
        freqKeysMap.get(1).add(key);
        minFreq = 1;
    }

    private void removeMinFreqKey() {
        LinkedHashSet<Integer> set = freqKeysMap.get(minFreq);
        int removeKey = set.iterator().next();
        set.remove(removeKey);
        if (set.isEmpty()) {
            freqKeysMap.remove(minFreq);
        }
        keyValueMap.remove(removeKey);
        keyFreqMap.remove(removeKey);
    }

    private void increaseFreq(int key) {
        Integer freq = keyFreqMap.get(key);
        keyFreqMap.put(key, freq + 1);
        freqKeysMap.get(freq).remove(key);
        if (freqKeysMap.get(freq).isEmpty()) {
            freqKeysMap.remove(freq);
            if (freq == minFreq) {
                minFreq++;
            }
        }
        freqKeysMap.putIfAbsent(freq + 1, new LinkedHashSet<>());
        freqKeysMap.get(freq + 1).add(key);
    }

}
