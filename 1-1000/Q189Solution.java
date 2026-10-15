// LeetCode Problem No.189 : Rotate Array
import java.util.*;
class Q189Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotate = new int[n];

        for(int i = 0; i < nums.length; i++){
            rotate[(i + k) % n] = nums[i];
        }

        for(int j = 0; j < n; j++){
            nums[j] = rotate[j];
        }
    }
}