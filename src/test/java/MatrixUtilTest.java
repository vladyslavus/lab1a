import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Vlad on 19.10.2016.
 */
public class MatrixUtilTest {

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

    //MatrixUtil matrix = new MatrixUtil();
    Matrix matrix = new Matrix(squareMatrix);
    MatrixUtil matUtil = new MatrixUtil();


    @Test
    public void findLeftSectorTest() throws Exception{
        int left = matUtil.findLeftSector(matrix);
        assertEquals("Left sector is not empty", 4, left);
    }


    @Test
    public void findRightSectorTest() throws Exception{
        int right = matUtil.findRightSector(matrix);
        assertEquals("Right sector is not empty", 6, right);
    }

    @Test
    public void findDownSectorTest() throws Exception{
        int down = matUtil.findDownSector(matrix);
        assertEquals("Down sector is not empty", 8, down);
    }

    @Test
    public void findUpperSectorTest() throws Exception{
        int upper = matUtil.findUpperSector(matrix);
        assertEquals("Upper sector is not empty", 2, upper);
    }

    @Test
    public void upToDownTest() throws Exception{
        int temp = matUtil.upToDown(8, 2, matrix);
        assertEquals("Down sector is not 2", 2, temp);
    }

    @Test
    public void leftToRightTest() throws Exception{
        int temp = matUtil.leftToRight(4, 6, matrix);
        assertEquals("left sector is not 2", 6, temp);
    }

}
