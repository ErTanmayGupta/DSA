// LeetCode Problem No.80 : Remove Duplicates from Sorted Array II
import java.util.*;

public class Q80Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length;i++){
            if(k < 2 || nums[i] != nums[k - 2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}