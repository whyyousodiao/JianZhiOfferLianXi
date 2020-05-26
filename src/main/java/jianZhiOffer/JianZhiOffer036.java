package jianZhiOffer;

import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;

public class JianZhiOffer036 {

    public Node treeToDoublyList(Node root) {
        if(root==null)return null;
        return cur(root).right;
    }

    public Node cur(Node node) {
        if(node == null)return null;

        Node nodeLeft = cur(node.left);
        Node nodeRight = cur(node.right);

        if (nodeLeft != null && nodeRight != null) {
            node.left = nodeLeft;
            node.right = nodeRight.right;
            nodeRight.right.left = node;
            nodeRight.right = nodeLeft.right;
            nodeLeft.right.left = nodeRight;
            nodeLeft.right = node;
            return nodeRight;
        }
        if(nodeLeft !=null){
            node.left = nodeLeft;
            node.right = nodeLeft.right;
            nodeLeft.right.left = node;
            nodeLeft.right = node;

            return node;
        }
        if(nodeRight !=null){
            node.left = nodeRight;
            node.right = nodeRight.right;
            nodeRight.right.left = node;
            nodeRight.right = node;
            return nodeRight;
        }
        if(nodeRight == null && nodeLeft == null){
            node.left = node;
            node.right = node;
            return node;
        }
        return null;
    }

}
