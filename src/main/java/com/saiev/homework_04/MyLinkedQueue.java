package com.saiev.homework_04;

public class MyLinkedQueue<T> {
    private MyLinkedList<T> list;

    public MyLinkedQueue() {
        list = new MyLinkedList<>();
    }

    public void push(T item) {
        list.insertFirst(item);
    }

    public T pop() {
        return list.removeLast();
    }

    public T peek() {
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}