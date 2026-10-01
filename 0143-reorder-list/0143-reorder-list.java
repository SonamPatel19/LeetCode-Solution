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
    public static ListNode getMid(ListNode head){
         ListNode slow=head;
         ListNode fast=head.next;
         while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         return slow;
    }
    public static ListNode reverse(ListNode mid){
        ListNode curr=mid;
        ListNode prev =null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
         return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid=getMid(head);
         // second half ka head
        ListNode second = mid.next;

        // first half ko separate karo
        mid.next = null;

        // second half reverse
        second = reverse(second);

        ListNode first = head;
        while(second!=null){
            ListNode  firstnode=first.next;
             ListNode secnode=second.next;
            first.next=second;
            second.next=firstnode;
            first=firstnode;
            second=secnode;
        }
    }
}