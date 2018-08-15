/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * <p>
 * <p>
 * For example, the following two linked lists:
 * <p>
 * A:          a1 → a2
 *                    ↘
 *                    c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 * <p>
 * <p>
 * Notes:
 * <p>
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class Intersection_of_Two_Linked_Lists_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        int countEnd = 0;
        while(p != null && q != null && countEnd < 3){
            if(p.equals(headB)) countEnd++;
            if(q.equals(headA)) countEnd++;
            if(p.equals(q)) return p;
            p = (p.next == null) ? headB : p.next;
            q = (q.next == null) ? headA : q.next;
        }
        return null;
    }
}
