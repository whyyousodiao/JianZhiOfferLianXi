package jianZhiOffer;

public class JianZhiOffer015 {
    /*public int hammingWeight(int n) {
        int res =0;
        while(n!=0){
            res+= n&1;
            n >>>=1;
        }
        return res;
    }*/
    /*public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            return Integer.bitCount(n);
        }
    }*/
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res++;
            n &=n-1;
        }
        return res;
    }
}
