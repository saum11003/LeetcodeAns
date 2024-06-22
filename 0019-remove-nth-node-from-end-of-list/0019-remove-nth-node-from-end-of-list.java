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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int cnt =0;
        while(temp != null){
            temp = temp.next;
            cnt ++;
        }
        
        if(cnt == n){
            ListNode newh = head.next;
            head = null;
            return newh;
}
        
        int val = cnt - n;
        temp = head;
        cnt = 1;
        while(temp != null){
            if(val == cnt){
                temp.next = temp.next.next;
            }
            temp = temp.next;
            cnt++;
            
        }
        return head;
    }
}