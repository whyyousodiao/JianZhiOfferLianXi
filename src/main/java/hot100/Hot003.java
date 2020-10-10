package hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xikai
 */
public class Hot003 {
    /*
    无重复字符的最长子串
    输入: "pwwkew"
    输出: 3
    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。

    请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len<=1){
            return len;
        }
        Set<Character> set = new HashSet<>();
        int res = 0;
        int curPos = 0;
        for(int i=0; i<len; i++){
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            while(curPos<len && !set.contains(s.charAt(curPos))){
                set.add(s.charAt(curPos));
                curPos++;
            }
            res = Math.max(res,curPos-i);
        }

        return res;
    }

}
