package bishiti.wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Wangyi2020091201 {
/*
10 9
1 left 2
1 right 3
2 left 4
2 right 5
3 right 6
6 left 7
6 right 8
8 left 9
8 right 10
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//节点数
        int n = sc.nextInt();//边
        Map<Integer,TreeNode> map = new HashMap<>();
        for (int i = 1; i <= m; i++) {
            map.put(i,new TreeNode(i));//为每个节点建立索引
        }
        for (int i = 0; i < n; i++) {//建树
            int parent = sc.nextInt();
            String relation = sc.next();
            int child = sc.nextInt();
            TreeNode node = map.get(parent);
            if(relation.equals("left")){
                node.left = map.get(child);
            }else{
                node.right = map.get(child);
            }
        }
        System.out.println(fun(map.get(1),0));

    }
    public static int fun(TreeNode node,int res){
        if(node == null){
            return 0;
        }
        if(node.left!=null && node.left.left == null
                && node.right!=null && node.right.right == null){//左右子树不为空但是左右子树的孩子节点都为空

            return res+1;
        }
        return fun(node.left,res)+fun(node.right,res);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
