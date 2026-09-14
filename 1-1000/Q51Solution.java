// LeetCode problem No.51 : N-Queens
import java.util.*;
class Q51Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<String>> res = solveNQueens(n);
        System.out.println(res);
    }

     public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> outerList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i] , '.');
        }

        backTracking(board , outerList , 0);
        return outerList;
    }

    public static void backTracking(char[][] board , List<List<String>> outerList , int row){
        if(row == board.length){
            List<String> innerList = new ArrayList<>();
            for(int i = 0; i < board.length; i++){
                innerList.add(new String(board[i]));
            }
            outerList.add(innerList);
            return;
        }

        for(int col = 0; col < board.length; col++){
            if(!checkSafe(board , row , col)){
                continue;
            }

            board[row][col] = 'Q';
            backTracking(board , outerList , row + 1);
            board[row][col] = '.';
        }
    }


    public static boolean checkSafe(char[][] board , int row , int col){
        int n = board.length;

        for(int i = 0; i < n; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
} 