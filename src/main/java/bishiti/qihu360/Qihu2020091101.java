package bishiti.qihu360;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Qihu2020091101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int first = 0;
        int last = 0;
        Set<Integer> set = new HashSet<>();
        Set<Integer> setWork = new HashSet<>();
        Set<Integer> setRun = new HashSet<>();
        for (int i = 0; i < m; i++) {

            int number = sc.nextInt();
            int flag = sc.nextInt();
            if(i==0){
                first = number;
            }
            if(i==n-1){
                last = number;
            }
            if(flag == 1){
                set.add(number);
                setWork.add(number);
            }else{
                set.add(number);
                setRun.add(number);
            }
        }
        if(setWork.size() == n){
            System.out.println(first);
            return;
        }else if(setRun.size() == n){
            System.out.println(last);
            return;
        }else{
            for (int i = 1; i <= n; i++) {
                if(!set.contains(i)){//如果不再下班打卡记录里就输出
                    System.out.println(i);
                }
            }
        }

    }
}
