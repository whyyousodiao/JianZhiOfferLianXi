package sort;

/**
 * 希尔排序
 */
public class ShellSort {

    /**
     * 第一种方法
     * @param nums 输入要排序的int数组
     * @return sorted Array
     */
    public int[] sort(int[] nums){
        int len = nums.length;
        int gap = 1;
        while(gap<len/3){
            gap = 3*gap+1;
        }
        while(gap>0){
            for (int i = gap; i < len; i++) {
                int tmp = nums[i];
                int j = i-gap;
                while(j>=0 && nums[j]>tmp){
                    nums[j+gap] = nums[j];
                    j-=gap;
                }
                nums[j+gap] = tmp;
            }
            gap/=3;
        }
        return nums;
    }
}
