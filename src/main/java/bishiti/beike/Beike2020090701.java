package bishiti.beike;

import java.util.Scanner;

public class Beike2020090701 {
/*
1
S J J B
4
S J J B
S J J B
S J J B
S J J B
*/
    static int leftWinTime = 0;
    static int rightWinTime = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                arr[j] = sc.next();
            }
            leftWinTime = 0;
            rightWinTime = 0;
            fun(arr[0],arr[1],arr[2],arr[3]);
            if(leftWinTime==rightWinTime){
                System.out.println("same");
            }else if(leftWinTime>rightWinTime){
                System.out.println("left");
            }else{
                System.out.println("right");
            }
        }
    }


    public static void fun(String... s){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(i==0) {
                    leftWinTime += fun2(s[i], s[2 + j]);
                }else{
                    rightWinTime += fun2(s[i], s[2 + j]);
                }
            }
        }
    }
    public static int fun2(String left,String right){
        if(left.equals("S")){
            if(right.equals("J")){
                return 1;
            }
        }else if(left.equals("J")){
            if(right.equals("B")){
                return 1;
            }
        }else{
            if(right.equals("S")) {
                return 1;
            }
        }
        return 0;
    }
}
