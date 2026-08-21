// LeetCode Problem no.3
import java.util.*;

public class Q3Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);

        sc.close();
    }

    public static int lengthOfLongestSubstring(String s) {
    HashSet<Character> HS = new HashSet<>();
    int left = 0;
    int max = 0;

    for (int right = 0; right < s.length(); right++) {

        while (HS.contains(s.charAt(right))) {
            HS.remove(s.charAt(left));
            left++;
        }

        HS.add(s.charAt(right));
        max = Math.max(max, right - left + 1);
    }

    return max;
    }
}