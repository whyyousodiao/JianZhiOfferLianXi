package sort;

/**
 * 堆排序
 */
public class HeapSort {

    /**
     * 第一种方法
     * @param nums 输入要排序的int数组
     * @return sorted Array
     */

    public int[] sort(int[] nums){
        int len = nums.length;
        inTree(nums,len);
        for (int i = len-1; i > 0; i--) {
            int tmp = nums[i];
            nums[i] = nums[0];
            nums[0] = tmp;
            len--;
            sink(nums,0,len);
        }
        return  nums;
    }
    public void inTree(int[] nums,int len){
        for (int i = len/2; i >= 0; i--) {
            sink(nums,i,len);
        }
    }
    public void sink(int[] nums,int index,int len){
        int lc = index*2+1;
        int rc = index*2+2;
        int pos = index;
        if(lc<len && nums[pos]<nums[lc]){
            pos = lc;
        }
        if(rc<len && nums[pos]<nums[rc]){
            pos = rc;
        }
        if(index!=pos){
            int tmp = nums[index];
            nums[index] = nums[pos];
            nums[pos] = tmp;
            sink(nums,pos,len);
        }
    }
}
