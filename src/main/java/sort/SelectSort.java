package sort;

/**
 * 选择排序
 */

public class SelectSort {

    /**
     * 第一种方法
     * @param nums 输入要排序的int数组
     * @return sorted Array
     */
    public int[] sort(int[] nums){
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i; j < len; j++) {
                if(nums[j]<nums[min]){
                    min = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array = {8,5,6,7,4,3,5,2,9,1};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        int[] array3 = {1,2,3,4,6,5,7,8,9,10};
        int i = 1;
        for(int num:new SelectSort().sort(array3)){
            System.out.println("num" +(++i)+"= "+ num);
        }

    }
}
