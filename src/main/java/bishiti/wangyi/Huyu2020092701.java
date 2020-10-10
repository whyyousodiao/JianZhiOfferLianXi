package bishiti.wangyi;

import java.util.Scanner;
/*
1
7 3
0 2
2 0
4 4
 */

public class Huyu2020092701 {
    //环形矩阵
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix;
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int cycle  = sc.nextInt();
            matrix = new int[len][len];
            int left = 0,right = len-1,top = 0,bottom = len-1;
            int count = 1;
            int flag = 0;
            int pos = 0;
            while (true){
                if(flag==0||flag==5){
                    if(flag == 0){
                        pos = top;
                    }else{
                        pos = bottom;
                    }
                    for (int j = left; j <= right; j++) {
                        matrix[pos][j] = count;
                        count++;
                    }
                    if(flag == 0){
                        top++;
                    }else{
                        bottom--;
                    }
                    if(top>bottom){
                        break;
                    }
                    flag = (flag+1)%8;
                }
                if(flag==1||flag==4) {
                    if(flag == 1){
                        pos = right;
                    }else{
                        pos = left;
                    }
                    for (int j = top; j <= bottom; j++) {
                        matrix[j][pos] = count;
                        count++;
                    }
                    if(flag == 1){
                        right--;
                    }else{
                        left++;
                    }
                    if (left > right) {
                        break;
                    }
                    flag = (flag+1)%8;
                }

                if(flag==2||flag==7) {
                    if(flag == 2){
                        pos = bottom;
                    }else{
                        pos = top;
                    }
                    for (int j = right; j >= left; j--) {
                        matrix[pos][j] = count;
                        count++;
                    }
                    if(flag == 2){
                        bottom--;

                    }else{
                        top++;
                    }
                    if (top > bottom) {
                        break;
                    }

                    flag = (flag+1)%8;

                }
                if(flag==3||flag==6) {
                    if(flag == 3){
                        pos = left;
                    }else{
                        pos = right;
                    }
                    for (int j = bottom; j >= top; j--) {
                        matrix[j][pos] = count;
                        count++;
                    }
                    if(flag == 3){
                        left++;
                    }else{
                        right--;
                    }
                    if (left > right) {
                        break;
                    }

                    flag = (flag+1)%8;
                }
            }
            for (int j = 0; j < cycle; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(matrix[x][y]);
            }
        }
    }

    private static void fun(int[][] matrix, int left, int right, int flag, int count) {
        System.out.println(false);
    }
}
