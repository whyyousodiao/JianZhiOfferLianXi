package huaweimianshi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Code02 {
    /*public TreeNode initTree(int[] nums){
        int len = nums.length;
        if(len==0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        int i = 1;
        while(i<len){

            TreeNode tmp = queue.poll();
            //left
            TreeNode left = new TreeNode(nums[i]);
            tmp.left = left;
            i++;
            queue.add(left);
            if(i>=len){
                break;
            }
            //right
            TreeNode right = new TreeNode(nums[i]);
            tmp.right = right;
            i++;
            queue.add(right);
        }
        return root;
    }
    public boolean judge(TreeNode root){
        if(root == null){
            return true;
        }
        Deque<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int left = root.left.val;

        int right = root.right.val;
        if(left!=right){
            return false;
        }
        queue.add(left);
        queue.add(right);
        return

    }*/
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
