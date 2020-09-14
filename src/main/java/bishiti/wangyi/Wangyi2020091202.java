package bishiti.wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Wangyi2020091202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String pattern = "abcxyz";
        fun(s,pattern);
    }
    public static void fun(String s,String pattern){
        Map<Integer,Integer> map = new HashMap<>();
        int len = s.length();
        int flag = 0;
        int max = 0;
        map.put(0,-1);//初始化状态0所在的位置为-1
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if(s.charAt(i) == pattern.charAt(j)){
                    flag^= (1<<(pattern.length()-j-1));//abcxyz中哪个位置，与状态中的相应位置进行异或看是否出现两次
                    break;
                }
            }
            if(map.containsKey(flag)){
                max = Math.max(max,i-map.get(flag));//和上次出现的状态的位置相减得到字串长度
            }
            map.putIfAbsent(flag,i);//记录这个状态第一次出现的位置
        }
        System.out.println(max);
    }
}
