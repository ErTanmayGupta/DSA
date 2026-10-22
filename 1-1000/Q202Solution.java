import java.util.*;
class Q202Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> Hs = new HashSet<>();
        while(n != 1){

            if(Hs.contains(n)){
                return false;
            }

            Hs.add(n);
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }
        
        return true;
    }
}