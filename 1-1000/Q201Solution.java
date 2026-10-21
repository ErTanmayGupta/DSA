import java.util.*;
class Q201Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        System.out.println(rangeBitwiseAnd(left , right));
    }

    public static int rangeBitwiseAnd(int left , int right){
        while(right > left){
            right = right & (right - 1);
        }

        return right;
    }
}