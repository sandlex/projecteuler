package com.sandlex.euler;

/**
 * author: Alexey Peskov
 */
public class Problem006 {

    public static void main(String[] args) {
        int sos = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sos += i * i;
            sum += i;
        }
        System.out.println(sum * sum - sos);
    }
}
