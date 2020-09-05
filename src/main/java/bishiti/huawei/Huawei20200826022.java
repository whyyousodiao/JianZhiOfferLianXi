package bishiti.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class Huawei20200826022 {
    public static void main(String[] args) {
        // [1,1,1,1,2,1,1],[5,2,5,4,5,1,6]
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] tmp = str.split("\\],\\[");

            String widthStr = tmp[0].substring(1);
            String heightStr = tmp[1].substring(0, tmp[1].length() - 1);
            String[] ws = widthStr.split(",");
            String[] hs = heightStr.split(",");

            if (ws.length != hs.length) {
                continue;
            }
            int len = ws.length;
            boolean valid = true;
            int[] widths = new int[len];
            int[] heights = new int[len];
            for (int i = 0; i < len; i++) {
                widths[i] = Integer.parseInt(ws[i]);
                heights[i] = Integer.parseInt(hs[i]);
                if (widths[i] < 1 || heights[i] < 1 || widths[i] > 100 || heights[i] > 100) {
                    valid = false;
                }
            }
            if (valid) {
                int max = largestRect(widths, heights);
                System.out.println(max);
            } else {
                System.out.println(0);
            }
        }
    }

    public static int largestRect(int[] widths, int[] heights) {
        int len = heights.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            int curHeight = heights[i];
            int left = i;
            while (left > 0 && heights[left - 1] >= curHeight) {
                left--;
            }

            int right = i;
            while (right < len - 1 && heights[right + 1] >= curHeight) {
                right++;
            }
            int curWidth = 0;
            for (int j = left; j <= right; j++) {
                curWidth += widths[j];
            }
            max = Math.max(max, curWidth * curHeight);
        }
        return max;
    }
}
