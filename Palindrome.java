
import java.util.*;

public class Palindrome {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        //eg: s="racecar"
        s=s.toLowerCase();
        int left=0;
        int right= s.length()-1;
        Boolean palindrome=true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                palindrome=false;
                break;
            }
            left++;
            right--;
        }
       if(palindrome){

        System.out.println("Palindrome");
       }
       else{
        System.out.println("Not Palindrome");
       }
        

        
    }
}
