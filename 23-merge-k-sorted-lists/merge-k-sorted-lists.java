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
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists==null || lists.length==0){
            return null;
        }

        return divide(lists,0,lists.length-1);
        
    }

    public ListNode divide(ListNode[] lists,int start,int end){
        if(start==end){
              return lists[start];
        }

        int mid=start+(end-start)/2;
        ListNode left=divide(lists,start,mid);
        ListNode right=divide(lists,mid+1,end);

        return merge(left,right);
    } 
/// methode for merging two linked list
    public ListNode merge(ListNode l1, ListNode l2){
            ListNode l=new ListNode(0), p=l;

            while(l1!=null && l2!=null){
                if(l1.val>l2.val){
                    p.next=l2;
                    l2=l2.next;

                }else{
                    p.next=l1;
                    l1=l1.next;
                }
                  
               p=p.next;
            }

            while(l1!=null){
                p.next=l1;
                p=p.next;
                l1=l1.next;
            }
             while(l2!=null){
                p.next=l2;
                p=p.next;
                l2=l2.next;
            }

            return l.next;
        }
}