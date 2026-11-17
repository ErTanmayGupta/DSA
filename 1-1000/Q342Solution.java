import java.util.*;

class Q342Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(isPowerOfFour(n));
    
  }
  public static boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 4 == 0){
            n = n / 4;
        }
        return n == 1;
    }
}
