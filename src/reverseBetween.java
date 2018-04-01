/**
 * Created by huzaifa.aejaz on 3/31/18.
 */
public class reverseBetween {
    ListNode finalNext = null;
    ListNode firstNext = null;
    ListNode reverse = null;
    public void reverseBetween(ListNode head, int m, int n) {

        reverseHelper(null, head, 1, 2,4);

    }
    private ListNode reverseHelper(ListNode prev, ListNode node, int count, int m , int n)
    {

        if(node.next == null) return node;
        if(count+1 == m) firstNext = node;
        reverseHelper(node, node.next, count+1, m, n);

        if(count <= n && count > m)
        {
            if(finalNext == null)
                finalNext = node.next;

        }
        if(node == firstNext){
            //firstNext.next.next = finalNext.next;
            firstNext.next = finalNext;
        }
        return node;
    }
}
