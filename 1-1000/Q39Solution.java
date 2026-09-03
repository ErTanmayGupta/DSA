// LeetCode Problem 39: Combination Sum
import java.util.*;
class Q39Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[n];
        for(int i = 0; i < n; i++){ 
            candidates[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Q39Solution solution = new Q39Solution();
        List<List<Integer>> ans = solution.combinationSum(candidates , target);
        System.out.println(ans);
    }
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        backSum(candidates , target , temp , 0 , 0);
        return ans;
    }
    public void backSum(int[] cand, int target , List<Integer> temp , int sum ,int i){
        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum > target || i >= cand.length){
            return;
        }

        temp.add(cand[i]);
        backSum(cand , target , temp , sum + cand[i] , i);
        temp.remove(temp.size()-1);
        backSum(cand , target , temp , sum , i+1);
    }
}