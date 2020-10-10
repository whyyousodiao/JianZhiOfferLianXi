package huaweimianshi;

public class Code1 {
    public static int maxArea(int[] height){
        int len = height.length;
        int left = 0;
        int right = len-1;
        int maxArea = 0;
        int maxLeft = height[left++];
        int maxRight = height[right--];
        while(left<right){
            while(left<right && height[left]<maxLeft){
                left++;
            }
            maxLeft = height[left];
            maxArea = Math.max(maxArea,Math.min(height[right],height[left])*(right-left));
            left++;
            while(left<right && height[right]<maxRight){
                right--;
            }
            maxRight = height[right];
            maxArea = Math.max(maxArea,Math.min(height[right],height[left])*(right-left));
            right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int max = maxArea(new int[]{1,3,2,5,25,24,5});
        System.out.println(max);
    }
}
