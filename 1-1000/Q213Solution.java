import java.util.*;
class Q213Solution {
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
        if(n == 1) return nums[0];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1 , -1);
        Arrays.fill(dp2 , -1);

        return Math.max(robFun(n-1 ,1, nums , dp1) , robFun(n-2 ,0, nums , dp2));        
    }

    public static int robFun(int i , int j, int[] nums , int[] dp){
        if(i < j ) return 0;
        if(i == j) return nums[i];

        if(dp[i] != -1){
            return dp[i];
        }

        int currHouse = nums[i] + robFun(i - 2 , j , nums , dp);
        int dangerHouse = robFun(i - 1 , j , nums , dp);

        return dp[i] = Math.max(currHouse , dangerHouse);
    }
}
