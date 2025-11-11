package com.example.dsa.practise.arrays;

public class PatternQuestions {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("------------------");
        pattern2(5);
        System.out.println("------------------");
        pattern3(5);
        System.out.println("------------------");
        pattern4(3);
    }
    static void pattern1(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1; row<=n; row++){
            for(int col = n; col>=row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1; row<=n*2; row++){
            int totalCol = row > n ? 2 * n - row : row;
            for(int col = 1; col <= totalCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
