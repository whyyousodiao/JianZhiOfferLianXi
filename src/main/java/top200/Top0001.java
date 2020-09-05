package top200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Top0001 {
    /*public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] tar = new int[target+1];
        int[] res = new int[2];
        int l=0,r=0;
        for(int i=0; i<len; i++){
            l=nums[i];
            if(l<=target){
                r=target-nums[i];
            }else{
                continue;
            }
            if(tar[r] != 0){
                res[0] = tar[r]-1;
                res[1] = i;
                return res;
            }else{
                tar[l] = i+1;
            }
        }
        return res;
    }*/
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>(Math.abs(target));
        int tmp = 0;
        int index = 0;
        for(int i=0; i<len; i++){
            tmp = nums[i];
            if(map.containsKey(target-tmp)){
                index = map.get(target-tmp);
                res[0]= (int)index;
                res[1] = i;
                return res;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Top0001 top0001 = new Top0001();

    }
}
