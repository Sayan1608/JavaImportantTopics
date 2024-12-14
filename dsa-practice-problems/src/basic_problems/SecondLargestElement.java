package basic_problems;

/***
 * You have been given an array/list 'ARR' of integers. Your task is to find the second largest element present in the 'ARR'.
 *
 * Note:
 * a) Duplicate elements may be present.
 *
 * b) If no such element is present return -1.
 */
public class SecondLargestElement {
    public static int findSecondLargest(int n, int[] arr) {
        int max = arr[0];
        int res = arr[1];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                res = max;
                max = arr[i];
            }else if(arr[i] > res && arr[i] != max){
                res = arr[i];
            }
        }

        if(res == max)return -1;
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {-10, -40, -25, -12, -25, -10};
        System.out.println(findSecondLargest(arr.length,arr));
    }
}
