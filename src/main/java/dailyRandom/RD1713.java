package dailyRandom;

import java.util.Arrays;

public class RD1713 {
    /*public int respace(String[] dictionary, String sentence) {
        Tree root = new Tree();
        for(String word:dictionary){
            root.add(word);
        }
        int len = sentence.length();
        int[] dp = new int[len+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i<=len;i++){

            dp[i]=dp[i-1]+1;
            Tree curPos=root;
            for(int j=i;j>=1;j--){
                int pos = sentence.charAt(j-1)-'a';
                if(curPos.next[pos]==null){
                    break;
                }else if(curPos.next[pos].isEnd){
                    dp[i]=Math.min(dp[j-1],dp[i]);
                }
                if (dp[i] == 0) {
                    break;
                }
                curPos= curPos.next[pos];
            }
        }
        return dp[len];
    }

    public static void main(String[] args) {
        RD1713 rd1713 = new RD1713();
        String[] dictionary = {"looked","just","like","her","brother"};
        String sentence = "jesslookedjustliketimherbrother";


        System.out.println(rd1713.respace(dictionary,sentence));
    }*/
}

/*
class Tree{
    public Tree[] next;
    boolean isEnd;
    public Tree(){
        next = new Tree[26];
        isEnd = false;
    }
    public void add(String s){
        int len = s.length();
        Tree treePos = this;
        for(int i=len-1; i>=0;i--){
            int pos = s.charAt(i)-'a';
            if(treePos.next[pos]==null){
                treePos.next[pos] = new Tree();
            }
            treePos = treePos.next[pos];
        }
        treePos.isEnd = true;
    }
}*/
