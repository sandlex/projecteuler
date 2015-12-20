package com.sandlex.euler;

/**
 * author: Alexey Peskov
 */
public class Problem004 {

    public static void main(String[] args) {
        int max = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                if (isPalindrome(i * j)) {
                    if (i * j > max) {
                        max = i * j;
                    }
                }
            }
        }
        System.out.println(max);
    }

    private static boolean isPalindrome(int num) {
        String inv = "";
        String str = String.valueOf(num);
        for (int i = str.length() - 1; i >=0; i--) {
            inv += str.charAt(i);
        }
        return inv.equals(str);
    }
}
