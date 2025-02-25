import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(0, board, result);
        return result;
    }

    private void backtrack(int row, char[][] board, List<List<String>> result) {
        int n = board.length;
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] rowChars : board) {
                solution.add(String.valueOf(rowChars));
            }
            result.add(solution);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isNotUnderAttack(row, col, board)) {
                board[row][col] = 'Q';
                backtrack(row + 1, board, result);
                board[row][col] = '.';
            }
        }
    }

    private boolean isNotUnderAttack(int row, int col, char[][] board) {
        int n = board.length;
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false; 
            int colOffset = row - i;
            if (col - colOffset >= 0 && board[i][col - colOffset] == 'Q') return false;
            if (col + colOffset < n && board[i][col + colOffset] == 'Q') return false; 
        }
        return true;
    }


}
