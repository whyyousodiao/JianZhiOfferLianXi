package top200;

public class Top007 {
    public int reverse(int x) {
        boolean flag = false;
        int remain = 0;
        int res = 0;
        if(x<0){
            flag = true;
            x = -x;
        }
        while(x>0){
            remain = x%10;
            if(flag == false){
                if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && remain>7)) {
                    return 0;
                }

            }else{
                if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && remain>8)) {
                    return 0;
                }
            }
            res = res * 10 + remain;
            x /=10;
        }
        if(flag){
            res = -res;
        }
        return res;
    }

    public static void main(String[] args) {
        Top007 top007 = new Top007();
        System.out.println(top007.reverse(123));
        System.out.println(Math.pow(2,31));

    }
}
