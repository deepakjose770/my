package com.deepak.arrays;

import java.util.Arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        //int[] arr = {0,2,3,4,5,2,1,0};
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(arr));

        Boolean isValidMountainArray = validMountainArray(arr);
        System.out.println(isValidMountainArray);
    }

    private static Boolean validMountainArray(int[] arr) {

        //We check if the number of elements inside the array is less than 3.
        //If the number of elemenst are less than three we cannot create a mountain
        if(arr.length < 3) {
            return false;
        }

        //initializing the i to be 0 outside for loop because the value of i needs to be used in multiple places
        int i =0;

        //We keep on iterating till we reach the peak and we keep on increasing the value of i
        //When we reach the peak we break out so that we have the value from which the decreasing sequence starts
        //Also if the values are equal we straight away return false
        for(; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                i++;
                break;
            }
            else if(arr[i] == arr[i+1]) {
                return false;
            }
        }

        //Now we have the index value of peak +1
        //We keep on checking if the value of the current is less than the previous value
        //if condition comes true we return false.
        //If we reach the end of the array we passed.
        for (; i< arr.length; i++) {
            if(arr[i-1] <= arr[i]) {
                return false;
            }
        }

        return true;
    }
}


//https://leetcode.com/problems/valid-mountain-array/