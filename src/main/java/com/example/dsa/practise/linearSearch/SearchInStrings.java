package com.hpe.rana.translationtool.linearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Priyanka";
        char target = 'o';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }

    static boolean search(String str, char ch){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i<str.length(); i++){
            if(ch == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char ch){
        if(str.length() == 0){
            return false;
        }
        for(char c : str.toCharArray()){
            if(c == ch){
                return true;
            }
        }
        return false;
    }


}
