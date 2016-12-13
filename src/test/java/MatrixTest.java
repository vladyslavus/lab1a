import org.junit.Test;

/**
 * Created by Vlad on 11.11.2016.
 */
public class MatrixTest {

    int [][] emptyMatrix = new int[0][0];

    int[][] squareMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    int[][] nullMatrix = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };


    int[][] negativeMatrix = {
            {0, 0, 0},
            {-4, 0, 0},
            {0, -8, 0}
    };

    int[][] notSquareMatrix = {
            {1,2,3},
            {4,5,6}
    };
    int[][] notMatrix = {
            {1}
    };

    //Matrix mat = new Matrix();
    Matrix matrix = new Matrix(squareMatrix);
    //MatrixUtil matUtil = new MatrixUtil();

    /*@Test(expected = IllegalArgumentException.class)
    public void validateEmptyMatrixTest(Matrix mat) throws Exception{
        int[][] matrix = mat.matrix;
        matrix.equals(negativeMatrix);
    }*/



    @Test (expected = IllegalArgumentException.class)
    public void validateNotSquareMatrixTest() throws Exception{
        //matrix.validateMatrix(notSquareMatrix);
        Matrix matEmpty = new Matrix(emptyMatrix);
    }

    @Test (expected = IllegalArgumentException.class)
    public void validateSmallestMatrixTest() throws Exception{
        Matrix notMat = new Matrix(notMatrix);
    }

    @Test
    public void validateSquareMatrixTest() throws Exception{
        Matrix sqMat = new Matrix(squareMatrix);
    }

    @Test
    public void validateNullMatrixTest() throws Exception{
        Matrix nullMat = new Matrix(nullMatrix);
    }

    @Test
    public void validateNegativeMatrixTest() throws Exception{
        Matrix ngMat = new Matrix(negativeMatrix);
    }


}
