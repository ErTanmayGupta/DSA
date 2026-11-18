import java.util.*;
class Q367Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num) {
        if(num < 0) return false;
        long left = 0, right = num;
        while(left <= right){
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if(square == num) return true;
            else if(square < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
