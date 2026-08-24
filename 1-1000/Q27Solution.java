// Leetcode problem 27: Remove Element
import java.util.*;

public class Q27Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int ans = removeElement(nums, val);
        System.out.println(ans);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
