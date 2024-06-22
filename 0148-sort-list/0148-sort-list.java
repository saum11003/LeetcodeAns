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
import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> vals = new ArrayList<>();
        ListNode current = head;
        
        while(current != null){
            vals.add(current.val);
            current = current.next;
        }
        Collections.sort(vals);
        current = head;
        int i =0;
        
        while(current != null){
            current.val = vals.get(i);
            i++;
            current = current.next;
            
}
        return head;
        
    }
}