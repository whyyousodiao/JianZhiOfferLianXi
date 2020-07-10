package top200;

public class Top0005 {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            int tmp1 = sub(s,i,i);
            int tmp2 = sub(s,i,i+1);
            int len = Math.max(tmp1,tmp2);
            if(len>end-start){
                start = i-(len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);

    }

    public int sub(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }

}
