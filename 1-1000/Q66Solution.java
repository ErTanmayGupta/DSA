//LeetCode Problem No. 66 Plus One
import java.util.*;
class Q66Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }   
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n - 1]++;
        for (int i = n - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1]++;
            }
        }
        if (digits[0] == 10) {
            int[] ans = new int[n + 1];
            ans[0] = 1;  
            return ans;
        }

        return digits;
    }
}
