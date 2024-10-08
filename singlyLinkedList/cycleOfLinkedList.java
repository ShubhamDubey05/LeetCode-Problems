package singlyLinkedList;

class ListNode {
    int val;
        ListNode next;
        ListNode(int x) {
             val = x;
             next = null;
         }
     }

    class Solution {
       public boolean hasCycle(ListNode head) {
   
           if(head==null){
               return false;
           }
              if( head.next ==null){
               return false;
           }
          
           ListNode slow=head;
           ListNode fast=head;
   
           while(fast!=null){
   
               if(slow == null){
                   return false;
               }
               slow=slow.next;
               if(fast.next == null){
                   return false;
               }
               fast=fast.next.next;
   
               if(fast==slow){
                   return true;
               }
           }
           return false;
   
       }
    }


public class cycleOfLinkedList {
    public static void main(String[] args) {
    
}
    
}
