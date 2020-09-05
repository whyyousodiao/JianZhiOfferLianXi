package other;

import java.util.*;

public class HashMapIterator {
    static Map<Integer,Integer> map;

    static {
        map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
    }

    //第一种方式 通过EntrySet遍历
    /*public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "+" + value);
        }
    }*/


    //第二种方式 通过keyset
    /*public static void main(String[] args) {
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println("key:"+key+" and value:"+map.get(key));
        }
    }*/

    //第三种方式 ForEach EntrySet
    /*public static void main(String[] args) {
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key:"+key+" and value:"+value);
        }
    }*/

    //第四种方式 ForEach KeySet
    /*public static void main(String[] args) {
        for(Integer key: map.keySet()){
            System.out.println("key:"+key+" and value:"+map.get(key));
        }
    }*/


    //第五种方法 Lambda表达式
    /*public static void main(String[] args) {
        map.forEach((key,value)->{
            System.out.println("key:"+key+" value:"+value);
        });
    }*/

    //第六种方法 Streams API单线程
    /*public static void main(String[] args) {
        map.entrySet().stream().forEach((entry)->{
            System.out.println("6 "+"key:"+entry.getKey()+" value:"+entry.getValue());
        });
    }*/

    //第七方法 Streams API多线程


    public static void main(String[] args) {

        map.entrySet().parallelStream().forEach((entry)->{
            System.out.println("7 "+"key:"+entry.getKey()+" value:"+entry.getValue());
        });
    }
}
