package bishiti.didi;
import java.util.*;

/**
 * @Classname DiDi02
 * @Date 2020/9/13 7:43 下午
 * @Created by sichengli
 */
public class Didi2020091303 {

    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();//数据组数
        for (int i = 0; i < cycle; i++) {
            String[] arr = sc.nextLine().split(" ");
            int n = sc.nextInt();//小岛个数
            int m = sc.nextInt();//数据行数
            int k = sc.nextInt();//每个桥的最大成本
            int[][] matrix = new int[n][n];
            for (int[] ints : matrix) {
                Arrays.fill(ints, Integer.MAX_VALUE);
            }
            for (int j = 0; j < m; j++) {
                int land1 = sc.nextInt();
                int land2 = sc.nextInt();
                int cost = sc.nextInt();
                matrix[land1][land2] = Integer.parseInt(arr[2]);
                matrix[land2][land1] = Integer.parseInt(arr[2]);
            }
            boolean[] visited = new boolean[n];
            ans = 0;
            dfs(matrix, k, 0, visited);
            if (ans == n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    private static void dfs(int[][] matrix, int k, int row, boolean[] visited){
        ans++;
        visited[row] = true;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[row][i] <= k && !visited[i]){
                dfs(matrix, k, i, visited);
            }
        }
    }
}
