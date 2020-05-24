package dailyRandom;

import java.util.*;

public class RD0076 {
    /*public String minWindow(String s, String t) {
     *//*HashMap<Character,Integer> map = new HashMap();
        HashMap<Character,Integer> apperMap = new HashMap();
        Queue<Integer> queue = new LinkedList<Integer>();
        int pre = 0;
        int rear = 0;
        int last = 0;
        *//**//*char tmp = 'a';*//**//*

        int len=0;

        for(int i=0; i<t.length(); i++){
            map.put(t.charAt(i),i);
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (!(map.isEmpty())&&map.get(c) != null) {
                map.remove(c);
                queue.add(i);
                apperMap.put(c,i);
                if(map.isEmpty()){
                    pre = queue.peek();
                    rear = i;
                    len = i-queue.peek();
                }
            }
            if(len !=0 && apperMap.get(c) != null && apperMap.get(c) == queue.peek()){

                queue.remove();
                if(i-queue.peek()<len){
                    pre = queue.peek();
                    rear = i;
                }
                queue.add(i);
                apperMap.put(c,i);
            }

        }
        if(len==0){
            return "";
        }
        return s.substring(pre,rear);*//*
    }*/
    public String minWindow(String s, String t) {
        if(s.length() == 0|| t.length() ==0 || s.length()<t.length()){return "";}
        int pre=0,rear=0,resl=0,resr=0,count=0,len=0;
        HashMap<Character,Integer> unfindedMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        HashMap<Character,Integer> ori = new HashMap<Character,Integer>();
        for(int i=0; i<t.length(); i++){
            unfindedMap.put(t.charAt(i),unfindedMap.getOrDefault(t.charAt(i),0)+1);
            map.put(t.charAt(i),0);
            ori.put(t.charAt(i),ori.getOrDefault(t.charAt(i),0)+1);
        }
        //body start here
        while(rear<s.length()){
            char c = s.charAt(rear);
            if(map.get(c)!=null){
                count = map.get(c);
                if(unfindedMap.get(c)!=null){
                    map.put(c,count+1);
                    if(unfindedMap.get(c)==1) {
                        unfindedMap.remove(c);
                    }else {
                        unfindedMap.put(c, unfindedMap.get(c) - 1);
                    }
                }else{
                    map.put(c,count+1);
                }
                if(unfindedMap.isEmpty()){
                    count++;
                    map.put(c,count);
                    while((map.get(s.charAt(pre)) == null || map.get(s.charAt(pre))>ori.get(s.charAt(pre)))){
                        if(map.get(s.charAt(pre)) == null){
                            pre++;
                            continue;
                        }
                        if(map.get(s.charAt(pre))>ori.get(s.charAt(pre))){
                            map.put(s.charAt(pre),map.get(s.charAt(pre))-1);
                        }
                        pre++;
                    }
                    if(rear+1-pre<len || len ==0)
                    {
                        resl=pre;
                        resr=rear;
                        len = rear+1-pre;
                    }
                }

            }
            rear++;
        }
        if(len==0){
            return "";
        }
        return s.substring(resl,resr+1);
    }

    public static void main(String[] args) {
        RD0076 rd = new RD0076();
        String s = "bba";
        String t = "ab";
        System.out.println(rd.minWindow(s,t));

    }


    /*public String minWindow(String s, String t) {
        int tLen = t.length();
        for (int i = 0; i < tLen; i++) {
            char c = t.charAt(i);
            ori.put(c, ori.getOrDefault(c, 0) + 1);
        }
        int l = 0, r = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        int sLen = s.length();
        while (r < sLen) {
            ++r;
            if (r < sLen && ori.containsKey(s.charAt(r))) {
                cnt.put(s.charAt(r), cnt.getOrDefault(s.charAt(r), 0) + 1);
            }
            while (check() && l <= r) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ansL = l;
                    ansR = l + len;
                }
                if (ori.containsKey(s.charAt(l))) {
                    cnt.put(s.charAt(l), cnt.getOrDefault(s.charAt(l), 0) - 1);
                }
                ++l;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    public boolean check() {
        Iterator iter = ori.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (cnt.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }*/



}
