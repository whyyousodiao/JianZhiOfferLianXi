package zhuanxianglianxi.shuxuezhuanti;

public class Zhuanxiang0258 {
    /**
     * 258. 各位相加
     * 数学方法
     *
     * 题解：
     * 分析任意数：num
     * 	= a1 + a2*10    + a3*100   + ... + an*(10*n)
     * 	= a1 + a2*(9+1) + a3(99+1) + ... + an*(10*n-1+1)
     * 	每项都 %9：
     * 	= a1 + a2 + a3 + ... + an（正符合该题，如果 num > 10，重复上面操作）
     * 3. a1 ~ an 都是 <10 的数，结合第1步的结论
     * 	return (num-1)%9 + 1
     */


    public int addDigits(int num) {
        return (num-1)%9+1;
    }

}
