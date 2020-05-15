public class JianZhiOffer019 {
    public static void main(String[] args) {
        /*JianZhiOffer005 jianZhiOffer005 = new   JianZhiOffer005();

        jianZhiOffer005.printNumbers(3);*/

        Solution19 solution = new Solution19();
        System.out.println(solution.isMatch("aaa","aaaa"));
    }
}

class Solution19 {
    public boolean isMatch(String s, String p) {

        int sLength = s.length();
        int pLength = p.length();
        if(sLength == 0){
            if (pLength % 2 != 0) {
                return false;
            }
            int index =1;
            while(index < pLength) {
                    if (p.charAt(index) != '*') {
                        return false;
                    }
                    index += 2;
            }
            return true;
        }
        if(p.length() ==0)return false;
        char c1=s.charAt(0);
        char c2=p.charAt(0);
        char c3='a';
        if(pLength>1) {
            c3 = p.charAt(1);
        }
        if(c3 != '*'){
            if(c1==c2 || c2 =='.'){
                return isMatch(s.substring(1), p.substring(1));
            }else {
                return false;
            }
        }else{
            if(c1==c2 || c2=='.') {
                return isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
            }else{
                return isMatch(s, p.substring(2));
            }
        }

    }

}



/*
class Solution {
    public boolean isMatch(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();
        boolean[][] res = new boolean[sLength+1][pLength+1];
        for(int i =0; i<=sLength;i++)
        {
            for(int j =0; j<=pLength;j++)
            {
                if(j==0){
                    res[i][j] = i==0;
                }else{
                    if(p.charAt(j-1) != '*'){
                        if(i>0 && (s.charAt(i-1) == p.charAt(j-1)|| p.charAt(j-1)=='.')){
                            res[i][j] = res[i-1][j-1];
                        }
                    }else{
                        if(j>=2){
                            res[i][j] |= res[i][j-2];
                        }
                        if(i>0 && j>=2 && (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2)=='.')){
                            res[i][j] |= res[i-1][j];
                        }
                    }

                }
            }
        }
        return res[sLength][pLength];
    }
}*/
