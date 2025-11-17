package dsa.practise.coding;
// https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertNumber {
    public static void main(String[] args) {
        /*
        Given a sorted array of distinct integers and a target value,
        return the index if the target is found. If not, return the
        index where it would be if it were inserted in order.
         */
        int[] arr = {1, 3, 5, 6};
        int target = 7;
        System.out.println(getSearchInsertPosition(arr, target));
    }

    static int getSearchInsertPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isFound = false;
        int ans = 0;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                isFound = true;
            }

            if (isFound) {
                return ans;
            }

        }
        return start;
    }

}
