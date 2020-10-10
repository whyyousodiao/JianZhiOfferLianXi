package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xikai
 */
public class Hot001 {
    /*
    两数之和
    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     */
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for(int i=1; i<len; i++){
            int tmp = target - nums[i];
            if(map.containsKey(tmp)){
                return new int[]{map.get(tmp),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
