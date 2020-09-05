package sort;

/**
 * 冒泡排序
 */
public class PopSort {

    /**
     * 第一种方法
     * @param nums 输入要排序的int数组
     * @return sorted Array
     */
    /*
    public int[] sort(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1 - i; j++) {
                if(nums[j]>nums[j+1]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }
    */

    /**
     * 第二种情况
     * 加入了一个flag位判断是否整体有序了，有序之后就直接返回，不用再进行下一次循环了
     * @param nums
     * @return
     */
    public int[] sort(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < len - 1 - i; j++) {
                if(nums[j]>nums[j+1]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                    flag=false;
                }
            }
            if(flag){
               break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array = {8,5,6,7,4,3,5,2,9,1};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        int[] array3 = {1,2,3,4,6,5,7,8,9,10};
        int i = 1;
        for(int num:new PopSort().sort(array3)){
            System.out.println("num" +(++i)+"= "+ num);
        }

    }

}
