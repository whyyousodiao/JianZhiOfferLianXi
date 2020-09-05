package sort;

/**
 * 快速排序
 */


public class FastSort {

    /**
     * 第一种方法
     * @param nums 输入要排序的int数组
     * @return sorted Array
     */
    public int[] sort(int[] nums){
        fastSort(nums,0,nums.length-1);
        return nums;
    }
    public void fastSort(int[] nums,int left,int right){
        if(left>=right){
            return;
        }
        int pos = partition(nums,left,right);
        fastSort(nums,left,pos-1);
        fastSort(nums,pos+1,right);
    }
    /**
     * 第二种方法
     * 只改变partition方法即可
     * 使用双边扫描
     */
    public int partition(int[] nums,int left,int right){
        int markNum = nums[left];
        int pre = left;
        int rear = right;
        while(true){
            while(nums[pre]<=markNum){
                pre++;
                if(pre>rear){
                    break;
                }
            }
            while(nums[rear]>markNum){
                rear--;
                if(rear<pre){
                    break;
                }
            }
            if (pre > rear) {
                break;
            }
            int tmp = nums[pre];
            nums[pre] = nums[rear];
            nums[rear] = tmp;
        }
        nums[left] = nums[rear];
        nums[rear] = markNum;
        return rear;
    }
    /*public int partition(int[] nums,int left,int right){
        int pos = left;
        int markNum = nums[pos];
        int tmp = 0;
        for (int i = left+1; i <= right; i++) {
            if(nums[i]<markNum){
                pos++;
                tmp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = tmp;
            }
        }
        nums[left] = nums[pos];
        nums[pos] = markNum;
        return pos;
    }*/


}
