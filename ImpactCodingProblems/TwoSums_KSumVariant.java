package ImpactCodingProblems;


import java.util.*;

public class TwoSums_KSumVariant {

    public static int[] twoSum(int[] nums, int target){

        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement= target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
        
    }
}
