package zhuanxianglianxi.shuxuezhuanti;

public class Zhuanxiang0043 {


    /**
     * 自己写的
     */
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1+len2];
        for(int i=len1-1;i>=0;i--){
            int n1 = num1.charAt(i)-'0';
            for(int j=len2-1;j>=0;j--){
                int n2 = num2.charAt(j)-'0';
                int sum = res[i+j+1]+n1*n2;
                res[i+j+1] = sum%10;
                res[i+j] += sum/10;
            }
        }
        StringBuffer str = new StringBuffer();
        for(int i=0;i<res.length;i++){
            if(i==0&&res[i]==0){
                continue;
            }
            str.append(res[i]);
        }

        return str.toString();
    }

    /**
     * 最优解
     */
    /*public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)) return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        char[] cs1 = num1.toCharArray();
        char[] cs2 = num2.toCharArray();
        int len = len1 + len2 - 1;
        int[] temp = new int[len];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                temp[i + j] += (cs1[i] - '0') * (cs2[j] - '0');
            }
        }
        for (int i = len - 1; i > 0; i--) {
            if (temp[i] > 9) {
                int add = temp[i] / 10;
                temp[i - 1] += add;
                temp[i] = temp[i] % 10;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(temp[i]);
        }
        return builder.toString();
    }*/

}
