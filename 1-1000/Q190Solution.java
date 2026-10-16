import java.util.*;
class Q190Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            result <<= 1;
            result = result | (n & 1);
            n >>=  1;
        }
        return result;
    }
}