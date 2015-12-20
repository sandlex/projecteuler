package com.sandlex.euler;

/**
 * author: Alexey Peskov
 */
public class Problem003 {

    public static void main(String[] args) {
        long num = 600851475143l;
        int max = 0;
        for (int i = 2; num != 1; i++) {
            if (isPrime(i)) {
                if (num % i == 0) {
                    num = num / i;
                    max = i;
                }
            }
        }
        System.out.println(max);
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
