  
package com.fordevelopers.svc;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 105
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/

import javax.jnlp.IntegrationService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        System.out.println();
        Arrays.stream(twoSum(new int[]{3, 2, 4}, 6)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(twoSum(new int[]{3,3}, 6)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(twoSum(new int[]{0,4,3,0}, 0)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(twoSum(new int[]{-1,-2,-3,-4,-5}, -8)).forEach(System.out::print);
        System.out.println();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Duration: "+ duration);

        System.out.println("******************************************************");
        long startTime1 = System.nanoTime();
        Arrays.stream(twoSumWithMap(new int[]{3, 2, 4}, 6)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(twoSumWithMap(new int[]{3,3}, 6)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(twoSumWithMap(new int[]{0,4,3,0}, 0)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(twoSumWithMap(new int[]{-1,-2,-3,-4,-5}, -8)).forEach(System.out::print);
        System.out.println();
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        System.out.println("Duration1: "+ duration1);

    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==(target-nums[i])){
                        return new int[]{i,j};
                    }
                }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumWithMap(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int result = target - nums[i];
            if (map.containsKey(result)){
                return new int[]{map.get(result), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }



}
