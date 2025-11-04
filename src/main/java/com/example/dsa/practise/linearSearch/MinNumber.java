package com.example.dsa.practise.linearSearch;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {12,43,7,0,3,99};
        System.out.println(finMin(arr));
    }
    static int finMin(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
