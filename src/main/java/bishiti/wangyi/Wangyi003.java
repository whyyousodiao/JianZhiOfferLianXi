package bishiti.wangyi;

import java.util.Scanner;

public class Wangyi003 {
}
/*public class Main {
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();
            int[] nums = new int[size];
            int sum = 0;
            for (int j = 0; j < size; j++) {
                nums[j] = sc.nextInt();
                sum+=nums[j];
                min = Integer.MAX_VALUE;
            }
            dfs(nums,0,0,0,sum);
            System.out.println(min);
        }

    }
    public static void dfs(int[] nums, int pos, int num1, int num2, int sum){
        if(pos == nums.length && num1==num2){
            min = Math.min(min,sum-num1*2);
        }
        if(pos>= nums.length){
            return;
        }
        dfs(nums,pos+1,num1,num2,sum);
        dfs(nums,pos+1,num1+nums[pos],num2,sum);
        dfs(nums,pos+1,num1,num2+nums[pos],sum);
    }
}*/
