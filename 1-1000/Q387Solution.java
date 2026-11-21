import java.util.*;
class Q3867olution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(firstUniqueCharacter(s));
    }

    public static int firstUniqueCharacter(String s){
        int n = s.length();
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] == 1){
                return i;
            }
        }

        return -1;
    }
}