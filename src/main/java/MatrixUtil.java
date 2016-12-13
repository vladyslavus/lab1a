/**
 * Created by Vlad on 19.10.2016.
 */
public class MatrixUtil {

    public int findLeftSector(Matrix mat){
        int[][] matrix = mat.matrix;
        int n = matrix.length;
        int left = matrix[1][0];
          for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                if ((i > j) && (i + j < n-1)){
                    matrix[i][i] = 0;
//                    matrix[i][n+1-i] = 0;
                    left = matrix[i][j];
                }
            }
        }
        return left;
    }

    public int findRightSector(Matrix mat){

        int[][] matrix = mat.matrix;
        int n = matrix.length;
        int right = matrix[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if ((i < j) && (i+j > n-1)){
                    right = matrix[i][j];
                }
            }
        }
        return right;
    }

    public int findDownSector(Matrix mat){
        //validateMatrix(matrix);
        int[][] matrix = mat.matrix;
        int n = matrix.length;
        int down = matrix[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if((i + j > n - 1)&&(i > j)){
                    down = matrix[i][j];
                }
            }
        }
        return down;
    }


    public int findUpperSector(Matrix mat){


        int[][] matrix = mat.matrix;
        int n = matrix.length;
        int upper = matrix[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if((i + j < n - 1)&&(i < j)){
                    upper = matrix[i][j];
                }
            }
        }
        return upper;
    }

    public int upToDown(int down, int upper, Matrix mat){
        //validateMatrix(matrix);
        int[][] matrix = mat.matrix;
        int n = matrix.length;
        int temp = upper;
        for (int j = 0; j < n; j++){

                upper = down;
                down = temp;
                //temp = upper;

        }
    return temp;
    }

    public int leftToRight(int left, int right, Matrix mat){
        int[][] matrix = mat.matrix;
        int n = matrix.length;
        int temp = left;
        for (int i = 0; i < n; i++){
            left = right;
            right = temp;
            temp = left;
        }
        return temp;
    }


}

