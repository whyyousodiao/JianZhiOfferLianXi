import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JianZhiOffer034 {
    /*List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> arrayList = new ArrayList<Integer>();
        cur(arrayList,root,sum);
        return result;
    }
    public void cur(List<Integer> res,TreeNode node,int sum){
        if(node == null){
            return;
        }
        int count = sum - node.val;
        if(count==0 && node.left==null && node.right == null){
            res.add(node.val);
            result.add(res);
        }
        List<Integer> res1 = new ArrayList<Integer>(res);
        List<Integer> res2 = new ArrayList<Integer>(res);
        res1.add(node.val);
        res2.add(node.val);
        cur(res1,node.left,count);
        cur(res2,node.right,count);


        return;
    }
    }*/
    LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
    LinkedList<Integer> path = new LinkedList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return result;
    }

    public void recur(TreeNode node,int num){
        if(node==null)return;
        path.add(node.val);
        num-=node.val;
        if(num ==0 && node.left==null && node.right==null){
            result.add(new LinkedList(path));
        }
        recur(node.left,num);
        recur(node.right,num);
        path.removeLast();
    }
}
