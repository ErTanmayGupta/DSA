// LeetCode Problem No. 58 Length of last word
import java.util.*;
class Q58Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = lengthOfLastWord(s);
        System.out.println(res);
    }

    public static int lengthOfLastWord(String s) {
         s = s.trim();
        
        String[] words = s.split(" ");
        int lastwordlength = words[words.length - 1].length();

        return lastwordlength;
    }
} 