package dsa.practise.coding;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "abca";
        char[] arr = s1.toCharArray();
        int start = 0;
        int end = arr.length -1;
        boolean isPalindrome = true;
        while(start < end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
