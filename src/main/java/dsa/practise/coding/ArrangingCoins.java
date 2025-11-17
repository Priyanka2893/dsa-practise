package dsa.practise.coding;
// https://leetcode.com/problems/arranging-coins/description/
public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 1;
        int coins = n;
        for (int i = 1; i <=n; i++) {
            coins -= i;
//            System.out.println(coins);
            if (coins < 0) {
                System.out.println(i-1);
                break;
            }else if(coins==0){
                System.out.println(i);
            }
        }
    }
}
