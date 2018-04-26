/**
 * Created by huzaifa.aejaz on 4/2/18.
 */
public class AddTwoLists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode num1 = l1;
        ListNode num2 = l2;
        ListNode finalResult = new ListNode(0);
        ListNode head = finalResult;
        int len1 = 0, len2 = 0;
        while (num1 != null) {
            num1 = num1.next;
            len1++;
        }
        while (num2 != null) {
            num2 = num2.next;
            len2++;
        }
        ListNode larger;
        ListNode smaller;
        if (len1 < len2) {
            smaller = l1;
            larger = l2;
        } else {
            smaller = l2;
            larger = l1;
        }

        ListNode prev = null;
        for (int i = 0; i < Math.abs(len1 - len2); i++) {
            ListNode node = new ListNode(larger.val);
            finalResult.next = node;
            prev = finalResult;
            larger = larger.next;
            finalResult = finalResult.next;
        }

        while(smaller != null && larger != null) {
            if (smaller.val + larger.val > 9) {
                if (prev != null) {
                    prev.val += 1;

                }
                else{
                    prev = new ListNode(1);
                    prev.next = finalResult.next;
                    head.next = prev;
                    finalResult = finalResult.next;
                }
                ListNode node = new ListNode((smaller.val + larger.val) % 10);
                finalResult.next = node;
                prev = finalResult.next;
                larger = larger.next;
                smaller = smaller.next;

            } else {
                ListNode node = new ListNode(smaller.val + larger.val);
                finalResult.next = node;
                prev = finalResult.next;
                smaller = smaller.next;
                larger = larger.next;

            }
            finalResult = finalResult.next;
        }


        return head.next;
    }
}
