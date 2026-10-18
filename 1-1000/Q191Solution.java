import java.util.*;
class Q191Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;

        while(n != 0){
            n = n & (n-1);
            count++;
        }

        return count;
    }
}