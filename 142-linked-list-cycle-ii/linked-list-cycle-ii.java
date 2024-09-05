/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       
        ListNode fast=head;
          ListNode slow=head;

        /*if(head==null || head.next==null){
            return null;
        }

        HashMap<ListNode,Integer> vs=new HashMap();
        


        while(fast!=null){
            
          vs.put(fast,vs.getOrDefault(fast,0)+1);
           

           if(vs.get(fast)>1){
               return fast;
           }
            fast=fast.next;
           
        }*/

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }


        return null;
    }
}