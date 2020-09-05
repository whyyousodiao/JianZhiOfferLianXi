package zhuanxianglianxi.shuxuezhuanti;

public class Zhuanxiang0204 {

    public int divide(int dividend, int divisor){
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long res = 0;
        int sign = ((dividend<0&&divisor>0)||(dividend>0&&divisor<0))?-1:1;

        long absDividend = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);
        while(absDividend>=absDivisor){
            long tmp = absDivisor,count=1;
            while(absDividend>=tmp){
                tmp = tmp<<1;
                count = count<<1;
            }
            tmp = tmp>>1;
            count = count>>1;
            absDividend-=tmp;
            res+=count;
        }
        if(sign==-1){
            return sign*(int)res;
        }else{
            if(res>max){
                return max;
            }else{
                return (int)res;
            }
        }

    }

    public static void main(String[] args) {
        Zhuanxiang0204 zhuanxiang0204 = new Zhuanxiang0204();
        System.out.println(zhuanxiang0204.divide(-2147483648,-1));
    }
}
