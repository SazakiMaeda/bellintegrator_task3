package com.sazakimaeda.bellintegratortask4;

public class BellintegratorTask4Application {

    public static void main(String[] args) {
        //Решение для одной диагонали от 13 до 2
        int[][] matrix = {
                {1, 8, 2, 2, 13},
                {6, 7, 33, 1, 12},
                {3, 2, 24, 5, -2},
                {75, 68, 9, 5, 0},
                {2, 88, 55, -5, 56}
        };

        int minDiagonalElement = solution(matrix);
        System.out.println("Минимальный элемент диагоналей (без пересечения): " + minDiagonalElement);
    }

    public static int solution(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Матрица не может быть пустая");
        }

        int n = matrix.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (i != n - 1 - i) {
                min = Math.min(min, matrix[i][n - 1 - i]);
            }
        }

        return min;
    }
}
