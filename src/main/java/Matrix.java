/**
 * Created by Vlad on 11.11.2016.
 */
public class Matrix {
    int[][] matrix;
    public Matrix( int matrix[][]){
        this.matrix = matrix;
        //MatrixUtil matr = new MatrixUtil();
        int rows = matrix.length;
        if (rows == 0) {
            throw new IllegalArgumentException("MatrixUtil is empty");
        }
        int cols = matrix[0].length;
        if ((rows != cols) || (rows < 2)){
            throw new IllegalArgumentException("MatrixUtil is not square");
        }

    }

}
