package com.example.dsa.practise.arrays.ArraysPractise;

import org.w3c.dom.ls.LSOutput;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int maxSum = nums[0]; // 5
        int currSum = 0;
        for(int i =0 ; i<nums.length; i++){
            if(currSum < 0){
                currSum = 0;
            }
            currSum += nums[i];
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println("Maximum subarray: " + maxSum);
    }
}
/**
 *   maxSum = 5
 *   currSum = 0
 *   i               nums[i]          currSum += nums[i]             maxSum
 *   0               5                0 + 5 = 5                      (5,5) = 5
 *   1               4                5 + 4 = 9                      (5,9) = 9
 *   2               -1               9 - 1 = 8                      (9,8) = 9
 *   3               7                8 + 7 = 15                     (9,15) = 15
 *   4               8                15 + 8 = 23                    (15,23) = 23
 */
