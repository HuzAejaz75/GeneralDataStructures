import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by huzaifa.aejaz on 3/22/18.
 */
public class Rocks {
    public int get_rocks(int[] quantity) {
        //1 step
         if(quantity.length==0|| quantity.length==1) return 0;
         if(quantity.length==2) return 0;
        //discrepancy in size provided and actual size

        int size = quantity[0];
        int[] boy1 = new int[size];
        boy1 = Arrays.copyOfRange(quantity, 1, quantity.length);
        int[] boy2 = new int[size];
        boy2 = Arrays.copyOfRange(quantity, 1, quantity.length);
        Arrays.sort(boy2);
        int[] boy3 = new int[size];
        int pointer = 0;
        while (pointer < boy1.length) {
            boy3[pointer] = boy1[pointer] + boy2[pointer];
            pointer++;
        }
        HashMap<Integer, Integer> indexMap = new HashMap<>();//dictionary
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int maxVal = 0;
        int maxcount = 0;
        for (int i = 0; i < boy3.length; i++) {
            indexMap.put(boy3[i], i);
            if (countMap.get(boy3[i]) != null) {
                int cn = countMap.get(boy3[i]);
                cn++;
                countMap.put(boy3[i], cn);
                if (maxcount < cn) {
                    maxcount = cn;
                    maxVal = boy3[i];
                } else if (maxcount == cn) {
                    if (maxVal < boy3[i])
                        maxcount=cn;
                        maxVal = boy3[i];
                }
                else
                    if(maxcount==0){
                     maxcount=cn;
                        maxVal = boy3[i];
                }


            } else {

                countMap.put(boy3[i], 1);
            }
        }

        if(maxcount==0) return boy3.length-1;
        else
            return indexMap.get(maxVal);


    }
}