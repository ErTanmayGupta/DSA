import java.util.*;
public class Q263Solving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isUgly(n));
    }

    public static boolean isUgly(int n) {
        if (n <= 0){
            return false;
        }
        int[] factors = {2,3,5};

        for(int f : factors){
            while(n % f == 0){
                n = n / f;
            }
        }

        return n == 1;
    }
}
