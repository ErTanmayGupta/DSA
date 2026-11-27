import java.util.*;

public class Q400Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(findNthDigit(n));
    }

    public static int findNthDigit(int n) {
        long len = 1;
        long count = 9;
        long start = 1;

        while(n > len * count){
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }

        long targetNumber = start + (n - 1) / len;

        String s = Long.toString(targetNumber);
        int digitIndex = (int)((n - 1) % len);

        return Character.getNumericValue(s.charAt(digitIndex));
    }
}
