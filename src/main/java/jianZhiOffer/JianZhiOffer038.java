package jianZhiOffer;

import java.util.*;

public class JianZhiOffer038 {
    public String[] permutation(String s) {
        Queue<String> res = new LinkedList<>();
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),s.charAt(i));
        }
        int sizeOfMap = map.size();
        int sizeOfStr = 1;

        Iterator<Character> iterator = map.keySet().iterator();
        if(iterator.hasNext()){
            res.add(map.get(iterator.next()).toString());
        }
        while(iterator.hasNext()) {
            char tmp = map.get(iterator.next());
            int sizeTmp = res.size();
            for (int j = 0; j < sizeTmp; j++) {
                String str = res.poll();
                for (int k = 0; k <= sizeOfStr; k++) {
                    StringBuffer stringBuffer = new StringBuffer(str);
                    stringBuffer.insert(k, tmp);
                    res.add(stringBuffer.toString());
                }
            }
            sizeOfStr++;
        }
        String[] ress = res.toArray(new String[res.size()]);
        return ress;
    }

    public static void main(String[] args) {
        JianZhiOffer038 jianZhiOffer038 = new JianZhiOffer038();
        System.out.println(jianZhiOffer038.permutation("abc"));
    }
}
