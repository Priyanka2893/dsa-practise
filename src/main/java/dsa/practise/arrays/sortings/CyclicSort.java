package dsa.practise.arrays.sortings;

import java.util.Arrays;

/**
 * 1. When given numbers from range 1 to N => use cyclic sorting
 * 2. After sorting => index = value - 1
 * 3. Because index starts from 0 and values starts from 1 to N
 * 4. Swap with correct index
 * 5. Total swaps = Worst Case = (N - 1) + N = 2N - 1 = O(N)
 * 6. Consecutive numbers in array
 * 7. No duplicates
 * 8. Unstable Algo
 */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
