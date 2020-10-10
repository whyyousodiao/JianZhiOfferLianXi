package bishiti.jingdong;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
And millionaires will hold 46% of total wealth by 2019, the report says. This ratio is likely to increase in 2020.
 */

public class Jingdong2020091703{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();

            int[] prince = new int[2];
            int[] princess = new int[2];

            int[][] map = new int[n][m];
            for (int j = 0; j < n; j++) {
                String s = sc.nextLine();
                for (int k = 0; k < s.length(); k++) {
                    char c = s.charAt(k);
                    if (c == '.') {
                        map[j][k] = 1;
                    } else if (c == '#') {
                        map[j][k] = 0;
                    } else if (c == 'S') {
                        map[j][k] = 2;
                        prince[0] = j;
                        prince[1] = k;
                    } else if (c == 'E') {
                        map[j][k] = 1;
                        princess[0] = j;
                        princess[1] = k;
                    }
                }
            }
            boolean[][] visited = new boolean[n][m];
            if (dfs(map, prince[0], prince[1], visited, princess)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean dfs(int[][] nums, int row, int col, boolean[][] visited, int[] target) {
        if (target[0] == row && target[1] == col) return true;
        int[] rowOffset = new int[]{-1, 0, 1, 0};
        int[] colOffset = new int[]{0, -1, 0, 1};

        for (int i = 0; i < 4; i++) {
            int nextRow = row + rowOffset[i];
            int nextCol = col + colOffset[i];
            if (nextRow >= 0 && nextRow < nums.length &&
                    nextCol >= 0 && nextCol < nums[0].length &&
                    !visited[nextRow][nextCol] && nums[nextRow][nextCol] == 1) {
                visited[nextRow][nextCol] = true;
                if (dfs(nums, nextRow, nextCol, visited, target)) return true;
                visited[nextRow][nextCol] = false;
            }
        }
        return false;
    }
}