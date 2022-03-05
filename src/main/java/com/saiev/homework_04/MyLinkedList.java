package com.saiev.homework_04;

public class MyLinkedList {

    public int indexOf(T item) {
        if (isEmpty()) {
            return -1;
        }
        if(item == null) {
            throw new RuntimeException("Object cannot be null");
        }
        Node current = first;
        int index=0;
        while (current != null && !current.getValue().equals(item)) {
            current = current.getNext();
            index++;
        }
        if (current == null) {
            return -1;
        }
        return index;
    }
}
