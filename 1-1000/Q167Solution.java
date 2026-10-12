// LeetCode problem No.167 : Two sum II - Input Array is sorted
import java.util.*;

class Q167Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;   
            } else {
                right--;  
            }
        }
        return new int[]{-1, -1};
    }
}