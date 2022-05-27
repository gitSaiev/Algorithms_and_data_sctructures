package com.saiev.homework_05;

import java.util.Random;

public class Knapsack_problem {
    static int n = 10;
    static Item[] items = new Item[n];

    public static void main(String[] args) {
        Random random = new Random();
        int maxWeight = 200;

        for (int i = 0; i < n; i++) {
            items[i] = new Item(random.nextInt(50) + 1, random.nextInt(100) + 1);
        }
        for (Item item : items) {
            System.out.println("knapsack has weight: " + item.getWeight() + ", and cost: " + item.getCost());
        }

        System.out.println("Answer");
        System.out.println(knapsack(items.length-1, maxWeight));
    }

    private static int knapsack(int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (items[i].getWeight() > W) {
            return knapsack(i-1, W);
        } else {
            return Math.max(knapsack(i-1, W), knapsack(i-1, W - items[i].getWeight()) + items[i].getCost());
        }
    }


}