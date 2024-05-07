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
    public ListNode doubleIt(ListNode head) {

        /*if(head==null){
            return head;
        }

        if(head.next==null && head.val==0){
            return head;

        }
        ListNode temp=head;
        long n=0;
        while(temp!=null){
           n=(int)n*10+temp.val;
           temp=temp.next;
        }

        n=n*2;
        ListNode nxt=null;

        while(n>0){
            int ld=(int)n%10;
            ListNode newn=new ListNode(ld);
            newn.next=nxt;
            nxt=newn;
            n/=10;
        }


       return nxt;*/

       if(head.val>4){
        head=new ListNode(0,head);

       }

       ListNode temp=head;

       while(temp!=null){
        temp.val=(temp.val*2)%10;

        if(temp.next!=null && temp.next.val>4){
            temp.val++;
        }

        temp=temp.next;

       }


       return head;
    }
}