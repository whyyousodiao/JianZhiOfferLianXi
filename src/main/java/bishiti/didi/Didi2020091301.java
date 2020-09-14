package bishiti.didi;

import java.util.Scanner;
/*
2
gogogoout
3
Gogo, go out!?
 */
public class Didi2020091301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());//子串长度
        String s = sc.nextLine();
        int len = s.length();
        int reverseTime = len/n;
        int remain = len%n;
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        for (int i = 0; i < reverseTime; i++) {
            pos+=n;
            for (int j = 0; j < n; j++) {
                sb.append(s.charAt(pos-j-1));
            }
        }
        for (int i = 0; i < remain; i++) {
            sb.append(s.charAt(len-i-1));
        }
        System.out.println(sb.toString());
    }
}
