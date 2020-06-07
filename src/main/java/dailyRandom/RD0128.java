package dailyRandom;

import java.util.HashSet;
import java.util.Set;

public class RD0128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxLen = 0;
        int tmpLen = 1;
        int tmpNum = 0;
        int pos = 0;
        while(pos< nums.length){
            if(set.contains(nums[pos]-1)){
                pos++;
                continue;
            }
            tmpNum = nums[pos];
            while(set.contains(tmpNum+1)){
                tmpNum++;
                tmpLen++;
            }
            maxLen = Math.max(maxLen,tmpLen);
            pos++;
            tmpLen =1;
            tmpNum =0;
        }
        return maxLen;
    }
}
