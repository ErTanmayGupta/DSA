// LeetCode Problem No.79: Word search
import java.util.*;
class Q79Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] board = new char[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                board[i][j] = sc.next().charAt(0);
            }
        }
        String word = sc.next();

        System.out.println(exist(board , word));
    }


    public static boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(board , word , visited , i , j , 0)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean dfs(char[][] board , String word , boolean[][] visited , int row , int col , int index){
        
        // Word Complete found (base condition)
        if(index == word.length()){
            return true;
        }

        // Boundary check
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length){
            return false;
        }

        // Already visited

        if(visited[row][col]){
            return false;
        }

        // Character not matching
        if(board[row][col] != word.charAt(index)){
            return false;
        }

        visited[row][col] = true;

        // Moving all four direction
        boolean found = dfs(board , word , visited , row + 1, col , index+1) ||
        dfs(board , word , visited , row - 1, col , index+1) || dfs(board , word , visited , row , col + 1, index+1) || dfs(board , word , visited , row , col - 1, index+1);

        // Backtracking
        visited[row][col] = false;

        return found;
    }
}