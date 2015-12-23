package com.sandlex.euler;

/**
 * author: Alexey Peskov
 */
public class Problem007 {

    public static void main(String[] args) {
        int num = 1, i = 0;
        while (i < 10001) {
            if (isPrime(++num)) {
                i++;
            }
        }
        System.out.println(num);
    }

    private static boolean isPrime(int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
