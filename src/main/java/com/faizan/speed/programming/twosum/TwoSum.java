package com.faizan.speed.programming.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode problem 1
 */

public class TwoSum {

    //Test data

    //Array: [2 3 7 4 8]
    //Result 7
    //Output[1, 3]

    // Easy approach is to use a nested loop and pick one value and check it with all others to come to a solution
    // But this will be O(n2) - Not recommended.

    public static int[] executeBruteForce(int target, int[] array) {

        for(int i=0; i<array.length; i++) {
            int pivot = array[i]; //2
            int delta = target - pivot;//5
            for(int j=0; j<array.length; j++) {
                if(array[j] == delta && i!=j) {
                    return new int [] {i, j};
                }
            }
        }
        return new int [] {-1, -1};
    }

    public static int[] executeTheOptimizedHashMapApproach(int target, int[] array) {

        Map<Integer, Integer> numericMap = new HashMap<>();
        for(int i=0; i<array.length; i++) {
            int delta = target - array[i];
            if(numericMap.containsKey(delta)) {
                return new int[]{i, numericMap.get(delta)};
            }
            numericMap.put(array[i], i);
        }
        return new int [] {-1, -1};
    }
}
