/*.	Reverse a String
	•	Problem: Write a function that reverses a given string.
	•	Example: Input: "hello" → Output: "olleh"
	•	Concepts: String manipulation, two-pointer technique.  */

import java.util.Stack;

public class ReverseString {
    public static void main(String []args){
        String s="Hello";
        char c[]=s.toCharArray();
        Stack<Character> st= new Stack<>();
        char[] res;
        for(int i=0;i<c.length;i++){
            st.push(c[i]);

        }
        for(int j=0;j<c.length;j++){
           System.out.print(st.pop());
        }

    }
}
