package basic_problems;

/***
 * You are given a square matrix of non-negative integers of size 'N x N'.
 * Your task is to rotate that array by 90 degrees in an anti-clockwise direction without using any extra space.
 */
public class RotateMatrixByNinetyDegrees {
    public static void inplaceRotate(int[][] arr, int n) {
        arr = transpose(arr);
        for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length-i-1][j];
                arr[arr.length-i-1][j] = temp;
            }
        }
        printMatrix(arr);
    }

    public static int[][] transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        inplaceRotate(matrix,matrix.length);
    }
}
