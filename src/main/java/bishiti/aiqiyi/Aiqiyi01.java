package bishiti.aiqiyi;

import java.util.Scanner;

public class Aiqiyi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n!=0){
            n/=5;
            res+=n;
        }

        System.out.println(res);
    }
}
