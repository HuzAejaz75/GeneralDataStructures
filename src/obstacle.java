import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 4/25/18.
 */
public class obstacle {

    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
        if(obstacleGrid.length==0) return 0;
        if(obstacleGrid.length==1) {
            if(obstacleGrid[0].length==0) return 1;
            else
                return (obstacleGrid[0][0]==1 || obstacleGrid[0][obstacleGrid[0].length-1] ==1 )? 0 : 1;
        }
        int[][] paths = new int[obstacleGrid.length][obstacleGrid[0].length];

        for(int i = 0; i < obstacleGrid.length; i++){
            for(int j = 0; j < obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j]==1) paths[i][j]=0;


                else{
                    if(i==0){
                        if(j-1>=0) {
                            paths[i][j] = (obstacleGrid[i][j-1]!=1 &&  paths[i][j-1]==1)? 1: 0;
                        }
                    }
                    else
                    if(j==0){
                        if(i-1>=0) {
                            paths[i][j] = (obstacleGrid[i-1][j]!=1 && paths[i-1][j]==1)? 1: 0;
                        }
                    }
                    else{
                        paths[i][j] = paths[i][j-1]+ paths[i-1][j];
                    }
                }
            }
        }
        return paths[paths.length-1][paths[0].length-1];
    }

}


