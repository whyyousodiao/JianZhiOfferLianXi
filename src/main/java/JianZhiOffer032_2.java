import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JianZhiOffer032_2 {
    /*public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>(0);
        Queue<TreeNode> list1 = new LinkedList<TreeNode>();
        Queue<TreeNode> list2 = new LinkedList<TreeNode>();

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        TreeNode node;
        list1.add(root);
        while (!list1.isEmpty() || !list2.isEmpty()){
            List<Integer> tmp = new ArrayList<Integer>();
            List<Integer> tmp2 = new ArrayList<Integer>();
            while(!list1.isEmpty()){
                node = list1.remove();
                tmp.add(node.val);
                if(node.left != null)list2.add(node.left);
                if(node.right != null)list2.add(node.right);
            }
            if(!tmp.isEmpty())
            res.add(tmp);
            while(!list2.isEmpty()){
                node = list2.remove();
                tmp2.add(node.val);
                if(node.left != null)list1.add(node.left);
                if(node.right != null)list1.add(node.right);
            }
            if(!tmp2.isEmpty())
            res.add(tmp2);
        }
        return res;
    }*/
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> list = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        TreeNode node;
        if(root != null)list.add(root);

        while(!list.isEmpty()){
            List<Integer> tmp = new ArrayList<Integer>();
            for (int i=list.size();i>0;i--)
            {
                node = list.poll();
                tmp.add(node.val);
                if(node.left!=null)list.add(node.left);
                if(node.right!=null)list.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
}
