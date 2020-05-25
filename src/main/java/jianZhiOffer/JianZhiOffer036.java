package jianZhiOffer;

public class JianZhiOffer036 {
    public Node treeToDoublyList(Node root) {
        return cur(root);
    }

    public Node cur(Node node) {
        if(node == null)return null;
        Node nodeLeft = cur(node.left);
        Node nodeRight = cur(node.right);

        if (nodeLeft != null && nodeRight != null) {

        }

        if(tmpNode.right!=null){
            nodeRight = tmpNode.right;
        }else{
            nodeRight = nodeLeft;
        }
        node.left = nodeLeft;
        node.right= nodeRight;
        if(node.right != null){
            return nodeRight;
        }else{
            return node;
        }
    }

}
