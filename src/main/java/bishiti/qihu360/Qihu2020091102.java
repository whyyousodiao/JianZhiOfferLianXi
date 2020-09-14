package bishiti.qihu360;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Qihu2020091102 {
    /*
12_Aaqq12
Password123
PASSWORD_123
PaSS^word
12_Aaqq
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(sc.hasNext()){
            if(num == 0){
                System.out.println();
                num++;
            }
            System.out.println(isGoodPassWord(sc.nextLine()));
        }

    }
    public static String isGoodPassWord(String tmp){

        int lenOfStr = tmp.length();
        if(lenOfStr<8){
            return "Irregular password";
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
            return "OK";
        }else{
            return "Irregular password";
        }
    }
}
