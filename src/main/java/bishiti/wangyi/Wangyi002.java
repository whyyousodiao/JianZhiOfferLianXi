package bishiti.wangyi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Wangyi002 {
}
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = sc.nextInt();
        int[] nums = new int[size];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            nums[i] = num;
            set.add(num);
        }
        StringBuffer sb = new StringBuffer();
        int pos = 1;
        for (int i = 0; i < size; i++) {
            while(true){
                if(set.contains(pos)){
                    pos++;
                }else if(pos > nums[i]){
                    sb.append(nums[i]+" ");
                    break;
                }else{
                    sb.append(pos+" ");
                    pos++;
                }
            }
        }
        while (pos<=n){
            sb.append(pos+" ");
            pos++;
        }
        System.out.println(sb.toString());
    }
}*/
