import java.util.*;
public class Q198Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        return robFun(0 , nums , dp);        
    }

    public static int robFun(int i , int[] nums , int[] dp){
        if(i >= nums.length) return 0;

        if(dp[i] != -1){
            return dp[i];
        }

        int currHouse = nums[i] + robFun(i + 2 , nums , dp);
        int dangerHouse = robFun(i + 1 , nums , dp);

        return dp[i] = Math.max(currHouse , dangerHouse);
    }
}
