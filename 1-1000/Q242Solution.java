import java.util.*;
public class Q242Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(isAnagram(s , t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < t.length(); j++){
            freq[t.charAt(j) - 'a']--;
        }
        for(int count:freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
