// LeetCode Problem 42: Trapping Rain Water
import java.util.*;
class Q42Solving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){ 
            height[i] = sc.nextInt();
        }
        Q42Solving solution = new Q42Solving();
        int result = solution.trap(height);
        System.out.println(result);
    }

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;

        while(left < right){
            if(height[left] <= height[right]){
                if(leftMax > height[left]){
                    total += leftMax - height[left];
                }
                else{
                    leftMax = height[left];
                }
                left++;
            }
            else{
                if(rightMax > height[right]){
                    total += rightMax - height[right];
                }
                else{
                    rightMax = height[right];
                }
                right--;
            }
        }

        return total;
    }
}