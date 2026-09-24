// LeetCode Problem No.81 : Search in Rotated sorted Array II
import java.util.*;
class Q81Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(search(arr , target));
    }

    public static boolean search(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
