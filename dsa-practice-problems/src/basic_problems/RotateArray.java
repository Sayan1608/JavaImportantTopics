package basic_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class RotateArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(rotateArray3(arr,2));
    }

    // Using a Temporary Array/Array List
    public static ArrayList<Integer> rotateArray1(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=k;i<arr.size();i++){
            res.add(arr.get(i));
        }
        for(int i=0;i<k;i++){
            res.add(arr.get(i));
        }

        arr = res;
        return arr;
    }

    // Using Juggling Algorithm
    public static ArrayList<Integer> rotateArray2(ArrayList<Integer> arr, int k) {
        for(int i=0;i<gcd(arr.size(),k);i++){
            int currIndex = i;
            int nextIndex = (currIndex + k)%arr.size();
            int startIndex = currIndex;
            int startElement = arr.get(currIndex);

            while(nextIndex != startIndex){
                arr.set(currIndex,arr.get(nextIndex));
                currIndex = nextIndex;
                nextIndex = (nextIndex + k)%arr.size();
            }
            arr.set(currIndex,startElement);
        }
        return arr;
    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    //Using Array-Reversal Algorithm
    public static ArrayList<Integer> rotateArray3(ArrayList<Integer> arr, int k) {
        reverse(arr,0,k-1);
        reverse(arr,k,arr.size() -1);
        reverse(arr,0,arr.size() -1);
        return arr;
    }



    public static void reverse(ArrayList<Integer> arr, int l, int r){
       while(l<=r){
            int temp = arr.get(l);
            arr.set(l,arr.get(r));
            arr.set(r,temp);
            l++;
            r--;
        }
    }
}
