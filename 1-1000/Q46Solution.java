// LeetCode Problem 46: Permutations
import java.util.*;
class Q46Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> outerList = new ArrayList<>();
        int index = 0;
        permutation(nums , outerList , index);
        return outerList;
    }

    public static void permutation(int[] nums , List<List<Integer>> outerList , int index){
        int n = nums.length;
        if(index == n){
            List<Integer> innerList = new ArrayList<>();
            for(int num: nums){
                innerList.add(num);
            }
            outerList.add(innerList);
            return;
        }
        for(int i = index; i < n; i++){
            swap(nums , index , i);
            permutation(nums , outerList , index + 1);
            swap(nums , index , i);
        }
    }

    public static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}