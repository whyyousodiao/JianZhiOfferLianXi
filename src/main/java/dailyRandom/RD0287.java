package dailyRandom;

public class RD0287 {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int i=0;
        int tempIndex=0,tmpValue=0;
        while(i<len && nums[i]==i){
            i++;
        }
        tmpValue = nums[i];
        tempIndex = i;
        while(nums[tempIndex]!=tempIndex){
            tmpValue = nums[tempIndex];
            nums[tempIndex] = tempIndex;
            tempIndex = tmpValue;
        }
        return tempIndex;
    }

}
