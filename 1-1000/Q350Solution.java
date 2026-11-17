import java.util.*;
class Q350Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for(int i=0;i<n;i++){
            nums1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for(int i=0;i<n2;i++){
            nums2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> HM = new HashMap<>();
        List<Integer> Temp = new ArrayList<>();

        for(int num : nums1){
            HM.put(num , HM.getOrDefault(num,0) + 1);
        }

        for(int num : nums2){
            if(HM.containsKey(num) && HM.get(num) > 0){
                Temp.add(num);
                HM.put(num, HM.get(num) - 1);
            }
        }

        int[] arr = new int[Temp.size()];
        for(int i = 0; i < Temp.size(); i++){
            arr[i] = Temp.get(i);
        }

        return arr;
    }
}