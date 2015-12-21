package com.sandlex.euler;

/**
 * author: Alexey Peskov
 */
public class Problem005 {

    public static void main(String[] args) {
        int i = 20;
        while (!isEvenlyDivisible(i)) {
            i++;
        }
        System.out.println(i);
    }

    private static boolean isEvenlyDivisible(int num) {
        for (int i = 1; i <= 20; i++) {
            if (num % i != 0) return false;
        }
        return true;
    }
}
