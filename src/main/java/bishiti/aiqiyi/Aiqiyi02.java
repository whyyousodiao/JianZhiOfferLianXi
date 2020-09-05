package bishiti.aiqiyi;

import java.util.*;

public class Aiqiyi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        int len = path.length();
        Set<Integer> trace  = new HashSet<>();
        int x = 0;
        int y = 0;
        trace.add(hashC(x,y));
        for(int i=0;i<len;i++){
            char s = path.charAt(i);
            switch (s){
                case 'N':
                    y=y+1;
                    break;
                case 'S':
                    y=y-1;
                    break;
                case 'W':
                    x=x-1;
                    break;
                case 'E':
                    x=x+1;
                    break;
            }
            int hsCode = hashC(x,y);
            if(!trace.add(hsCode)){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
    public static int hashC(int x,int y){
        return x*1011+y;
    }
}
