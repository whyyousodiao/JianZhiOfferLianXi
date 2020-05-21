package dailyRandom;


import java.util.Arrays;

public class RD1371 {
    public int findTheLongestSubstring(String s) {

        int n = s.length();
        int[] res = new int[1<<5];
        int maxLen = 0;
        Arrays.fill(res,-1);
        res[0] =0;
        int status=0;
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c =='a'){
                status ^= 1;
            }
            if(c =='e'){
                status ^= (1<<1);
            }
            if(c =='i'){
                status ^= (1<<2);
            }
            if(c =='o'){
                status ^= (1<<3);
            }
            if(c =='u'){
                status ^= (1<<4);
            }
            if(res[status] >= 0){
                if(maxLen<i+1-res[status]){
                    maxLen = i-res[status]+1;
                }
            }else{
                res[status]=i+1;
            }

        }
        return maxLen;
    }
}
