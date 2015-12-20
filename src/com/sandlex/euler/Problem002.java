package com.sandlex.euler;

/**
 * author: Alexey Peskov
 */
public class Problem002 {

    public static void main(String[] args) {
        int prev = 0, curr = 1, res = 0;
        for (int sum = prev + curr; sum <= 4000000; sum = prev + curr) {
            prev = curr;
            curr = sum;
            if (curr % 2 == 0) {
                res += curr;
            }
        }
        System.out.println(res);
    }
}
