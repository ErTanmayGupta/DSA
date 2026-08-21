// Leetcode Problem 9: Palindrome Number

import java.util.*;

public class Q9Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Is the number a palindrome? " + isPalindrome(x));
    }

    public static boolean isPalindrome(int x){
        if(x < 0) return false;
        int original = x;
        int reversed = 0;
        while(x != 0){  
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
