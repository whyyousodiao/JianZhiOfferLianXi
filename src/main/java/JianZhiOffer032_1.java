import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class JianZhiOffer032_1 {


    public int[] levelOrder(TreeNode root) {
        if(root == null)return new int[0];
        Stack<Integer> stack = new Stack<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node =  queue.remove();
            stack.add(node.val);

            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        int size = stack.size();
        int[] res = new int[size];
        for(int i=size-1; i>=0;i--){
            res[i] = stack.pop();
        }
        return res;

    }
    /**
     * 这个用dfs方法不太行，因为dfs先遍历的是子节点，这样就先把子节点的值加入了结果，所以只能用bfs了
     */
    /*public int[] levelOrder(TreeNode root) {
        if(root == null)return new int[0];
        Stack<Integer> stack = new Stack<Integer>();
        cur(root, stack);
        int size = stack.size();
        int[] res = new int[size];
        for(int i=size-1; i>=0;i--){
            res[i] = stack.pop();
        }
        return res;

    }
    public void cur(TreeNode node,Stack<Integer> stack){
        if(node == null)return;
        stack.add(node.val);
        cur(node.left, stack);
        cur(node.right, stack);
    }*/

}
