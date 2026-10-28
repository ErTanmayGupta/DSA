import java.util.*;
class Q217Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> Hs = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(! Hs.contains(nums[i])){
                Hs.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}