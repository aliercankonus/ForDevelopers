package com.fordevelopers.svc;
/*
* Check string is palindrome or not
* Palindrome means that word should be same from start to end and end to start
* */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("dened"));
        System.out.println(isPalindrome("mektep"));
        System.out.println(isPalindrome("aabaa"));
    }

    public static boolean isPalindrome(String value){
        char[] charArray = value.toCharArray();
        int first = 0;
        int last = charArray.length-1;

        while(first<last){
            if(charArray[first]!=charArray[last]){
                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}
