package otherPractice;

import javafx.util.Pair;

import java.util.*;

public class Other0127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len = beginWord.length();
        Map<String,List<String>> map = new HashMap<>();
        for(String str : wordList){
            for(int i=0;i<len;i++){
                String s = str.substring(0,i)+"*"+str.substring(i+1,len);
                List<String> list = map.getOrDefault(s,new LinkedList<>());
                list.add(str);
                map.put(s,list);
            }
        }
        Queue<Pair<String,Integer>> queue = new LinkedList<>();
        queue.add(new Pair(beginWord,1));
        Set<String> set = new HashSet<>();
        set.add(beginWord);

        while(!queue.isEmpty()){
            Pair<String, Integer> pair = queue.poll();
            String str = pair.getKey();
            Integer num = pair.getValue();
            for(int i =0;i<len;i++){
                String s = str.substring(0,i)+"*"+str.substring(i+1,len);
                for(String word:map.getOrDefault(s,new LinkedList<>())){
                    if(word.equals(endWord)){
                        return num+1;
                    }else{
                        if(!set.contains(word)){
                            set.add(word);
                            queue.add(new Pair(word,num+1));
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Other0127 other0127 = new Other0127();
        List<String> list = new ArrayList<>();
        list.add("hot");
        list.add("lot");
        list.add("cog");
        list.add("log");
        list.add("dot");
        list.add("dog");
        System.out.println(other0127.ladderLength("hit","cog",list));
    }
}
