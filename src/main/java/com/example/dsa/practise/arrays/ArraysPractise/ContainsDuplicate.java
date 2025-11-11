package com.example.dsa.practise.arrays.ArraysPractise;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(numbers.contains(nums[i])){
                System.out.println("true");
            }
            numbers.add(nums[i]);
        }
    }
}
