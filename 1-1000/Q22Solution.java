// Leetcode Porblem 22: Generate Parentheses
import java.util.*;
public class Q22Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Q22Solution solution = new Q22Solution();
        List<String> ans = solution.generateParenthesis(n);
        for(String str : ans){
            System.out.println(str);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = n;
        int close = n;
        String curr = "";
        Parenthesis(open , close , curr , ans);
        return ans;
    }

    void Parenthesis(int open , int close , String curr , List<String> ans){
        // Base Case
        if(open == 0 && close == 0){
            ans.add(curr);
            return ;
        }

        if( open != 0){
            String op1 = curr;
            op1 += '(';
            Parenthesis(open - 1 , close , op1 , ans);
        }

        if(close > open){
            String op2 = curr;
            op2 += ')';
            Parenthesis(open , close - 1 , op2 , ans);
        }
    }
}