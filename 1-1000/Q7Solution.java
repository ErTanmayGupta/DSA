// LeetCode problem no. 7 : Reverse Integer
import java.util.Scanner;

public class Q7Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Reversed integer: " + reverseInteger(num));
    }

    public static int reverseInteger(int x) {
        long reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0; 
            }
        }
        return (int)reversed;
    }
}