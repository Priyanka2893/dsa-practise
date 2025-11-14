package dsa.practise.recursion;

/**
 * 1. Break it down into smaller problems
 * 2. Fibo(N) = Fibo(N-1) + Fibo(N-2) -> Recurrence Relation
 * 3. Base Condition = Fibo(0) = 0, Fibo(1) = 1
 * 4. Try to figure out recursive tree
 */
public class FibonnaciSeries {
    public static void main(String[] args) {
        int number = 4;
//        System.out.println(getFibonacci(number)); // 0 + 1 + 1 + 2 + 3 + 5 + 8.....
        for(int i =10; i<=20;i++){
            System.out.println(getFibonacci(i));
        }
    }
    static int getFibonacci(int n){
        if(n < 2){
            return n;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);  // 1 + 0

              // fibo(3) = 2 + fibo(2)
             // fibo(2) = 1+0 + fibo(1) =1
            // fib(1) + fibo(0) = 1 + 0

    }

}// => 4 = 3 + 2
// => 3 = 2 + 1
// => 2 = 1 + 0

/**
 *  =>sett
 */
