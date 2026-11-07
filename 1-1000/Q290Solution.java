
import java.util.*;

class Q290Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pattern = sc.nextLine();
        String s = sc.nextLine();

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.trim().split("\\s+");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, Integer> HM1 = new HashMap<>();
        HashMap<String, Integer> HM2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            Integer a = HM1.put(pattern.charAt(i), i);
            Integer b = HM2.put(words[i], i);

            if (!Objects.equals(a, b)) {
                return false;
            }
        }

        return true;
    }
}
