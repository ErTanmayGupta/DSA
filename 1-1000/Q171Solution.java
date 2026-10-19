import java.util.*;
class Q171Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(titleToNumber(s));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for(int i = 0; i < columnTitle.length(); i++){
            int digitValue = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + digitValue;
        }

        return result;
    }
}