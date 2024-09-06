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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet();
        if(head==null){
            return head;
        }

        for(int i:nums){
            set.add(i);
        }
        

        while(head!=null && set.contains(head.val)){
            head=head.next;
        }

        ListNode temp=head;
        ListNode prev=head;

        while(temp!=null){
            if(set.contains(temp.val)){
                prev.next=temp.next;
                temp=temp.next;
            }
           else{
            prev=temp;
            temp=temp.next;
        }
        }

        return head;
    }
}