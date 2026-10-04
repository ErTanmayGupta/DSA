// Leetcode Problem 47: Permutations II
import java.util.*;

class Q47Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<>();
        int index = 0;
        permutations(nums , outerList , index);
        return outerList;
    }

    public static void permutations(int[] nums , List<List<Integer>> outerList , int index){
        int n = nums.length;
        if(index >= n){
            List<Integer> innerList = new ArrayList<>();
            for(int num : nums){
                innerList.add(num);
            }
            outerList.add(innerList);
            return;
        }

        Set<Integer> s = new HashSet<>();
        for(int i = index; i < n; i++){
            if(s.contains(nums[i])){
                continue;
            }
            s.add(nums[i]);
            swap(nums , index , i);
            permutations(nums , outerList , index + 1);
            swap(nums , index , i);
        }
    }

    public static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
