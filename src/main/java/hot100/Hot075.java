package hot100;

public class Hot075 {
    public void sortColors(int[] nums) {
        int pre =0;
        int rear = nums.length-1;
        while(pre<rear){
            if(nums[rear]==2){
                rear--;
                continue;
            }
            if(nums[pre]!=2){
                pre++;
                continue;
            }
            nums[pre] = nums[rear];
            nums[rear] = 2;
            pre++;
            rear--;
        }
        pre = 0;
        while(pre<rear){
            if(nums[rear]==1){
                rear--;
                continue;
            }
            if(nums[pre]!=1){
                pre++;
                continue;
            }
            nums[pre] = nums[rear];
            nums[rear] = 1;
            pre++;
            rear--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        new Hot075().sortColors(nums);
    }
}
