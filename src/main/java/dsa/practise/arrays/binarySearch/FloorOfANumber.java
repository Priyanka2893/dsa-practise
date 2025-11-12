package dsa.practise.arrays.binarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {11,34,65,89,90}; // in ascending order
        int target = 63;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr,int target){

        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return arr[end];
    }

}
