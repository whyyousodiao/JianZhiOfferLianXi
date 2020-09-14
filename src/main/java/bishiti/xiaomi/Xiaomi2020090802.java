package bishiti.xiaomi;

import java.util.Scanner;

public class Xiaomi2020090802 {
    public static void main(String[] args) {
        char[][] pattern = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        int[][] visited = new int[3][4];
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        String s = sc.nextLine();
        if(s.length()==0 || s==null){
            System.out.println("false");
            return;
        }
        flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(fun(pattern,s,i,j,0,visited)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(flag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
    public static boolean fun(char[][] pattern, String s,int i,int j, int pos,int[][] visited){
        int len = s.length();
        if(pos == len){
            return true;
        }
        if(i >= 3 || i<0 || j >= 4 || j<0 || visited[i][j]==1 || pos>len){
            return false;
        }
        if(j > pattern[0].length || j<0){
            return false;
        }
        boolean res = false;
        if(s.charAt(pos)==pattern[i][j]){
            visited[i][j] = 1;
            res = fun(pattern,s,i+1,j,pos+1,visited) || fun(pattern,s,i-1,j,pos+1,visited)|| fun(pattern,s,i,j+1,pos+1,visited)|| fun(pattern,s,i,j-1,pos+1,visited);
            visited[i][j] = 0;
        }
        return res;
    }
}
