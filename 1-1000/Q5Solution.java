// Leetcode Problem 5: Longest Palindromic subString
import java.util.*;
public class Q5Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Longest Palindromic Substring : " + longestPalindrome(s));

    }

    public static String longestPalindrome(String s){
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s , i ,i);
            int len2 = expandAroundCenter(s , i , i+1);
            int len = Math.max(len1 , len2);

            if(len > end - start + 1){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start , end + 1);
    }

    private static int expandAroundCenter(String s , int left , int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}