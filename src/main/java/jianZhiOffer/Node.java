package jianZhiOffer;

public class Node {
    int val;
    public Node left;
    public Node right;
    public Node next;
    public Node random;


    public Node(int val) {
        this.val = val;
        this.right = null;
        this.left = null;
        this.next =null;
        this.random =null;
    }
    public Node(int _val,Node _left,Node _right) {
        this.val = _val;
        this.left = _left;
        this.right = _right;
    }
}