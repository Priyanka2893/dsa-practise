package dsa.practise.coding;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s1 = "}()";
        char[] arr = s1.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        for(int i = 0; i<arr.length; i++){

            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '['){
                stack.push(arr[i]);
            }
            if(arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                if(stack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                stack.pop();
            }
            if (isBalanced){

            }
//            if(stack.isEmpty()){
//                stack.push(arr[i]);
//            }else if(arr[i] == ')' || arr[i] == '}' || arr[i] == ']'){
//                stack.pop();
//            }else{
//                stack.push(arr[i]);
//            }
        }
//        if(stack.isEmpty()){
//            System.out.println("Balanced Parenthesis!!");
//        }else {
//            System.out.println("Not balanced!!");
//        }
    }



}
