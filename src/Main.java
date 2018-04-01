/**
 * Created by huzaifa.aejaz on 3/26/18.
 */
public class Main {
    public static void main(String[] args) {
        FindLongestSnake FLS = new FindLongestSnake();
        int[][] matrix = {{1,2,1,2},{7,7,2,5},{6,4,3,4},{1,2,2,5}};
        FLS.getMaxSequence(matrix);

        ListNode LN0 = new ListNode(1);
        ListNode LN2 = new ListNode(2);
        ListNode LN3 = new ListNode(3);
        ListNode LN4 = new ListNode(4);
        ListNode LN5 = new ListNode(5);
        ListNode LN6 = new ListNode(6);
        LN0.next = LN2;
        LN2.next = LN3;
        LN3.next = LN4;
        LN4.next = LN5;
        LN5.next = LN6;

       // ReverseWithin RW = new ReverseWithin();
        //RW.reverseBetween(LN0, 3,5);
        reverseBetween RB = new reverseBetween();
        RB.reverseBetween(LN0,2,5);
    }
}
