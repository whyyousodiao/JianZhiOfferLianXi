package bishiti.zhongxing;

import java.util.Scanner;

public class Zhongxing2020090702 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
            }
            int[] tmp = new int[n];
            int index = 0;
            for (int j = n-1; j >= 0; j--) {
                tmp[j] = nums[index++];
            }
            int max = Math.max(fun(nums),fun(tmp));
            System.out.println(n-max);
        }

    }
    public static int fun(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int[] dp = new int[arr.length];
        dp[0] = 1;
        int res = 1;
        for (int i = 0; i < dp.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max + 1;
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
