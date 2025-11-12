package dsa.practise.arrays.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,65,-2,9,0};
        int target = -2;
        int start = 2;
        int end = 4;
        System.out.println(search(arr,start,end,target));
    }
    static int search(int[] arr, int start, int end,int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i<=end; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
