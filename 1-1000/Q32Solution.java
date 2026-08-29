// LeetCpde Problem No.32 - Longest Valid parentheses
import java.util.*;
public class Q32Solution {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> para = new Stack<>();
        para.push(-1);
        int ans = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                para.push(i);
            }
            else{
                para.pop();
            }

            if (para.isEmpty()) {
                para.push(i);
            }
            else {
                ans = Math.max(ans, i - para.peek());
            }
        }

        return ans;
    }
}
