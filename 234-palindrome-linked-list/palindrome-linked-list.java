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
    public static ListNode reverse(ListNode head){
    if(head==null){
        return null;
    }

    ListNode prev=null;
    ListNode curr=head;
    ListNode next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

    return prev;
 }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
       /* Stack<Integer> s=new Stack();
        ListNode temp=head;
        int l=1;
        while(temp.next!=null){
           temp=temp.next;
           l++;
        }

        temp=head;

        for(int i=0;i<l;i++){
            if(i<(l/2)){
                s.push(temp.val);
            }

            else if(s.peek()==temp.val){
                s.pop();
            }

            temp=temp.next;
        }

       if(s.isEmpty()){
           return true;
       }
        
        return false;*/
        
 ListNode slow=head;
 ListNode fast=head;
 while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
 }

 ListNode l2=reverse(slow);
 ListNode temp=head;
 ListNode temp2=l2;

 while(temp2!=null){
    if(temp.val!=temp2.val){
        return false;
    }
    temp=temp.next;
    temp2=temp2.next;
 }

 return true;
        
    }
}