import java.util.*;
class Q258Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        if(num == 0){
            return 0;
        } 
        if(num % 9 == 0){
            return 9;
        }
        return num % 9;
    }
}
