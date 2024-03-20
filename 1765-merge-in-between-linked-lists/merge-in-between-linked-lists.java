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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        if(list1==null){
           return list2;
        }
        int k=b-a+1;
        ListNode l2=list2;
        while(l2.next!=null){
            l2=l2.next;
        }

        ListNode temp=list1;
        ListNode prev=list1;

        for(int i=0;i<a-1;i++){
          temp=temp.next;
          prev=prev.next; 
        }
        
        while(k-->=0){
           prev=prev.next;
        }

        temp.next=list2;
        l2.next=prev;

        return list1;
    }
}