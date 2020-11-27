package com.fordevelopers.svc;

import java.util.Arrays;
/*
* Find max value in array, and find max first and second value in array
* Question: if I want, Kth max element in array, what should I do?
* */
public class FindMax {

    public static void main(String[] args) {
        int[] numbers = new int[]{10,20,2,5,34,3,46,20,-20,6,-1,0,0,0,0};
        int[] maxValues = findMax(numbers);
        Arrays.stream(maxValues).forEach(System.out::println);
    }

    public static int[] findMax(int[] numbers){
        int firstMax=0;
        int secondMax = 0;
        for(int i=0;i<numbers.length;i++){
            if(firstMax<=numbers[i]){
                secondMax = firstMax;
                firstMax = numbers[i];
            }
        }
        return new int[]{firstMax,secondMax};
    }
}
