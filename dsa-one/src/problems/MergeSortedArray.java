package problems;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                result[k++] = nums1[i];
                i++;
            }else{
                result[k++] = nums2[j];
                j++;
            }
        }

        if(i>=m){
            while(j<n){
                result[k++] = nums2[j++];
            }
        }

        if(j>=n){
            while(i<m){
                result[k++] = nums1[i++];
            }
        }

        nums1 = result;
        return nums1;
    }

    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();
        int [] nums1 = new int[]{1,2,3,0,0,0};
        int [] nums2 = new int[]{2,5,6};
        nums1 = obj.merge(nums1,3,nums2,3);

        for(int n : nums1)
            System.out.println(n);
    }
}
