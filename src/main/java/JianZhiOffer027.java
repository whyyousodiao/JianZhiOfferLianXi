import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class JianZhiOffer027 {
    public TreeNode mirrorTree(TreeNode root) {
        return dfs(root);
    }
    public TreeNode dfs(TreeNode node){
        if(node==null){
            return null;
        }
        TreeNode tmpNode = new TreeNode(0);
        tmpNode = dfs(node.left);
        node.left = dfs(node.right);
        node.right = tmpNode;
        return node;
    }

    /*public TreeNode mirrorTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)return null;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = new TreeNode(0);
            node=stack.pop();
            if(node.left != null)stack.push(node.left);
            if(node.right != null)stack.push(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }*/
}
