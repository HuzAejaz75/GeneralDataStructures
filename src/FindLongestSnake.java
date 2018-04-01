import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 3/26/18.
 */
public class FindLongestSnake {
    int max = 0;
    public int getMaxSequence(int [][] matrix){
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(matrix.length==0) return 0;

        sequenceHelper(matrix,0,0,result,temp,-1);
        return 6;
    }
    private void sequenceHelper(int[][] matrix, int l, int r, List<List<Integer>> result, List<Integer> temp, int prev){
        //base case

        if(l < matrix.length && r < matrix[l].length&& Math.abs(matrix[l][r]-prev) == 1|| prev==-1){
            for(int i = l ; i < matrix.length; i++){
                for(int j = r; j < matrix[i].length;j++){
                    temp.add(matrix[i][j]);

                    sequenceHelper(matrix, i+1,j,result,temp, matrix[i][j]);
                    sequenceHelper(matrix, i,j+1,result,temp, matrix[i][j]);
                    temp.remove(temp.size()-1);
                }
            }
        }
        else
            if(max < temp.size()){        //(//l < matrix.length && r < matrix[l].length && Math.abs(matrix[l][r]-prev)!= 1  && prev != -1 && max < temp.size() ||max < temp.size() && l==matrix.length-1 && r==matrix[l].length-1){
            result.add(new ArrayList<>(temp));
            max = temp.size();
        }

    }
}
