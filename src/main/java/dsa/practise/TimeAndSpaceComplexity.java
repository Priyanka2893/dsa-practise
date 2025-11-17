package dsa.practise;

/**
 *  1. Time complexity != Time taken to run program
 *  2. Time Complexity = It is a function that tells us how time will grow as size(input) will grow
 *  3. What do we consider when thinking about complexity :
 *     ->a. Always look for worst case complexity - because we're considering large number
 *     ->b. Problem arise when we have large data
 *     ->c. Always look at complexity for large data
 *     ->d. Why we ignore constants - Because even value of actual time is diff, they all will grow linearly
 *                                - We don't care about actual time
 *     -> O(N^3 + logn) = consider point 3.b = always consider large data - always ignore less dominating values
 *     -> O(3N^3 + 4N^2 + 5N + 6) = O(N^3 + N^2 + n) = O(N^3)
 *  4. Space Complexity = It is an algo is total space taken by algo with respect to input size.
 *                      = It includes auxiliary(extra) space + space used by input
 */
public class TimeAndSpaceComplexity {
    // 1 - 10
    //
    /**
     * What is big O Notation - Any algorithm will not exceed above this complexity
     *                        - Upper bound - not exceed this
     *                        - f(n) = (g(n)) => limit=infinity => f(n)/g(n) < infinity
     *                        - O(n^3) = O(6N^3 + 3N + s) => 6N^3 + 3N + s/N^3
     *  Big Omega = Opposite of Big O Notation - lower bound - takes atleast take this complexity
     *            = lim             = f(N)/g(N) > 0
     *              N -> infinity
     *
     *  What if an algo has lower bound and upper bound as O(N^2) = O(N^2) + omega(N^2)
     *  Big Theta Notation = combining between = means both ub and lb is  theta(N^2)
     *                     = 0 < lim            f(n)/g(n) < infinity
     *                           n -> infinity
     *  Little O Notation = upper bound - not strict ub - loose ub -
     *  Little omega Notation
     *
     * --------------------------------------------------------------------------------------------
     * Ques : for(int i= 0;i<=n ; i++){
     *           for(j=1;j<k;j++){
     *              //some algo
     *           }
     *           i + k;
     * }

     * inner loop = O(kt) time
     * ans = O(kt * time outer loop is running)
     * outer loop = i = 1 + 1+k + 1+2k + 1+3k +........ + 1+xk
     *     1 + xk <= n
     *     xk <= n-1
     *     x = n-1/k
     * ans = O(kt + (n-1)/k) => ans = O(n)
     */
}
