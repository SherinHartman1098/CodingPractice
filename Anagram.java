/*Determine if Two Strings are Anagrams
	•	Problem: Check if two strings are anagrams of each other.
	•	Example: Input: "listen" and "silent" → Output: true */
    import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String str2= sc.nextLine();
        if(str.length()!=str2.length()){
             System.out.println("The length of the inputs doesn't match with each other");
            return;
        }
        char[] ch=str.toCharArray();
        char[] ch2= str2.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ch2);
       Boolean isAnagram= Arrays.equals(ch,ch2);
       System.out.println(isAnagram);
        

    }
}
