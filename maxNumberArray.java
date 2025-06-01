/*Find the Maximum Number in an Array
	•	Problem: Given an array of integers, find the maximum value.
	•	Example: Input: [1, 3, 7, 2, 5] → Output: 7
	•	Concepts: Array traversal, comparison operations. */

import java.util.*;
public class maxNumberArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num[]=new int[n];
        
        
        
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
            
        }
        int currMax=num[0];
        for(int j=1;j<num.length;j++){
            if(num[j]>currMax){
                currMax=num[j];
            }
        }
        System.out.println(currMax);

    }
}
