package bishiti.tonghuashun;

import java.util.HashMap;
import java.util.LinkedList;

class Node {
    public int key, val;
    public Node(int k, int v) {
        this.key = k;
        this.val = v;
    }
}
public class Tonghuashun2020090501 {
    private final HashMap<Integer, Node> map;
    private final LinkedList<Node> cache;
    private final int size;

    public Tonghuashun2020090501(int capacity) {
        this.size = capacity;
        map = new HashMap<>();
        cache = new LinkedList<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key).val;
        put(key, val);
        return val;
    }

    public void put(int key, int val) {
        Node node = new Node(key, val);

        if (map.containsKey(key)) {
            cache.remove(map.get(key));
            cache.addFirst(node);
            map.put(key, node);
        } else {
            if (size == cache.size()) {
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(node);
            map.put(key, node);
        }
    }
}


