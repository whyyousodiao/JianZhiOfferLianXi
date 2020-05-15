public class JianZhiOffer021 {

    public static void main(String[] args) {
        Solution21 solution = new Solution21();
        int[] n ={1,5,6,7,8,9};
        System.out.println(solution.exchange(n).toString());
    }

}


class Solution21 {
    public int[] exchange(int[] nums) {
        int pre = 0;
        int rear = nums.length-1;
        while(pre < rear){
            int temp =0;
            if((nums[pre]&1) == 1){
                pre++;
            }else{
                temp = nums[pre];
                nums[pre] = nums[rear];
                nums[rear] = temp;
            }
            if((nums[rear]&1) == 0){
                rear--;
            }else{
                temp = nums[rear];
                nums[rear] = nums[pre];
                nums[pre] = temp;
            }
        }
        return nums;
    }
}
/*class Solution {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while(i < j) {
            while(i < j && (nums[i] & 1) == 1) i++;
            while(i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}*/


