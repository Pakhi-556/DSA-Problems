/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {

        Stack<ListNode> s=new Stack();

        ListNode curr=head;

        while(curr!=null){
            while(!s.isEmpty() && s.peek().val<curr.val){
                s.pop();
            }

            s.push(curr);
            curr=curr.next;
        }
        ListNode nxt=null;
        while(!s.isEmpty()){
          curr=s.pop();
          curr.next=nxt;
          nxt=curr;
        }
        
        return curr;
    }
}