package dsa.practise.arrays.sortings;

import java.util.Arrays;

/**
 * 1. Partially sorting the array
 * 2. For every index : Put that index ele at the correct index of LHS
 * 3. i will run till n-2 - outer loop -
 * 4. j will check ele in LHS and swap accordingly
 * Worst Case - desc arr - O(N^2)
 * Best Case - already sorted - O(N-1) - O(N)
 * Adv: Adaptive - Steps are reduced if already sorted as compare to bubble sort
 *      Stable Algo
 *      Used for smaller values of N
 *      Used where arr if partially sorted - hybrid sorting algo
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1}; // [4,5,3,2,1] - [4,3,5,2,1] - [3,4,5,2,1]
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for(int i = 0; i< arr.length - 1; i++){
            for(int j = i+1; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
