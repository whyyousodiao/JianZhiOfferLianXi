package bishiti.jingdong;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
And millionaires will hold 46% of total wealth by 2019, the report says. This ratio is likely to increase in 2020.
 */
/*
2
2 2
.E
S.
2 2
#E
S#
 */
public class Jingdong2020091702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int startN = 0;
            int startM = 0;
            int endN = 0;
            int endM = 0;
            int[][] arr = new int[n][m];
            for (int j = 0; j < n; j++) {
                String s = sc.nextLine();
                for (int k = 0; k < m; k++) {
                    char c = s.charAt(k);
                    switch (c){
                        case 'S':
                            startN = j;
                            startM = k;
                            break;
                        case 'E':
                            endN = j;
                            endM = k;
                            break;
                        case '#':
                            arr[j][k] = 1;
                            break;
                    }
                }
            }
            int[][] appear = new int[n][m];
            if(fun(arr,startN,startM,endN,endM,appear)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    private static boolean fun(int[][] arr, int startN, int startM, int endN, int endM, int[][] appear) {
        if(startN<0 || startN>=arr.length || startM>=arr[0].length || startM<0 || arr[startN][startM]==1 || appear[startN][startM] == 1){//
            return false;
        }else if(startM == endM && startN == endN){
            return true;
        }

        appear[startN][startM] = 1;
        boolean res = fun(arr, startN+1, startM, endN, endM, appear) ||
                fun(arr, startN-1, startM, endN, endM, appear) ||
                fun(arr, startN, startM+1, endN, endM, appear) ||
                fun(arr, startN, startM-1, endN, endM, appear);
        appear[startN][startM] = 0;
        return res;
    }
}
