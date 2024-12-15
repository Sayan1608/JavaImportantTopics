package basic_problems;

/***
 * You have been given an integer array/list 'ARR' of size 'N'.
 * Write a solution to check if it could become non-decreasing by modifying at most 1 element.
 *
 * We define an array as non-decreasing,
 * if ARR[i] <= ARR[i + 1] holds for every i (0-based) such that (0 <= i <= N - 2).
 */
public class NonDecreasingArray {
    public static boolean isPossible(int[] arr, int n) {
        int modifications = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                modifications++;
                if(modifications > 1) return false;

                if(i==0 || arr[i-1] <= arr[i+1]){
                    arr[i] = arr[i+1];
                }else{
                    arr[i+1] = arr[i];
                }
            }
        }
        return true;
    }



    public static void main(String[] args) {
//        int [] arr = {-2, 7, -1, 0, 1, 2};
//        int [] arr = {8,4,6};
        int[] arr = {-90, -70, -61, -57, -246, -28, 1, 14, 35, 63};
//        int[] arr = {-88, -77, -57, -54, -41, 2, 212, -157, 34, 68};
//        int[] arr = {-10, 10, 0, 10, 3};
        System.out.println(isPossible(arr,arr.length));
    }
}
