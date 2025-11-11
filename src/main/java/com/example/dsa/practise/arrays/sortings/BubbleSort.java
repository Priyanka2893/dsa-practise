package com.example.dsa.practise.arrays.sortings;

import java.util.Arrays;

/**
 *  1. Exchange Sorting
 *  2. Sinking Sort
 *  3. Stable Sorting Algorithm
 *  4. In-place sorting
 *  5. If array is Partially sorted choose - bubble sort otherwise selection
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,9,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i =0; i < arr.length; i++){
            swapped = false;
            for(int j =1; j <= arr.length - i - 1 ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
;                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
