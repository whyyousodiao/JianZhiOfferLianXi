package weekCompetition;

import java.util.LinkedList;
import java.util.Queue;

public class Compete0001 {
    public int minReorder(int n, int[][] connections) {
        int len = connections.length;
        int remain = len;
        boolean[][] res = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();
        int[] list;
        for(int i=0;i<len;i++){
            res[connections[i][0]][connections[i][1]] = true;
            if(connections[i][0]==0 || connections[i][1]==0){
                queue.add(connections[i]);
            }
        }
        while(!queue.isEmpty()){
            list = queue.remove();
            res[list[0]][list[1]] = false;
            if(list[1]==0) {
                list[1] = list[0];
                list[0] = 0;
                remain--;
            }
            int tmp = list[1];
            for (int i = 0; i <n; i++) {
                if(res[i][tmp]){
                    res[i][tmp] = false;
                    queue.add(new int[]{0,i});
                    remain--;
                }
                if(res[tmp][i]){
                    res[tmp][i] = false;
                    queue.add(new int[]{0,i});
                }
            }
        }
        return remain;
    }

    public static void main(String[] args) {
        /*int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};*/
        int[][] connections = {{0,1},{2,0},{3,2}};
        Compete0001 compete0001 = new Compete0001();
        System.out.println(compete0001.minReorder(6,connections));
    }
}
