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
    public boolean hasCycle(ListNode head) {
       
        ListNode temp = head;
        HashMap<ListNode,Integer> vals = new HashMap<>();
        while(temp != null){
            if(vals.containsKey(temp)){
                return true;
}
            vals.put(temp,1);
            
            temp = temp.next;
}
        return false;
        
    }
}