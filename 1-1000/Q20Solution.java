// Leetcode problem 20: Valid Parentheses
import java.util.*;
public class Q20Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Q20Solution solution = new Q20Solution();
        boolean result = solution.isValid(s);
        System.out.println(result);
    }
    // Approach 1 : Without using stack
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }


    /***
        * Approach 2 : Using Stack
        public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
     */
}
