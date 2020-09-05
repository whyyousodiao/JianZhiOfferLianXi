package sort;

/**
 * 归并排序
 */
public class MergeSort {
    /**
     * 第一种方法
     * @param nums 输入要排序的int数组
     * @return sorted Array
     */
    public int[] sort(int[] nums){
        int[] tmp = new int[nums.length];
        mergeSort(nums,tmp,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] nums,int[] tmp, int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)>>1;
        mergeSort(nums,tmp,left,mid);
        mergeSort(nums,tmp,mid+1,right);
        merge(nums,tmp,left,mid,right);
    }
    public void merge(int[] nums,int[] tmp, int left,int mid,int right){
        System.arraycopy(nums,left,tmp,left,right-left+1);
        int start1 = left;
        int start2 = mid+1;
        for (int i = left; i <= right; i++) {
            int leftNum = start1>mid?Integer.MAX_VALUE:tmp[start1];
            int rightNum = start2>right?Integer.MAX_VALUE:tmp[start2];
            if(leftNum<rightNum){
                nums[i] = leftNum;
                start1++;
            }else {
                nums[i] = rightNum;
                start2++;
            }
        }
    }
}
