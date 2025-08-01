import java.util.Scanner;

public class nQueenProblem {

    static void placeQueens(char[][] board, int row, int n) {
        if (row == n) {
            printBoard(board, n);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (safe(board, row, col, n)) {
                board[row][col] = 'Q';
                placeQueens(board, row + 1, n);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    static void printBoard(char[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean safe(char[][] board, int row, int col, int n) {
        // same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static void solveNQueen(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        placeQueens(board, 0, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solveNQueen(n);
    }
}
