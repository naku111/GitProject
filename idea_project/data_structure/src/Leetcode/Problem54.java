package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return order;
        }
        int rows = matrix.length, columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];//访问标记
        int total = rows * columns;//总数目
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//每次走的方向
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            order.add(matrix[row][column]);
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0
                    || nextColumn >= columns || visited[nextRow][nextColumn]) {
                directionIndex = (directionIndex + 1) % 4;
            }//到边界换方向走
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return order;
    }


    public static void main(String[] args) {
        List<Integer> integers = spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (int integer: integers) {
            System.out.println(integer);
        }
    }
}
