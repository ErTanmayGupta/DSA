import java.util.Scanner;
public Q345Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = reverseVowels(s);

        System.out.println("Reversed Vowels: " + result);

        sc.close();
    }

    public static String reverseVowels(String s) {
        char[] st = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while(start < end){

            if(!isVowel(st[start])){
                start++;
            }

            if(!isVowel(st[end])){
                end--;
            }

            if(isVowel(st[start]) && isVowel(st[end])){
                char temp = st[start];
                st[start] = st[end];
                st[end] = temp;

                start++;
                end--;
            }
        }

        return new String(st);
    }

    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

}
