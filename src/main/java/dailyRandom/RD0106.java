package dailyRandom;

import jianZhiOffer.TreeNode;

import java.util.HashMap;

public class RD0106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return cur(inorder,postorder,0,postorder.length-1,0,inorder.length-1);
    }
    public TreeNode cur(int[] inorder, int[] postorder, int i, int j, int m, int n){
        if(m>n){
            return null;
        }
        TreeNode node = new TreeNode(postorder[j]);
        int pos = m;
        while(pos<=n){
            if(inorder[pos] == postorder[j]){
                break;
            }
            pos++;
        }
        if(pos>n){
            return null;
        }
        int len = pos-m;
        node.left = cur(inorder,postorder, i,i+len-1,m,pos-1);
        node.right = cur(inorder,postorder,i+len,j-1,pos+1,n);
        return node;
    }
    /**
     * 官方解法
     *
     */
    /*int post_idx;
    int[] postorder;
    int[] inorder;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

    public TreeNode helper(int in_left, int in_right) {
        // if there is no elements to construct subtrees
        if (in_left > in_right)
            return null;

        // pick up post_idx element as a root
        int root_val = postorder[post_idx];
        TreeNode root = new TreeNode(root_val);

        // root splits inorder list
        // into left and right subtrees
        int index = idx_map.get(root_val);

        // recursion
        post_idx--;
        // build right subtree
        root.right = helper(index + 1, in_right);
        // build left subtree
        root.left = helper(in_left, index - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        this.inorder = inorder;
        // start from the last postorder element
        post_idx = postorder.length - 1;

        // build a hashmap value -> its index
        int idx = 0;
        for (Integer val : inorder)
            idx_map.put(val, idx++);
        return helper(0, inorder.length - 1);
    }*/

}
