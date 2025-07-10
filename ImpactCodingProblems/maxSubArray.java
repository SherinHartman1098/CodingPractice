package ImpactCodingProblems;

import java.util.*;

public class maxSubArray {
    public static int maxSubArrays(int[] nums){
        int maxSum=nums[0];
        int currSum=nums[0];
        for(int i=0;i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);

            maxSum=Math.max(maxSum, currSum);
        }

        return maxSum;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
       int res= maxSubArrays(nums);
       System.out.println(res);
    }
}
