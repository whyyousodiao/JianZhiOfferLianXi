package bishiti.wangyi;

import java.util.*;

public class Wangyi004 {



}
/*import java.util.*;
public class Main{
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nums[a][b] += 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums[i][j] > 0) {
                    for (int k = 1; k <= n; k++) {
                        nums[j][k] += nums[j][k];
                    }
                }
            }
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (nums[i][j] > 0 && nums[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }*//*


}
*/
