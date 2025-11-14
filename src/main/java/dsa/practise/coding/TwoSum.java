package dsa.practise.coding;

import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,4,5,10,20,33};
        int target = 13;
        twoSum(arr,target);

    }
    static void twoSum(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        boolean isFound = false;
        while(s < e) {
            if (arr[s] + arr[e] == target) {
                System.out.println(s + "," + e);
                isFound = true;
                break;
            } else if (target < arr[s]+ arr[e]) {
                e--;
            }else{
                s++;
            }
        }
        if(!isFound){
            System.out.println("No two numbers present");
        }
    }
}
