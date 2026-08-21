// Leetcode problem 17: Letter Combinations of a Phone Number
import java.util.*;

public class Q17Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        List<String> combinations = letterCombinations(digits);
        System.out.println(combinations);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        int index = 0;
        StringBuilder curr = new StringBuilder();
        String[] mapping = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        Combination(digits , index , curr , mapping , result);

        return result;
    }

    static void Combination(String digits , int index , StringBuilder curr , String[] mapping , List<String> result){
        int n = digits.length();
        if(index >= n){
            result.add(curr.toString());
            return;
        }

        int val = digits.charAt(index) - '0';
        String temp = mapping[val];

        for(int i = 0; i < temp.length(); i++){
            curr.append(temp.charAt(i));
            Combination(digits , index + 1 , curr , mapping , result); // Recursive Call
            curr.deleteCharAt(curr.length() - 1);  // Backtracking
        }
    }
}
