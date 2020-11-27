package com.fordevelopers.svc;

/*
*
* 1453 -> 1000
* 186  -> 100
* 100  -> 100
* 11   -> 10
* 7    -> 0
* 1    -> 0 */
public class FindSmallestBase {

    public static void main(String[] args) {
        System.out.println(findSmallestBase(1453));
        System.out.println(findSmallestBase(186));
        System.out.println(findSmallestBase(100));
        System.out.println(findSmallestBase(11));
        System.out.println(findSmallestBase(7));
        System.out.println(findSmallestBase(1));
    }

    public static int findSmallestBase(int number){
        int i = 0;
        while(number>=10){
            number = number/10;
            i++;
        }
        return i==0 ? i : (int) Math.pow(10,i);
    }
}
