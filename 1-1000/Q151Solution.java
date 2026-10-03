import java.util.*;

class Q151Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverseWords(s));
    } 
    
    public static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
