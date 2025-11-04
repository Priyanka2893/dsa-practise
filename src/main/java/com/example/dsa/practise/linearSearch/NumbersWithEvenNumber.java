package com.example.dsa.practise.linearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class NumbersWithEvenNumber {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbersWithEvenNumber(nums));
    }
    static int findNumbersWithEvenNumber(int[] nums){
        if(nums.length == 0){
            return -1;
        }
        int sum=0;
        for(int ele: nums){
            if(even(ele)){
                sum ++;
            }
        }
        return sum;
    }
    static boolean even(int num){
        if(numOfDigits(num) % 2 == 0){
            return true;
        }
        return false;
    }
    static int numOfDigits(int num){
        int count = 0;
        while(num > 0){
            count ++;
            num/=10;
        }
        return count;
    }
}
