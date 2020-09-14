package bishiti.beike;

import java.util.Scanner;

public class Beike2020090702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int pos = 0;
        int len = s.length()/2;
        for (int i = 0,j=len; i < len && j>=0; j--) {
            int low = i;
            int high = j;
            while(low<j){
                if(s.charAt(low)!=s.charAt(high)){
                    break;
                }
                low++;
                high++;
            }
            if(low==j){
                pos = j-1;
                break;
            }

        }
        System.out.println(s.length()-pos);
    }
}
/*
* if(s.length()<=2){
            System.out.println(s.length());
            return;
        }*/