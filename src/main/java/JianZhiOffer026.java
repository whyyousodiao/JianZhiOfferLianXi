public class JianZhiOffer026 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B==null){
            return false;
        }
        return subTree(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    public boolean subTree(TreeNode father, TreeNode sub) {
        if(sub == null){
            return true;
        }
        if(father == null || father.val != sub.val){
            return false;
        }
        return subTree(father.left,sub.left) && subTree(father.right, sub.right);
    }
}