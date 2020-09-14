package bishiti.meituan;

import java.util.Scanner;
/*
8 3
1 0 1
0 1 0
0 1 0
1 0 1
1 0 1
0 1 0
0 1 0
1 0 1
 */

public class Meituan2020091301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int len = fun(arr,n,m);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < m; j++) {
                if(j==m-1){
                    System.out.println(arr[i][j]);
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
    public static int fun(int[][] arr, int n,int m){
        if(n==0){
            return 0;
        }
        int mid = n/2;
        boolean flag = true;
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]!=arr[n-i-1][j]){
                    flag = false;
                }
            }
        }
        if(flag){
            return fun(arr,mid,m);
        }else {
            return n;
        }
    }
}
