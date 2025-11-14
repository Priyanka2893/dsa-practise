package dsa.practise.recursion;

/**
 * 1. Function calling itself
 * 2. It helps us in solving bigger/complex problems in a simple way
 * 3. You can convert recursion solution into iteration(for loops) and vice versa
 * 4. Space complexity = not constant because of recursive calls
 * 5. It helps in breaking down bigger problems into smaller problems
 * 6. If no base condition gven - infinite calls - results in stackOverflow
 * 7. Every call takes space in memory stack
 *
 * ---------- STEPS -----------------
 * 1. Identify if you can break down problem into smaller problem
 * 2. Write down recurrence relation if possible
 * 3. Draw the recursion tree
 *  -> About the tree - See the flow of functions, how they are getting stack.
 *                    - Identify and flow on left tree calls and right tree calls.
 *  Variables : 1. Arguments 2. Return Type 3. Body of function
 */
public class NumberExampleRecursion {
    //
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        // base condition - where recursion stop making new call
        if(n>5){
//            System.out.println(5);
            return;
        }
        System.out.println(n);
        // Tail recursion - last step for function
        print(n+1);

    }
}
