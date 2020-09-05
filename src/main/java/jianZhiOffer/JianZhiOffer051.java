package jianZhiOffer;

public class JianZhiOffer051 {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public int mergeSort(int[] nums,int pre,int rear){
        if(pre>=rear){
            return 0;
        }
        int[] sortArray= new int[rear-pre+1];
        int mid = (rear+pre)/2;
        int res = mergeSort(nums,pre,mid)+mergeSort(nums,mid+1,rear);
        int leftPointer = pre;
        int rightPointer = mid+1;
        int i = 0;
        while(leftPointer<=mid && rightPointer<=rear){
            if(nums[leftPointer]<=nums[rightPointer]){
                sortArray[i]=nums[leftPointer];
                leftPointer++;
                res = res + rightPointer-(mid+1);
            }else{
                sortArray[i]=nums[rightPointer];
                rightPointer++;

            }
            i++;
        }
        while(rightPointer<=rear){
            sortArray[i] = nums[rightPointer];
            rightPointer++;
            i++;
        }
        while(leftPointer<=mid){
            sortArray[i] = nums[leftPointer];
            res= res + rightPointer-(mid+1);
            leftPointer++;
            i++;
        }
        for(int j=pre,k=0;j<=rear;j++,k++){
            nums[j] = sortArray[k];
        }
        return res;
    }

    public static void main(String[] args) {
        JianZhiOffer051 jianZhiOffer051 = new JianZhiOffer051();
        int[] a = {1,3,2,3,1};
        /*int[] a ={7,5,6,4};*/
        System.out.println(jianZhiOffer051.reversePairs(a));
    }

}
