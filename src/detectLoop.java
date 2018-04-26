/**
 * Created by huzaifa.aejaz on 4/1/18.
 */
public class detectLoop {
    public ListNode myApproach(ListNode head) {


        ListNode finalReturn = null;
        if(head == null ) return finalReturn;
        ListNode slowNode = head;
        ListNode fastNode = head;

        while(slowNode != null && fastNode != null)
        {

            if((slowNode!=null && slowNode.next==slowNode)|| (fastNode!= null && (fastNode.next == slowNode ||fastNode.next==fastNode)))
            {
                finalReturn = slowNode;
                break;
            }
            fastNode = fastNode.next;
            if(fastNode.next == null )
                slowNode = slowNode.next;
        }

        return finalReturn;

    }

    public ListNode theirApproach(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                ListNode slow2 = head;
                while (slow2 != slow){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }

}
