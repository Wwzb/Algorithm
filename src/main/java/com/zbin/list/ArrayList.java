package com.zbin.list;

/**
 * @author Zbin
 * @date 2021/11/8
 */
@SuppressWarnings("unchecked")
public class ArrayList<T> {

    private Object[] elements = {};

    private int length = 0;

    public ArrayList() {
    }

    public T get(int index) {
        if (index < 0 || index >= length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (T) elements[index];
    }

    public void set(T element, int index) {
        if (index < 0 || index >= length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        elements[index] = element;
    }

    public void add(T element) {
        if (elements == null || elements.length == 0) {
            elements = new Object[10];
        }
        elements[length] = element;
        length++;
    }

    public void add(T element, int index) {
        if (index > length || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        for (int i = length; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        length++;
    }

    public T remove(int index) {
        if (index >= length || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        T element = (T) elements[index];
        for (int i = index; i < length; i++) {
            elements[i] = elements[i + 1];
        }
        length--;
        return element;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    public void clear() {
        for (int i = 0; i < length; i++) {
            elements[i] = null;
        }
        length = 0;
    }

    public void print() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            if (sb.length() > 1) {
                sb.append(",");
            }
            sb.append(elements[i]);
        }
        sb.append("]");
        System.out.println(sb);
    }
}
