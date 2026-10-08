// LeetCode Problem No.152 : Maximum Product Subarray
import java.util.*;

class Q152Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(maxProduct(nums));

    }

    public static int maxProduct(int[] nums) {
        int maxproduct = nums[0];
        int currmax = nums[0];
        int currmin = nums[0];
        for(int i = 1; i < nums.length; i++){
            int val = nums[i];
            if (val < 0){
                int temp = currmax;
                currmax = currmin;
                currmin = temp;
            }
            currmax = Math.max(val, currmax * val);
            currmin = Math.min(val, currmin * val);

            maxproduct = Math.max(maxproduct , currmax);
        }

        return maxproduct;
    }
}
