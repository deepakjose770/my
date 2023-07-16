package com.deepak.leetcode.easy.one;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeUsingStringConvert(56765));
        System.out.println(isPalindrome(56765));
    }

    public static boolean isPalindromeUsingStringConvert(int num) {
        String number = String.valueOf(num);
        int numLength = number.length();
        for(int i = 0; i<numLength/2; i++) {
            if(number.charAt(i) != number.charAt(numLength-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int newNUm = 0;
        while (num > 0) {
            newNUm = newNUm * 10 + num%10;
            num = num/10;
        }
        return temp == newNUm;
    }
}
