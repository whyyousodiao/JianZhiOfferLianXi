package top200;

public class Top0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return cur(nums2,nums1);
        }
        return cur(nums1,nums2);



    }
    public double cur(int[] nums1,int[] nums2){
        int len1= nums1.length;
        int len2 = nums2.length;
        int llen = (len1+len2+1)/2;
        int left = 0;
        int right = len1;


        while (left<right){
            int i = left+(right-left+1)/2;
            int j = llen - i;
            if(nums1[i-1]>nums2[j]){
                right = i-1;
            }else{
                left = i;
            }

        }
        int i = left;
        int j = llen-i;
        int leftNum1 = i==0 ? Integer.MIN_VALUE:nums1[i-1];
        int rightNum1 = i==len1 ? Integer.MAX_VALUE:nums1[i];
        int leftNum2 = j==0? Integer.MIN_VALUE:nums2[j-1];
        int rightNum2 = j==len2 ? Integer.MAX_VALUE:nums2[j];
        if((len1+len2)%2==1){
            return Math.max(leftNum1,leftNum2);
        }else{
            return (Math.max(leftNum1,leftNum2)+Math.min(rightNum1,rightNum2))/2;
        }
    }
}
