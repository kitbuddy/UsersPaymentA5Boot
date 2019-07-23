package com.devglan.userportal.examples;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {

        int[] newArray = {0,2,4,6,2,1,4,5,2,1,3,4,5,5,2};

        System.out.println(twoSumHash(newArray, 5).toString());

    }


        public static int[] twoSum(int[] nums, int target) {


            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {

                    if (nums[i] == target - nums[j]) {
                        return new int[]{i, j};
                    }
                }
            }
            return nums;

        }


    public static int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
//
//
//    public static String runAddFunction() {
//
//          int[] arrayForNumbers = {1, 2, 4, 5, 6};
//
//          int i;
//          for (i = 0; i <= arrayForNumbers.length; i++) {
//
//              if (arrayForNumbers[i] + arrayForNumbers[i + 1] == 9) {
//                  return toString(i);
//              }
//          }
//          return null;
//      }

}
