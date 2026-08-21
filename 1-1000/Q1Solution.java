import java.util.*;
 

public class Q1Solution {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }



    public static int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return new int[]{-1, -1};
    }


    // public int[] twoSum(int[] nums, int target) {
        
    //     Map<Integer, Integer> map = new HashMap<>();

    //     for (int i = 0; i < nums.length; i++) {
    //         int complement = target - nums[i];

           
    //         if (map.containsKey(complement)) {
    //             return new int[] { map.get(complement), i };
    //         }

    //         map.put(nums[i], i);
    //     }

    //     // This will never be reached because one valid answer always exists
    //     return new int[] {};

    // }


}