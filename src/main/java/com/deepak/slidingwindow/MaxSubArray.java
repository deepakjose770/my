package com.deepak.slidingwindow;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] num = {1000,4,7,45,34,2,39, 500};
        int k = 3;
        System.out.println("The max value of subarray is " + findMaxSubArray(num, k));
    }

    private static int findMaxSubArray(int[] num, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            windowSum += num[i];
        }
        System.out.println(windowSum);
        maxSum = Math.max(maxSum, windowSum);

        for (int i = k; i < num.length; i++) {
            windowSum = windowSum - num[i-k] + num[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
