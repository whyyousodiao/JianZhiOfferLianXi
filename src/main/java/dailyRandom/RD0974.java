package dailyRandom;

public class RD0974 {
    public int subarraysDivByK(int[] A, int K) {
        int len=A.length;
        int[] count = new int[K];
        int sum = 0;
        int res=0;
        for(int i=0;i<len;i++){
            sum=(sum+A[i]+K)%K;
            if(sum<0){
                sum=K-(-sum)%K;
            }
            count[sum]++;
            if(sum==0){
                res += count[sum];
                continue;
            }
            res += (count[sum]-1);
        }
        return res;
    }
}
