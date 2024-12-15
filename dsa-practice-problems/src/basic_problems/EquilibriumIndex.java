package basic_problems;

/***
 * You are given an array Arr consisting of N integers.
 * You need to find the equilibrium index of the array.
 *
 * An index is considered as an equilibrium index if the sum of elements of the array to the left
 * of that index is equal to the sum of elements to the right of it.
 */
public class EquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr){
        int leftSum = 0;
        int rightSum = 0;

        for(int i=0;i<arr.length;i++)
            rightSum += arr[i];

        for(int i=0;i<arr.length;i++){
            if(i==0) leftSum = 0;
            else leftSum += arr[i-1];

            if(i==arr.length-1) rightSum = 0;
            else rightSum -= arr[i];

            if(leftSum == rightSum) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 9, 3, 2};
        System.out.println(arrayEquilibriumIndex(arr));
    }
}
