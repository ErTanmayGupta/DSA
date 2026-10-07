// LeetCode Problem No. 174 : Dungeon Game
import java.util.*;

public class Q174Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] dungeon = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dungeon[i][j] = sc.nextInt();
            }
        } 

        System.out.println(calculateMinimumHP(dungeon));
    }

    public static int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        int[][] dp = new int[m + 1][n + 1];
        for(int[] dug : dp){
            Arrays.fill(dug , -1);
        }

        return fun(dungeon , m , n , 0, 0 , dp);
    }

    public static int fun(int[][] grid , int m , int n , int i , int j , int[][] dp){
        if(i >= m || j >= n){
            return Integer.MAX_VALUE;
        }

        if(i == m-1 && j == n-1){
            return Math.max(1 , 1 - grid[i][j]);
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int right = fun(grid , m , n , i , j + 1 , dp);
        int down = fun(grid , m , n , i + 1 , j , dp);

        int minHealth = Math.min(right , down);

        int healthNeed = minHealth - grid[i][j];

        return dp[i][j] = Math.max(1 , healthNeed);
    }
}
