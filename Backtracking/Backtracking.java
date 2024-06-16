import java.util.ArrayList;
import java.util.List;

public class Backtracking {

    // print permutation of a string
    public void printPermu(String str, String permu){
        if (str.length() == 0) {
            System.out.println(permu);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermu(newStr, permu + currChar);
        }
    }

    // Check if placing a queen is safe
    public boolean isSafe(int row, int col, char[][] board) {
        // Check horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check upper right
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check lower left
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check lower right
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Save the current board configuration
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    // Recursive helper function for solving N-Queens
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    // Solve N-Queens problem
    public List<List<String>> solveQueen(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);

        return allBoards;
    }

    public static void main(String[] args) {
        Backtracking obj = new Backtracking();

        // Print permutations of a string
        obj.printPermu("ABC", "");

        // Solve and print N-Queens solutions
        int n = 4;
        List<List<String>> solutions = obj.solveQueen(n);
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.print(row+" , ");
            }
            System.out.println();
        }
    }
}
