import java.util.*;

class Q292Solution{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(canWinNim(n));
  }

  public static boolean canWinNim(int n) {
        return n % 4 != 0;
  }
}
