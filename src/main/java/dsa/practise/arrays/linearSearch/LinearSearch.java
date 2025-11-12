package dsa.practise.arrays.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,14,65,9,1};
        int target = 1;
        System.out.println(linear(arr,target));
        System.out.println(linear1(arr,target));
        System.out.println(linear2(arr,target));
    }
    public static int linear(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static boolean linear1(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for(int i = 0; i<arr.length; i++){
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
    public static int linear2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int ele : arr){
            if(ele == target){
                return ele;
            }
        }
        return Integer.MIN_VALUE;
    }

}
