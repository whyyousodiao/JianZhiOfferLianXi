package dailyRandom;

import java.util.Arrays;

public class RD00001 {

    public int[] establishTree(int n,int[][] edges){
        int[] tree = new int[n];
        Arrays.fill(tree,-1);
        int len = edges.length;
        for(int i=0;i<len;i++){
            tree[edges[i][1]] = edges[i][0];
        }
        return tree;
    }
    /*public int[] cur(){
        int[] asciiTable = new int[26];

    }*/
    public static void main(String[] args) {
        RD00001 rd0000 = new RD00001();
/*
        System.out.println(rd0000.countSubTrees(15,4));
*/
    }
}
class Tree{
    int[] table;
    int father;
    public Tree(int f,char value){
        table = new int[26];
        father = f;
        table[value-'a'] += 1;
    }
}
