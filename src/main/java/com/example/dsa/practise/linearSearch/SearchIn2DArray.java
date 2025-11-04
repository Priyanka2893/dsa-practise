package com.hpe.rana.translationtool.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1}, // [0,0], [0,1], [0,2]
                {18,0,45,6},
                {3,8,90}
        };
        int target = 7;

        System.out.println(Arrays.toString(findMin(arr,target)));
        System.out.println(findMax(arr));
    }
    static int[] findMin(int[][] arr,int target){
        for(int row =0; row< arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col}; // {row,col}
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int findMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[]ints : arr){
            for(int ele : ints){
                if(ele > max){
                    max = ele;
                }
            }
        }
        return max;
    }
}
