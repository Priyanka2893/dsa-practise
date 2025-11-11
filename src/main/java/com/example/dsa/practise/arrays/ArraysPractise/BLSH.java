package com.example.dsa.practise.arrays.ArraysPractise;

public class BLSH {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        if (prices.length < 2) {
            System.out.println("MaxProfit: " + 0);  // Not enough prices to make a profit
        }

        int minPrice = prices[0]; // 7
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Calculate the profit by subtracting the current price from minPrice
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);

            // Update minPrice if the current price is lower
            minPrice = Math.min(minPrice, prices[i]);
        }

        System.out.println("MaxProfit : " + maxProfit);;


    }
}
/**
 *   minPrice = 7                      maxProfit = 0
 *             maxProfit = max(0,1-7) = -6
 *              minPrice = min(7,1) = 1
 *  minPrice = 1                       maxProfit = 6
 *               maxProfit = max(-6,5-1) = 4
 *               minPrice = min(1,5) = 1
 *   minPrice = 1                      maxProfit = 4
 *                 maxProfit = max(4,3-1) = 4
 *                 minPrice = min(1,3) = 1
 *   minPrice = 1                      maxProfit = 4
 *                 maxProfit = max(4,6-1) = 5
 *                 minPrice = min(1,6) = 1
 *   minPrice = 1                      maxProfit = 5
 *                maxProfit = max(5,4-1) = 5
 *                minPrice = min(1,4) = 1
 *
 *                maxProfit = 5 - final answer
 */
