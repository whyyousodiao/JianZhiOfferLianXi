package dailyRandom;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Classname Main3
 * @Date 2020/7/22 8:03 下午
 * @Created by sichengli
 */
public class RD0000 {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] res = new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++){
            res[i][0] = i;
        }
        for(int i=0;i<=len2;i++){
            res[0][i] = i;
        }
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    res[i][j] = res[i-1][j-1];
                }else{
                    res[i][j] = Math.min(Math.min(res[j-1][i-1],res[j-1][i]),res[j][i-1])+1;
                }
            }
        }
        return res[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println("1");
    }
}