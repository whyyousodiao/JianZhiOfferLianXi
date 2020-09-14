package bishiti.xiaomi;

import java.util.Scanner;
public class Xiaomi2020090801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int len = str.length;

        for (int i = 0; i < len; i++) {
            String tmp = str[i];
            int lenOfStr = tmp.length();
            if(lenOfStr>120 || lenOfStr<8){
               System.out.println(1);
               continue;
            }
            boolean numberFlag = false;
            boolean lowerCharFlag = false;
            boolean upperCharFlag = false;
            boolean specialCharFlag = false;
            for (int j = 0; j < lenOfStr; j++) {
               int charSeq = tmp.charAt(j)-'0';
               if(charSeq>=0 && charSeq<=9){
                   numberFlag = true;
               }else if(charSeq>=17 && charSeq<=42){
                   upperCharFlag = true;
               }else if(charSeq>=49 && charSeq<=74){
                   lowerCharFlag = true;
               }else{
                   specialCharFlag = true;
               }
               if(numberFlag && upperCharFlag && lowerCharFlag && specialCharFlag){
                   break;
               }
            }
            if(numberFlag && upperCharFlag && lowerCharFlag && specialCharFlag){
               System.out.println(0);
            }else{
               System.out.println(2);
            }



        }

    }
}
