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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> vals = new Stack<>();
        ListNode current = head;
        while(current!= null){
            vals.push(current.val);
            current = current.next;
}
        current = head;
        while(current != null){
            if(current.val != vals.peek()){
                return false;
}
            current = current.next;
            vals.pop();
            
}
        return true;
        
    }
}