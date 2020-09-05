package bishiti.huawei;


import java.util.*;

public class Huawei2020082601{



    public static String get32BitBinString(Long number) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < 32; i++){
            sBuilder.append(number & 1);
            number = number >>> 1;
        }
        return sBuilder.reverse().toString();
    }

    public static void fun(Long[] nums){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            str.append(get32BitBinString(nums[i]));
        }

        for (int i = 0; i < str.length(); i = i + 2) {
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(i+1));
            str.setCharAt(i+1, temp);
        }

        String temp = str.substring(str.length() - 2, str.length());
        str.insert(0, temp);
        str.delete(str.length()-2, str.length());

        int index = 0;
        for (int i = 0; i < str.length(); i+=32) {
            nums[index++] = Long.valueOf(str.substring(i, i + 32), 2);
        }
        for(Long a : nums){
            System.out.print(a+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strArr = s.split(" ");
        int len = strArr.length;
        Long[] arr = new Long[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Long.valueOf(strArr[i]);
        }
        fun(arr);
    }

}
