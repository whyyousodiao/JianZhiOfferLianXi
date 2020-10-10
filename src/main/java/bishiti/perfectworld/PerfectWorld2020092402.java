package bishiti.perfectworld;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
5
2 9 10
3 7 15
5 12 12
15 20 10
19 24 8
 */
public class PerfectWorld2020092402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //建筑物个数
        int n = Integer.parseInt(sc.nextLine());
        int[][] buildings = new int[n][3];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            for (int j = 0; j < arr.length; j++) {
                buildings[i][j] = Integer.parseInt(arr[j]);
            }
        }

        //获取天际线，待实现
        List<List<Integer>> skyline = getSkyline(buildings);

        //输出skyline到标准输出
        for (List<Integer> point : skyline) {
            int size = point.size();
            for (int i = 0; i < size; i++) {
                System.out.print(point.get(i));
                if (i < size-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> list = new LinkedList<>();
        int len = buildings.length;
        int n = buildings[len-1][1];
        int[] res = new int[n+1];
        for (int i = 0; i < len; i++) {
            int left = buildings[i][0];
            int right = buildings[i][1];
            int height = buildings[i][2];
            for (int j = left; j < right; j++) {
                res[j] = Math.max(res[j],height);
            }
        }
        if(res[0]!=0){
            List<Integer> tmp = new LinkedList<>();
            tmp.add(0);
            tmp.add(res[0]);
            list.add(tmp);
        }
        for (int i = 1; i <= n; i++) {
            if(res[i]!=res[i-1]){
                List<Integer> tmp = new LinkedList<>();
                tmp.add(i);
                tmp.add(res[i]);
                list.add(tmp);
            }
        }
        if(list.size()!=0){
            return list;
        }
        return null;
    }
    public String fun(String s){
        getSkyline(new int[1][1]);
        return "s";
    }

}
