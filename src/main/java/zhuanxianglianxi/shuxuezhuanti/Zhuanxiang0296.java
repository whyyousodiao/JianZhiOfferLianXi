package zhuanxianglianxi.shuxuezhuanti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zhuanxiang0296 {

    /**
     * Best Meeting Point 最佳见面点
     *
     *A group of two or more people wants to meet and minimize the total travel distance.
     * You are given a 2D grid of values 0 or 1, where each 1 marks the home of someone in the group.
     * The distance is calculated using Manhattan Distance,
     * where distance(p1, p2) = |p2.x - p1.x| + |p2.y - p1.y|.
     *
     * For example, given three people living at (0,0), (0,4), and (2,2):
     *
     * 1 - 0 - 0 - 0 - 1
     * |   |   |   |   |
     * 0 - 0 - 0 - 0 - 0
     * |   |   |   |   |
     * 0 - 0 - 1 - 0 - 0
     *
     * The point (0,2) is an ideal meeting point, as the total travel
     * distance of 2+2+2=6 is minimal. So return 6.
     */

    public int minTotalDistance(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(grid[i][j]==1){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        Collections.sort(col);
        int rowMid = row.get(row.size()/2);
        int colMid = col.get(col.size()/2);
        int res = 0;

        for(Integer n:row){
            res+=Math.abs(n-rowMid);
        }
        for(Integer n:col){
            res+=Math.abs(n-colMid);
        }
        return res;
    }

    public static void main(String[] args) {
        Zhuanxiang0296 zhuanxiang0296 = new Zhuanxiang0296();
        int[][] grid = {
                {1,0,0,0,1},{0,0,0,0,0},{0,0,1,0,0}
        };
        System.out.println(zhuanxiang0296.minTotalDistance(grid));
    }
}
