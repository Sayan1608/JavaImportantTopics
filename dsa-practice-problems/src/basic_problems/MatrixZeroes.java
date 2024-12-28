package basic_problems;

/***
 * You are given an N x M integer matrix. Your task is to modify this matrix in place so that if
 * any cell contains the value 0, then all cells in the same row and column
 * as that cell should also be set to 0.
 *
 * Requirements:
 *
 * If a cell in the matrix has the value 0, set all other cells in that cell's row and column to 0.
 * You should perform this modification in place (without using additional matrices).
 */
public class MatrixZeroes {
    public static void setZeros(int matrix[][]) {
        int c0 = 1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    if(j==0){
                        c0 = 0;
                        matrix[i][0]=0;
                    }else{
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j]=0;
            }
        }

        if(matrix[0][0] == 0){
            for(int j=1;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }

        if(c0 == 0){
            for(int i =0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {{99,17,67,46},{0,87,32,53},{27,24,79,71},{23,0,17,0},{85,100,40,0}};
        setZeros(matrix);
    }
}
