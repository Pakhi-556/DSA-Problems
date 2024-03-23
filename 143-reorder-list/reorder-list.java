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

      public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode rev(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
      return prev;
    }

    public void reorderList(ListNode head) {
        
 ListNode mid=mid(head);
 ListNode slist=mid.next;
 mid.next=null;
 ListNode l2=rev(slist);

 ListNode l1=head;
 ListNode temp;
 while(l1!=null && l2!=null){
    temp=l1.next;
    l1.next=l2;
    l1=l2;
    l2=temp;
 }
    }
}