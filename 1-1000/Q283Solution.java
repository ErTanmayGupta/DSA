import java.util.*;
class Q283Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        while(index < nums.length){
            nums[index++] = 0;
        }
    }
}
