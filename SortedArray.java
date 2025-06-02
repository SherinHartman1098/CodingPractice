/*.	Merge Two Sorted Arrays
	•	Problem: Given two sorted arrays, merge them into a single sorted array.
	•	Example: Input: [1,3,5] and [2,4,6] → Output: [1,2,3,4,5,6]
	•	Concepts: Two-pointer technique, array manipulation. ￼ ￼ */
import java.util.*;
public class SortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int [] arr1=new int[n1];
        int [] arr2= new int[n2];

        for(int i=0;i<n1;i++){
            
            arr1[i]=sc.nextInt();
        }
            for(int j=0;j<n2;j++){
            arr2[j]= sc.nextInt();
        }
        int[] merger= new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, merger, 0, n1);
        System.arraycopy(arr2, 0, merger, n1, n2);
        // System.arraycopy(arr2, n2, merger, n1, n2);
        Arrays.sort(merger);
        System.out.println(Arrays.toString(merger));
    }
    // public void mergeArrays(int[] arr1, int []arr2){
          
    // int [] merger= new int[n1+n2];
    // for(int i=0;i<merger.length;i++){
    //     merger[i]+=arr1[i];
    //     merger[i]+=arr2[i];
    // }
    
    // for(int j=0;j<merger.length;j++){
    //     System.out.print(merger[j]);
    // }
    // }
}
