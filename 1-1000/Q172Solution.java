// LeetCode problem No. 172: Factorial Trailing Zeroes
import java.util.*;
class Q172Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {
        int zeroes = 0;
        for(long i = 5; i <= n; i *= 5){
            zeroes += n / i;
        }

        return zeroes;
    }
}