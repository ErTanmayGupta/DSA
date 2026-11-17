import java.util.*;
class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums1 = new int[n];

        for(int i = 0; i < n; i++){
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] nums2 = new int[m];

        for(int i = 0; i < m; i++){
            nums2[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        int[] result = obj.intersection(nums1, nums2);

        System.out.println("Intersection of two arrays:");

        System.out.println(Arrays.toString(result));

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for(int num : nums2){
            if(set.contains(num)){
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;

        for(int num : resultSet){
            result[index++] = num;
        }

        return result;
    }
}
