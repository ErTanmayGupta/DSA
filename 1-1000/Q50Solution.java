// LeetCode Problem 50: Pow(x, n)
import java.util.*;
class Q50Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result = myPow(x, n);
        System.out.println(result);
    }

    public static double myPow(double x, int n) {
        double power = Math.pow(x, n);
        return power;
    }

/* 
    class Solution {
    public double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double ans = 1;

        while (power > 0) {

            if (power % 2 == 1) {
                ans *= x;
            }

            x *= x;
            power /= 2;
        }

        return ans;
    }
}
 
   */

}