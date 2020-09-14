package bishiti.zhongxing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Zhongxing2020090701 {
/*
2 2
3 2
2 3

5 5
2 3 4 5 6
1 2 4 5 7
6 4 5 6 7
1 1 1 1 1
2 3 4 1 2

4 5
2 3 4 5 6
1 2 4 5 7
6 4 5 6 7
1 1 1 1 1
* */
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        long[] avgScore = new long[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][i] = sc.nextInt();
                avgScore[i] += arr[j][i];
            }
        }
        int res = 0;
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            if(people[i] == -1){
                continue;
            }
            for (int j = 0; j < m; j++) {
                if(avgScore[j]/arr[i][j]<=n) {
                    people[i] = -1;
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);
    }*/


    /**
     * @Classname ZhongXin1
     * @Date 2020/9/7 10:37 上午
     * @Created by sichengli
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //人数
        int m = sc.nextInt();   //考试科目
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            sum = sum/n;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > sum) {
                    if(set.add(j)) {
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }

}
