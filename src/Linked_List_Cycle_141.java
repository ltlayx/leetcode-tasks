import java.util.HashSet;
import java.util.Set;

/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */
public class Linked_List_Cycle_141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<ListNode>();
        while(head != null){
            if(!nodeSet.contains(head)){
                nodeSet.add(head);
            }else{
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
