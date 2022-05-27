package com.saiev.homework_05;

public class Main {
    public static int pow(int x, int n) {
        if (n==0) {
            return 1;
        }
        return pow(x, n-1)*x;
    }
}
