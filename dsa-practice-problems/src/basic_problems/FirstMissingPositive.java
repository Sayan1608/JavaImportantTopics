package basic_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 * You are given an array 'ARR' of integers of length N.
 * Your task is to find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array.
 * The array can have negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give output 2
 * because it is the smallest positive number that is missing in the input array.
 */
public class FirstMissingPositive {
    // Using HashSet.
    //TODO : with constant space.
    public static int firstMissing(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for(int e : arr){
            set.add(e);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)) return i;
        }
        return n+1;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,5,4};
        System.out.println(firstMissing(arr,arr.length));
    }
}
