import java.util.*;

class Q38Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        String current = "1";
        
        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder();
            int length = current.length();
            int j = 0;
            
            while (j < length) {
                int count = 1;
                while (j + 1 < length && current.charAt(j) == current.charAt(j + 1)) {
                    count++;
                    j++;
                }
                next.append(count).append(current.charAt(j));
                j++;
            }
            current = next.toString();
        }
        
        return current;
    }
}