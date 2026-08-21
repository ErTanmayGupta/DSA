import java.util.*;

public class Q12Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(intToRoman(num));
    }
    
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){

                ans.append(symbols[i]);
                num -= values[i];
            }
        }
        return ans.toString();
    }
}
