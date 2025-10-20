package org.example;

public class TriangleNumberCalculator {

    // recursive method to calculate the nth triangular number
    public int value(int n) {
        if (n <= 1) {
            return n;
        }
        return n + value(n - 1);
    }

    // adds the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // subtracts the mth triangular number from the nth triangular number
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
}

