package bishiti.meituan;

import java.util.Arrays;
import java.util.Scanner;
/*
2
9 3
1 4
 */

public class Meituan2020091305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //任务数量
        int n = sc.nextInt();
        Integer[][] arr = new Integer[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = i+1;
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        Arrays.sort(arr,(x,y)->{
            if(x[2]>y[2]){
                return -1;
            }else if(x[2]<y[2]){
                return 1;
            }else{
                if(x[1]>y[1]){
                    return -1;
                }else if(x[1]<y[1]){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][0]+" ");
        }
    }
}
