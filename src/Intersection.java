/**
 * Created by huzaifa.aejaz on 4/2/18.
 */
public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        int m = 0, n = 0;
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(headA!= null){
            m++;
            headA = headA.next;
        }
        while(headB != null){
            n++;
            headB = headB.next;
        }
        ListNode longer = null, shorter = null;
        if(m > n){
            longer = p1;
            shorter = p2;
        }
        else
        {
            longer = p2;
            shorter = p1;
        }

        for(int i  = 0; i < Math.abs(m-n); i++){
            longer = longer.next;
        }
        while(longer!= null && shorter != null){
            if(longer == shorter){
                return longer;
            }
            longer = longer.next;
            shorter = shorter.next;
        }
        return null;
    }
}
