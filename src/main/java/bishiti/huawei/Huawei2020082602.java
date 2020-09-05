package bishiti.huawei;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Huawei2020082602 {
    public static long largestRectangleArea(long[] heights) {
        int n = heights.length;
        long[] left = new long[n];
        long[] right = new long[n];
        Arrays.fill(right, n);

        Stack<Integer> mono_stack = new Stack<Integer>();
        for (int i = 0; i < n; ++i) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                right[mono_stack.peek()] = i;
                mono_stack.pop();
            }
            left[i] = (mono_stack.isEmpty() ? -1 : mono_stack.peek());
            mono_stack.push(i);
        }

        long ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int sLen = s.length();
            int mid = (sLen - 1) / 2;
            String[] a = s.substring(1, mid - 1).split(",");
            String[] b = s.substring(mid + 2, sLen - 1).split(",");
            int len = a.length;
            long[] width = new long[len];
            long[] height = new long[len];
            boolean valid = true;
            for (int i = 0; i < a.length; i++) {
                width[i] = Long.valueOf(a[i]);
                height[i] = Long.valueOf(b[i]);
                if (width[i] < 1 || width[i] > 100 || height[i] < 1 || height[i] > 100) {
                    valid = false;
                }
            }
            if (!valid) {
                System.out.println(0);
                continue;
            }
            int rLen = 0;
            for (long n : width) {
                rLen += n;
            }
            long[] res = new long[rLen];
            int pos = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < width[i]; j++) {
                    res[pos] = height[i];
                    pos++;
                }
            }
            System.out.println(largestRectangleArea(res));
        }
    }
}