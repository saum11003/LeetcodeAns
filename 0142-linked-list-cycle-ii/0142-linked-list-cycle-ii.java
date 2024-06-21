/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> vals = new HashMap<>();
        ListNode current = head;
        
        
        while(current != null){
            if(vals.containsKey(current)){
                return current;
}else{
vals.put(current,1);
            }
            current = current.next;
            
}
        return null;
        
    }
}