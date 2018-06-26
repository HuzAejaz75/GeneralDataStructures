/**
 * Created by huzaifa.aejaz on 5/1/18.
 */
public class removeDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int target;
        ListNode first = dummy;
        ListNode second = dummy;
        while(first!= null && first.next != null ){
            first = second.next;
            if((first.next!=null && first.val == first.next.val)|| first.val == second.val ){
                target = first.val;
                while((first != null && first.val == target)||first != null &&(second.val == first.val)){
                    first = first.next;
                }
                if(head.val == target){
                    head = first;
                    second = first;
                   // if(first!= null) first = first.next;
                }
                else{
                    second.next = first;
                }
            }else{
                first = first.next;
                second = second.next;
            }


        }
        return head;

    }
}
