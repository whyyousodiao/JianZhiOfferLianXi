package bishiti.meituan;

import java.util.Scanner;
/*
8 2 5
5 5 5 4 5 5 5 5
 */

public class Meituan2020091302 {
    static int mod = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //出售数
        int n = sc.nextInt();
        //购买数
        int m = sc.nextInt();
        //最小值
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<k){
                count = 0;
                continue;
            }
            count++;
            if(count>=m){
                res++;
            }
        }
        System.out.println(res);
    }
}
