package com.saiev.homework_08;

public class ChainingHashMap {

    public V remove(K key) {
        V temp = null;
        checkKeyNotNull(key);
        int i = hash(key);
        if (st[i].isEmpty()) {
            return null;
        }
        for (Node node: st[i]) {
            if (node.key.equals(key)) {
                temp = node.value;
                st[i].remove(node);
            }
        }
        return temp;
    }
}
