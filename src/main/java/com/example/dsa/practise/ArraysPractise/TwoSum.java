package com.hpe.rana.translationtool.ArraysPractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Map<Integer,Integer> prevMap = new HashMap<>();
        for(int i = 0 ; i< nums.length; i++){
            int value = target - nums[i];  // value = 9 - 2 = 7, value = 9 - 7 = 2
            if(prevMap.containsKey(value)){ // no for 7,  yes for 2
//                return new int[] { prevMap.get(value), i };
                System.out.println("-------inside if condition ------");
                System.out.println(Arrays.toString(new int[]{prevMap.get(value), i})); // (0,1)
            }
            prevMap.put(nums[i],i); // add [2(value) : 0(index)],
        }
    }
}
/**
 * Time complexity = o(n)
 *  [2,7,11,15] arr - [0,1,2,3] index
 *  value = target - num      checks if 7 present in newly created hashMap
 *  9 - 2 = 7                 ans is NO                                         then add that value to map = [ 2 : 0 ]
 *  9 - 7 = 2                 ans is YES                                        value index 0 and current num index i.e. i = (0,1)
 *
 *
 */
