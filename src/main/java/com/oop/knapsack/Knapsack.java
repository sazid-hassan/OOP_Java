package com.oop.knapsack;

class Knapsack {
    static int max(int a, int b) {
        return Math.max(a, b);
    }

    static int knapsack(int W, int[] weight, int[] val, int n) {
        int i, w;
        int[][] newArr = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    newArr[i][w] = 0;
                } else if (weight[i - 1] <= w) {
                    newArr[i][w] = max(val[i - 1] + newArr[i - 1][w - weight[i - 1]], newArr[i - 1][w]);
                } else {
                    newArr[i][w] = newArr[i - 1][w];
                }
            }
        }

        return newArr[n][W];
    }

    public static void main(String[] args) {
        int[] val = new int[]{1, 2, 5, 6};
        int[] wt = new int[]{2, 3, 4, 5 };
        int W = 8;
        int n = val.length;
        System.out.println(knapsack(W, wt, val, n));
    }
}



