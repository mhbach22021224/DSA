package Week12;
import java.util.*;
public class ConnectedCellsInAGrid {
    public static int connectedCell(List<List<Integer>> matrix) {
        int max = 0;
        for (int i=0; i< matrix.size();i++) {
            for (int j=0; j< matrix.get(i).size();j++) {
                if(matrix.get(i).get(j) == 1) {
                    int curMax = countConnected(i, j, matrix);
                    max = Math.max(curMax, max);
                }
            }
        }
        return max;
    }

    private static int countConnected(int i, int j, List<List<Integer>> matrix) {
        if (i < 0 || j < 0 || i >= matrix.size() || j >= matrix.get(i).size() || matrix.get(i).get(j)==0) {
            return 0;
        }
        int count = 0;
        if (matrix.get(i).get(j)==1) {
            count = 1;
            matrix.get(i).set(j, 0);
            count += countConnected(i-1, j-1, matrix);
            count += countConnected(i-1, j, matrix);
            count += countConnected(i-1, j+1, matrix);
            count += countConnected(i, j-1, matrix);
            count += countConnected(i, j, matrix);
            count += countConnected(i, j+1, matrix);
            count += countConnected(i+1, j-1, matrix);
            count += countConnected(i+1, j, matrix);
            count += countConnected(i+1, j+1, matrix);
        }
        return count;

    }

}
