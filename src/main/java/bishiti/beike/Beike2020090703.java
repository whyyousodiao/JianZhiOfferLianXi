package bishiti.beike;

import java.util.HashSet;
import java.util.Scanner;

public class Beike2020090703 {
/*
1
2 2 1
1
1
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int mod = 1000000007;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();           //栅栏总数
            int m  = sc.nextInt();          //颜色数
            int g = sc.nextInt();           //颜色间隔
            HashSet<Integer>[] color = new HashSet[m+1];
            for (int j = 1; j <= m; j++) {
                color[j] = new HashSet<>();
                for (int k = 1; k <= g; k++) {
                    color[j].add(sc.nextInt());
                }

            }
            int[][] dp = new int[n+1][m+1];
            for (int j = 1; j <= m; j++) {
                dp[1][j] = 1;
            }
            for (int j = 2; j <= n ; j++) {
                for (int k = 1; k <= m ; k++) {
                    for (int l = 1; l <= m ; l++) {
                        if(!color[k].contains(l)){
                            dp[j][l] += dp[j-1][k];
                            dp[j][l] %= mod;
                        }
                    }
                }
            }
            long sum = 0;
            for (int j = 1; j <= m; j++) {
                sum += dp[n][j];
                sum %= mod;
            }
            System.out.println(sum);
        }
    }


}
