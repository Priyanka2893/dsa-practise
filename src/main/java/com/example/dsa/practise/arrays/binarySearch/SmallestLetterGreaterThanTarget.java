package com.example.dsa.practise.arrays.binarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','f','j'};
        char target = 'c';
        System.out.println(binarySearch(arr,target));
    }
    static char binarySearch(char[] arr,char target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];

    }

}
