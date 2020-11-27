package com.fordevelopers.svc;

public class ReverseInteger {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        System.out.println(reverseMySolution(123));
        System.out.println(reverseMySolution(-853));
        System.out.println(reverseMySolution(10));
        System.out.println(reverseMySolution(0));
        System.out.println(reverseMySolution(1534236469));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Duration: "+ duration);


    }

    public static int reverseMySolution(int x) {
        char[] str = String.valueOf(x).toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int index = x < 0 ? 1 : 0;
        for(int i=str.length-1;i>=index;i--){
            stringBuilder.append(str[i]);
        }
        try {
            int result =Integer.parseInt(stringBuilder.toString());
            return x < 0  ? result * -1: result;
        }catch(NumberFormatException ex){
            return 0;
        }
    }
}
