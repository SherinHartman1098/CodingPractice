/*	Find the Missing Number in a Sequence
	•	Problem: Given an array containing n distinct numbers taken from 0 to n, find the one that is missing.
	•	Example: Input: [3,0,1] → Output: 2
	•	Concepts: Mathematical formulas, array manipulation.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        
    }
}
