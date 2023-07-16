package com.deepak.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int nums[] = {1,0,3,1,0,9};
        int k = 3;
        System.out.println("The result is : " + checkDuplicate(nums, k));
    }

    //Solution using hashmap
    public static boolean checkDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(map.containsKey(nums[i]) && isValidDuplicate(map.get(nums[i]), i, k)) {
                return true;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    private static boolean isValidDuplicate(Integer integer, int i, int k) {
        return (Math.abs(integer - i)) <= k;
    }


    //Solution using sliding window technique
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i > k){
                set.remove(nums[i - k - 1]);
            }
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
