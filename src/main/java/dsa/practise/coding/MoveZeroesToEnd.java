package dsa.practise.coding;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,2,0,5,0,10,0,22};
        moveZeroesToEnd(arr);
    }
    static void moveZeroesToEnd(int[] arr){
        int slow = 0;
        int fast = slow + 1;

        while(fast<=arr.length-1){
            if(arr[fast] != 0){
                arr[slow] = arr[fast];
                slow++;
            }
            fast++;
        }
        while(slow<arr.length){
            arr[slow] = 0;
            slow++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
