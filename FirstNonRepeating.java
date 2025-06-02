/*Find the First Non-Repeating Character in a String
	•	Problem: Identify the first character that does not repeat in a string.
	•	Example: Input: "swiss" → Output: "w"
	•	Concepts: Hash maps, string traversal. ￼ */
import java.util.*;
public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        sc.close();
        Map<Character,Integer>charCountMap= new HashMap<>();
        Queue <Character> nonRepeat= new LinkedList<>();
      for(char c:s.toCharArray()){
        charCountMap.put(c,charCountMap.getOrDefault(c, 0) +1);
        nonRepeat.offer(c);
        while (!nonRepeat.isEmpty()&&charCountMap.get(nonRepeat.peek())>1) {
            nonRepeat.poll();
        }
      }
        System.out.println(nonRepeat.isEmpty()? null:nonRepeat.peek());
    }
}
