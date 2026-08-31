// leetcode problem 34 - Find first and last position of Element in sorted array
import java.util.*;
public class Q34Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchRange(nums , target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans =  {-1,-1};

        ans[0] = binarySearch(nums , target , true);
        ans[1] = binarySearch(nums , target , false);

        return ans;
        
    }

    public static int binarySearch(int[] nums , int target , boolean findfirst){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                ans = mid;
                
                if(findfirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(nums[mid] < target){
                start = mid + 1;

            }
            else{
                end = mid - 1;
            }
        }

        return ans;
    }
}
