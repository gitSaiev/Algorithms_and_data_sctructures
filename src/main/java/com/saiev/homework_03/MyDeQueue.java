package com.saiev.homework_03;

public class MyDeQueue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int begin;
    private int end;

    //0 1 2 3 4
    //        B
    //    E
    //1 5     8

    public MyDeQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public MyDeQueue() {
        capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public int Previos(int index) {
        return (list.length + index - 1) % list.length;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }

        return list[begin];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }

        return list[Previos(end)];
    }


    public void insertRight(T item) {
        if (isFull()) {
            //Расширение массива***
            throw new RuntimeException("Queue isFull");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertLeft(T item) {
        if (isFull()) {
            reCapacity();
        }
        size++;
        begin = Previos(begin);
        list[begin] = item;

    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        list[end] = null;
        end = Previos(end);
        return temp;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void reCapacity() {
        int newSize = (int) (capacity * 1.5 + 1);
        T[] temp = (T[]) new Object[newSize];
        int tempIndex = begin;
        do {
            temp[begin] = list[begin];
            begin = nextIndex(begin);
        }
        while (tempIndex != begin);
        list = temp;

    }


}