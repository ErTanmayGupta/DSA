import java.util.*;

public class Q396Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxRotateFunction(nums));
    }

    public static int maxRotateFunction(int[] nums) {
        int n = nums.length; 
        int sum = 0;
        int f0 = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
            f0 += i * nums[i];
        }

        int max = f0;
        int curr = f0;

        for(int j = 1; j < n; j++){
            curr = curr + sum - n * nums[n-j];
            max = Math.max(max , curr);
        }

        return max;
    }
}
