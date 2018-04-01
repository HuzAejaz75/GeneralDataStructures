import org.junit.Test;

/**
 * Created by huzaifa.aejaz on 3/22/18.
 */
public class Tester {
    @Test
    public void Test1(){
        int[] nums = { 3,2,2};
        Rocks rock = new Rocks();
        int hey = rock.get_rocks(nums);
        System.out.println(hey);
    }

    @Test
    public void testingStructure(){
        DesignStructure DS = new DesignStructure();
      DS.addWord("bad");
        DS.addWord("dad");
        DS.addWord("mad");
        DS.addWord("pad");
        DS.addWord("bad");



        System.out.println(DS.search("b.."));

    }
    @Test
    public void NodeTest(){
       /* ListNode LN = new ListNode(7);
        ListNode LN0 = new ListNode(1);
        ListNode LN2 = new ListNode(2);
        ListNode LN3 = new ListNode(2);
        ListNode LN4 = new ListNode(4);
        ListNode LN5 = new ListNode(7);
        ListNode LN6 = new ListNode(3);
        ListNode LN7 = new ListNode(6);
        ListNode LN8 = new ListNode(5);
        LN.next = LN0;
        LN0.next = LN2;
        LN2.next = LN3;
        LN3.next = LN4;
        LN4.next = LN5;
        LN5.next = LN6;
        LN6.next = LN7;
        LN7.next = LN8;*/

       ListNode Ln = new ListNode(3);
       ListNode Ln1 = new ListNode(1);
        ListNode Ln2 = new ListNode(2);
       Ln.next = Ln1;
       Ln1.next = Ln2;
       Ln2.next = null;
       Partition PN = new Partition();
       PN.partition(Ln,2);


       //Partition pn = new Partition();
       //pn.partition(LN,4);

    }



}
