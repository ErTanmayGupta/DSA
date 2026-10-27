import java.util.*;
public class Q215Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(findKthLargestElement(nums , k));
    }

    public static int findKthLargestElement(int[] nums , int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        return minHeap.peek();
        
    }
}
