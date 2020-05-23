package dailyRandom;

import jdk.nashorn.internal.ir.IndexNode;
import jianZhiOffer.TreeNode;

public class RD0105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return cur(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode cur(int[] preorder, int[] inorder,int pleft,int pright,int ileft,int iright){
        if(pleft>pright){return null;}
        int pos = ileft;
        TreeNode node = new TreeNode(preorder[pleft]);
        while(pos<=iright){
            if(preorder[pleft]==inorder[pos]){
                break;
            }
            pos++;
        }
        if(pos>iright){return null;}
        int len = pos-ileft;
        node.left = cur(preorder,inorder,pleft+1,pleft+len,ileft,pos-1);
        node.right = cur(preorder,inorder,pleft+1+len,pright,pos+1,iright);
        return node;
    }
}
