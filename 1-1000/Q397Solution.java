import java.util.*;
public class Q397Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(integerReplacement(n));
    }
    public static int integerReplacement(int n) {
        int oper = 0;
        long num = n;

        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                if(num == 3 || (num & 3) == 1){
                    num -= 1;
                }
                else{
                    num += 1;
                }
            }

            oper++;
        }

        return oper;
    }
}