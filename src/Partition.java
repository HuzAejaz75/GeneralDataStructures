/**
 * Created by huzaifa.aejaz on 3/31/18.
 */
public class Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode firstHead = new ListNode(0);
        firstHead.next = head;
        ListNode secondHead = new ListNode(x);


        ListNode first = firstHead;
        ListNode second = secondHead;
        ListNode curNode = head;
        while (curNode != null) {
            ListNode tmp = curNode.next;
            if (curNode.val < x) {

                first.next = curNode;
                first = curNode;
            } else {
                second.next = curNode;
                second = curNode;
                second.next = null;// important
            }
            curNode = tmp;
        }
       // first.next = secondHead.next;
        return firstHead.next;
    }
}


