/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        int colu = 1;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;

                    if (col != 0) {
                        matrix[0][col] = 0;
                    } else {
                        colu = 0;
                    }
                }
            }
        }

        for (int col = 1; col < width; col++) {
            for (int row = 1; row < height; row++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int col = 0; col < width; col++) {
                matrix[0][col] = 0;
            }
        }

        if (colu == 0) {
            for (int row = 0; row < height; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}