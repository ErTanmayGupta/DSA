import java.util.*;

public class Q371Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums1 = sc.nextInt();
        int nums2 = sc.nextInt();

        System.out.println(getSum(nums1, nums2));
    }

    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
