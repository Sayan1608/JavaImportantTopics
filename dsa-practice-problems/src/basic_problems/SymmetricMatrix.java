package basic_problems;

/***
 * You are given a square matrix, return true if the matrix is symmetric otherwise return false.
 *
 * A symmetric matrix is that matrix whose transpose is equal to the matrix itself.
 */
public class SymmetricMatrix {
    public static boolean isMatrixSymmetric(int[][] matrix) {
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]!=matrix[j][i]) return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,7,3},{2,4,5},{3,5,8}};
        System.out.println(isMatrixSymmetric(matrix));
    }

}
