import java.util.*;
class Q389Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] == 0) return c;
            freq[c - 'a']--;
        }

        return ' ';
    }
}