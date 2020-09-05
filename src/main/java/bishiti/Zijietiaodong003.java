package bishiti;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zijietiaodong003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long[] nums = new long[len+1];
        for (int i = 1; i <= len; i++) {
            nums[i] = sc.nextLong();
        }



        int sum = 0, res = 0, pre=1;
        if(nums.length==0){
            System.out.println(0);
            return;
        }
        if(nums.length==1){
            System.out.println(nums[0]==0?0:1);
            return;
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 2; i <= len+1; i++) {
            sum+=nums[i-1];
            if(map.getOrDefault(sum,0)!=0){
                pre = Math.max(pre,(map.get(sum)+1));
            }
            map.put(sum,i);
            res +=(i-pre);
        }
        System.out.println(res);

    }
}
