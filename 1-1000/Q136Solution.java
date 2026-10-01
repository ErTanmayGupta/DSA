import java.util.*;

class Q136Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }

        int result = singleNumber(nums);
        System.out.println("The single number is: " + result);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
