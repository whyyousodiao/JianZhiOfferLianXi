package bishiti.didi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
2
3 3 400
1 2 200
1 3 300
2 3 500
3 3 400
1 2 500
1 3 600
2 3 700
 */
public class Didi2020091302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();//数据组数
        for (int i = 0; i < cycle; i++) {
            int n = sc.nextInt();//小岛个数
            int m = sc.nextInt();//数据行数
            int k = sc.nextInt();//每个桥的最大成本
            int[][] map = new int[n][n];
            Set<Integer> bridged = new HashSet<>();
            for (int j = 0; j < m; j++) {
                int land1 = sc.nextInt();
                int land2 = sc.nextInt();
                int cost = sc.nextInt();
                if(cost>k){
                    continue;
                }
                map[land1-1][land2-1] = 1;
                map[land2-1][land1-1] = 1;
            }
            Set<Integer> bianliguo = new HashSet<>();
            bridged.add(0);
            boolean flag = true;
            while (bianliguo.size()!=n && flag){
                flag = false;
                for (int j = 0; j < n; j++) {
                    if(bridged.contains(j)){
                        if(bianliguo.contains(j)){
                            continue;
                        }else{
                            for (int l = 0; l < n; l++) {
                                if(map[i][l]==1){
                                    bridged.add(l);
                                }
                            }
                            bianliguo.add(j);
                        }
                        flag = true;
                    }
                    if(bridged.size()==n){
                        break;
                    }
                }
                if(bridged.size()==n){
                    break;
                }
            }
            if(bridged.size()==n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
