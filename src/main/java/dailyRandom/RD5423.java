package dailyRandom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RD5423 {
    public int minSumOfLengths(int[] arr, int target) {
        int len = arr.length;
/*
        HashSet<int[]> set = new HashSet<>();
        int[] tmparr;
*/
        int sizeOfres = 0;
        int[] res = new int[256];
        int pos = 0;
        int tmp = 0;
        int preLen = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                continue;
            }
            pos = i+1;
            tmp = target - arr[i];
            while(pos<len && tmp>0){
                tmp = tmp - arr[pos];
                pos++;
            }
            if(tmp == 0){
                /*tmparr = Arrays.copyOfRange(arr,i,pos);
                set.add(tmparr);*/
                if(pos-i<preLen){
                    preLen = pos - i;
                }
                res[sizeOfres] = pos-i;
                sizeOfres++;
                i=pos-1;

            }
        }
        if(sizeOfres<2){
            return -1;
        }
        Arrays.sort(res);
        return res[256-sizeOfres]+res[256-sizeOfres+1];
    }

    public static void main(String[] args) {
        /*int[] arr = {3,2,2,4,3};
        int[] res = Arrays.copyOfRange(arr,0,2);
        for(int num:res) {
            System.out.println(num);
        }*/
        int[] arr = {78,18,1,94,1,1,1,29,58,3,4,1,2,56,17,19,4,1,63,2,16,11,1,1,2,1,25,62,10,69,12,7,1,6,2,92,4,1,61,7,26,1,1,1,67,26,2,2,70,25,2,68,13,4,11,1,34,14,7,37,4,1,12,51,25,2,4,3,56,21,7,8,5,93,1,1,2,55,14,25,1,1,1,89,6,1,1,24,22,50,1,28,9,51,9,88,1,7,1,30,32,18,12,3,2,18,10,4,11,43,6,5,93,2,2,68,18,11,47,33,17,27,56,13,1,2,29,1,17,1,10,15,18,3,1,86,7,4,16,45,3,29,2,1,1,31,19,18,16,12,1,56,4,35,1,1,36,59,1,1,16,58,18,4,1,43,31,15,6,1,1,6,49,27,12,1,2,80,14,2,1,21,32,18,15,11,59,10,1,14,3,3,7,15,4,55,4,1,12,4,1,1,53,37,2,5,72,3,6,10,3,3,83,8,1,5};
        RD5423 rd5423 = new RD5423();
        System.out.println(rd5423.minSumOfLengths(arr,97));

    }
}
