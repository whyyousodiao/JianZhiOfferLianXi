package sort;

/**
 * 插入排序
 */

public class InsertSort {
    /**
     * 第一种方法
     * @param nums 输入要排序的int数组
     * @return sorted Array
     */
    public int[] sort(int[] nums){
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int tmp = nums[i];
            int j = 0;
            for (j = i-1; j >=0; j--) {
                if(tmp < nums[j]){
                    nums[j+1] = nums[j];
                }else{
                    break;
                }
            }
            nums[j+1] = tmp;

        }
        return nums;
    }

}
