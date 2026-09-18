// LeetCode Problem 67: Add Binary
import java.util.*;

public class Q67Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(addBinary(a, b));
    }


    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        int base = 2;
        StringBuffer result = new StringBuffer();
        while(i >= 0 || j >= 0){
            int num1 = 0;
            int num2 = 0;
            int sum = 0;
            if(i >= 0){
                num1 = a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                num2 = b.charAt(j) - '0';
                j--;
            }
            sum = num1 + num2 + carry;
            if(sum >= base){
                carry = 1;
                sum = sum-base;
            }
            else{
                carry = 0;
            }
            result.append(sum);
        }
        if(carry == 1){
            result.append(1);
        }
        return result.reverse().toString();
    }
}
