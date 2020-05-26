package dailyRandom;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RD0146 {
    Queue<Integer> queue;
    HashMap<Integer,Integer> hashMap ;
    HashMap<Integer,Integer> apperedMap;
    int capacity;
    int popNum;
    public RD0146(int capacity) {
        queue = new LinkedList<Integer>();
        hashMap = new HashMap<>(capacity);
        apperedMap = new HashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if(hashMap.containsKey(key)){
            queue.add(key);
            apperedMap.put(key,apperedMap.get(key)+1);
            return hashMap.get(key);
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(hashMap.containsKey(key)){
            hashMap.put(key,value);
            queue.add(key);
            apperedMap.put(key,apperedMap.get(key)+1);

        }else{
            if(hashMap.size()<capacity){
                queue.add(key);
                hashMap.put(key,value);
                apperedMap.put(key,1);
            }else {

                while (apperedMap.get((int) queue.peek()) > 1) {
                    int removeNum = (int) queue.remove();
                    apperedMap.put(removeNum, apperedMap.get(removeNum) - 1);
                }
                int removedNum = (int) queue.remove();
                apperedMap.remove(removedNum);
                hashMap.remove(removedNum);
                hashMap.put(key, value);
                apperedMap.put(key,1);
                queue.add(key);
            }
        }
    }

    public static void main(String[] args) {
        RD0146 cache = new RD0146( 3 /* 缓存容量 */ );
        /*cache.put(1, 1);

        cache.put(2, 2);
        System.out.println(cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));       // 返回 -1 (未找到)
        System.out.println(cache.get(3));       // 返回  3
        System.out.println(cache.get(4));       // 返回  4*/
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        System.out.println(cache.get(4));
        System.out.println(cache.get(3));
        System.out.println(cache.get(2));
        System.out.println(cache.get(1));
        cache.put(5, 5);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
        System.out.println(cache.get(5));
    }
}
