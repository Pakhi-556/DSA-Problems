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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int res[]=new int[]{-1,-1};
        Integer prev_cri=null;
        Integer first_cri=null;

        ListNode prev=head;
        ListNode curr=head.next;

        int cur_ind=1;

        while(curr.next!=null){
            if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val)){
             
             if(prev_cri!=null){
                res[0]=(res[0]==-1)? cur_ind-prev_cri : Math.min(res[0], cur_ind - prev_cri);
             }else{
                first_cri=cur_ind;
             }

             prev_cri=cur_ind;
            }
            prev=curr;
            curr=curr.next;
            cur_ind++;
        }

        if (prev_cri != null && !prev_cri.equals(first_cri)) {
            res[1] = prev_cri - first_cri;
        }

        return res;
        
    }
}