package bishiti.huawei;

import java.util.Scanner;

public class Huawei2020082603 {
    static String res;
    static String[] strs;
    static int[] rightPos;
    static int[] wrongPos;
    static int[][] arr;
    static int len, tryNum;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        len = Integer.valueOf(scanner.nextLine());
        tryNum = Integer.valueOf(scanner.nextLine());
        strs = new String[tryNum];
        rightPos = new int[tryNum];
        wrongPos = new int[tryNum];
        arr = new int[tryNum][26];
        for(int i = 0; i< tryNum; i++){
            String str = scanner.nextLine();
            String[] tmp = str.split(" ");
            strs[i] = tmp[0];
            rightPos[i] = Integer.valueOf(tmp[1]);
            wrongPos[i] = Integer.valueOf(tmp[2]);
        }
        for(int i = 0; i< tryNum; i++){
            String tmp = strs[i];
            for(int j=0;j<tmp.length();j++){
                arr[i][tmp.charAt(j)-'a']++;
            }
        }


        StringBuilder path = new StringBuilder();
        cur(0,path);

        System.out.println(res);
    }
    private static void cur(int index, StringBuilder path){
        if(res != null) {
            return;
        }
        if(path.length() == len){
            if (check(path.toString())) {
                res = path.toString();
            }
            return;
        }
        for(int i=0;i<26;i++){
            path.append((char)(i+'a'));
            cur(index+1,path);
            path.deleteCharAt(path.length()-1);
        }
    }
    private static boolean check(String s){
        for(int i = 0; i< strs.length; i++){
            int[] sMap = new int[26];
            int rightNum = 0;
            int wrongNum = 0;
            String tmpStr = strs[i];
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                if(c == tmpStr.charAt(j)){
                    rightNum++;
                }
                sMap[c-'a']++;
                if(sMap[c-'a'] <= arr[i][c-'a']) {
                    wrongNum++;
                }
            }
            wrongNum -= rightNum;
            if(rightNum != rightPos[i]) {
                return false;
            }
            if(wrongNum != wrongPos[i]) {
                return  false;
            }
        }
        return true;
    }
}
