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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer>s=new Stack<>();
        ListNode temp=head;
        int size=0;
        ArrayList<Integer>arr=new ArrayList<>();
        while(temp!=null){
            size++;
            arr.add(temp.val);
            temp=temp.next;
        }
        int[] result=new int[size];
        
        for(int i=result.length-1;i>=0;i--){
            while(!s.isEmpty() && arr.get(i)>=arr.get(s.peek())){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]=0;
            }
            else{
                result[i]=arr.get(s.peek());
            }
            s.push(i);
        }
        return result;
    }
}