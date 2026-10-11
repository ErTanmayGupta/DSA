// LeetCode Problem No.162 : Find Peak element
import java.util.*;
class Q162Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(findPeakElement(nums));
        
    }

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[mid+1]){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return left;
    }
}