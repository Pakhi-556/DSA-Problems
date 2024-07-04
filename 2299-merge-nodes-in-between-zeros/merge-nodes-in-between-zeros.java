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
    public ListNode mergeNodes(ListNode head) {

        if(head==null || head.next==null){
            return null;
        }

        ListNode demo=new ListNode(0);
        ListNode ans=demo;

        ListNode temp=head.next;
        int sum=0;

        while(temp!=null){
            if(temp.val==0){
                ListNode n=new ListNode(sum);
                ans.next=n;
                ans=ans.next;
                sum=0;
            }

            sum+=temp.val;

            temp=temp.next;
        }


        return demo.next;
        
    }
}