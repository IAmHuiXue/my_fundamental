import java.util.Arrays;

public class TwoDAndOneDConversion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2};
        int[][] matrix = new int[3][4];
        solution1(array, matrix);
        solution2(array, matrix);
    }

    /*

    To put the elements from a 1-d array of length L accordingly to a 2-d array of size R * C
    There are two ways to achieve this:

1 2 3 4
5 6 7 8
9 0 1 2

     */

    /**
     * position the row index & col index in matrix
     */
    static void solution1(int[] array, int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = array[j + i * c];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    /**
     * position the index in array
     */
    static void solution2(int[] array, int[][] matrix) {
        int l = array.length;
        int c = matrix[0].length;

        for (int i = 0; i < l; i++) {
            matrix[i / c][i % c] = array[i];
        }
        System.out.println(Arrays.deepToString(matrix));
    }

}
