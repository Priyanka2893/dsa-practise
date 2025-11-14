package dsa.practise.arrays.sortings;

import java.util.Arrays;

/**
 * 1. Unstable Sorting Algo
 * 2. Worst and Best - O(n^2)
 * 3. It performs well on small lists/arrays
 *
 *  1 2 1 2 4 6 6
 *
 *  1,2 -> 2,1
 *  1 1 2 2 4 6 6
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,3,-1,99,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        //
    }
    static void selectionSort(int[] arr){
        for(int i=0; i < arr.length; i++){
            // find the max item in remaining arr and swap with correct index
            int last = arr.length - i - 1; // last = 5-0-1=4, 5-1-1=3
            int max = 0;
            for(int j=0;j <= last; j++){
                if(arr[max] < arr[j]){
                    max=j;
                }
            }
//            int maxIndex = getMaxIndex(arr,0,last);
//            swap(arr,maxIndex,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for(int i=start; i<= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
