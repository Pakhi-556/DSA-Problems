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

    public int gcd(int a,int b){
        if(a==0){
            return b;
        }

        return gcd(b%a,a);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode curr=head.next;
        ListNode prev=head;

        while(curr!=null){
            int gcd=gcd(curr.val,prev.val);
            ListNode newnode=new ListNode(gcd);
            prev.next=newnode;
            newnode.next=curr;
            prev=curr;
            curr=curr.next;
        }

        return head;
        
    }
}