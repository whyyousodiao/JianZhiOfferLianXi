package jianZhiOffer;

import javafx.print.Collation;
import javafx.print.PrintColor;
import org.omg.PortableInterceptor.INACTIVE;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.util.*;

public class JianZhiOffer032_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        TreeNode node;
        if(root!=null)queue.offer(root);
        int mask =0;
        while (!queue.isEmpty()){
            List<Integer> tmp  = new ArrayList<Integer>();
            for(int i=queue.size();i>0;i--){
                node = queue.poll();
                tmp.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }

            if(mask ==1){
                Collections.reverse(tmp);
            }
            res.add(tmp);
            mask = (mask+1)%2;
        }
        return res;
    }

    /*public static void main(String[] args) {
        LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
        Map<String,Integer> map = new HashMap<String, Integer>();
        TreeNode node = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        map.put("5",6);
        linkedList.addFirst(node1);
        linkedList.addFirst(node2);
        linkedList.addFirst(node3);
        linkedList.addFirst(node4);
        linkedList.addFirst(node);


        System.out.println(linkedList);
        System.out.println(map);
    }*/
}
