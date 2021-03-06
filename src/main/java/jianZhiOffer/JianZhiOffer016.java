package jianZhiOffer;

/*
实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
*/
public class JianZhiOffer016 {
    public double myPow(double x, int n) {
        if(x == 0)return 0;
        double res = 1.0;
        if(n<0){
            x=1/x;
            n=-n;
        }
        while(n!=0){
            if((n&1)==1){
                res = res*x;
            }
            x *= x;
            n>>>=1;
        }

        return res;
    }
}
