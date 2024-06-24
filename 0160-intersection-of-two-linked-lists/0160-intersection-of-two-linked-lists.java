/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        HashMap<ListNode, Integer> vals = new HashMap<>();
        
        ListNode tempA = headA;
        while(tempA != null){
            vals.put(tempA, 1);
            tempA = tempA.next;
}
        ListNode tempB = headB;
        while(tempB != null){
            if(vals.containsKey(tempB)){
                return tempB;
}
            tempB = tempB.next;
}
        return null;
    }
}