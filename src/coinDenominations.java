import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 4/27/18.
 */
public class coinDenominations {
    int min = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        if(coins.length==0 || amount==0) return 0;

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(list, result, coins, amount);
        return (min==Integer.MAX_VALUE)? -1 : min;
    }
    public void helper(List<Integer> list, List<List<Integer>> result,int[] coins, int amount ){
        //base condition
        if(amount==0 && list.size()< min)
        {
            Collections.sort(list);
            if(!result.contains(list))
            {
                min = list.size();
                result.add(new ArrayList<>(list));
            }
        }
        else{
            if(amount > 0){
                for(int i = 0; i < coins.length; i++){
                    list.add(coins[i]);
                    helper(list,result, coins, amount-coins[i]);
                    list.remove(list.size()-1);
                }
            }

        }

    }
}
