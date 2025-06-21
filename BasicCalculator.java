/*
 * Implement a Basic Calculator
	•	Problem: Create a function that evaluates a simple arithmetic expression string containing non-negative integers, +, -, *, and / operators.
	•	Example: Input: "3+2*2" → Output: 7
	•	Concepts: Stack, operator precedence. 
 */

import java.util.Scanner;

public class BasicCalculator {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("**** Basic Calculator****");
        System.out.println("Input your choice:\n 1. Add \n 2. Subtract\n 3. Multiply\n 4.Divide");
        int choice=sc.nextInt();
        int num1= sc.nextInt();
        int num2=sc.nextInt();

        BasicCalculator obj= new BasicCalculator();
        obj.calculate(choice,num1,num2);
    }
    public void calculate(int choice,int num1,int num2){
        int res=0;
       switch (choice) {    
        case 1:
            res=Math.addExact(num1, num2);
            System.out.println("Resulst :"+res);
            break;
        case 2:
            res=Math.subtractExact(num2, res);
            System.out.println("Resulst :"+res);
            break;
        case 3:
            res= Math.multiplyExact(num2, res);
            System.out.println("Resulst :"+res);
            break;
        case 4:
            res= Math.divideExact(num2, res);
            System.out.println("Resulst :"+res);
            break;

        default:
        System.out.println("Invalid choide. Please enter the correct choice");
            break;
       } 

        
       
    }

}
