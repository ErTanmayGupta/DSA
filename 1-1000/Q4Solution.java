// Leetcode Problem 4: Median of Two Sorted Arrays
import java.util.*;
public class Q4Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for(int i = 0; i < n1; i++){
            nums1[i] = sc.nextInt();
        }
        
        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for(int i = 0; i < n2; i++){
            nums2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int size = nums1.length + nums2.length;
        int[] merged = new int[size];

        for(int i = 0; i < nums1.length; i++){
            merged[i] = nums1[i];
        }

        for(int j = 0; j < nums2.length; j++){
            merged[nums1.length + j] = nums2[j];
        }
        
        Arrays.sort(merged);

        if(size % 2 != 0){
        median = merged[size / 2];
        }
        else{
            median = (merged[size / 2] + merged[(size / 2) - 1]) / 2.0;
        }

        return median;
    }
}
