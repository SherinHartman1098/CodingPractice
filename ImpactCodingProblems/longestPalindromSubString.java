package ImpactCodingProblems;

import java.util.Scanner;

public class longestPalindromSubString {
    public static String longestPalindrom(String s){
        if(s== null || s.length()<1) return  "";
        String result="";
        for(int i=0;i<s.length();i++){
            String odd= expandFromCenter(s,i,i);
            String even=expandFromCenter(s,i,i+1);
            if(odd.length()>result.length())result=odd;
            if(even.length()>result.length())result=even;
        }
        return result;
    }
    private static String expandFromCenter(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String  s= sc.nextLine();
        
        String res= longestPalindrom(s);
        System.out.println(res);
    }
}
