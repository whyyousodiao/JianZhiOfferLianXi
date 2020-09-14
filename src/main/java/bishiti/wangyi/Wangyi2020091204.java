package bishiti.wangyi;

import java.util.*;

public class Wangyi2020091204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] male = sc.nextLine().split(" ");//男编号
        String[] female = sc.nextLine().split(" ");//女编号
        int numOfMale = male.length;
        int numOfFemale = female.length;
        int maleRes = 0;
        int femaleRes = 0;
        int n = sc.nextInt();
        Map<Integer,Integer> femaleAppear = new HashMap<>();
        Map<Integer,Integer> maleAppear = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int maleNum = sc.nextInt();
            int femaleNum = sc.nextInt();
            int maleAppearTime = maleAppear.getOrDefault(maleNum,0);
            if(maleAppearTime < 1){
                maleRes++;
                maleAppear.put(maleNum,maleAppearTime+1);
            }
            int femaleAppearTime = maleAppear.getOrDefault(femaleNum,0);
            if(femaleAppearTime < 1){
                femaleRes++;
                maleAppear.put(maleNum,femaleAppearTime+1);
            }
        }
        System.out.println(Math.min(femaleRes,maleRes));



    }
}
