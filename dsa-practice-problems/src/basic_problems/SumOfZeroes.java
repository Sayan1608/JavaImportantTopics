package basic_problems;

import java.util.ArrayList;
import java.util.List;

/***
 * You are given a binary matrix (it contains only 0s and 1s) with dimensions ‘N * M’.
 * You need to find and return the sum of coverages of all zeros of the given matrix.
 *
 * Coverage for a particular 0 is defined as the total number of ‘1s’ around it
 * (i.e., immediate left, immediate right, immediate up, and immediate bottom positions).
 */
public class SumOfZeroes {

    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

        int count = 0;

        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat.get(i).size(); j++){
                if(mat.get(i).get(j) == 0){
                    // check left
                    if(j-1>=0 && mat.get(i).get(j-1) == 1)
                        count++;

                    // check right
                    if(j+1<mat.get(i).size() && mat.get(i).get(j+1) == 1)
                        count++;

                    // check up
                    if(i-1 >= 0 && mat.get(i-1).get(j) == 1)
                        count++;

                    // check bottom
                    if(i+1 < mat.size() && mat.get(i+1).get(j) == 1)
                        count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(0,1,0,1));
        ArrayList<Integer> list2 = new ArrayList<Integer>(List.of(1,0,1,0));
        ArrayList<Integer> list3 = new ArrayList<Integer>(List.of(1,1,0,0));
        ArrayList<Integer> list4 = new ArrayList<Integer>(List.of(0,0,1,1));

        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>(List.of(list1,list2,list3,list4));

        System.out.println(coverageOfMatrix(mat));


    }
}
