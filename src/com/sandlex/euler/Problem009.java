package com.sandlex.euler;

/**
 * author: Alexey Peskov
 */
public class Problem009 {

    public static void main(String[] args) {
        for (int a = 1; true; a++) {
            for (int b = a + 1; a + b <= 1000; b++) {
                for (int c = b + 1; a + b + c <= 1000; c++) {
                    if (a + b + c == 1000) {
                        if (isTriplet(a, b, c)) {
                            System.out.println(a * b * c);
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }

    private static boolean isTriplet(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}
