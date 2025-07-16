package ImpactCodingProblems;

import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){ val=x;}
}
public class MergeTwoList {
    public static ListNode MergeTwoList(ListNode l1, ListNode l2){
        ListNode dummy=new ListNode(-1),tail=dummy;
        while(l1!=null &&l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
            
        }
        tail.next=(l1!=null)?l1:l2;
        return dummy.next;
    } 
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
              // Input for list 1
              System.out.println("Enter number of nodes in list 1:");
              int n1 = sc.nextInt();
              System.out.println("Enter nodes of list 1 in sorted order:");
              ListNode l1 = new ListNode(sc.nextInt());
              ListNode curr = l1;
              for (int i = 1; i < n1; i++) {
                  curr.next = new ListNode(sc.nextInt());
                  curr = curr.next;
              }
      
              // Input for list 2
              System.out.println("Enter number of nodes in list 2:");
              int n2 = sc.nextInt();
              System.out.println("Enter nodes of list 2 in sorted order:");
              ListNode l2 = new ListNode(sc.nextInt());
              curr = l2;
              for (int i = 1; i < n2; i++) {
                  curr.next = new ListNode(sc.nextInt());
                  curr = curr.next;
              }
      
              // Merge and print
              ListNode merged = MergeTwoList(l1, l2);
              System.out.println("Merged Sorted List:");
              while (merged != null) {
                  System.out.print(merged.val + " ");
                  merged = merged.next;
              }
              System.out.println();
      
              sc.close();
    }
}
    