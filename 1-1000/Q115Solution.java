// LeetCode problem No.115 : Distinct Subsequences
import java.util.*;

class Q115Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(numDistinct(s, t));

    }

    public static int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < t.length(); j++){
                dp[i][j] = -1;
            }
        }

        return solver(s , t , 0 , 0 , dp);
    }

    public static int solver(String s , String t , int i , int j, int[][] dp){
        if(j >= t.length()){
            return 1;
        }
        if(i >= s.length()){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s.charAt(i) == t.charAt(j)){
            int skip = solver(s , t , i + 1, j, dp);
            int take = solver(s , t , i + 1, j + 1, dp);

            return dp[i][j] = skip + take;
        }

        return dp[i][j] = solver(s , t , i + 1, j, dp);
    }
}