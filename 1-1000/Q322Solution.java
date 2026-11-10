import java.util.*;

class Q322Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }

        int amount = sc.nextInt();

        System.out.println(coinChange(coins , amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[amount + 1][coins.length + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = solver(coins , amount , 0 , dp);

        if(ans >= 1000000000){
            return -1;
        }
        else{
            return ans;
        }
    }

    public static int solver(int[] coins , int amount , int idx , int[][] dp){
        if(amount == 0){
            return 0;
        }

        if(idx == coins.length){
            return 1000000000;
        }

        if (dp[amount][idx] != -1) {
            return dp[amount][idx];
        }

        int skip = solver(coins , amount , idx + 1 , dp);
        int take = 1000000000;

        if(coins[idx] <= amount){
            take = 1 + solver(coins , amount - coins[idx] , idx , dp);
        }

        return dp[amount][idx] = Math.min(skip , take);
    }
}
