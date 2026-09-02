// LeetCode Problem No.36 Valid Sudoku
import java.util.*;

class Q36Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];
        for(int i = 0; i < 9; i++){
            String row = sc.next();
            for(int j = 0; j < 9; j++){
                board[i][j] = row.charAt(j);
            }
        }
        Q36Solution solution = new Q36Solution();
        System.out.println(solution.isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '1';

                int box = (i / 3) * 3 + (j / 3);

                if (rows[i][num] || cols[j][num] || boxes[box][num]) {
                    return false;
                }

                rows[i][num] = true;
                cols[j][num] = true;
                boxes[box][num] = true;
            }
        }

        return true;
    }
}