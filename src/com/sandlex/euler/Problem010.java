package com.sandlex.euler;

/**
 * author: Alexey Peskov
 */
public class Problem010 {

    public static void main(String[] args) {
        int num = 1;
        long sum = 0;
        while (++num <= 2000000) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        System.out.println(sum);
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
