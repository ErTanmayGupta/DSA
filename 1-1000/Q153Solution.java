// LeetCode problem no. 153 : Find Minimum in rotated sorted Array
import java.util.*;

class Q153Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = nums[0];

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[left] <= nums[mid]){
                min = Math.min(min , nums[left]);
                left = mid + 1;
            }
            else{
                min = Math.min(min , nums[mid]);
                right = mid - 1;
            }
        }

        return min;
    }
}
