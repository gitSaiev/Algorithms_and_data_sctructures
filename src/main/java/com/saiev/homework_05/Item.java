package com.saiev.homework_05;

public class Item {
    private int weight;
    private int cost;

    public Item() {
    }

    public Item(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }
}