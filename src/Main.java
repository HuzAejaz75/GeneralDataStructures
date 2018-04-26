/**
 * Created by huzaifa.aejaz on 3/26/18.
 */
public class Main {
    public static void main(String[] args) {
        FindLongestSnake FLS = new FindLongestSnake();
        int[][] matrix = {{1,2,1,2},{7,7,2,5},{6,4,3,4},{1,2,2,5}};
        FLS.getMaxSequence(matrix);

        UniquePermutations UP = new UniquePermutations();
        int[] nums = {1,1,2};
        UP.permuteUnique(nums);

      /*  ListNode LN0 = new ListNode(1);
        ListNode LN2 = new ListNode(2);
        ListNode LN3 = new ListNode(3);
        ListNode LN4 = new ListNode(4);
        ListNode LN5 = new ListNode(5);
        ListNode LN6 = new ListNode(6);
        LN0.next = LN2;
        LN2.next = LN3;
        LN3.next = LN4;
        LN4.next = LN5;
        LN5.next = LN6;*/
      /*  ListNode LN0 = new ListNode(1);
        ListNode LN1 = new ListNode(2);
        ListNode LN2 = new ListNode(3);
        ListNode LN3 = new ListNode(4);
        ListNode LN4 = new ListNode(5);
        ListNode LN5 = new ListNode(6);
        ListNode LN6 = new ListNode(7);
        ListNode LN7 = new ListNode(8);

        LN0.next = LN1;
        LN1.next = LN2;
        LN2.next = LN3;
        LN3.next = LN4;
        LN4.next = LN5;
        LN5.next = LN6;
        LN6.next = LN7;
        LN7.next = null;*/
       /* ListNode LN1 = new ListNode(9);
        ListNode LN2 = new ListNode(9);
        LN1.next = LN2;
        LN2.next = null;*/
        /*ListNode LN2 = new ListNode(2);
        ListNode LN3 = new ListNode(4);
        ListNode LN4 = new ListNode(3);
        LN1.next = LN2;
        LN2.next = LN3;
        LN3.next = LN4;
        LN4.next = null;*/


     //   ListNode BN0 = new ListNode(1);
       /* ListNode BN1 = new ListNode(6);
        ListNode BN2 = new ListNode(4);*/
     //   BN0.next = null;
        /*BN1.next = BN2;
        BN2.next = null;*/

      //  AddTwoLists AL = new AddTwoLists();
      //  AL.addTwoNumbers(LN1, BN0);

        //Intersection it = new Intersection();
        //it.getIntersectionNode(BN0,LN0);
     //  LN7.next = null;
       // ReorderList ROL = new ReorderList();
        //ROL.reorderList(LN0);

       // detectLoop DL = new detectLoop();
        //DL.myApproach(LN0);
       // DL.theirApproach(LN0);

       // OddEvenList OEL = new OddEvenList();
        //OEL.oddEvenList(LN0);

       // GettingMiddle GM = new GettingMiddle();
        //GM.reorderList(LN0);


       // ReverseWithin RW = new ReverseWithin();
        //RW.reverseBetween(LN0, 3,5);
        //reverseBetween RB = new reverseBetween();
        //RB.reverseBetween(LN0,2,5);

        obstacle obs = new obstacle();
        int[][] numsa = new int[][]{{0,1,0,0,0},{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        System.out.println(obs.uniquePathsWithObstacles(numsa));
    }
}
