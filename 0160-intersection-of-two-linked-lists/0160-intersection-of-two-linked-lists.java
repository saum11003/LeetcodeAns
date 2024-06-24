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
//         HashMap<ListNode, Integer> vals = new HashMap<>();
        
//         ListNode tempA = headA;
//         while(tempA != null){
//             vals.put(tempA, 1);
//             tempA = tempA.next;
// }
//         ListNode tempB = headB;
//         while(tempB != null){
//             if(vals.containsKey(tempB)){
//                 return tempB;
// }
//             tempB = tempB.next;
// }
//         return null;
        int cntA = 0;
        ListNode tempA = headA;
        while(tempA != null){
            tempA = tempA.next;
            cntA++;
        }
        int cntB = 0;
        ListNode tempB = headB;
        while(tempB != null){
            tempB = tempB.next;
            cntB++;
        }
        tempA= headA;
        tempB = headB;
        int val =0;
        if(cntB>cntA){
            val= cntB-cntA;
            while(val != 0){
                tempB= tempB.next;
                val--;
            }
        }else if(cntA>cntB){
            val=cntA-cntB;
            while(val != 0){
                tempA= tempA.next;
                val--;
            }
        }else{
            val=cntA-cntB;
        }
        while(tempA != null){
            if(tempA ==tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
       
    }
}