package bishiti.perfectworld;

import java.util.Scanner;

/*
5
15 16 19 20 25 1 3 4 5 7 10 14
 */
public class PerfectWorld2020092401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        int result = search(nums, target);

        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int mid = 0;
        while(left<=right){
            mid = (left+right)>>1;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<nums[mid]){//左边是非旋转数组
                if(nums[left]<target && nums[mid]>target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{//右边是非旋转数组
                if(nums[right]>target && nums[mid]<target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }

        return -1;
    }


}
