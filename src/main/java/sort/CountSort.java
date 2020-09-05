package sort;

/**
 * 计数排序
 */

public class CountSort {

    /**
     * 第一种方法
     * @param nums 输入要排序的int数组
     * @return sorted Array
     */


    /*public int[] sort(int[] nums){

        int max = nums[0];
        for(int num:nums){
            if(num>max){
                max = num;
            }
        }
        int[] res = new int[max+1];
        for(int num:nums){
            res[num]+=1;
        }
        int index = 0;
        for(int i =0;i<=max;i++){
            while(res[i]>0){
                nums[index++]=i;
                res[i]--;
            }
        }
        return nums;
    }*/

    /**
     * 第二种稳定排序
     * @param nums
     * @return
     */
    public int[] sort(int[] nums){
        int max = nums[0];
        for(int num:nums){
            if(num>max){
                max = num;
            }
        }
        int[] res = new int[max+1];
        for(int num:nums){
            res[num]+=1;
        }
        for (int i = 1; i < max+1; i++) {
            res[i] += res[i-1];
        }
        int[] tmp = new int[nums.length];
        for (int i = nums.length-1; i >=0 ; i--) {
            tmp[res[nums[i]]-1] = nums[i];
            nums[i]--;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }
        return nums;
    }

}
