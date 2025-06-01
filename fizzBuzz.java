/*Implement FizzBuzz
	•	Problem: Print numbers from 1 to n. For multiples of 3, print "Fizz"; for multiples of 5, print "Buzz"; for multiples of both, print "FizzBuzz".
	•	Example: Input: 5 → Output: 1, 2, Fizz, 4, Buzz
	•	Concepts: Loops, conditional statements. */
import java.util.*;
public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){

            System.out.print("Fizz"+" ");
            }
            else if(i%5==0) {
                System.out.print("Buzz"+" ");
            }
            else if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz"+" ");
            }
            else
            {
            System.out.print(i+" ");
            }
        }
        
    }
}
