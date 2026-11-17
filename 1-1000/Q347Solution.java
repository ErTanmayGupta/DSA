import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
          nums[i] = sc.nextInt();
        }
      
        int k = sc.nextInt();
        
        Solution ob = new Solution();
        int[] result = ob.topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
    }

    public int[] topKFrequent(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];

        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int offset = -min;

        int[] freq = new int[max - min + 1];

        for(int i = 0; i < nums.length; i++){
            freq[nums[i] + offset]++;
        }

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            int maxFreq = -1;
            int maxFreqIdx = -1;

            for(int j = 0; j < freq.length; j++){
                if(freq[j] > maxFreq){
                    maxFreq = freq[j];
                    maxFreqIdx = j;
                }
            }

            ans[i] = maxFreqIdx - offset;
            freq[maxFreqIdx] = 0;
        }

        return ans;
    }
}
