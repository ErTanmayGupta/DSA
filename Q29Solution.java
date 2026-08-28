// LeetCode problem no.29: Divide Two Integer
import java.util.*;

public class Q29Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divident = sc.nextInt();
        int divisor = sc.nextInt();
        int ans = divide(divident , divisor);

        System.out.println(ans);
    }

    public static int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        return (dividend / divisor);
    }
}
