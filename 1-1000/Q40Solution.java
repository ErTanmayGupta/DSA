// LeetCode Problem - Combination Sum II
import java.util.*;
class Q40Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[n];
        for(int i = 0; i < n; i++){ 
            candidates[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Q40Solution solution = new Q40Solution();
        List<List<Integer>> result = solution.combinationSum2(candidates, target);
        for(List<Integer> combo : result){
            System.out.println(combo);
        }
    }

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        backSum(candidates , target , temp , 0 , 0);
        return ans;
    }

    public void backSum(int[] cand , int target , List<Integer> temp , int sum , int i){
        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(sum > target || i >= cand.length){
            return;
        }

        // Take
        temp.add(cand[i]);
        backSum(cand , target , temp , sum + cand[i] , i+1);
        temp.remove(temp.size()-1);

        // Skip
        while(i + 1 < cand.length && cand[i] == cand[i+1]){
            i++;
        }

        backSum(cand, target, temp, sum, i + 1);
    }
}