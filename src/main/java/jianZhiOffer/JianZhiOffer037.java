package jianZhiOffer;

import java.util.*;

public class JianZhiOffer037 {
    // Encodes a tree to a single string.
    Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> list = new LinkedList<>();
    public String serialize(TreeNode root) {
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            list.add(node.val);
            queue.add(node.left);
            queue.add(node.right);
        }
        return list.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        return null;
    }






}
