package dailyRandom;

public class RD0198 {
    public int rob(int[] nums) {

        int len = nums.length;
        if(len==0){
            return 0;
        }
        if(len == 1){
            return nums[0];
        }
        int[] res = new int[len];
        int tmp;
        res[0]=nums[0];
        res[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<len;i++){
            res[i] = Math.max(res[i-1],res[i-2]+nums[i]);
        }
        return res[len-1];
    }
}
