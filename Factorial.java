/*Calculate Factorial Using Recursion
	•	Problem: Write a recursive function to calculate the factorial of a number.
	•	Example: Input: 5 → Output: 120
	•	Concepts: Recursion, base cases. */
import java.util.*;
public class Factorial {

    public int factorial(int n){
        if(n==0||n==1)
        return 1;
        else
            return n*factorial(n-1);
        
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Factorial obj= new Factorial();
        int res=obj.factorial(n);
        System.out.println("Factorial of " + n + " is: " + res);
    }
}
