package bishiti.meituan;

import java.util.Scanner;
/*
5 3 2
 */

public class Meituan2020091303 {
    static int mod = 998244353;
    //1 hushu
    //2 合并11111
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //总和
        int n = sc.nextInt();
        //必须小于等于k大于等于1
        int k = sc.nextInt();
        //必须有一个数大于等于d
        int d = sc.nextInt();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {

        }
        /*System.out.println(fun(n,k,d,0,0));*/
    }

    /*public static int fun(int n, int k, int d, int res, int max){
        if(n==0){
            return max>=d?res+1:0;
        }
        for (int i = 1; i <= k; i++) {
            if(n-i>=0){
                res=(res + fun(n-i,k,d,0,Math.max(i,max)))%mod;
            }else{
                break;
            }
        }
        return res%mod;
    }*/
    /*public static int fun(int n, int k, int d, int res, int max){
        int time = n/d;
        for (int i = 0; i < k; i++) {
            
        }
        for (int i = d; i < k; i++) {
            for (int j = 0; j < time; j++) {
            }
        }
    }*/
}
