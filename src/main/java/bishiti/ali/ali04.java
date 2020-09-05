package bishiti.ali;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ali04 {

    //n为取得个数。m为扑克牌数量
    public double[] twoSum(int n, int m) {
        double[] res = new double[m+1];
        Arrays.fill(res,1,m+1,1.0d);
        for(int j=0;j<n;j++) {
            for (int i = 2; i <= m; i++) {
                res[i] += res[i - 1];
            }
        }
        return res;
        /*for(int i=0;i<=n;i++){//迭代次数

        }

        for(int i=2;i<=n;i++){
            for(int j=i*m;j>=i;j--){
                int sum = 0;
                for(int k=1;k<=m;k++){
                    if(j-k<=i-2){
                        break;
                    }
                    sum+=res[j-k];
                }
                res[j] = sum;
            }
        }*/

//        return Arrays.copyOfRange(res,n,n*m+1);
    }

    public static void main(String[] args) {
        ali04 al = new ali04();
        int i =0;
        for(double db:al.twoSum(4,4)) {
            System.out.println("db = " + db);
        }
    }
}
