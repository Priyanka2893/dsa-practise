package dsa.practise.recursion;

/**
 * 1. Break it down into smaller problems
 * 2. Fibo(N) = Fibo(N-1) + Fibo(N-2) -> Recurrence Relation
 * 3. Base Condition = Fibo(0) = 0, Fibo(1) = 1
 * 4. Try to figure out recursive tree
 */
public class FibonnaciSeries {
    public static void main(String[] args) {
        System.out.println(getFibonacci(4));
    }
    static int getFibonacci(int n){
        if(n < 2){
            return n;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}
