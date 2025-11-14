package dsa.practise.arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,34,65,89,90}; // in ascending order
        // arr = [0,0,0,0,0,1,,1,1,1,2,,2,....]
        int target = 11;
        int[] arr2 = {90,89,65,34,11}; //in desc
        System.out.println(binarySearch1(arr2,target));
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2; // (start+end)/2

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int binarySearch1(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                end = mid - 1;
            }else if(target < arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
