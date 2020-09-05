package top200;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Top0003 {
    public int lengthOfLongestSubstring(String s) {

        int biggestSize =0;
        int lastNum = 0;
        Map<Character,Integer> map= new HashMap<>();
        int pre = 0;
        int i =0;
        while (i<s.length()){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                i++;
                continue;
            }
            if(biggestSize < map.size()){
                biggestSize = map.size();
            }
            while(s.charAt(pre) != s.charAt(i)){
                map.remove(s.charAt(pre));
                pre++;
            }
            pre++;
            map.put(s.charAt(i),i);
            i++;
        }
        if(biggestSize < map.size()){
            biggestSize = map.size();
        }
        return biggestSize;

    }

    /*public int lengthOfLongestSubstring(String s) {
        int biggestSize =0;
        int lastNum = 0;
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                continue;
            }
            if (biggestSize < map.size()) {
                biggestSize = map.size();
            }
            lastNum = map.size();
            map.clear();

            map.put(s.charAt(i), i);
        }
        biggestSize = Math.max(biggestSize,Math.max(map.size(),lastNum-1+map.size()));
        return biggestSize;
        }*/

    public static void main(String[] args) {
        Top0003 top0003 = new Top0003();
        System.out.println(top0003.lengthOfLongestSubstring("aabaab!bb"));

    }
}
